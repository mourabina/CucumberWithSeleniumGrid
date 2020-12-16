package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultaArquivosGeraisROT06Page {

	@FindBy(id = "label6")
	private WebElement tituloPagina;

	@FindBy(id = "btnExcluir")
	private WebElement btnExcluir;

	@FindBy(id = "btnListar")
	private WebElement btnListar;

	@FindBy(id = "inputFiltro")
	private WebElement inuputFiltroPorNome;

	@FindBy(id = "selectTipo")
	private WebElement selectTipo;

	@FindBy(id = "inputSince")
	private WebElement inputDataInicial;

	@FindBy(id = "inputUntil")
	private WebElement inputDataFinal;

	@FindBy(id = "comboImpressora")
	private WebElement selectImpressora;

	@FindBy(id = "collectionPanelFilesAttrs_inputCheck_0_checkbox")
	private WebElement checkboxNomee_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelSequencia_0")
	private WebElement labelSequenciaGrid_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelUltimaModificacao_0")
	private WebElement labelUltimaModificacao_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelTamanho_0")
	private WebElement labelTamanho_0;

	@FindBy(id = "//label[@id = 'collectionPanelFilesAttrs_labelOperacao_0']/a")
	private WebElement btnVer_0;

	public ConsultaArquivosGeraisROT06Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getBtnExcluir() {
		return btnExcluir;
	}

	public WebElement getBtnListar() {
		return btnListar;
	}

	public WebElement getInuputFiltroPorNome() {
		return inuputFiltroPorNome;
	}

	public WebElement getSelectTipo() {
		return selectTipo;
	}

	public WebElement getInputDataInicial() {
		return inputDataInicial;
	}

	public WebElement getInputDataFinal() {
		return inputDataFinal;
	}

	public WebElement getSelectImpressora() {
		return selectImpressora;
	}

	public WebElement getCheckboxNomee_0() {
		return checkboxNomee_0;
	}

	public WebElement getLabelSequenciaGrid_0() {
		return labelSequenciaGrid_0;
	}

	public WebElement getLabelUltimaModificacao_0() {
		return labelUltimaModificacao_0;
	}

	public WebElement getLabelTamanho_0() {
		return labelTamanho_0;
	}

	public WebElement getBtnVer_0() {
		return btnVer_0;
	}

}
