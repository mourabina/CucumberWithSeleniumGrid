package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFAdicionarItemPage {

	@FindBy(id = "vendorStockId")
	private WebElement inputFornecedorEstoqueID;

	@FindBy(id = "itemDesc")
	private WebElement inputDescricaoItem;

	@FindBy(id = "itemNbr")
	private WebElement inputNumeroitem;

	@FindBy(id = "mdseClasfCode")
	private WebElement inputNCM;

	@FindBy(id = "cfopOperationCode")
	private WebElement inputCFOP;

	@FindBy(id = "itemQtyUomCode")
	private WebElement inpuUN;

	@FindBy(id = "itemQty")
	private WebElement inputQuantidade;

	@FindBy(id = "itemQtyKilos")
	private WebElement inputQuantidadeKilos;

	@FindBy(id = "unitBuyPriceAmt")
	private WebElement inputValorUnitario;

	@FindBy(id = "totalBuyPriceAmt")
	private WebElement inputValorTotal;

	@FindBy(id = "vnpkQty")
	private WebElement inputPacoteFornecedor;

	@FindBy(id = "icmsPct")
	private WebElement inputIcmsPorcento;

	@FindBy(id = "icmsBaseAmt")
	private WebElement inputValorBaseICMS;

	@FindBy(id = "icmsAmt")
	private WebElement inputValorICMS;

	@FindBy(id = "fcpTaxPct")
	private WebElement inputFCPPorcento;

	@FindBy(id = "fcpBaseAmt")
	private WebElement inputValorBaseFCP;

	@FindBy(id = "fcpTaxAmt")
	private WebElement inputValorFCP;

	@FindBy(id = "icmsTaxCode")
	private WebElement inputCST;

	@FindBy(id = "icmsStBaseAmt")
	private WebElement inputBaseICMSST;

	@FindBy(id = "icmsStAmt")
	private WebElement inputIcmsST;

	@FindBy(id = "fcpStBaseAmt")
	private WebElement inputBaseFcpSt;

	@FindBy(id = "fcpStTaxAmt")
	private WebElement inputFcpST;

	@FindBy(id = "ipiPct")
	private WebElement inputIPIPorcento;

	@FindBy(id = "ipiAmt")
	private WebElement inputValorTotalIPI;

	@FindBy(id = "discountPct")
	private WebElement inputDescontoPorcento;

	@FindBy(id = "discountAmt")
	private WebElement inputDesconto;

	@FindBy(id = "insuranceAmt")
	private WebElement inputSeguro;

	@FindBy(id = "otherExpenseAmt")
	private WebElement inputDespesasAcessorias;

	@FindBy(id = "freightAmt")
	private WebElement inputFrete;

	public SNFAdicionarItemPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputFornecedorEstoqueID() {
		return inputFornecedorEstoqueID;
	}

	public WebElement getInputDescricaoItem() {
		return inputDescricaoItem;
	}

	public WebElement getInputNumeroitem() {
		return inputNumeroitem;
	}

	public WebElement getInputNCM() {
		return inputNCM;
	}

	public WebElement getInputCFOP() {
		return inputCFOP;
	}

	public WebElement getInpuUN() {
		return inpuUN;
	}

	public WebElement getInputQuantidade() {
		return inputQuantidade;
	}

	public WebElement getInputQuantidadeKilos() {
		return inputQuantidadeKilos;
	}

	public WebElement getInputValorUnitario() {
		return inputValorUnitario;
	}

	public WebElement getInputValorTotal() {
		return inputValorTotal;
	}

	public WebElement getInputPacoteFornecedor() {
		return inputPacoteFornecedor;
	}

	public WebElement getInputIcmsPorcento() {
		return inputIcmsPorcento;
	}

	public WebElement getInputValorBaseICMS() {
		return inputValorBaseICMS;
	}

	public WebElement getInputValorICMS() {
		return inputValorICMS;
	}

	public WebElement getInputFCPPorcento() {
		return inputFCPPorcento;
	}

	public WebElement getInputValorBaseFCP() {
		return inputValorBaseFCP;
	}

	public WebElement getInputValorFCP() {
		return inputValorFCP;
	}

	public WebElement getInputCST() {
		return inputCST;
	}

	public WebElement getInputBaseICMSST() {
		return inputBaseICMSST;
	}

	public WebElement getInputIcmsST() {
		return inputIcmsST;
	}

	public WebElement getInputBaseFcpSt() {
		return inputBaseFcpSt;
	}

	public WebElement getInputFcpST() {
		return inputFcpST;
	}

	public WebElement getInputIPIPorcento() {
		return inputIPIPorcento;
	}

	public WebElement getInputValorTotalIPI() {
		return inputValorTotalIPI;
	}

	public WebElement getInputDescontoPorcento() {
		return inputDescontoPorcento;
	}

	public WebElement getInputDesconto() {
		return inputDesconto;
	}

	public WebElement getInputSeguro() {
		return inputSeguro;
	}

	public WebElement getInputDespesasAcessorias() {
		return inputDespesasAcessorias;
	}

	public WebElement getInputFrete() {
		return inputFrete;
	}

}
