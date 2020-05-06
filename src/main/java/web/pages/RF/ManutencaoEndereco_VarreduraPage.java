package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoEndereco_VarreduraPage {

	@FindBy(id = "TL_RUA")
	private WebElement rua;
	
	public ManutencaoEndereco_VarreduraPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getRua() {
		return rua;
	}
	
}
