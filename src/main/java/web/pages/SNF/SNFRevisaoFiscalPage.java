package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRevisaoFiscalPage {

	@FindBy(xpath = "//h2[@class='text-left']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//*[@id='businessUnitId']//span[@class='dropdown-btn']")
	private WebElement selectFilial;

	@FindBy(xpath = "//div[@class='dropdown-list']//div[contains(text(),'Marcar todos')]")
	private WebElement chechboxMarcarTodos;

	@FindBy(xpath = "//input[@placeholder='Procurar']")
	private WebElement inputProcurar;

	@FindBy(xpath = "//ul[@class='item2']//input")
	private WebElement checkboxMarcarFilial;

	@FindBy(xpath = "//label[contains(text(),'Tipo Pesquisa')]/ancestor::div[@class='form-group row']//select")
	private WebElement selectTipoPesquisa;

	@FindBy(id = "poNbr")
	private WebElement inputNumeroPedido;

	@FindBy(id = "cgcCpfTaxId")
	private WebElement inputCPFCNPJFornecedor;

	@FindBy(id = "statusCode")
	private WebElement selectSituacao;

	@FindBy(id = "pendingStatusCheck")
	private WebElement selectNFSPendentesDeRevisao;

	public SNFRevisaoFiscalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getChechboxMarcarTodos() {
		return chechboxMarcarTodos;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getCheckboxMarcarFilial() {
		return checkboxMarcarFilial;
	}

	public WebElement getSelectTipoPesquisa() {
		return selectTipoPesquisa;
	}

	public WebElement getInputNumeroPedido() {
		return inputNumeroPedido;
	}

	public WebElement getInputCPFCNPJFornecedor() {
		return inputCPFCNPJFornecedor;
	}

	public WebElement getSelectSituacao() {
		return selectSituacao;
	}

	public WebElement getSelectNFSPendentesDeRevisao() {
		return selectNFSPendentesDeRevisao;
	}

}
