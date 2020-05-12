package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class MprodPage extends BaseTest {

	@FindBy(id = "X_BT_INQ")
	private WebElement buttonConsultar;

	@FindBy(id = "X_BT_ADD")
	private WebElement buttonIncluir;

	@FindBy(id = "X_BT_CHG")
	private WebElement buttonAlterar;

	@FindBy(id = "X_BT_DEL")
	private WebElement buttonDeletar;

	@FindBy(id = "DEPOSITO_WM")
	private WebElement inputDeposito;

	@FindBy(id = "DEPINQ")
	private WebElement inputDepositoConsulta;

	@FindBy(id = "CODPRODU")
	private WebElement inputCodigoProduto;

	@FindBy(id = "EMB1")
	private WebElement selectEmbProduto;

	@FindBy(id = "EMB2")
	private WebElement selectEmbProduto2;

	@FindBy(id = "EMB1_WHSE")
	private WebElement selectEmbDeposito;

	@FindBy(id = "EMB_WHSE")
	private WebElement inputEmbDeposito;

	@FindBy(id = "VALID")
	private WebElement inputPrazoValidade;

	@FindBy(id = "TL_ALTO_RISCO")
	private WebElement checkboxItemAltoRisco;

	@FindBy(id = "TL_PERIGOSO")
	private WebElement checkboxItemPerigoso;

	@FindBy(id = "PESOCOMPRA")
	private WebElement inputPesoBrutoCompra;

	@FindBy(id = "PESOBRTUV")
	private WebElement inputPesoBrutoVenda;

	@FindBy(id = "X_LOTE")
	private WebElement inputLoteSerie;

	@FindBy(id = "SEPBATCH")
	private WebElement inputSepBatch;

	@FindBy(id = "TIPO_PESO")
	private WebElement inputTipoPeso;

	@FindBy(id = "TCX1CX2")
	private WebElement inputCaixa1Caixa2;

	@FindBy(id = "TL_QTDVOL")
	private WebElement inputQuantiVolume;

	@FindBy(id = "RESIST")
	private WebElement inputResistencia;

	@FindBy(id = "PEDMAX")
	private WebElement inputPedidoMaximoFaturamento;

	@FindBy(id = "ARRFAT")
	private WebElement inputArrendondamentoFaturamento;

	@FindBy(id = "ARRPED")
	private WebElement inputArrendondamentoPedidoCompra;

	@FindBy(id = "ARRPEDAUT")
	private WebElement inputArrendAutomatGiro;

	@FindBy(id = "DDE_PROD")
	private WebElement inputDiasEstoqueProduto;

	@FindBy(id = "REF")
	private WebElement inputReferenciaProduto;

	@FindBy(id = "OPLOGIS")
	private WebElement inputOperadorLogistico;

	@FindBy(id = "COMPRIMEN")
	private WebElement inputDimenCompraComprimento;

	@FindBy(id = "LARG")
	private WebElement inputDimenCompraLargura;

	@FindBy(id = "ALTURA")
	private WebElement inputDimenCompraAltura;

	@FindBy(id = "COMPR_VDA")
	private WebElement inputDimenBrutaVendaComprimento;

	@FindBy(id = "LARG_VDA")
	private WebElement inputDimenBrutaVendaLargura;

	@FindBy(id = "ALT_VDA")
	private WebElement inputDimenBrutaVendaAltura;

	@FindBy(id = "TCONVMAST")
	private WebElement inputQuantEmbCaixaMaster;

	@FindBy(id = "BASE")
	private WebElement inputPalletBase;

	@FindBy(id = "ALTUR")
	private WebElement inputPalletBaseAltura;

	@FindBy(id = "COMPLEM")
	private WebElement inputPalletBaseComplemento;

	@FindBy(id = "TL_EANEMB")
	private WebElement inputPalletBaseEANEmbala;

	@FindBy(id = "TL_TP_ITEM")
	private WebElement inputTipoDeItem;

	@FindBy(id = "TL_LIMTMINPBL")
	private WebElement inputLimiteMaximoAtendItemCross;

	@FindBy(id = "alerta_sad")
	private WebElement LabelMSG;

	public MprodPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getButtonConsultar() {
		return buttonConsultar;
	}

	public WebElement getButtonIncluir() {
		return buttonIncluir;
	}

	public WebElement getButtonAlterar() {
		return buttonAlterar;
	}

	public WebElement getButtonDeletar() {
		return buttonDeletar;
	}

	public WebElement getInputDeposito() {
		return inputDeposito;
	}

	public WebElement getInputDepositoConsulta() {
		return inputDepositoConsulta;
	}

	public WebElement getInputCodigoProduto() {
		return inputCodigoProduto;
	}

	public WebElement getSelectEmbProduto() {
		return selectEmbProduto;
	}

	public WebElement getSelectEmbProduto2() {
		return selectEmbProduto2;
	}

	public WebElement getSelectEmbDeposito() {
		return selectEmbDeposito;
	}

	public WebElement getInputEmbDeposito() {
		return inputEmbDeposito;
	}

	public WebElement getInputPrazoValidade() {
		return inputPrazoValidade;
	}

	public WebElement getCheckboxItemAltoRisco() {
		return checkboxItemAltoRisco;
	}

	public WebElement getCheckboxItemPerigoso() {
		return checkboxItemPerigoso;
	}

	public WebElement getInputPesoBrutoCompra() {
		return inputPesoBrutoCompra;
	}

	public WebElement getInputPesoBrutoVenda() {
		return inputPesoBrutoVenda;
	}

	public WebElement getInputLoteSerie() {
		return inputLoteSerie;
	}

	public WebElement getInputSepBatch() {
		return inputSepBatch;
	}

	public WebElement getInputTipoPeso() {
		return inputTipoPeso;
	}

	public WebElement getInputCaixa1Caixa2() {
		return inputCaixa1Caixa2;
	}

	public WebElement getInputQuantiVolume() {
		return inputQuantiVolume;
	}

	public WebElement getInputResistencia() {
		return inputResistencia;
	}

	public WebElement getInputPedidoMaximoFaturamento() {
		return inputPedidoMaximoFaturamento;
	}

	public WebElement getInputArrendondamentoFaturamento() {
		return inputArrendondamentoFaturamento;
	}

	public WebElement getInputArrendondamentoPedidoCompra() {
		return inputArrendondamentoPedidoCompra;
	}

	public WebElement getInputArrendAutomatGiro() {
		return inputArrendAutomatGiro;
	}

	public WebElement getInputDiasEstoqueProduto() {
		return inputDiasEstoqueProduto;
	}

	public WebElement getInputReferenciaProduto() {
		return inputReferenciaProduto;
	}

	public WebElement getInputOperadorLogistico() {
		return inputOperadorLogistico;
	}

	public WebElement getInputDimenCompraComprimento() {
		return inputDimenCompraComprimento;
	}

	public WebElement getInputDimenCompraLargura() {
		return inputDimenCompraLargura;
	}

	public WebElement getInputDimenCompraAltura() {
		return inputDimenCompraAltura;
	}

	public WebElement getInputDimenBrutaVendaComprimento() {
		return inputDimenBrutaVendaComprimento;
	}

	public WebElement getInputDimenBrutaVendaLargura() {
		return inputDimenBrutaVendaLargura;
	}

	public WebElement getInputDimenBrutaVendaAltura() {
		return inputDimenBrutaVendaAltura;
	}

	public WebElement getInputQuantEmbCaixaMaster() {
		return inputQuantEmbCaixaMaster;
	}

	public WebElement getInputPalletBase() {
		return inputPalletBase;
	}

	public WebElement getInputPalletBaseAltura() {
		return inputPalletBaseAltura;
	}

	public WebElement getInputPalletBaseComplemento() {
		return inputPalletBaseComplemento;
	}

	public WebElement getInputPalletBaseEANEmbala() {
		return inputPalletBaseEANEmbala;
	}

	public WebElement getInputTipoDeItem() {
		return inputTipoDeItem;
	}

	public WebElement getInputLimiteMaximoAtendItemCross() {
		return inputLimiteMaximoAtendItemCross;
	}

	public WebElement getLabelMSG() {
		return LabelMSG;
	}

}
