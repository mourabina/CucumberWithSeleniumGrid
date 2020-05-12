package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventarioRotativoPage {

	@FindBy(id = "TL_SETOR")
	private WebElement setor;
	
	@FindBy(id = "TL_RUAI")
	private WebElement ruaInicio;
	
	@FindBy(id = "TL_RUAF")
	private WebElement ruaFinal;
	
	@FindBy(id = "TL_ALTURAI")
	private WebElement alturaInicio;
	
	@FindBy(id = "TL_ALTURAF")
	private WebElement alturaFinal;
	
	@FindBy(id = "TL_OPT_PAR")
	private WebElement rb_par;
	
	@FindBy(id = "TL_OPT_IMPA")
	private WebElement rb_impa;
	
	public InventarioRotativoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSetor() {
		return setor;
	}

	public WebElement getRuaInicio() {
		return ruaInicio;
	}

	public WebElement getRuaFinal() {
		return ruaFinal;
	}

	public WebElement getAlturaInicio() {
		return alturaInicio;
	}

	public WebElement getAlturaFinal() {
		return alturaFinal;
	}

	public WebElement getRb_par() {
		return rb_par;
	}

	public WebElement getRb_impa() {
		return rb_impa;
	}
}
