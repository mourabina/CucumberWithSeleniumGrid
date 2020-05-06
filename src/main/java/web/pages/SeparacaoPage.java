package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class SeparacaoPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_AFTURNO_FX")
	private WebElement buttonAbreFechaTurno;

	@FindBy(id = "BT_XDOCK_FX")
	private WebElement buttonXDocking;

	@FindBy(id = "BT_BPACK_FX")
	private WebElement buttonBreakPak;

	@FindBy(id = "BT_ESTOCADO_FX")
	private WebElement buttonEstocado;

	@FindBy(id = "BT_HORTI_FX")
	private WebElement buttonHorti;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public SeparacaoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonAbreFechaTurno() {
		return buttonAbreFechaTurno;
	}

	public WebElement getButtonXDocking() {
		return buttonXDocking;
	}

	public WebElement getButtonBreakPak() {
		return buttonBreakPak;
	}

	public WebElement getButtonEstocado() {
		return buttonEstocado;
	}

	public WebElement getButtonHorti() {
		return buttonHorti;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
