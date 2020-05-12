package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class LoginRFABRPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement tituloPagina;

	@FindBy(id = "TL_USUARIO")
	private WebElement inputUsuario;

	@FindBy(id = "XTL_SENHA")
	private WebElement inputSenha;

	@FindBy(id = "TL_EMP")
	private WebElement inputEmpresa;

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement inputFilialWM;

	@FindBy(id = "Button1_FX")
	private WebElement buttonOK;

	public LoginRFABRPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputUsuario() {
		return inputUsuario;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public WebElement getInputEmpresa() {
		return inputEmpresa;
	}

	public WebElement getInputFilialWM() {
		return inputFilialWM;
	}

	public WebElement getButtonOK() {
		return buttonOK;
	}

}
