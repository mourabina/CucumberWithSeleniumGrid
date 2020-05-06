package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class EntradaPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_RECEB_FX")
	private WebElement buttonRecebimento;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public EntradaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonRecebimento() {
		return buttonRecebimento;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
