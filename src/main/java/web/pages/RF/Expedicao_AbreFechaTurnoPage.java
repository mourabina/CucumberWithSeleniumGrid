package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedicao_AbreFechaTurnoPage {

	@FindBy(id = "BT_ABRIR_FX")
	private WebElement btn_abrir;

	@FindBy(id = "BT_FECHA_FX")
	private WebElement btn_fechar;
	
	public Expedicao_AbreFechaTurnoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtn_abrir() {
		return btn_abrir;
	}

	public WebElement getBtn_fechar() {
		return btn_fechar;
	}
	
}
