package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoEndereco_RemanejamentoPage {

	@FindBy(id = "TL_ENDER_ORI")
	private WebElement enderecoOrigem;
	
	@FindBy(id = "TL_EAN")
	private WebElement codigoEan;
	
	@FindBy(id = "TL_ENDER_DES")
	private WebElement enderecoDestino;
	
	public ManutencaoEndereco_RemanejamentoPage (WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public WebElement getCodigoEan() {
		return codigoEan;
	}

	public WebElement getEnderecoDestino() {
		return enderecoDestino;
	}
	
}
