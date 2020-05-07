package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ExpedicaoPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPaginaExpedicao;

	@FindBy(id = "BT_AFTURNO_FX")
	private WebElement itemMenuExpdicaoAbreFechaTurno;

	@FindBy(id = "BT_CONFPLT_FX")
	private WebElement itemMenuExpdicaoConferenciaEmbarque;

	@FindBy(id = "Button1_FX")
	private WebElement itemMenuExpdicaoOperacoesExcecao;

	@FindBy(id = "Button2_FX")
	private WebElement itemMenuExpdicaoOperacoesPorItem;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public ExpedicaoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPaginaExpedicao() {
		return labelTituloPaginaExpedicao;
	}

	public WebElement getItemMenuExpdicaoAbreFechaTurno() {
		return itemMenuExpdicaoAbreFechaTurno;
	}

	public WebElement getItemMenuExpdicaoConferenciaEmbarque() {
		return itemMenuExpdicaoConferenciaEmbarque;
	}

	public WebElement getItemMenuExpdicaoOperacoesExcecao() {
		return itemMenuExpdicaoOperacoesExcecao;
	}

	public WebElement getItemMenuExpdicaoOperacoesPorItem() {
		return itemMenuExpdicaoOperacoesPorItem;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
