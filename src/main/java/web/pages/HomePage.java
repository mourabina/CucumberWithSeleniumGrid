package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement megSucesso;

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement menuContas;

	@FindBy(xpath = "//a[text()='Criar Movimentação']")
	private WebElement menuCriarMovimentacao;

	@FindBy(xpath = "//a[text()='Resumo Mensal']")
	private WebElement menuResumoMensal;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement menuHome;

	@FindBy(xpath = "//a[text()='Adicionar']")
	private WebElement subMenuAdicionar;

	@FindBy(xpath = "//a[text()='Listar']")
	private WebElement subMenuListar;

	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMenuHome() {
		return menuHome;
	}

	public WebElement getMenuContas() {
		return menuContas;
	}

	public WebElement getMenuCriarMovimentacao() {
		return menuCriarMovimentacao;
	}

	public WebElement getMenuResumoMensal() {
		return menuResumoMensal;
	}

	public WebElement getMegSucesso() {
		return megSucesso;
	}

	public WebElement getSubMenuAdicionar() {
		return subMenuAdicionar;
	}

	public WebElement getSubMenuListar() {
		return subMenuListar;
	}

}
