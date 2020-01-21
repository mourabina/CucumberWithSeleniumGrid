package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "idTL_USUARIO")
	private WebElement InputUser;

	@FindBy(id = "idXTL_SENHA")
	private WebElement inputPass;

	@FindBy(id = "idTL_EMP")
	private WebElement inputEmpresa;

	@FindBy(id = "idTL_FILIAL_WM")
	private WebElement inputFilial;

	@FindBy(id = "idBTN_LOGIN_FX")
	private WebElement btnLogin;

	@FindBy(xpath = "//select")
	private WebElement selectSistema;
	
	@FindBy(xpath = "//input[@value=\"OK\"]")
	private WebElement btnOK;
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputUser() {
		return InputUser;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public WebElement getInputEmpresa() {
		return inputEmpresa;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getSelectSistema() {
		return selectSistema;
	}

	public WebElement getBtnOK() {
		return btnOK;
	}

}
