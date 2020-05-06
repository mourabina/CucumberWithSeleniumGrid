package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class Expedicao_ConferenciaEmbarquePage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_AFTURNO_FX")
	private WebElement buttonConferenciaEmbaqueTarefa;

	@FindBy(id = "BT_DOCA_FX")
	private WebElement buttonAssociaVeiculoViagem;

	@FindBy(id = "BT_ARMAZENA_FX")
	private WebElement buttonFinalizaViagemDoca;

	@FindBy(id = "Button1_FX")
	private WebElement buttonLiberaViagemDoca;

	@FindBy(id = "Button2_FX")
	private WebElement buttonEmbarqueSortimentos;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public Expedicao_ConferenciaEmbarquePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonConferenciaEmbaqueTarefa() {
		return buttonConferenciaEmbaqueTarefa;
	}

	public WebElement getButtonAssociaVeiculoViagem() {
		return buttonAssociaVeiculoViagem;
	}

	public WebElement getButtonFinalizaViagemDoca() {
		return buttonFinalizaViagemDoca;
	}

	public WebElement getButtonLiberaViagemDoca() {
		return buttonLiberaViagemDoca;
	}

	public WebElement getButtonEmbarqueSortimentos() {
		return buttonEmbarqueSortimentos;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
