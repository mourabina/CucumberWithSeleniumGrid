package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class CadastroDeDocasFAT28Page extends BaseTest {

	@FindBy(id = "Label13")
	private WebElement labelTituloPaginaCadastroDocas;

	@FindBy(id = "DEPWM")
	private WebElement labelDeposito;

	@FindBy(id = "OPCAO")
	private WebElement inputMAINT;

	@FindBy(id = "panel_ACAO1_0")
	private WebElement inputAcao_0;

	@FindBy(id = "panel_NUM1_0")
	private WebElement inputDoca_0;

	@FindBy(id = "panel_OCUP1_0")
	private WebElement inputOcupacao_0;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	public CadastroDeDocasFAT28Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPaginaCadastroDocas() {
		return labelTituloPaginaCadastroDocas;
	}

	public WebElement getLabelDeposito() {
		return labelDeposito;
	}

	public WebElement getInputMAINT() {
		return inputMAINT;
	}

	public WebElement getInputAcao_0() {
		return inputAcao_0;
	}

	public WebElement getInputDoca_0() {
		return inputDoca_0;
	}

	public WebElement getInputOcupacao_0() {
		return inputOcupacao_0;
	}

	public WebElement getMsg() {
		return msg;
	}

}
