package web.funcionalidade;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.GerarProtocolo;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import io.cucumber.datatable.DataTable;
import web.funcionalidade.SNF.SNFHomeFuncionalidade;
import web.funcionalidade.SNF.SNFObterAgendamentoFuncionalidade;
import web.funcionalidade.SNF.SNFVisualizarNFFuncionalidade;
import web.pages.SNF.SNFEditarNotaFiscalPage;
import web.pages.SNF.SNFEditarRecebimentoPage;

public class FluxoRecebimentoFuncionalidade extends BaseTest {

	private AgendamentoFuncionalidade agendamento;
	private PedidosEstocadosFuncionalidade estocado;
	private LoginFuncionalidade login;
	private ConsultaDigitacaoDePedidosSOLPDFuncionalidade solpd;
	private SNFHomeFuncionalidade home;
	private SNFVisualizarNFFuncionalidade visualizarNf;
	private SNFEditarNotaFiscalPage editarNF;
	private waitLoading load;
	private SNFObterAgendamentoFuncionalidade obterAgendamento;
	private SNFEditarRecebimentoPage editarRecebimento;
	private GerarProtocolo sup;
	private MonitoramentoReceiverCPC76Funcionalidade cpc76;
	private ConsultaArquivosGeraisROT06Funcionalidade rot06;
	private DigitacaoPedidosDSDCROSSFuncionalidade inpe2;

	public FluxoRecebimentoFuncionalidade() {
		this.estocado = new PedidosEstocadosFuncionalidade();
		this.agendamento = new AgendamentoFuncionalidade();
		this.login = new LoginFuncionalidade();
		this.solpd = new ConsultaDigitacaoDePedidosSOLPDFuncionalidade();
		this.home = new SNFHomeFuncionalidade();
		this.visualizarNf = new SNFVisualizarNFFuncionalidade();
		this.editarNF = new SNFEditarNotaFiscalPage(webDriver);
		this.load = new waitLoading();
		this.obterAgendamento = new SNFObterAgendamentoFuncionalidade();
		this.editarRecebimento = new SNFEditarRecebimentoPage(webDriver);
		this.sup = new GerarProtocolo();
		this.cpc76 = new MonitoramentoReceiverCPC76Funcionalidade();
		this.rot06 = new ConsultaArquivosGeraisROT06Funcionalidade();
		this.inpe2 = new DigitacaoPedidosDSDCROSSFuncionalidade();
	}

	public void geracaoPedido(String pedido, String modelo) throws ParseException, InterruptedException {
		switch (pedido) {
		case "Estocado":
			switch (modelo) {
			case "1185701":
				List<List<String>> lista = Arrays.asList(
						Arrays.asList("Comprador", "Fornec", "Pesquisa", "Classif Ped", "Filial"),
						Arrays.asList("018", "3504927", "37160", "T", "7458"));
				DataTable params = DataTable.create(lista);
				this.consultarPedido(params);
				this.solpd.getDataProxPed();
				this.login.acessarTela("GERPD");
				this.estocado.gerarPedidoEstocado(params, 40);
				this.aguardaGerarPedido(params);
				webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
				this.criarAgendamento(VariaveisEstaticas.getNUMERO_PEDIDO());
				break;

			default:
				break;
			}
			break;
		case "DSD":

			break;
		case "CROSS":
			switch (modelo) {
			case "00000616":
				List<List<String>> lista = Arrays.asList(
						Arrays.asList("Comprador", "Fornec", "Produto", "Classif Ped"),
						Arrays.asList("041", "3515691", "18026", "N"));
				DataTable params = DataTable.create(lista);
				this.consultarPedidoCross(params);
				this.solpd.getDataProxPed();
				this.login.acessarTela("INPE2");
				this.inpe2.gerarPedidoCross(params, 1, "588");
				this.aguardaGerarPedidoCross(params);
				webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
				this.criarAgendamento(VariaveisEstaticas.getNUMERO_PEDIDO());
				break;
				
			default:
				break;	
			}
		default:
			break;
		}
	}

