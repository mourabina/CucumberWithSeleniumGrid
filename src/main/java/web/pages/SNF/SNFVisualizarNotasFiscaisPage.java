package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFVisualizarNotasFiscaisPage {

	@FindBy(xpath = "//h2[text() = 'Visualizar Notas Fiscais']")
	private WebElement TituloPagina;

	@FindBy(xpath = "//a[@class= 'btn btn-primary mr-1 re-btn-fa']/i")
	private WebElement buttonMais;

	@FindBy(xpath = "//a[@class = 'btn btn-secondary mr-1 re-btn-fa']/i")
	private WebElement buttonatualizar;

	@FindBy(xpath = "//input[@placeholder = 'Procurar...']")
	private WebElement inputProcurar;

	@FindBy(id = "businessUnitId")
	private WebElement UnidadeDeNegocio;

	@FindBy(id = "statusId")
	private WebElement Situacao;

	@FindBy(id = "type")
	private WebElement TipoDeDocumento;

	@FindBy(xpath = "//label[contains(text(), 'CNPJ')]/ancestor::div[@class='form-group row mb-1']/div/input")
	private WebElement inputCNPJ;

	@FindBy(xpath = "//label[contains(text(), 'CPF')]/ancestor::div[@class='form-group row mb-1']/div/input")
	private WebElement inputCPF;

	@FindBy(xpath = "//label[@for=\"vendorName\"]/parent::div//input")
	private WebElement inputNomeFornecedor;

	@FindBy(xpath = "//label[@for=\"notaFiscalNbr\"]/parent::div//input")
	private WebElement inputNotaFiscal;

	@FindBy(xpath = "//label[@for=\"seriesFrmCd\"]/parent::div//input")
	private WebElement inputSerieNotaFiscal;

	@FindBy(xpath = "//label[@for=\"poNbr\"]/parent::div//input")
	private WebElement inputNumeroPedido;

	@FindBy(xpath = "//label[@for=\"schedulingDate\"]/parent::div/div/div/input")
	private WebElement inputDataAgenda;

	@FindBy(xpath = "//label[contains(text(), 'ID Nota Fiscal')]/ancestor::div[@class='form-group row mb-1']/div/input")
	private WebElement inputIDNotaFiscal;

	@FindBy(xpath = "//label[@for=\"storeNbr\"]/parent::div//input")
	private WebElement inputNumeroLoja;

	@FindBy(xpath = "//a[@class= 'btn btn-default text-secondary mr-2 float-right']")
	private WebElement buttonLimpar;

	@FindBy(xpath = "//button[@class= 'btn btn-primary float-right']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//a[@class = 'btn btn-link']")
	private WebElement buttonEditar;

	@FindBy(xpath = "//a[@class = 'btn btn-primary mr-2']/i")
	private WebElement buttonAdicionar;

	@FindAll({
		@FindBy(xpath = "//table[@class='table table-hover']//tbody/tr/td")
	})
	private List<WebElement> griResultadoVisualizarNotaFiscal;
	
	@FindAll({
		@FindBy(xpath = "//table[@class='table table-hover']//tr/th")
		})
	private List<WebElement> headerResultadoVisualizarNotaFiscal;

	// ============================================================Loja=============================================================

	public List<WebElement> getHeaderResultadoVisualizarNotaFiscal() {
		return headerResultadoVisualizarNotaFiscal;
	}

	@FindBy(xpath = "//label[@for='inbNotaFiscalId']/parent::div/div/input")
	private WebElement inputIDNotaFiscalLoja;

	@FindBy(xpath = "//label[@for='startDateIssue']/parent::div//input")
	private WebElement inputDataEmissaoInicio;

	@FindBy(xpath = "//label[@for='endDateIssue']/parent::div//input")
	private WebElement inputDataEmissaoFim;

	@FindBy(xpath = "//label[@for='startDateRejection']/parent::div//input")
	private WebElement inputDataRejeicaoInicio;

	@FindBy(xpath = "//label[@for='endDateRejection']/parent::div//input")
	private WebElement inputDataRejeicaoFim;

	@FindBy(xpath = "//label[@for='department']/parent::div//input")
	private WebElement inputPortifolio;

	public SNFVisualizarNotasFiscaisPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public List<WebElement> getGriResultadoVisualizarNotaFiscal() {
		return griResultadoVisualizarNotaFiscal;
	}

	public WebElement getInputIDNotaFiscalLoja() {
		return inputIDNotaFiscalLoja;
	}

	public WebElement getInputDataEmissaoInicio() {
		return inputDataEmissaoInicio;
	}

	public WebElement getInputDataEmissaoFim() {
		return inputDataEmissaoFim;
	}

	public WebElement getInputDataRejeicaoInicio() {
		return inputDataRejeicaoInicio;
	}

	public WebElement getInputDataRejeicaoFim() {
		return inputDataRejeicaoFim;
	}

	public WebElement getInputPortifolio() {
		return inputPortifolio;
	}

	public WebElement getButtonAdicionar() {
		return buttonAdicionar;
	}

	public WebElement getTituloPagina() {
		return TituloPagina;
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}

	public WebElement getButtonatualizar() {
		return buttonatualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getUnidadeDeNegocio() {
		return UnidadeDeNegocio;
	}

	public WebElement getSituacao() {
		return Situacao;
	}

	public WebElement getTipoDeDocumento() {
		return TipoDeDocumento;
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getInputCPF() {
		return inputCPF;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputNotaFiscal() {
		return inputNotaFiscal;
	}

	public WebElement getInputSerieNotaFiscal() {
		return inputSerieNotaFiscal;
	}

	public WebElement getInputNumeroPedido() {
		return inputNumeroPedido;
	}

	public WebElement getInputDataAgenda() {
		return inputDataAgenda;
	}

	public WebElement getInputIDNotaFiscal() {
		return inputIDNotaFiscal;
	}

	public WebElement getInputNumeroLoja() {
		return inputNumeroLoja;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getButtonEditar() {
		return buttonEditar;
	}

}
