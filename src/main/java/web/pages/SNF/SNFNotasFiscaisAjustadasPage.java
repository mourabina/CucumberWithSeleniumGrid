package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFNotasFiscaisAjustadasPage {
	
	@FindBy(id = "buId")
	private WebElement filial;

	@FindBy(id = "typeId")
	private WebElement tipoAjuste; 
	
	@FindBy(id = "statusNotaId")
	private WebElement situacao; 
	
	@FindBy(id = "//label[@for =\"notaFiscalNbr\"]/following-sibling::div//input")
	private WebElement numeroNotaFiscal; 
	
	@FindBy(xpath = "//label[@for =\"dateStart\"]/following-sibling::div//input")
	private WebElement dataInicio; 
	
	@FindBy(xpath = "//label[@for =\"dateEnd\"]/following-sibling::div//input")
	private WebElement dataFim; 
	
	@FindBy(id = "typeDoc")
	private WebElement tipoDocumento; 
	
	@FindBy(id = "//label[@for =\"typeDoc\"]/following-sibling::div//input")
	private WebElement CNPJ_CPF; 
	
	@FindBy(id = "//label[@for =\"id\"]/following-sibling::div//input")
	private WebElement nomeFornecedor; 
	
	public SNFNotasFiscaisAjustadasPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getFilial() {
		return filial;
	}

	public WebElement getTipoAjuste() {
		return tipoAjuste;
	}

	public WebElement getSituacao() {
		return situacao;
	}

	public WebElement getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public WebElement getDataInicio() {
		return dataInicio;
	}

	public WebElement getDataFim() {
		return dataFim;
	}

	public WebElement getTipoDocumento() {
		return tipoDocumento;
	}

	public WebElement getCNPJ_CPF() {
		return CNPJ_CPF;
	}

	public WebElement getNomeFornecedor() {
		return nomeFornecedor;
	}
}
