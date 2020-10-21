package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatorioRevisaoFiscalPage {

	@FindBy(xpath = "//h4[text()='Revisão Fiscal']")
	private WebElement tituloPagina;

	@FindBy(xpath = "tipoRelatorio")
	private WebElement selectTipoRelatorio;

	@FindBy(xpath = "//td[@class='text-secondary']")
	private WebElement griResultado;

	public SNFRelatorioRevisaoFiscalPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectTipoRelatorio() {
		return selectTipoRelatorio;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getGriResultado() {
		return griResultado;
	}

}
