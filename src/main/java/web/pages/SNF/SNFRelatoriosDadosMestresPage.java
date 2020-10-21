package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatoriosDadosMestresPage {

	@FindBy(xpath = "//select[@formcontrolname='relatorio']")
	private WebElement selectRelatorio;

	public SNFRelatoriosDadosMestresPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectRelatorio() {
		return selectRelatorio;
	}

}
