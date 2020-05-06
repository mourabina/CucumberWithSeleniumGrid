package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class Expedicao_OperacoesPorItem extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_OTIMIT_FX")
	private WebElement buttonOtimizacaoTarefaPorItem;

	@FindBy(id = "BT_CONF_IT_FX")
	private WebElement buttonConferenciaTarefaPorItem;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public Expedicao_OperacoesPorItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonOtimizacaoTarefaPorItem() {
		return buttonOtimizacaoTarefaPorItem;
	}

	public WebElement getButtonConferenciaTarefaPorItem() {
		return buttonConferenciaTarefaPorItem;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
