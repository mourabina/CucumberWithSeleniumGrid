package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class PlanejamentoConversaoLojasLJATIPage extends BaseTest {

	@FindBy(id = "LABEL13")
	private WebElement labelTituloPagina;

	@FindBy(id = "TL_CODLJSAD_F_NV4")
	private WebElement inputLoja;

	@FindBy(id = "TL_CODLJSAD_NV4")
	private WebElement inputLoa1;

	@FindBy(id = "TL_CODLJWM")
	private WebElement inputLojaWM;

	@FindBy(id = "TL_SIT")
	private WebElement inputIDSit;

	@FindBy(id = "TL_SITUACAO")
	private WebElement inputDescSituacao;

	@FindBy(id = "TL_DTCONV")
	private WebElement inputConversao;

	@FindBy(id = "TL_DTLIBETL")
	private WebElement inputLibETL;

	@FindBy(id = "TL_DTBLOQ")
	private WebElement inputBloqueio;

	@FindBy(id = "TL_DTLIB")
	private WebElement inputLiebracao;

	@FindBy(id = "TL_DTLIBERACAO6")
	private WebElement inputGrupo1;

	@FindBy(id = "TL_DT_7_25_27")
	private WebElement inputGrupo2;

	@FindBy(id = "TL_DTLIBERACAO57")
	private WebElement inputGrupo3;

	@FindBy(id = "TL_DT_24_26")
	private WebElement inputGrupo4;

	@FindBy(id = "TL_DT_13")
	private WebElement inputGrupo5;

	@FindBy(id = "TL_DT_CONV_NF_INI")
	private WebElement inputDataConversaoInicioNotaFiscal;

	@FindBy(id = "TL_DT_CONV_CUP_INI")
	private WebElement inputDataInicioConversaoCupom;

	@FindBy(id = "TL_DT_CONV_TRNS_INI")
	private WebElement inputDataInicioConversaoTRNS;

	@FindBy(id = "TL_DT_CONV_NF_FIM")
	private WebElement inputDataConversaoFinalNotaFiscal;

	@FindBy(id = "TL_DT_CONV_CUP_FIM")
	private WebElement inputDataFinalConversaoCupom;

	@FindBy(id = "TL_DT_CONV_TRNS_FIM")
	private WebElement inputDataFinalConversaoTRNS;

	@FindBy(id = "TL_FLAG_EDI")
	private WebElement inputHabilitarEnvioEDI;

	@FindBy(id = "TL_SN_CARGA_NOTAS")
	private WebElement inputProcessarCargasNotas;

	@FindBy(id = "TL_CONF")
	private WebElement inputConfins;

	@FindBy(id = "TL_DTCORTE")
	private WebElement dataCorteHNF;

	PlanejamentoConversaoLojasLJATIPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);

	}

	public WebElement getDataCorteHNF() {
		return dataCorteHNF;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputLoja() {
		return inputLoja;
	}

	public WebElement getInputLoa1() {
		return inputLoa1;
	}

	public WebElement getInputLojaWM() {
		return inputLojaWM;
	}

	public WebElement getInputIDSit() {
		return inputIDSit;
	}

	public WebElement getInputDescSituacao() {
		return inputDescSituacao;
	}

	public WebElement getInputConversao() {
		return inputConversao;
	}

	public WebElement getInputLibETL() {
		return inputLibETL;
	}

	public WebElement getInputBloqueio() {
		return inputBloqueio;
	}

	public WebElement getInputLiebracao() {
		return inputLiebracao;
	}

	public WebElement getInputGrupo1() {
		return inputGrupo1;
	}

	public WebElement getInputGrupo2() {
		return inputGrupo2;
	}

	public WebElement getInputGrupo3() {
		return inputGrupo3;
	}

	public WebElement getInputGrupo4() {
		return inputGrupo4;
	}

	public WebElement getInputGrupo5() {
		return inputGrupo5;
	}

	public WebElement getInputDataConversaoInicioNotaFiscal() {
		return inputDataConversaoInicioNotaFiscal;
	}

	public WebElement getInputDataInicioConversaoCupom() {
		return inputDataInicioConversaoCupom;
	}

	public WebElement getInputDataInicioConversaoTRNS() {
		return inputDataInicioConversaoTRNS;
	}

	public WebElement getInputDataConversaoFinalNotaFiscal() {
		return inputDataConversaoFinalNotaFiscal;
	}

	public WebElement getInputDataFinalConversaoCupom() {
		return inputDataFinalConversaoCupom;
	}

	public WebElement getInputDataFinalConversaoTRNS() {
		return inputDataFinalConversaoTRNS;
	}

	public WebElement getInputHabilitarEnvioEDI() {
		return inputHabilitarEnvioEDI;
	}

	public WebElement getInputProcessarCargasNotas() {
		return inputProcessarCargasNotas;
	}

	public WebElement getInputConfins() {
		return inputConfins;
	}

}
