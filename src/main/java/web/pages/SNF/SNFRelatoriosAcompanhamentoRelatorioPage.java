package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatoriosAcompanhamentoRelatorioPage {

	@FindBy(xpath = "//h4[text()='Acompanhamento de Relatórios']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//input[@placeholder='Procurar...']")
	private WebElement inputProcurar;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	private WebElement btEfetuarDownload;

	public SNFRelatoriosAcompanhamentoRelatorioPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getBtEfetuarDownload() {
		return btEfetuarDownload;
	}

}
