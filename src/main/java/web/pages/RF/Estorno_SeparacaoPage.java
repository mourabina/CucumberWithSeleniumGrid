package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Estorno_SeparacaoPage {

	@FindBy(id = "TL_SETOR")
	private WebElement setor;
	
	@FindBy(id = "TL_RUAI")
	private WebElement ruaInicio;
	
	@FindBy(id = "TL_RUAF")
	private WebElement ruaFinal;
	
	@FindBy(id = "TL_OPT_PAR")
	private WebElement rb_par;
	
	@FindBy(id = "TL_OPT_IMPA")
	private WebElement rb_impa;
	
	public Estorno_SeparacaoPage(WebDriver webDriver) {
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

	public WebElement getRb_par() {
		return rb_par;
	}

	public WebElement getRb_impa() {
		return rb_impa;
	}
}
