package web.funcionalidade.SNF;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_VisualizarNotaFiscalRemessa;
import web.bean.interfaces.SNF_VisualizarNotaFiscalRemessaInterface;
import web.pages.SNF.SNFVisualizarNotasFiscaisRemessaPage;

public class SNF_VisualizarNotaFiscalRemessaFuncionalidade extends BaseTest {

	private SNFVisualizarNotasFiscaisRemessaPage remessa;
	private waitLoading load;

	public SNF_VisualizarNotaFiscalRemessaFuncionalidade() {
		this.remessa = new SNFVisualizarNotasFiscaisRemessaPage(webDriver);
		this.load = new waitLoading();
	}

	public void preencherTodosCamposPesquisarRemessa() {
		this.load.loading();
		Select select = new Select(remessa.getSelectFilialDestino());
		select.selectByValue("7472");
		Select selectCNPJ = new Select(remessa.getSelectTipoDocumento());
		selectCNPJ.selectByValue("CNPJ");
		this.remessa.getInputNomeFornecedor().sendKeys("Fornecedor Grupo Big");
		this.remessa.getInputSerieNF().sendKeys("1");
		Select selectSituacao = new Select(remessa.getSelectSituacaoNotaFiscal());
		selectSituacao.selectByVisibleText("Aprovada");
		this.remessa.getInputNotaFiscal().sendKeys("909001");
		addEvidenciaWeb("Campos preenchidos com sucesso");
	}

	public void preecherLetras(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys("ABCD");
		addEvidenciaWeb("Digitando valores Invalidos");
	}

	public void preencherCaracteresEspeciais(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys("~!@#$%^&*()-+=\\/");
		addEvidenciaWeb("Digitando valores Invalidos");
	}

	public void preencherCaracteresNumeros(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys("25365874");
		addEvidenciaWeb("Digitando valores Validos");
	}

	public boolean verificarCampoVazio(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		addEvidenciaWeb("Campo Está Vazio");
		return manu.getElement(this.remessa).getAttribute("value").isEmpty();
	}
	
	public String verificarTextoCampo(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		addEvidenciaWeb("Não Aceita Valores Invalidos");
		return manu.getElement(this.remessa).getAttribute("value").toString();
	}
	
	public void preencherCampoDataValida(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys(GeracaoData.retornaDataAtual());
		this.remessa.getInputSecao().click();
		addEvidenciaWeb("Digitando valores Validos");
	}
	
	public void preencherCampoDataInvalida(String elem, String valor) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys(valor);
		this.remessa.getInputSecao().click();
		addEvidenciaWeb("Digitando valores Invalidos");
	}
	
	public String validarTextoCampoData(String elem) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		addEvidenciaWeb("Digitando valores Invalidos");
		return manu.getElement(this.remessa).getAttribute("value").toString();
	}
	
	public void clicarBotaoLimpar() {
		this.remessa.getButtonLimpar().click();
	}

	public void clicarBotaoPesquisar() {
		this.remessa.getButtonPesquisar().click();
	}

	public String verificaUnidadeNegocioSelecione() {
		addEvidenciaWeb("Campo Filial Destino com o Valor Selecione...");
		this.load.loading();
		Select uni = new Select(this.remessa.getSelectFilialDestino());
		return uni.getFirstSelectedOption().getText().trim();
	}

	public String verificaSituacaoSelecione() {
		addEvidenciaWeb("Campo Situação Nota Fiscal com o Valor Selecione...");
		Select sit = new Select(this.remessa.getSelectSituacaoNotaFiscal());
		return sit.getFirstSelectedOption().getText().trim();
	}

	public void preencherCamposPesquisa(String elem, String valor) {
		SNF_VisualizarNotaFiscalRemessaInterface manu = SNF_VisualizarNotaFiscalRemessa
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.remessa));
		manu.getElement(this.remessa).sendKeys(valor);
		addEvidenciaWeb("Digitando o valor " + valor +  " no campo  " + elem );
	}
	
	

}
