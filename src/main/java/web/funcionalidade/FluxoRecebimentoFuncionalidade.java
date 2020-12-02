package web.funcionalidade;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import io.cucumber.datatable.DataTable;
import web.funcionalidade.SNF.SNFHomeFuncionalidade;
import web.funcionalidade.SNF.SNFObterAgendamentoFuncionalidade;
import web.funcionalidade.SNF.SNFVisualizarNFFuncionalidade;
import web.pages.SNF.SNFEditarNotaFiscalPage;

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
	}

	public void geracaoPedido(String pedido, String modelo) throws ParseException, InterruptedException {
		switch (pedido) {
		case "Estocado":
			switch (modelo) {
			case "1185701":
				List<List<String>> lista = Arrays.asList(
						Arrays.asList("Comprador", "Fornec", "Pesquisa", "Classif Ped"),
						Arrays.asList("018", "3504927", "37160", "T"));
				DataTable params = DataTable.create(lista);
				this.consultarPedido(params);
				this.solpd.getDataProxPed();
				this.login.acessarTela("GERPD");
				this.estocado.gerarPedidoEstocado(params, 40);
				this.aguardaGerarPedido(params);
				this.criarAgendamento(VariaveisEstaticas.getNUMERO_PEDIDO());
				break;

			default:
				break;
			}
			break;
		case "DSD":

			break;
		case "CROSS":

			break;
		default:
			break;
		}
	}

	public void criarAgendamento(String numPedido) throws InterruptedException {
		this.login.acessarTela("CPT85");
		this.agendamento.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtualMaisDias(1));
		this.agendamento.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtualMaisDias(1));
		this.agendamento.preencherCampoValor("Hora Prev Entrada", "1000");
		this.agendamento.preencherCampoValor("Transportadora", "TransAutomação");
		this.agendamento.preencherCampoValor("Contato", "SR Selenium");
		this.agendamento.preencherCampoValor("Fone", "11 31314040");
		this.agendamento.preencherCampoValor("Perecivel", "N");
		this.agendamento.preencherCampoValor("Alto Risco", "N");
		this.agendamento.incluirAguardar();
		this.login.voltarHomePage();
		this.login.acessarTela("CPT85");
		this.agendamento.preencherCampoValor("Agenda", VariaveisEstaticas.getNUMERO_AGENDA());
		this.agendamento.clicarBotaoConsultar();
		this.agendamento.preencherCampoValor("Pedido", numPedido);
		this.agendamento.consultarPedido();
		this.agendamento.IncluirPedido();
		this.agendamento.finalizarAgendamento();
		//Thread.sleep(15000);
		//this.agendamento.reenviarSNF();
	}

	public void consultarPedido(DataTable params) throws ParseException {
		this.login.acessarTela("SOLPD");
		this.solpd.getPedido(params);
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

	public void vincularPedido() throws InterruptedException {
		boolean vinculo = true;
		this.pesquisarNota();
		do {
			this.visualizarNf.editarNF();
			this.load.loading();
			this.pesquisarPedido();
			this.load.loading();
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
			this.editarNF.getBtnVincularPedido().click();
			this.load.loading();
		} while(!SeleniumRobot.existElementWeb("//*[contains(text(),\"Pedido vinculado com sucesso!\")]"));
	
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
		this.load.loading();
		this.obterAgendamento.editarAgenda();
	}
	
	public void atualizarPlaca() {
		this.obterAgendamento.inserirPlaca();
		Assert.assertTrue(SeleniumRobot.existElementWeb("//*[contains(text(),\"Alteração efetuada com sucesso!\")]"));
	}
	
}
