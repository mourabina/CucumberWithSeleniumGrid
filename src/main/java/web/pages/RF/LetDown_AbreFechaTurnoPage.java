package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetDown_AbreFechaTurnoPage {

	@FindBy(id = "BT_ABRIR_FX")
	private WebElement btn_abre;
	
	@FindBy(id = "BT_FECHA_FX")
	private WebElement btn_fecha;
		
	public LetDown_AbreFechaTurnoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtn_abre() {
		return btn_abre;
	}

	public WebElement getBtn_fecha() {
		return btn_fecha;
	}
}
