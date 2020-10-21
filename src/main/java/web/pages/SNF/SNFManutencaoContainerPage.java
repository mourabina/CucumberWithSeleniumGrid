package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFManutencaoContainerPage {

	@FindBy(xpath = "//h2[text()='Manutenção de container']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//a[@class='btn btn-secondary mr-2']/i")
	private WebElement buttonAtualizar;

	@FindBy(xpath = "//input[@placeholder='Procurar...']")
	private WebElement inputProcurar;

	@FindBy(id = "businessUnitId")
	private WebElement selectFilial;

	@FindBy(id = "status")
	private WebElement selectSituacao;

	@FindBy(xpath = "//i[@class='fas fa-eraser']")
	private WebElement buttonLimpar;

	@FindBy(xpath = "//i[@class='fas fa-search']")
	private WebElement buttonProcurar;

	@FindBy(xpath = "//a[@class='btn btn-link text-primary']")
	private WebElement btGridEditar;

	public SNFManutencaoContainerPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getBtGridEditar() {
		return btGridEditar;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getSelectSituacao() {
		return selectSituacao;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonProcurar() {
		return buttonProcurar;
	}

}
