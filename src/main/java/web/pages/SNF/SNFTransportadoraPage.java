package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFTransportadoraPage {
	
	@FindBy(xpath = "//h2[text()='Manutenção de Transportadora']")
	private WebElement tituloPagina;
	
	@FindBy(xpath = "//i[@class='fa fa-plus-circle']")
	private WebElement buttonMais;
	
	@FindBy(xpath = "//i[@class='fas fa-sync-alt']")
	private WebElement buttonAtualizar;
	
	@FindBy(xpath = "//input[@class='form-control rounder']")
	private WebElement inputProcurar;
	
	@FindBy(id = "id")
	private WebElement inputIDTransportadora;
	
	@FindBy(id = "vendorNbr")
	private WebElement inputNumeroFornecedor;
	
	@FindBy(id = "cnpjBranchNbr")
	private WebElement inputCNPJ_CPF;
	
	@FindBy(id = "status")
	private WebElement selectSituacao;
	
	@FindBy(xpath = "//i[@class='fas fa-eraser']")
	private WebElement buttonLimpar;
	
	@FindBy(xpath = "//i[@class='fas fa-search']")
	private WebElement buttonPesquisar;
	
	public SNFTransportadoraPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getInputIDTransportadora() {
		return inputIDTransportadora;
	}

	public WebElement getInputNumeroFornecedor() {
		return inputNumeroFornecedor;
	}

	public WebElement getInputCNPJ_CPF() {
		return inputCNPJ_CPF;
	}

	public WebElement getSelectSituacao() {
		return selectSituacao;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

}
