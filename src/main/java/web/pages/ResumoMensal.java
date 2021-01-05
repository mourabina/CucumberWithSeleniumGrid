package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResumoMensal {

	@FindBy(xpath = "//table[@id='tabelaExtrato']//tbody//tr[1]/td[6]//span")
	private WebElement btnDeletarMovimentacao;

	@FindBy(xpath = "//div[contains(@class,'alert alert')]")
	private WebElement mengExibida;

	public ResumoMensal(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtnDeletarMovimentacao() {
		return btnDeletarMovimentacao;
	}

	public WebElement getMengExibida() {
		return mengExibida;
	}

}
