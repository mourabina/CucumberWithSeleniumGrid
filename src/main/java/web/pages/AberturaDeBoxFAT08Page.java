package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class AberturaDeBoxFAT08Page extends BaseTest {

	@FindBy(id = "Label12")
	private WebElement labelTituloPaginaAberturaDeBox;

	@FindBy(id = "OPCAO")
	private WebElement inputMAINT;

	@FindBy(id = "TUDO")
	private WebElement inputDeletarTudo;

	@FindBy(id = "DEP_WM")
	private WebElement labelDeposito;

	@FindBy(id = "NUMDOC")
	private WebElement inputNumeroBox;

	@FindBy(id = "ACAO1")
	private WebElement inputAcao_1;

	@FindBy(id = "LOJA1_WM")
	private WebElement inputLoja_1;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	public AberturaDeBoxFAT08Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPaginaAberturaDeBox() {
		return labelTituloPaginaAberturaDeBox;
	}

	public WebElement getInputMAINT() {
		return inputMAINT;
	}

	public WebElement getInputDeletarTudo() {
		return inputDeletarTudo;
	}

	public WebElement getLabelDeposito() {
		return labelDeposito;
	}

	public WebElement getInputNumeroBox() {
		return inputNumeroBox;
	}

	public WebElement getInputAcao_1() {
		return inputAcao_1;
	}

	public WebElement getInputLoja_1() {
		return inputLoja_1;
	}

	public WebElement getMsg() {
		return msg;
	}

}
