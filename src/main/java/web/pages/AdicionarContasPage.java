package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class AdicionarContasPage extends BaseTest {

	@FindBy(id = "nome")
	private WebElement inputNome;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btnSalvar;

	@FindBy(xpath = "//div[contains(@class, \"alert alert\")]")
	private WebElement msgExibida;

	@FindBy(xpath = "//table[@id='tabelaContas']//tbody/tr[1]/td/a[2]")
	private WebElement deletarConta;

	public AdicionarContasPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getDeletarConta() {
		return deletarConta;
	}

	public WebElement getInputNome() {
		return inputNome;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}

	public WebElement getMsgExibida() {
		return msgExibida;
	}

}