	public void criarAgendamento(String numPedido) throws InterruptedException {
		webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		this.login.acessarTela("CPT85");
		this.agendamento.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtualMaisDias(1));
		this.agendamento.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtualMaisDias(1));
		this.agendamento.preencherCampoValor("Hora Prev Entrada", "1013");
		this.agendamento.preencherCampoValor("Transportadora", "TransAutomação");
		this.agendamento.preencherCampoValor("Contato", "SR Selenium");
		this.agendamento.preencherCampoValor("Fone", "1131314040");
		this.agendamento.preencherCampoValor("Perecivel", "N");
		this.agendamento.preencherCampoValor("Alto Risco", "N");
		this.agendamento.incluirAguardar();
		this.login.voltarHomePage();
		this.login.acessarTela("CPT85");
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		this.agendamento.preencherCampoValor("Agenda", VariaveisEstaticas.getNUMERO_AGENDA());
		this.agendamento.clicarBotaoConsultar();
		this.agendamento.preencherCampoValor("Pedido", numPedido);
		this.agendamento.consultarPedido();
		this.agendamento.IncluirPedido();
		this.agendamento.finalizarAgendamento();
	/*	Thread.sleep(120000);
		this.login.voltarHomePage();
		this.login.acessarTela("CPT85");
		this.agendamento.preencherCampoValor("Agenda", VariaveisEstaticas.getNUMERO_AGENDA());
		this.agendamento.clicarBotaoConsultar();
		this.agendamento.reenviarSNF();
		webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Alert alert = webDriver.switchTo().alert();
		alert.accept(); */ 
	}

	public void consultarPedido(DataTable params) throws ParseException {
		this.login.acessarTela("SOLPD");
		this.solpd.getPedido(params);
	}
	
	public void consultarPedidoCross(DataTable params) throws ParseException {
		this.login.acessarTela("SOLPD");
		this.solpd.getPedidoCross(params);
	}

	public void aguardaGerarPedido(DataTable params) throws ParseException, InterruptedException {
		int count = 0;
		do {
			this.login.voltarHomePage();
			this.consultarPedido(params);
			this.solpd.validarPedido();
			Thread.sleep(5000);
			count += 1;
		} while (count <= 10 && !this.solpd.verificaSitPedido("PEDIDO EMITIDO - NUMERO :"));

		VariaveisEstaticas.setNUMERO_PEDIDO(this.solpd.getNumeroPedido());
	}
	
	public void aguardaGerarPedidoCross(DataTable params) throws ParseException, InterruptedException {
		int count = 0;
		do {
			this.login.voltarHomePage();
			this.consultarPedidoCross(params);
			this.solpd.validarPedidoIntensCross();
			Thread.sleep(5000);
			count += 1;
		} while (count <= 10 && !this.solpd.verificaSitPedido("PEDIDO EMITIDO - NUMERO :"));

		VariaveisEstaticas.setNUMERO_PEDIDO(this.solpd.getNumeroPedido());
	}

	public void vincularPedido() throws InterruptedException {
		boolean vinculo = true;
		this.pesquisarNota();
		do {
			this.visualizarNf.editarNF();
		//	this.load.loading();
			this.pesquisarPedido();
		//	this.load.loading();
			if (SeleniumRobot.existElementWeb(
					"//div[ancestor::div[contains(@class,\"alert\")] and parent::div[@class = \"row\"]]")) {
				this.editarNF.getBtnRetornar().click();
				this.load.loading();
				Thread.sleep(10000);
			} else
				vinculo = false;
		} while (vinculo);
		do {
			Thread.sleep(10000);
			VariaveisEstaticas.setDATA_EMISSAO(this.editarNF.getInputDataEmissaoNotaFiscal().getAttribute("value"));
			VariaveisEstaticas.setSERIE_NOTA(this.editarNF.getInputSerieNotaFiscal().getAttribute("value"));
			VariaveisEstaticas.setCNPJ_NOTA(this.editarNF.getInputCNPJNotaFiscal().getAttribute("value"));
			this.editarNF.getBtnVincularPedido().click();
			this.load.loading();
		} while (!SeleniumRobot.existElementWeb("//*[contains(text(),\"Pedido vinculado com sucesso!\")]"));

	}

	public void pesquisarNota() {
		this.visualizarNf.preencherCamposPesquisas("Nota Fiscal", VariaveisEstaticas.getNOTA_FISCAL());
	}

	public void pesquisarPedido() {
		wait.until(ExpectedConditions.visibilityOf(this.editarNF.getInputNumeroPedido()));
		if (this.editarNF.getInputNumeroPedido().isEnabled()) {
			this.editarNF.getInputNumeroPedido().sendKeys(VariaveisEstaticas.getNUMERO_PEDIDO());
			this.editarNF.getBtnPesquisarPedido().click();
		}
	}

	public void acessarNotaFiscal() throws InterruptedException {
		this.home.AcessaMenu("Recebimento");
		this.home.AcessaMenu("Nota Fiscal");
	}

	public void acessarVisualizarRecebimento() throws InterruptedException {
		this.home.AcessaMenu("Recebimento");
		this.home.AcessaMenu("Visualizar Recebimento");

	}

	public void acessarAgenda() {
		this.obterAgendamento.preencherCamposPesquisas("Numero Agendamento", VariaveisEstaticas.getNUMERO_AGENDA());
		// this.load.loading();
		this.obterAgendamento.editarAgenda();
	}

	public void atualizarPlaca() {
	    this.load.loading();
		this.obterAgendamento.inserirPlaca();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//*[contains(text(),\"Alteração efetuada com sucesso!\")]"));
	}

	public void validarNF() {
		SeleniumRobot.MoveToElementWeb(this.editarNF.getBtnValidar());
		this.editarNF.getBtnValidar().click();
		this.load.loading();
		Assert.assertEquals(this.editarNF.getAlertValidarNF().getText(), "Nota Fiscal validada com sucesso.");
	}

	public void definirVeiculoCDViaSAD() {
		this.login.acessarAmbienteSAD("SADVAREJO",VariaveisEstaticas.getUSER_SAD(), VariaveisEstaticas.getFILIAL_SAD());
		this.login.acessarTela("CPT85");
		this.agendamento.preencherCampoValor("Agenda", VariaveisEstaticas.getNUMERO_AGENDA());
		this.agendamento.clicarBotaoConsultar();
		this.agendamento.preencherCampoValor("Veiculo no CD", "S");
		this.agendamento.clicarBotaoAlterar();
		Assert.assertTrue(
				this.agendamento.retornaMensagemExibida().contains("ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"));
	}

	public void pegarValirGridResultado(String campo, String valor) throws InterruptedException {
		this.acessarVisualizarRecebimento();
		
		this.obterAgendamento.preencherCamposPesquisas("Numero Agendamento", VariaveisEstaticas.getNUMERO_AGENDA());

		while (!SeleniumRobot.existElementWeb("//span[contains(text(),'Chegada do caminhão')]")) {
			this.obterAgendamento.clicarBotaoPesquisar();
			
		}

		this.obterAgendamento.clicarBtEditarGridResultado();

	}

	public void salvarVinculados() {
		this.obterAgendamento.marcarCheckBox();
		this.editarRecebimento.getButtonSavarVinculados().click();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//*[contains(text(),\"NF(s) vinculada(s) com sucesso!\")]"));
	}

	public void validarProtocoloFronteira() throws ParseException {
		this.editarRecebimento.getInputProtocolo().sendKeys(this.gerarProtoco());
		this.editarRecebimento.getInputDataFronteira()
				.sendKeys(GeracaoData.retornaDataFormatadaAnoQuatroDigitos(GeracaoData.retornaDataAtual()));
		this.editarRecebimento.getInputProtocolo().click();
		this.editarRecebimento.getButtonValidarProtocoloFrontera().click();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//*[contains(text(),\"Validação atendida com sucesso\")]"));

	}

	public String gerarProtoco() throws ParseException {
		String valorString = VariaveisEstaticas.getNOTA_FISCAL();
		Integer valor = Integer.valueOf(valorString.length());
		String cnpj = VariaveisEstaticas.getCNPJ_NOTA().replace("/", "").replace(".", "").replace("-", "");
		String serie = "00" + VariaveisEstaticas.getSERIE_NOTA();
		String data = GeracaoData.retornaDataFormatoInvertido(VariaveisEstaticas.getDATA_EMISSAO());
		return this.sup.geradorProtoco(data, cnpj, sup.completaNumeroNFComZero(valor, valorString), serie);
	}

	public void enviarParaSAD() {
		this.editarRecebimento.getButtonEnviarParaSad().click();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//*[contains(text(),\"Enviado para o SAD com sucesso!\")]"));
		Assert.assertEquals("Interface envio ao SAD gerado", this.obterAgendamento.retornaValorCampoSituacao());
	}

	public void geraGuiaCega() {
		this.login.acessarAmbienteSAD("SADVAREJO",VariaveisEstaticas.getUSER_SAD(), VariaveisEstaticas.getFILIAL_SAD());
		this.login.acessarTela("CPC76");
		this.cpc76.inserirInformacaoCampo("Agenda", VariaveisEstaticas.getNUMERO_AGENDA());
		this.cpc76.inserirInformacaoCampo("Pedido", VariaveisEstaticas.getNUMERO_PEDIDO());
		this.cpc76.clicarEnter();
		Assert.assertEquals("06 - FBE GERADO", this.cpc76.retornaValorCampos("Status Grid"));
		this.cpc76.inserirInformacaoCampo("Guia Cega UM", "X");
		this.cpc76.clicarEnter();

	}

	public void validarGeracaoGuiaCega() {
		this.login.acessarTela("ROT06");
		this.rot06.inserirInformacaoCampo("Filtro por Nome", "GUIA");
		this.rot06.clicarBotaoListar();
		this.rot06.clicarBotaoVer();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//pre[@style= 'word-wrap: break-word; white-space: pre-wrap;']"));
	}

}
