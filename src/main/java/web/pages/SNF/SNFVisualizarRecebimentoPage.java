package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFVisualizarRecebimentoPage {

	@FindBy(xpath = "//input[@placeholder = 'Procurar...']")
	private WebElement inputPesquisar;

	@FindBy(id = "businessUnitId")
	private WebElement inputFilial;

	@FindBy(id = "statusId")
	private WebElement inputSituacao;

	@FindBy(id = "receiverNbr")
	private WebElement inputNumeroRecebimento;

	@FindBy(id = "poNbr")
	private WebElement inpuNumeroPedido;

	@FindBy(id = "appointmentNbr")
	private WebElement inputNumeroAgendamento;

	@FindBy(id = "schedulingDateTime")
	private WebElement inputDataAgenda;

	@FindBy(id = "vendorNbr")
	private WebElement inputNumeroFornecedor;

	@FindBy(xpath = "//a[@class = 'btn btn-default text-secondary mr-2 float-right']")
	private WebElement buttonLipar;

	@FindBy(xpath = "//a[@class = 'btn btn-primary float-right']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//a[@class = 'btn btn-link']")
	private WebElement buttonEditar;

	@FindBy(xpath = "//table[@class = 'table table-hover']/thead/tr/th")
	private List<WebElement> headGridResultado;

	@FindBy(xpath = "//table[@class = 'table table-hover']/tbody/tr/td")
	private List<WebElement> valueGridResultado;

	// ==========================================================Loja=========================================================================

	@FindBy(id = "vendorName")
	private WebElement inputNomeFornecedor;

	@FindBy(id = "notaFiscalNbr")
	private WebElement inputNotaFiscal;

	public SNFVisualizarRecebimentoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public List<WebElement> getHeadGridResultado() {
		return headGridResultado;
	}

	public List<WebElement> getValueGridResultado() {
		return valueGridResultado;
	}

	public WebElement getInputNumeroRecebimento() {
		return inputNumeroRecebimento;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputNotaFiscal() {
		return inputNotaFiscal;
	}

	public WebElement getInputPesquisar() {
		return inputPesquisar;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputSituacao() {
		return inputSituacao;
	}

	public WebElement getinputNumeroRecebimento() {
		return inputNumeroRecebimento;
	}

	public WebElement getInpuNumeroPedido() {
		return inpuNumeroPedido;
	}

	public WebElement getInputNumeroAgendamento() {
		return inputNumeroAgendamento;
	}

	public WebElement getInputDataAgenda() {
		return inputDataAgenda;
	}

	public WebElement getInputNumeroFornecedor() {
		return inputNumeroFornecedor;
	}

	public WebElement getButtonLipar() {
		return buttonLipar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getButtonEditar() {
		return buttonEditar;
	}

}
