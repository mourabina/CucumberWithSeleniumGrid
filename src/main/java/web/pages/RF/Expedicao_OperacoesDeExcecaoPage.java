package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class Expedicao_OperacoesDeExcecaoPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_AFTURNO_FX")
	private WebElement buttonEnvioTarefaParaEndPulm;

	@FindBy(id = "BT_EXCTRB_FX")
	private WebElement buttonEnvioRetiradaEndPulm;

	@FindBy(id = "BT_DOCA_FX")
	private WebElement buttonOtimizacaoDeTarefa;

	@FindBy(id = "BT_TVD_FX")
	private WebElement buttonTrocaVeiculoDaDoca;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public Expedicao_OperacoesDeExcecaoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonEnvioTarefaParaEndPulm() {
		return buttonEnvioTarefaParaEndPulm;
	}

	public WebElement getButtonEnvioRetiradaEndPulm() {
		return buttonEnvioRetiradaEndPulm;
	}

	public WebElement getButtonOtimizacaoDeTarefa() {
		return buttonOtimizacaoDeTarefa;
	}

	public WebElement getButtonTrocaVeiculoDaDoca() {
		return buttonTrocaVeiculoDaDoca;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
