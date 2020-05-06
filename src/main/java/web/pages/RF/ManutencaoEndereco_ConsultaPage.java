package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoEndereco_ConsultaPage {
	
	@FindBy(id = "TL_ENDER_ORI")
	private WebElement enderecoOrigem;
	
	public ManutencaoEndereco_ConsultaPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getEnderecoOrigem() {
		return enderecoOrigem;
	}
	
}
