package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFDetalheDaRevisaoFiscalPage {

	@FindBy(id = "statusCode")
	private WebElement inputSituacao;

	@FindBy(id = "buIdDescription")
	private WebElement inputFilial;

	@FindBy(id = "lastChangeUserID")
	private WebElement inputUsuario;

	@FindBy(id = "lastChangeTs")
	private WebElement inputUltimaModProt;

	@FindBy(id = "poNbrOut")
	private WebElement inputNumeroPedido;

	@FindBy(id = "eltncNotaFiscal")
	private WebElement inputBaixaXML;

	@FindBy(id = "enfBarCode")
	private WebElement inputCodigoBarra;

	@FindBy(id = "notaFiscalNbrOut")
	private WebElement inputnotaFiscalForncedor;

	@FindBy(id = "shipperNotaFiscalNbr")
	private WebElement inputnotaFiscalOperadorLogistico;

	@FindBy(id = "nfDate")
	private WebElement inputDataNotaFiscalFornecedor;

	@FindBy(id = "nfDateShipper")
	private WebElement inputDataNotaFiscalOperadorLogistico;

	@FindBy(id = "serieNF")
	private WebElement inputSerieNFForncedor;

	@FindBy(id = "serieNFShipper")
	private WebElement inputSerieNFOperadorLogistico;

	@FindBy(id = "vendorNbr")
	private WebElement inputCodigoForncedor;

	@FindBy(id = "shipperNbr")
	private WebElement iputCodForncedorOperadorLogistico;

	@FindBy(id = "vendorName")
	private WebElement inputNomeFornecedor;

	@FindBy(id = "shipperName")
	private WebElement inputNomeFornecedorOperadorLogistico;

	@FindBy(id = "cnpjNbr")
	private WebElement inputCPF_CNPJFornecedor;

	@FindBy(id = "shipperCnpjNbr")
	private WebElement inputCPF_CNPJOperadorLogistico;

	@FindBy(id = "stateId")
	private WebElement inputInscricaoEstadualFornecedor;

	@FindBy(id = "shipperStateId")
	private WebElement inputInscricaoEstadualOperadorLogistico;

	@FindBy(id = "stateDesc")
	private WebElement inputEstadoFornecedor;

	@FindBy(id = "shipperStateDesc")
	private WebElement inputEstadoOpetadorLogistico;

	@FindBy(id = "cfop")
	private WebElement inputCFOPFornecedor;

	@FindBy(id = "shipperCfop")
	private WebElement inputCFOPOperadorLogistico;

	@FindBy(id = "cfopDesc")
	private WebElement inputDescricaoCFOPFornecedor;

	@FindBy(id = "cfopDescShipper")
	private WebElement inputDescricaoCFOPOperadorLogistico;

	@FindBy(id = "vendorIcmsDiscInd")
	private WebElement selectBaseICMSDesconto;

	@FindBy(id = "vendorIcmsFreightInd")
	private WebElement selectBaseICMSFrete;

	@FindBy(id = "vendorIcmsOtherExpensesInd")
	private WebElement selectBaseICMSOutrasDespesas;

	@FindBy(id = "vendorIcmsSubDiscInd")
	private WebElement selectBaseICMSSTDesconto;

	@FindBy(id = "vendorIcmsSubFreightInd")
	private WebElement selectBaseICMSSTFrete;

	@FindBy(id = "vendorIcmsSubOtherExpensesInd")
	private WebElement selectBaseICMSSTOutrasDespesas;

	@FindBy(id = "naturezaFornecedor")
	private WebElement selectNaturezaFornecedor;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btSalvar;

	@FindBy(xpath = "//table[@class='table table-striped']/thead/tr/th")
	private List<WebElement> headListaItens;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr/td")
	private List<WebElement> valueListaItens;

	public SNFDetalheDaRevisaoFiscalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputSituacao() {
		return inputSituacao;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputUsuario() {
		return inputUsuario;
	}

	public WebElement getInputUltimaModProt() {
		return inputUltimaModProt;
	}

	public WebElement getInputNumeroPedido() {
		return inputNumeroPedido;
	}

	public WebElement getInputBaixaXML() {
		return inputBaixaXML;
	}

	public WebElement getInputCodigoBarra() {
		return inputCodigoBarra;
	}

	public WebElement getInputnotaFiscalForncedor() {
		return inputnotaFiscalForncedor;
	}

	public WebElement getInputnotaFiscalOperadorLogistico() {
		return inputnotaFiscalOperadorLogistico;
	}

	public WebElement getInputDataNotaFiscalFornecedor() {
		return inputDataNotaFiscalFornecedor;
	}

	public WebElement getInputDataNotaFiscalOperadorLogistico() {
		return inputDataNotaFiscalOperadorLogistico;
	}

	public WebElement getInputSerieNFForncedor() {
		return inputSerieNFForncedor;
	}

	public WebElement getInputSerieNFOperadorLogistico() {
		return inputSerieNFOperadorLogistico;
	}

	public WebElement getInputCodigoForncedor() {
		return inputCodigoForncedor;
	}

	public WebElement getIputCodForncedorOperadorLogistico() {
		return iputCodForncedorOperadorLogistico;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputNomeFornecedorOperadorLogistico() {
		return inputNomeFornecedorOperadorLogistico;
	}

	public WebElement getInputCPF_CNPJFornecedor() {
		return inputCPF_CNPJFornecedor;
	}

	public WebElement getInputCPF_CNPJOperadorLogistico() {
		return inputCPF_CNPJOperadorLogistico;
	}

	public WebElement getInputInscricaoEstadualFornecedor() {
		return inputInscricaoEstadualFornecedor;
	}

	public WebElement getInputInscricaoEstadualOperadorLogistico() {
		return inputInscricaoEstadualOperadorLogistico;
	}

	public WebElement getInputEstadoFornecedor() {
		return inputEstadoFornecedor;
	}

	public WebElement getInputEstadoOpetadorLogistico() {
		return inputEstadoOpetadorLogistico;
	}

	public WebElement getInputCFOPFornecedor() {
		return inputCFOPFornecedor;
	}

	public WebElement getInputCFOPOperadorLogistico() {
		return inputCFOPOperadorLogistico;
	}

	public WebElement getInputDescricaoCFOPFornecedor() {
		return inputDescricaoCFOPFornecedor;
	}

	public WebElement getInputDescricaoCFOPOperadorLogistico() {
		return inputDescricaoCFOPOperadorLogistico;
	}

	public WebElement getSelectBaseICMSDesconto() {
		return selectBaseICMSDesconto;
	}

	public WebElement getSelectBaseICMSFrete() {
		return selectBaseICMSFrete;
	}

	public WebElement getSelectBaseICMSOutrasDespesas() {
		return selectBaseICMSOutrasDespesas;
	}

	public WebElement getSelectBaseICMSSTDesconto() {
		return selectBaseICMSSTDesconto;
	}

	public WebElement getSelectBaseICMSSTFrete() {
		return selectBaseICMSSTFrete;
	}

	public WebElement getSelectBaseICMSSTOutrasDespesas() {
		return selectBaseICMSSTOutrasDespesas;
	}

	public WebElement getSelectNaturezaFornecedor() {
		return selectNaturezaFornecedor;
	}

	public WebElement getBtSalvar() {
		return btSalvar;
	}

	public List<WebElement> getHeadListaItens() {
		return headListaItens;
	}

	public List<WebElement> getValueListaItens() {
		return valueListaItens;
	}

}
