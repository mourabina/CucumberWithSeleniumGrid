package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class CadastroDocasRecebimentoRFA17Page extends BaseTest {

	@FindBy(id = "Label13")
	private WebElement labelTituloPaginaCadastrDocsRecebimen;

	@FindBy(id = "OPCAO")
	private WebElement inputMAINT;

	@FindBy(id = "DEP_WM")
	private WebElement inputDepositoWM;

	@FindBy(id = "panel_ACAO1_0")
	private WebElement inputAcaoGrid_0;

	@FindBy(id = "panel_NUM1_0")
	private WebElement inputDocsGrid_0;

	@FindBy(id = "panel_OCUP1_0")
	private WebElement labelOcupado;

	public CadastroDocasRecebimentoRFA17Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPaginaCadastrDocsRecebimen() {
		return labelTituloPaginaCadastrDocsRecebimen;
	}

	public WebElement getInputMAINT() {
		return inputMAINT;
	}

	public WebElement getInputDepositoWM() {
		return inputDepositoWM;
	}

	public WebElement getInputAcaoGrid_0() {
		return inputAcaoGrid_0;
	}

	public WebElement getInputDocsGrid_0() {
		return inputDocsGrid_0;
	}

	public WebElement getLabelOcupado() {
		return labelOcupado;
	}

}
