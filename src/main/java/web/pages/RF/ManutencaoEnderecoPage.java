package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoEnderecoPage {
	
	@FindBy(id = "BT_REM_END_FX")
	private WebElement btn_RemanejamentoEndereco;

	@FindBy(id = "BT_CON_FX")
	private WebElement btn_ConsultarEndereco;
	
	@FindBy(id = "BT_VAR_PRI_FX")
	private WebElement btn_VarreduraPrimarias;
	
	public ManutencaoEnderecoPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public WebElement getBtn_RemanejamentoEndereco() {
		return btn_RemanejamentoEndereco;
	}

	public WebElement getBtn_ConsultarEndereco() {
		return btn_ConsultarEndereco;
	}

	public WebElement getBtn_VarreduraPrimarias() {
		return btn_VarreduraPrimarias;
	}

}
