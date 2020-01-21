package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "TL_USUARIO")
	private WebElement InputUser;

	@FindBy(id = "XTL_SENHA")
	private WebElement inputPass;

	@FindBy(id = "TL_EMP")
	private WebElement inputEmpresa;

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement inputFilial;

	@FindBy(id = "BTN_LOGIN_FX")
	private WebElement btnLogin;

	
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
}
