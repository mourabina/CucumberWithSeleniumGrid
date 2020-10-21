package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFVisualizarNotasFiscaisRemessaPage {

	@FindBy(xpath = "//h2[text() ='Visualizar Notas Fiscais de Remessa']")
	private WebElement labelTituloPagina;

	@FindBy(id = "businessUnitId")
	private WebElement selectFilialDestino;

	@FindBy(id = "type")
	private WebElement selectTipoDocumento;

	@FindBy(id = "statusId")
	private WebElement selectSituacaoNotaFiscal;

	@FindBy(xpath = "//label[@for=\"vendorName\"]/parent::div//input")
	private WebElement inputNomeFornecedor;

	@FindBy(xpath = "//label[@for=\"vendorNbr\"]/parent::div//input")
	private WebElement inputNumeroFornecedor;

	@FindBy(xpath = "//label[@for=\"notaFiscalNbr\"]/parent::div//input")
	private WebElement inputNotaFiscal;

	@FindBy(xpath = "//label[@for='type']/parent::div//input")
	private WebElement inputCNPJ;

	@FindBy(xpath = "//label[@for=\"seriesFrmCd\"]/parent::div//input")
	private WebElement inputSerieNF;

	@FindBy(xpath = "//i[@class = 'fas fa-eraser']")
	private WebElement buttonLimpar;

	@FindBy(xpath = "//i[@class = 'fas fa-search']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//table[@class = 'table table-hover']/thead/tr/th")
	private List<WebElement> indiceGridResultadoPesquisa;

	@FindBy(xpath = "//table[@class = 'table table-hover']/tbody/tr/td")
	private List<WebElement> valorGridResultadoPesquisa;

	@FindBy(xpath = "//label[@for=\"department\"]/parent::div//select")
	private WebElement selectFilialOrigem;

	// ===========================================================Loja============================================================================

	@FindBy(xpath = "//label[@for='department']/parent::div//input")
	private WebElement inputSecao;

	@FindBy(xpath = "//label[@for='startDateIssue']/parent::div//input")
	private WebElement inputDataEmissaoNFInicio;

	@FindBy(xpath = "//label[@for='endDateIssue']/parent::div//input")
	private WebElement inputDataEmissaoNFFim;

	public SNFVisualizarNotasFiscaisRemessaPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getInputDataEmissaoNFInicio() {
		return inputDataEmissaoNFInicio;
	}

	public WebElement getInputDataEmissaoNFFim() {
		return inputDataEmissaoNFFim;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getSelectTipoDocumento() {
		return selectTipoDocumento;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputNotaFiscal() {
		return inputNotaFiscal;
	}

	public WebElement getInputSerieNF() {
		return inputSerieNF;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getSelectFilialDestino() {
		return selectFilialDestino;
	}

	public WebElement getSelectSituacaoNotaFiscal() {
		return selectSituacaoNotaFiscal;
	}

	public WebElement getInputNumeroFornecedor() {
		return inputNumeroFornecedor;
	}

	public List<WebElement> getIndiceGridResultadoPesquisa() {
		return indiceGridResultadoPesquisa;
	}

	public List<WebElement> getValorGridResultadoPesquisa() {
		return valorGridResultadoPesquisa;
	}

	public WebElement getSelectFilialOrigem() {
		return selectFilialOrigem;
	}

	public WebElement getInputSecao() {
		return inputSecao;
	}

}
