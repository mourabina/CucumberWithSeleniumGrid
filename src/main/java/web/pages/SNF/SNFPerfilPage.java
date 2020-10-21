package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFPerfilPage {
	@FindBy( xpath = "//Select[@formcontrolname=\"buTypeId\"]")
	private WebElement SelectTipoUnidade;
	
	@FindBy( xpath = "//Select[@formcontrolname=\"buId\"]")
	private WebElement SelectFilial;	
	
	@FindBy(xpath = "//button[contains(@class,\"ml-3\")]/i")
	private WebElement BtnCarregar;

	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	private WebElement BtnCancelar;
	
	public SNFPerfilPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public WebElement getSelectTipoUnidade() {
		return SelectTipoUnidade;
	}
	
	public WebElement getSelectFilial() {
		return SelectFilial;
	}
	
	public WebElement getBtnCarregar() {
		return BtnCarregar;
	}
	
	public WebElement getBtnCancelar() {
		return BtnCancelar;
	}
}
