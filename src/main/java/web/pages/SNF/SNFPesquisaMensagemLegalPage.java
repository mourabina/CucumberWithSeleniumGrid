package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFPesquisaMensagemLegalPage {

	@FindBy(xpath = "//h2[text() = 'Pesquisa de Mensagem Legal']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//a[@class = 'btn btn-primary mr-2 re-btn-fa']/i")
	private WebElement buttonMais;

	@FindBy(xpath = "//a[@class = 'btn btn-secondary mr-2 re-btn-fa']/i")
	private WebElement buttonAtualizar;

	@FindBy(xpath = "//input[@class = 'form-control rounder']")
	private WebElement inputProcurar;

	@FindBy(xpath = "//a[@class='btn btn-success ml-2 re-btn-fa']/i")
	private WebElement buttonGerarExcel;

	@FindBy(xpath = "//h4[text()='Inserção de Mensagem Legal']")
	private WebElement tituloInsercaoMensagemLegal;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	private WebElement inputMensagemLegal;

	@FindBy(xpath = "//button[@class='btn btn-primary mr-2']")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//h4[text()='Edição de Mensagem Legal']")
	private WebElement tituloEdicaoMensagemLegal;

	@FindBy(id = "id")
	private WebElement inputCodigo;

	@FindBy(id = "description")
	private WebElement inputDescricao;

	@FindBy(xpath = "//input[@formcontrolname=\"id\"]")
	private WebElement inputEditCodigo;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	private WebElement inputInsertDescricao;

	@FindBy(xpath = "//p[contains(@class,'alert alert-info')]")
	private WebElement msgSucesso;

	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private List<WebElement> headGridResultado;

	@FindBy(xpath = "//table[@class='table table-hover']/tbody/tr/td")
	private List<WebElement> valueGridResulado;

	public SNFPesquisaMensagemLegalPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public List<WebElement> getHeadGridResultado() {
		return headGridResultado;
	}

	public WebElement getInputEditCodigo() {
		return inputEditCodigo;
	}

	public List<WebElement> getValueGridResulado() {
		return valueGridResulado;
	}

	public WebElement getMsgSucesso() {
		return msgSucesso;
	}

	public WebElement getInputDescricao() {
		return inputDescricao;
	}

	public WebElement getInputInsertDescricao() {
		return inputInsertDescricao;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getButtonGerarExcel() {
		return buttonGerarExcel;
	}

	public WebElement getTituloInsercaoMensagemLegal() {
		return tituloInsercaoMensagemLegal;
	}

	public WebElement getInputMensagemLegal() {
		return inputMensagemLegal;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getTituloEdicaoMensagemLegal() {
		return tituloEdicaoMensagemLegal;
	}

	public WebElement getInputCodigo() {
		return inputCodigo;
	}

}
