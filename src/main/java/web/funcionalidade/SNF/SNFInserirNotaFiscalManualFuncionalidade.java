package web.funcionalidade.SNF;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_LimparCamposNFManual;
import web.bean.interfaces.SNF_NFManual;
import web.pages.SNF.SNFFornecedorNFPage;

public class SNFInserirNotaFiscalManualFuncionalidade extends BaseTest {

	private SNFFornecedorNFPage forn;
	private waitLoading loading;

	public SNFInserirNotaFiscalManualFuncionalidade() {
		this.forn = new SNFFornecedorNFPage(webDriver);
		this.loading = new waitLoading();

	}

	public void preencherNfManualSucesso() {
		this.loading.loading();
		this.forn.getUnidadeNegocio().click();
		Select select = new Select(forn.getUnidadeNegocio());
		select.selectByValue("7467");

		this.forn.getNumeroNotaFiscal().sendKeys(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.forn.getSerieNotaFiscal().sendKeys(GeradorNumeroRandomico.retornaSerieAleatorio());
		this.forn.getDataEmissaoNotaFiscal().sendKeys(GeracaoData.retornaDataAtual());
		this.forn.getDataVencimentoNotaFiscal().sendKeys(GeracaoData.retornaDataAtualMaisMeses(1));

		this.forn.getTipoDocumento().click();
		Select documento = new Select(forn.getTipoDocumento());
		documento.selectByVisibleText("CNPJ");

		this.forn.getCPF_CNPJ().sendKeys("59105999003959");
		this.forn.getCFOP().click();
		this.loading.loading();
		this.forn.getCFOP().sendKeys("6101");
		this.forn.getBaseICMS().sendKeys("6811074");
		this.forn.getValorICMS().sendKeys("817329");
		this.forn.getBaseFCP().sendKeys("0");
		this.forn.getValorFCP().sendKeys("0");
		this.forn.getBaseICMSST().sendKeys("0");
		this.forn.getValorICMSST().sendKeys("0");
		addEvidenciaWeb("Preenchimento da Nota Fiscal - 1");
		this.forn.getValorTotalProdutos().sendKeys("6519725");
		this.forn.getBaseFCPST().sendKeys("0");
		this.forn.getValorFCPST().sendKeys("0");
		this.forn.getFrete().sendKeys("291349");
		this.forn.getSeguro().sendKeys("0");
		this.forn.getDesconto().sendKeys("0");
		this.forn.getDespesasAcessorias().sendKeys("0");
		this.forn.getIPI().sendKeys("681107");
		this.forn.getTotalValorNota().sendKeys("7492181");
		this.forn.getCodigoBarraNFe().sendKeys("4.2190459105999E+43");
		this.forn.getDadosAdicionais()
				.sendKeys("Obser.: 9180151 - 02.05.2019 as 06:00h Cofins tributado cfe. Lei 10.833/2003 art.1o"
						+ "Pis tributado cfe. Lei 10.637/2002, art.1o Nr Pedido: 7023405676 - Cod. Reparticao: 88005101 - Remessa: 0524926379 - Transporte: 0252597877 - Ped.Cliente: 9600074906 -");
		addEvidenciaWeb("Preenchimento da Nota Fiscal - 2");
	}
	
	public void unidadeNegocioSelecione() {
		SeleniumRobot.MoveToElementWeb(this.forn.getUnidadeNegocio());
		this.forn.getUnidadeNegocio().click();
		Select select = new Select(this.forn.getUnidadeNegocio());
		select.selectByValue("undefined");
		addEvidenciaWeb("Campo Unidade de Negocio com o valor Selecione...");
	}

	public void preencherNfManualMenosNumeroSerie(String elem) {

		this.forn.getUnidadeNegocio().click();
		Select select = new Select(forn.getUnidadeNegocio());
		select.selectByValue("7467");

		this.forn.getNumeroNotaFiscal().sendKeys(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.forn.getSerieNotaFiscal().sendKeys("1");
		this.forn.getDataEmissaoNotaFiscal().sendKeys(GeracaoData.retornaDataAtual());
		this.forn.getDataVencimentoNotaFiscal().sendKeys(GeracaoData.retornaDataAtualMaisMeses(1));

		this.forn.getTipoDocumento().click();
		Select documento = new Select(forn.getTipoDocumento());
		documento.selectByVisibleText("CNPJ");

		this.forn.getCPF_CNPJ().sendKeys("59105999003959");
		this.forn.getCFOP().click();
		this.loading.loading();
		this.forn.getCFOP().sendKeys("6101");
		this.forn.getBaseICMS().sendKeys("6811074");
		this.forn.getValorICMS().sendKeys("817329");
		this.forn.getBaseFCP().sendKeys("0");
		this.forn.getValorFCP().sendKeys("0");
		this.forn.getBaseICMSST().sendKeys("0");
		this.forn.getValorICMSST().sendKeys("0");
		addEvidenciaWeb("Preenchimento da Nota Fiscal - 1");
		this.forn.getValorTotalProdutos().sendKeys("6519725");
		this.forn.getBaseFCPST().sendKeys("0");
		this.forn.getValorFCPST().sendKeys("0");
		this.forn.getFrete().sendKeys("291349");
		this.forn.getSeguro().sendKeys("0");
		this.forn.getDesconto().sendKeys("0");
		this.forn.getDespesasAcessorias().sendKeys("0");
		this.forn.getIPI().sendKeys("681107");
		this.forn.getTotalValorNota().sendKeys("7492181");
		this.forn.getCodigoBarraNFe().sendKeys("4.2190459105999E+43");
		this.forn.getDadosAdicionais()
				.sendKeys("Obser.: 9180151 - 02.05.2019 as 06:00h Cofins tributado cfe. Lei 10.833/2003 art.1o"
						+ "Pis tributado cfe. Lei 10.637/2002, art.1o Nr Pedido: 7023405676 - Cod. Reparticao: 88005101 - Remessa: 0524926379 - Transporte: 0252597877 - Ped.Cliente: 9600074906 -");
		addEvidenciaWeb("Preenchimento da Nota Fiscal - 2");
		this.limpaCampo(elem);
		this.forn.getCodigoBarraNFe().click();
		addEvidenciaWeb("Removendo o valor do campo " + elem);
	}

	public void clicarBotaoSavarNF() {
		forn.getButtonSalvar().click();
		this.loading.loading();
	}

	public void verificarSessaoPedidoNF() {
		SeleniumRobot.MoveToElementWeb(this.forn.getsessaoPedidoNF());
		assertTrue("Campo Número do pedido não está sendo apresentado", this.forn.getNumeroPedido().isDisplayed());
		assertTrue("Campo Data de Embarque não está sendo apresentado", this.forn.getDataEmbarque().isDisplayed());
		assertTrue("Campo Data de Cancelamaneto não está sendo apresentado",
				this.forn.getDataCancelamento().isDisplayed());
		assertTrue("Campo Data do Pedido não está sendo apresentado", this.forn.getDataPedido().isDisplayed());
		assertTrue("Campo Horário Efet. dos impostos não está sendo apresentado",
				this.forn.getHorarioEfetivoImposto().isDisplayed());
		assertTrue("Campo Situação não está sendo apresentado", this.forn.getSituacaoPedido().isDisplayed());
		addEvidenciaWeb("Sessão Pedido da Nota Fiscal");
	}

	public boolean botaoSalvarDesabilitado() {
		SeleniumRobot.MoveToElementWeb(this.forn.getButtonSalvar());
		addEvidenciaWeb("Botão Salavar Desabilitado");
		return forn.getButtonSalvar().isEnabled();

	}

	public boolean botaoSalvarHabilitado() {
		SeleniumRobot.MoveToElementWeb(forn.getButtonSalvar());
		addEvidenciaWeb("Botão Salavar Habilitado");
		return forn.getButtonSalvar().isEnabled();

	}

	public void limpaCampo(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(forn));
		String quant = manu.getElement(forn).getAttribute("value");
		for (int i = 1; i <= quant.length(); i++) {
			manu.getElement(forn).sendKeys(Keys.BACK_SPACE);
		}
	}

	public void preecherLetras(String elem) {
		this.loading.loading();
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		manu.getElement(forn).sendKeys("ABCD");
		addEvidenciaWeb("Digitando Letras");
	}

	public void preencherCaracteresEspeciais(String elem) {
		this.loading.loading();
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		manu.getElement(forn).sendKeys("~!@#$%^&*()-+=\\/");
		addEvidenciaWeb("Digitando Caracteres Especiais");
	}

	public void preencherValorNegativo(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		manu.getElement(forn).sendKeys("-100");
		addEvidenciaWeb("Digitando Valores Negativos");
	}

	public boolean verificarCampoVazio(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		return manu.getElement(forn).getAttribute("value").isEmpty();
	}
	
	public String retornaValorCampo(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		this.forn.getInscricaoEstadual().click();
		return manu.getElement(forn).getAttribute("value").replace("R$", "").replace(",", ".").trim().toString();
	}
	
	public String retornaValorCamposData(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		clicarCampoCNPJ();
		return manu.getElement(forn).getAttribute("value").toString();
	}

	public boolean verificarValorPositivo(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		addEvidenciaWeb("Verificando Valor Positivo");
		return Double.parseDouble(
				manu.getElement(forn).getAttribute("value").replace("R$", "").replace(",", ".").trim()) > 0;
				
	}

	public void preencherCampoLetra(String elem) {
		SNF_NFManual manu = SNF_LimparCamposNFManual.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.forn));
		manu.getElement(this.forn).sendKeys("ABCD");
		addEvidenciaWeb("Digitando Letras");
	}
	
	public void clicarCampoCNPJ() {
		this.forn.getCPF_CNPJ().click();
	}
	
	public void clicarCampoIncricaoEstadual() {
		this.forn.getInscricaoEstadual().click();
	}
	
}
