package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ArmazenagemPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_PUTAWAY_FX")
	private WebElement buttonPutAway;

	@FindBy(id = "BT_LETDOWN_FX")
	private WebElement buttonLetDown;

	@FindBy(id = "BT_ALOCACAO_FX")
	private WebElement buttonAlocacao;

	@FindBy(id = "BT_INVENTARIO_FX")
	private WebElement buttonInvetario;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public ArmazenagemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonPutAway() {
		return buttonPutAway;
	}

	public WebElement getButtonLetDown() {
		return buttonLetDown;
	}

	public WebElement getButtonAlocacao() {
		return buttonAlocacao;
	}

	public WebElement getButtonInvetario() {
		return buttonInvetario;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
