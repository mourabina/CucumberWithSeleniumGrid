package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFManutencaoTransportadoraPage {

	@FindBy(xpath = "//h2[text()='Manutenção de Transportadora']")
	private WebElement tituloPagina;

	@FindBy(id = "carrierId")
	private WebElement inputIDTransportadora;

	@FindBy(id = "vendorNbr")
	private WebElement inputNumeroFornecedor;

	@FindBy(id = "status")
	private WebElement selectSituacao;

	@FindBy(id = "cnpjBranchNbr")
	private WebElement inputCNPJ_CPF;

	@FindBy(id = "carrierName")
	private WebElement inputNomeTrasportadora;

	@FindBy(id = "icmsStateTaxId")
	private WebElement inputICMSEstadoTaxID;

	@FindBy(id = "address")
	private WebElement inputEndereco;

	@FindBy(id = "addressNbr")
	private WebElement inputNumero;

	@FindBy(id = "addressInfo")
	private WebElement inputComplemento;

	@FindBy(id = "state")
	private WebElement inputEstado;

	@FindBy(id = "city")
	private WebElement inputCidade;

	@FindBy(id = "neighborhood")
	private WebElement inputBairro;

	@FindBy(xpath = "//button[@class = 'btn btn-default mr-2']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//button[@class = 'btn btn-primary']")
	private WebElement buttonSalvar;

	// =====================================Manutenção Trasportadora
	// ============================================================//

	@FindBy(xpath = "//h2[text() = 'Manutenção de Transportadora']")
	private WebElement tituloPaginaPesquisa;

	@FindBy(xpath = "//a[@class = 'btn btn-primary mr-2 re-btn-fa']/i")
	private WebElement btMais;

	@FindBy(xpath = "//a[@class = 'btn btn-secondary mr-2 re-btn-fa']/i")
	private WebElement btAtualziar;

	@FindBy(xpath = "//input[@placeholder='Procurar...']")
	private WebElement inputProcurar;

	@FindBy(id = "id")
	private WebElement inputIdTrasnportadoraPesquisa;

	@FindBy(xpath = "//a[@class='btn btn-default text-secondary mr-2 float-right']")
	private WebElement btLimpar;

	@FindBy(xpath = "//a[@class='btn btn-primary float-right']")
	private WebElement btPesquisar;

	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private List<WebElement> headGridReultado;

	@FindBy(xpath = "//table[@class='table table-hover']/tbody/tr/td")
	private List<WebElement> valueGridReultado;

	public SNFManutencaoTransportadoraPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPaginaPesquisa() {
		return tituloPaginaPesquisa;
	}

	public WebElement getBtMais() {
		return btMais;
	}

	public WebElement getBtAtualziar() {
		return btAtualziar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getInputIdTrasnportadoraPesquisa() {
		return inputIdTrasnportadoraPesquisa;
	}

	public WebElement getBtLimpar() {
		return btLimpar;
	}

	public WebElement getBtPesquisar() {
		return btPesquisar;
	}

	public List<WebElement> getHeadGridReultado() {
		return headGridReultado;
	}

	public List<WebElement> getValueGridReultado() {
		return valueGridReultado;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputIDTransportadora() {
		return inputIDTransportadora;
	}

	public WebElement getInputNumeroFornecedor() {
		return inputNumeroFornecedor;
	}

	public WebElement getSelectSituacao() {
		return selectSituacao;
	}

	public WebElement getInputCNPJ_CPF() {
		return inputCNPJ_CPF;
	}

	public WebElement getInputNomeTrasportadora() {
		return inputNomeTrasportadora;
	}

	public WebElement getInputICMSEstadoTaxID() {
		return inputICMSEstadoTaxID;
	}

	public WebElement getInputEndereco() {
		return inputEndereco;
	}

	public WebElement getInputNumero() {
		return inputNumero;
	}

	public WebElement getInputComplemento() {
		return inputComplemento;
	}

	public WebElement getInputEstado() {
		return inputEstado;
	}

	public WebElement getInputCidade() {
		return inputCidade;
	}

	public WebElement getInputBairro() {
		return inputBairro;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

}
