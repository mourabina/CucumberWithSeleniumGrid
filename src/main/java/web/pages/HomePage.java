package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	@FindBy(xpath = "//*[contains(@href,\"MENUG\")]")
	private WebElement HomePageIcon;
	
	@FindBy(id = "auxProxTela")
	private WebElement inputProxiTela;
	
	@FindBy(id = "nomeUsuario")
	private WebElement labelMSGBemVindoUsuario;
	
	@FindBy(id = "btnTransmitir")
	private WebElement Btntransmitir;
	
	@FindBy(id = "itemMenu1")
	private WebElement compras;
	
	@FindBy(id = "itemMenu2")
	private WebElement entrada;
	
	@FindBy(id = "itemMenu3")
	private WebElement faturamento;
	
	@FindBy(id = "itemMenu4")
	private WebElement fiscal;
	
	@FindBy(xpath = "'//a[@class='nav-link navbar-brand glyphicon glyphicon-off pull-left ']")
	private WebElement buttonLogaout;

	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputProxiTela() {
		return inputProxiTela;
	}

	public WebElement getLabelMSGBemVindoUsuario() {
		return labelMSGBemVindoUsuario;
	}

	public WebElement getButtonLogaout() {
		return buttonLogaout;
	}

	public WebElement getBtnTransmitir() {
		return Btntransmitir;
	}

	public WebElement getCompras() {
		return compras;
	}

	public WebElement getEntrada() {
		return entrada;
	}

	public WebElement getFaturamento() {
		return faturamento;
	}

	public WebElement getFiscal() {
		return fiscal;
	}

	public WebElement getHomePageIcon() {
		return HomePageIcon;
	}

	public WebElement getBtntransmitir() {
		return Btntransmitir;
	}

}
