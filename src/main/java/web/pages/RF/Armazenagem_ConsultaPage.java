package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Armazenagem_ConsultaPage {
	
	@FindBy(id = "BT_CONS_FX")
	private WebElement btn_consultas;
	
	@FindBy(id = "BT_CONS1_FX")
	private WebElement btn_consutasEAN;
	
	@FindBy(id = "Button1_FX")
	private WebElement btn_consultaDUN14;
	
	@FindBy(id = "TL_EAN")
	private WebElement codigoEAN;
	
	@FindBy(id = "TL_DUN14")
	private WebElement codigoDUN14;
	
	public Armazenagem_ConsultaPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtn_consultas() {
		return btn_consultas;
	}

	public WebElement getBtn_consutasEAN() {
		return btn_consutasEAN;
	}

	public WebElement getBtn_consultaDUN14() {
		return btn_consultaDUN14;
	}

	public WebElement getCodigoEAN() {
		return codigoEAN;
	}

	public WebElement getCodigoDUN14() {
		return codigoDUN14;
	}
}
