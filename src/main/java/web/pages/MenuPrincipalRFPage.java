package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class MenuPrincipalRFPage extends BaseTest {

	@FindBy(id = "Label4")
	private WebElement labelTituloPagina;

	@FindBy(id = "BT_ENTRADA_FX")
	private WebElement itemMenuEntrada;

	@FindBy(id = "BT_ARMAZ_FX")
	private WebElement itemMenuArmazenagem;

	@FindBy(id = "BT_SEP_FX")
	private WebElement itemMenuSeparacao;

	@FindBy(id = "BT_EXPED_FX")
	private WebElement itemMenuExpedicao;

	@FindBy(id = "BT_AUDIT_FX")
	private WebElement itemMenuQualidadeAsegurada;

	@FindBy(id = "BT_LOGIN_FX")
	private WebElement buttonlogin;

	public MenuPrincipalRFPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getItemMenuEntrada() {
		return itemMenuEntrada;
	}

	public WebElement getItemMenuArmazenagem() {
		return itemMenuArmazenagem;
	}

	public WebElement getItemMenuSeparacao() {
		return itemMenuSeparacao;
	}

	public WebElement getItemMenuExpedicao() {
		return itemMenuExpedicao;
	}

	public WebElement getItemMenuQualidadeAsegurada() {
		return itemMenuQualidadeAsegurada;
	}

	public WebElement getButtonlogin() {
		return buttonlogin;
	}

}
