package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEtiquetasAjustadasPage {
	
	@FindBy(id = "businessUnit")
	private WebElement numeroCD;
	
	@FindBy(id = "type")
	private WebElement tipoAjuste;
	
	@FindBy(xpath = "//label[@for =\"typeDoc\"]/following-sibling::div//input")
	private WebElement idNotaFiscal;
	
	@FindBy(xpath = "//label[@for =\"notaFiscalNbr\"]/following-sibling::div//input")
	private WebElement numeroNotaFiscal;
	
	@FindBy(id = "status")
	private WebElement situacao;
	
	@FindBy(id = "receiverNbr")
	private WebElement numeroReceiver;
	
	@FindBy(xpath = "//button[child::i[@class=\"fa fa-plus\"]]")
	private WebElement btnCriarNF;
	
	@FindBy(xpath = "//button[child::i[@class=\"fa fa-trash\"]]")
	private WebElement btnRejeitarEtiquetas;
	
	public SNFEtiquetasAjustadasPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getNumeroCD() {
		return numeroCD;
	}

	public WebElement getTipoAjuste() {
		return tipoAjuste;
	}

	public WebElement getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public WebElement getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public WebElement getSituacao() {
		return situacao;
	}

	public WebElement getNumeroReceiver() {
		return numeroReceiver;
	}

	public WebElement getBtnCriarNF() {
		return btnCriarNF;
	}

	public WebElement getBtnRejeitarEtiquetas() {
		return btnRejeitarEtiquetas;
	}
}
