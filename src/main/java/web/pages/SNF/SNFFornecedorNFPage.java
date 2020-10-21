package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFFornecedorNFPage {

	@FindBy(name = "businessUnitId")
	private WebElement UnidadeNegocio;

	@FindBy(xpath = "//input[@formcontrolname = 'notaFiscalNbr']")
	private WebElement NumeroNotaFiscal;

	@FindBy(xpath = "//input[@formcontrolname = \"seriesFrmCd\"]")
	private WebElement SerieNotaFiscal;

	@FindBy(xpath = "//input[@formcontrolname = 'nfIssueDate']")
	private WebElement DataEmissaoNotaFiscal;

	@FindBy(xpath = "//input[@formcontrolname = 'nfDueDate']")
	private WebElement DataVencimentoNotaFiscal;

	@FindBy(xpath = "//select[@formcontrolname = 'typeCnpjTax']")
	private WebElement TipoDocumento;

	@FindBy(xpath = "//input[@formcontrolname = 'issuTaxId']")
	private WebElement CPF_CNPJ;

	@FindBy(xpath = "//input[@formcontrolname = 'issuStateTaxId']")
	private WebElement InscricaoEstadual;

	@FindBy(xpath = "//input[@formcontrolname = 'orignStateProvCode']")
	private WebElement UFDoFornecedor;

	@FindBy(xpath = "//input[@formcontrolname = 'vendorNbr']")
	private WebElement NumeroFornecedor;

	@FindBy(xpath = "//input[@formcontrolname = 'vendorName']")
	private WebElement NomeFornecedor;

	@FindBy(xpath = "//input[@formcontrolname = 'cfopOperCode']")
	private WebElement CFOP;

	@FindBy(xpath = "//input[@formcontrolname = 'totIcmsBaseAmt']")
	private WebElement BaseICMS;

	@FindBy(xpath = "//input[@formcontrolname = 'totIcmsTaxAmt']")
	private WebElement ValorICMS;

	@FindBy(xpath = "//input[@formcontrolname = 'totBaseFcpAmt']")
	private WebElement BaseFCP;

	@FindBy(xpath = "//input[@formcontrolname = 'totFcpAmt']")
	private WebElement ValorFCP;

	@FindBy(xpath = "//input[@formcontrolname = 'totIcmsStBaseAmt']")
	private WebElement BaseICMSST;

	@FindBy(xpath = "//input[@formcontrolname = 'totIcmsStTaxAmt']")
	private WebElement ValorICMSST;

	@FindBy(xpath = "//input[@formcontrolname = 'totBuyPriceAmt']")
	private WebElement ValorTotalProdutos;

	@FindBy(xpath = "//input[@formcontrolname = 'totBaseFcpStAmt']")
	private WebElement BaseFCPST;

	@FindBy(xpath = "//input[@formcontrolname = 'totFcpStAmt']")
	private WebElement ValorFCPST;

	@FindBy(xpath = "//input[@formcontrolname = 'totFreightAmt']")
	private WebElement Frete;

	@FindBy(xpath = "//input[@formcontrolname = 'totInsuranceAmt']")
	private WebElement Seguro;

	@FindBy(xpath = "//input[@formcontrolname = 'totDiscountAmt']")
	private WebElement Desconto;

	@FindBy(xpath = "//input[@formcontrolname = 'totOtherExpAmt']")
	private WebElement DespesasAcessorias;

	@FindBy(xpath = "//input[@formcontrolname = 'totIpiTaxAmt']")
	private WebElement IPI;

	@FindBy(xpath = "//input[@formcontrolname = 'totInvoiceAmt']")
	private WebElement TotalValorNota;

	@FindBy(xpath = "//input[@formcontrolname = 'barCodeNf']")
	private WebElement CodigoBarraNFe;

	@FindBy(xpath = "//textarea[@formcontrolname = 'addionalData']")
	private WebElement DadosAdicionais;

	@FindBy(xpath = "//button[@class = 'btn btn-primary float-right mr-3']")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//div[@class='form-group row mb-2']//button[@class = 'btn btn-primary float-right']")
	private WebElement RatearValoresAdicionais;

	@FindBy(xpath = "//button[contains(text(), 'Validar') and not(contains(text(), 'Não'))]")
	private WebElement buttonValidar;

	@FindBy(xpath = "//button[contains(text(), 'Não')]")
	private WebElement buttonNaoValidar;

	@FindBy(xpath = "//button[contains(text(), 'Rejeitar')]")
	private WebElement buttonRejeitar;

	@FindBy(xpath = "//button[contains(text(), 'Regerar Contra NF')]")
	private WebElement buttonRegerarContraNF;

	@FindBy(xpath = "//button[contains(text(), 'Po Cod. Item Fornecedor')]")
	private WebElement buttonPoCodItemFornecedor;

	@FindBy(xpath = "//button[contains(text(), 'Enviar e-mail para Correção de Item de Pedido')]")
	private WebElement buttonEnviarEmailCorrecaoItemPedido;

	@FindBy(xpath = "//div[contains(text(), 'Itens da Nota Fiscal')]/ancestor::div[@class='card mb-2']//following-sibling::button[@class='btn btn-default float-right mb-4']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//h2[text() = 'Editar nota fiscal']")
	private WebElement labelTituloPgina;

	@FindBy(xpath = "//input[@formcontrolname = 'poNbr']")
	private WebElement NumeroPedido;

	@FindBy(xpath = "//button[@class = 'btn btn-primary ml-3 rounded']")
	private WebElement buttonPesquisarPedido;

	@FindBy(xpath = "//button[contains(text(), 'Vincular')]")
	private WebElement buttonVincular;

	@FindBy(xpath = "//button[contains(text(), 'Desvincular')]")
	private WebElement buttonDesvincular;

	@FindBy(xpath = "//input[@formcontrolname='shipDate']")
	private WebElement dataEmbarque;

	@FindBy(xpath = "//input[@formcontrolname='cancelDate']")
	private WebElement dataCancelamento;

	@FindBy(xpath = "//input[@formcontrolname='poDate']")
	private WebElement dataPedido;

	@FindBy(xpath = "//input[@formcontrolname='taxEffective']")
	private WebElement HorarioEfetivoImposto;

	@FindBy(xpath = "//input[@formcontrolname='statusName']")
	private WebElement situacaoPedido;

	@FindBy(xpath = "//div[contains(text(),\"Pedido da nota fiscal\")]/parent::div")
	private WebElement sessaoPedidoNF;

	public SNFFornecedorNFPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getNumeroPedido() {
		return NumeroPedido;
	}

	public WebElement getButtonPesquisarPedido() {
		return buttonPesquisarPedido;
	}

	public WebElement getButtonVincular() {
		return buttonVincular;
	}

	public WebElement getButtonDesvincular() {
		return buttonDesvincular;
	}

	public WebElement getUnidadeNegocio() {
		return UnidadeNegocio;
	}

	public WebElement getNumeroNotaFiscal() {
		return NumeroNotaFiscal;
	}

	public WebElement getSerieNotaFiscal() {
		return SerieNotaFiscal;
	}

	public WebElement getDataEmissaoNotaFiscal() {
		return DataEmissaoNotaFiscal;
	}

	public WebElement getDataVencimentoNotaFiscal() {
		return DataVencimentoNotaFiscal;
	}

	public WebElement getTipoDocumento() {
		return TipoDocumento;
	}

	public WebElement getCPF_CNPJ() {
		return CPF_CNPJ;
	}

	public WebElement getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	public WebElement getUFDoFornecedor() {
		return UFDoFornecedor;
	}

	public WebElement getNumeroFornecedor() {
		return NumeroFornecedor;
	}

	public WebElement getNomeFornecedor() {
		return NomeFornecedor;
	}

	public WebElement getCFOP() {
		return CFOP;
	}

	public WebElement getBaseICMS() {
		return BaseICMS;
	}

	public WebElement getValorICMS() {
		return ValorICMS;
	}

	public WebElement getBaseFCP() {
		return BaseFCP;
	}

	public WebElement getValorFCP() {
		return ValorFCP;
	}

	public WebElement getBaseICMSST() {
		return BaseICMSST;
	}

	public WebElement getValorICMSST() {
		return ValorICMSST;
	}

	public WebElement getValorTotalProdutos() {
		return ValorTotalProdutos;
	}

	public WebElement getBaseFCPST() {
		return BaseFCPST;
	}

	public WebElement getValorFCPST() {
		return ValorFCPST;
	}

	public WebElement getFrete() {
		return Frete;
	}

	public WebElement getSeguro() {
		return Seguro;
	}

	public WebElement getDesconto() {
		return Desconto;
	}

	public WebElement getDespesasAcessorias() {
		return DespesasAcessorias;
	}

	public WebElement getIPI() {
		return IPI;
	}

	public WebElement getTotalValorNota() {
		return TotalValorNota;
	}

	public WebElement getCodigoBarraNFe() {
		return CodigoBarraNFe;
	}

	public WebElement getDadosAdicionais() {
		return DadosAdicionais;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getRatearValoresAdicionais() {
		return RatearValoresAdicionais;
	}

	public WebElement getButtonValidar() {
		return buttonValidar;
	}

	public WebElement getbuttonNaoValidar() {
		return buttonNaoValidar;
	}

	public WebElement getButtonRejeitar() {
		return buttonRejeitar;
	}

	public WebElement getButtonRegerarContraNF() {
		return buttonRegerarContraNF;
	}

	public WebElement getButtonPoCodItemFornecedor() {
		return buttonPoCodItemFornecedor;
	}

	public WebElement getButtonEnviarEmailCorrecaoItemPedido() {
		return buttonEnviarEmailCorrecaoItemPedido;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getLabelTituloPgina() {
		return labelTituloPgina;
	}

	public WebElement getButtonNaoValidar() {
		return buttonNaoValidar;
	}

	public WebElement getDataEmbarque() {
		return dataEmbarque;
	}

	public WebElement getDataCancelamento() {
		return dataCancelamento;
	}

	public WebElement getDataPedido() {
		return dataPedido;
	}

	public WebElement getHorarioEfetivoImposto() {
		return HorarioEfetivoImposto;
	}

	public WebElement getSituacaoPedido() {
		return situacaoPedido;
	}

	public WebElement getsessaoPedidoNF() {
		return sessaoPedidoNF;
	}
}
