package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFAdicionarParametrizacaoEtiquetasSIFPage {

	@FindBy(xpath = "//input[@formcontrolname=\"cnpj\"]")
	private WebElement inptCnpj;
	
	@FindBy(xpath = "//input[@formcontrolname=\"cnpj\"]/parent::div//button")
	private WebElement btnPesquisarCnpj;
	
	@FindBy(xpath = "//input[@formcontrolname=\"vendorName\"]")
	private WebElement inptNomeFornecedor;
	
	@FindBy(xpath = "//input[@formcontrolname=\"vendorName\"]/parent::div//button")
	private WebElement btnPesquisarNomeFornecedor;
	
	@FindBy(xpath = "//input[@formcontrolname=\"govtInspectionCode\"]")
	private WebElement inptCodigoSIF;
	
	public SNFAdicionarParametrizacaoEtiquetasSIFPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInptCnpj() {
		return inptCnpj;
	}

	public WebElement getBtnPesquisarCnpj() {
		return btnPesquisarCnpj;
	}

	public WebElement getInptNomeFornecedor() {
		return inptNomeFornecedor;
	}

	public WebElement getBtnPesquisarNomeFornecedor() {
		return btnPesquisarNomeFornecedor;
	}

	public WebElement getInptCodigoSIF() {
		return inptCodigoSIF;
	}
}
