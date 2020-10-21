package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFConversaoPacoteFornecedorPage {

	@FindBy(xpath = "//h2[text()='Conversão Pacote Fornecedor']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//input[@placeholder = 'Procurar...']")
	private WebElement inputPesquisar;

	@FindBy(id = "buId")
	private WebElement selectFilial;

	@FindBy(id = "itemNbr")
	private WebElement inputNumeroItem;

	@FindBy(id = "vendorStockId")
	private WebElement inputIDEstoqueFornecedor;

	@FindBy(id = "itemDesc")
	private WebElement inputDescricaoItem;

	@FindBy(xpath = "//i[@class = 'fas fa-eraser']")
	private WebElement buttonLimpar;

	@FindBy(xpath = "//i[@class = 'fas fa-search']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//td[@class = 'text-secondary']")
	private WebElement gridResultadoPesquisa;

	// ============================================Editar Conversão Pacote
	// Fornecedor================================================

	@FindBy(id = "vndrConversionQty")
	private WebElement inputQuatPacoteNF;

	@FindBy(id = "vndrUomCode")
	private WebElement selctUomNF;

	@FindBy(id = "vnpkQty")
	private WebElement inputPacoteFornecedor;

	@FindBy(id = "vendorPackCnt")
	private WebElement inpuQuantidadePacote;

	@FindBy(id = "vnpkUomCode")
	private WebElement selectUomWM;

	public SNFConversaoPacoteFornecedorPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputQuatPacoteNF() {
		return inputQuatPacoteNF;
	}

	public WebElement getSelctUomNF() {
		return selctUomNF;
	}

	public WebElement getInputPacoteFornecedor() {
		return inputPacoteFornecedor;
	}

	public WebElement getInpuQuantidadePacote() {
		return inpuQuantidadePacote;
	}

	public WebElement getSelectUomWM() {
		return selectUomWM;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputPesquisar() {
		return inputPesquisar;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getInputNumeroItem() {
		return inputNumeroItem;
	}

	public WebElement getInputIDEstoqueFornecedor() {
		return inputIDEstoqueFornecedor;
	}

	public WebElement getInputDescricaoItem() {
		return inputDescricaoItem;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getGridResultadoPesquisa() {
		return gridResultadoPesquisa;
	}

}
