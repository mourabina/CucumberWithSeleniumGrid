package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstornoPage {
	@FindBy(id = "BT_EST_SEP_FX")
	private WebElement estornoSeparacao;
	
	public EstornoPage (WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getEstornoSeparacao() {
		return estornoSeparacao;
	}
}
