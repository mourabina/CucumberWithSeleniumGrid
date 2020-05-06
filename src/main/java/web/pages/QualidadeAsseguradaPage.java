package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class QualidadeAsseguradaPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_AUDIT_FX")
	private WebElement buttonAuditoria;

	@FindBy(id = "BT_QA_INV_FX")
	private WebElement buttonInventarioRotativo;

	@FindBy(id = "BT_AU_CTREXPED_FX")
	private WebElement buttonEstorno;

	@FindBy(id = "BT_MANUT_ENDER_FX")
	private WebElement buttonManutencaoEndereco;

	@FindBy(id = "BT_MENU_FX")
	private WebElement buttonMenu;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonLogin;

	public QualidadeAsseguradaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonAuditoria() {
		return buttonAuditoria;
	}

	public WebElement getButtonInventarioRotativo() {
		return buttonInventarioRotativo;
	}

	public WebElement getButtonEstorno() {
		return buttonEstorno;
	}

	public WebElement getButtonManutencaoEndereco() {
		return buttonManutencaoEndereco;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
