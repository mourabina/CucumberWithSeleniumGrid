package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEtiquetasRetornoPage {
	
	@FindBy(id = "buId")
	private WebElement filial;
	
	@FindBy(id = "typeId")
	private WebElement tipoAjusta;
	
	@FindBy(id = "notaFiscalId")
	private WebElement IDNotaFiscal;
	
	@FindBy(id = "vendorNbr")
	private WebElement nomeFornecedor;
	
	@FindBy(id = "docType")
	private WebElement tipoDocumento;
	
	@FindBy(id = "notaFiscalNbr")
	private WebElement numeroNotaFiscal;
	
	@FindBy(id = "cnpjCpf")
	private WebElement documento;
	
	@FindBy(id = "receiverNbr")
	private WebElement numeroRecebimento;
	
	@FindBy(id = "statusId")
	private WebElement situacao;
	
	@FindBy(xpath = "//button[child::i[@class=\"fa fa-plus\"]]")
	private WebElement btnCriarNF;
	
	@FindBy(xpath = "//button[child::i[@class=\"fa fa-trash\"]]")
	private WebElement btnRejeitarEtiquetas;
	
	public SNFEtiquetasRetornoPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getFilial() {
		return filial;
	}

	public WebElement getTipoAjusta() {
		return tipoAjusta;
	}

	public WebElement getIDNotaFiscal() {
		return IDNotaFiscal;
	}

	public WebElement getNomeFornecedor() {
		return nomeFornecedor;
	}

	public WebElement getTipoDocumento() {
		return tipoDocumento;
	}

	public WebElement getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public WebElement getDocumento() {
		return documento;
	}

	public WebElement getNumeroRecebimento() {
		return numeroRecebimento;
	}

	public WebElement getSituacao() {
		return situacao;
	}

	public WebElement getBtnCriarNF() {
		return btnCriarNF;
	}

	public WebElement getBtnRejeitarEtiquetas() {
		return btnRejeitarEtiquetas;
	}
	

}
