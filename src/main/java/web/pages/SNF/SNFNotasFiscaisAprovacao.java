package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFNotasFiscaisAprovacao {

	@FindBy(xpath = "//label[@for =\"filial\"]/following-sibling::div//select")
	private WebElement filial;
	
	@FindBy(xpath = "//label[@for =\"empresa\"]/following-sibling::div//select")
	private WebElement empresa;
	
	@FindBy(xpath = "//label[@for =\"natuOp\"]/following-sibling::div//select")
	private WebElement naturezaOperacao;
	
	@FindBy(xpath = "//label[@for =\"state\"]/following-sibling::div//select")
	private WebElement estado;
	
	@FindBy(xpath = "//label[contains(text(),\"Data de Solicitação\")]/following-sibling::div//input")
	private WebElement dataSolicitacao;
	
	@FindBy(xpath = "//button[contains(text(),\"Aprovar\")]")
	private WebElement btnAprovar;
	
	@FindBy(xpath = "//button[contains(text(),\"Rejeitar\")]")
	private WebElement btnRejeitar;
	
	public SNFNotasFiscaisAprovacao(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getFilial() {
		return filial;
	}

	public WebElement getEmpresa() {
		return empresa;
	}

	public WebElement getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public WebElement getEstado() {
		return estado;
	}

	public WebElement getDataSolicitacao() {
		return dataSolicitacao;
	}

	public WebElement getBtnAprovar() {
		return btnAprovar;
	}

	public WebElement getBtnRejeitar() {
		return btnRejeitar;
	}
}