package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFConsultaNotasFiscaisAnulacaoPage {

	@FindBy(xpath = "//label[@for='filial']/ancestor::div[@class='form-group row']//select")
	private WebElement seletFilial;

	@FindBy(xpath = "//label[@for='empresa']/ancestor::div[@class='row form-group']//select")
	private WebElement selectEmpresa;

	@FindBy(xpath = "//label[@for='natuOp']/ancestor::div[@class='row form-group']//select")
	private WebElement selectNaturezzaOperacao;

	@FindBy(xpath = "//label[@for='state']/ancestor::div[@class='row form-group']//select")
	private WebElement selectUF;

	@FindBy(xpath = "//label[contains(text(),'Data de Solicitação')]/ancestor::div[@class='row form-group']//input")
	private WebElement inputDataSolicitacao;

	public SNFConsultaNotasFiscaisAnulacaoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeletFilial() {
		return seletFilial;
	}

	public WebElement getSelectEmpresa() {
		return selectEmpresa;
	}

	public WebElement getSelectNaturezzaOperacao() {
		return selectNaturezzaOperacao;
	}

	public WebElement getSelectUF() {
		return selectUF;
	}

	public WebElement getInputDataSolicitacao() {
		return inputDataSolicitacao;
	}

}
