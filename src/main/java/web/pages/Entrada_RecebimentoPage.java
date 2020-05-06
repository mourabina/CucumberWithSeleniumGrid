package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class Entrada_RecebimentoPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_COLETA_FX")
	private WebElement buttonIniciarConferencia;

	@FindBy(id = "BT_DTCRIT_FX")
	private WebElement buttonTratarDataCritica;

	@FindBy(id = "BT_INS_PALETE_FX")
	private WebElement buttonInserirPaleteManual;

	@FindBy(id = "BT_CANCELA_FX")
	private WebElement buttonCancelarConferencia;

	@FindBy(id = "Button1_FX")
	private WebElement buttonAutorizaSobra;

	@FindBy(id = "Button2_FX")
	private WebElement buttonArmazenaPaleteCross;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public Entrada_RecebimentoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonIniciarConferencia() {
		return buttonIniciarConferencia;
	}

	public WebElement getButtonTratarDataCritica() {
		return buttonTratarDataCritica;
	}

	public WebElement getButtonInserirPaleteManual() {
		return buttonInserirPaleteManual;
	}

	public WebElement getButtonCancelarConferencia() {
		return buttonCancelarConferencia;
	}

	public WebElement getButtonAutorizaSobra() {
		return buttonAutorizaSobra;
	}

	public WebElement getButtonArmazenaPaleteCross() {
		return buttonArmazenaPaleteCross;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
