package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultaArquivosGeraisROT06Page {

	@FindBy(id = "label6")
	private WebElement tituloPagina;

	@FindBy(id = "btnRenomear")
	private WebElement bt_renomear;

	@FindBy(id = "btnListar")
	private WebElement br_listar;

	@FindBy(id = "inputFiltro")
	private WebElement filtrarPorNome;

	@FindBy(id = "selectTipo")
	private WebElement selectTipo;

	@FindBy(id = "collectionPanelFilesAttrs_inputControle_0")
	private WebElement inputControle_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelNome_0")
	private WebElement labelNome_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelSequencia_0")
	private WebElement labelSequencia_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelTamanho_0")
	private WebElement labelTamanho_0;

	@FindBy(id = "collectionPanelFilesAttrs_labelOperacao_0")
	private WebElement labelOpercao_0;

	public ConsultaArquivosGeraisROT06Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getBt_renomear() {
		return bt_renomear;
	}

	public WebElement getBr_listar() {
		return br_listar;
	}

	public WebElement getFiltrarPorNome() {
		return filtrarPorNome;
	}

	public WebElement getSelectTipo() {
		return selectTipo;
	}

	public WebElement getInputControle_0() {
		return inputControle_0;
	}

	public WebElement getLabelNome_0() {
		return labelNome_0;
	}

	public WebElement getLabelSequencia_0() {
		return labelSequencia_0;
	}

	public WebElement getLabelTamanho_0() {
		return labelTamanho_0;
	}

	public WebElement getLabelOpercao_0() {
		return labelOpercao_0;
	}

}
