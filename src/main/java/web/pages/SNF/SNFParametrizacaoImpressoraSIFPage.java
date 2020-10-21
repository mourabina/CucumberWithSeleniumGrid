package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFParametrizacaoImpressoraSIFPage {

	@FindBy(id = "businessUnitId")
	private WebElement UnidadeNegocio;
	
	@FindBy(id = "lblPrinterTypeId")
	private WebElement TipoImpressora;
	
	@FindBy(id = "printerAddressName")
	private WebElement EnderecoImpressora;
	
	public SNFParametrizacaoImpressoraSIFPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getUnidadeNegocio() {
		return UnidadeNegocio;
	}

	public WebElement getTipoImpressora() {
		return TipoImpressora;
	}

	public WebElement getEnderecoImpressora() {
		return EnderecoImpressora;
	}
}
