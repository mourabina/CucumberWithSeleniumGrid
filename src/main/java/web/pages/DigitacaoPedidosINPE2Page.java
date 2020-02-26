package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class DigitacaoPedidosINPE2Page extends BaseTest {

	@FindBy(id = "LABEL34")
	private WebElement labelTituloPagina;

	@FindBy(id = "TL_REG")
	private WebElement inputRegional;

	@FindBy(id = "OPCAO")
	private WebElement inputOpcao;

	@FindBy(id = "TL_PROD")
	private WebElement inputProduto;

	@FindBy(id = "TL_FORN")
	private WebElement inputFornecedor;

	@FindBy(id = "QTDE")
	private WebElement inputQuatidade;

	@FindBy(id = "NUM_EVE")
	private WebElement inputEvento;

	@FindBy(id = "TL_OBSP")
	private WebElement inputObservacao;

	@FindBy(id = "TL_COMP")
	private WebElement inputComprador;

	@FindBy(id = "TL_PCOMPRA")
	private WebElement inputPRCompras;

	@FindBy(id = "TL_PEDGRAT")
	private WebElement inputGratis;

	@FindBy(id = "TL_DTENT")
	private WebElement inputDataEntrega;

	@FindBy(id = "TL_DESCT")
	private WebElement inputDesconto;

	@FindBy(id = "TL_MOTG")
	private WebElement inputMotivo;

	@FindBy(id = "TL_CPAGTO")
	private WebElement inputCodigoPagamento;

	@FindBy(id = "NUM_CONTR")
	private WebElement inputContr;

	@FindBy(id = "TL_CLASP")
	private WebElement inputClassif;

	@FindBy(id = "TL_ICM")
	private WebElement inputICMS;

	@FindBy(id = "TL_HREDI")
	private WebElement inputHREDI;

	@FindBy(id = "EXEC_PED")
	private WebElement inputExecutarPedido;

	@FindBy(id = "EXEC_REL")
	private WebElement inputBaixarRelatorio;

	@FindBy(id = "EXEC_IMP")
	private WebElement inputIMpressora;

	@FindBy(id = "TL_IPI")
	private WebElement inputIPI;

	@FindBy(id = "panel_FILENT1_WM_0")
	private WebElement labelCodigoFilial;

	@FindBy(id = "panel_NOMEFIL1_0")
	private WebElement labelNomeFilial;

	public DigitacaoPedidosINPE2Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelCodigoFilial() {
		return labelCodigoFilial;
	}

	public WebElement getLabelNomeFilial() {
		return labelNomeFilial;
	}

	public WebElement getInputIPI() {
		return inputIPI;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputRegional() {
		return inputRegional;
	}

	public WebElement getInputOpcao() {
		return inputOpcao;
	}

	public WebElement getInputProduto() {
		return inputProduto;
	}

	public WebElement getInputFornecedor() {
		return inputFornecedor;
	}

	public WebElement getInputQuatidade() {
		return inputQuatidade;
	}

	public WebElement getInputEvento() {
		return inputEvento;
	}

	public WebElement getInputObservacao() {
		return inputObservacao;
	}

	public WebElement getInputComprador() {
		return inputComprador;
	}

	public WebElement getInputPRCompras() {
		return inputPRCompras;
	}

	public WebElement getInputGratis() {
		return inputGratis;
	}

	public WebElement getInputDataEntrega() {
		return inputDataEntrega;
	}

	public WebElement getInputDesconto() {
		return inputDesconto;
	}

	public WebElement getInputMotivo() {
		return inputMotivo;
	}

	public WebElement getInputCodigoPagamento() {
		return inputCodigoPagamento;
	}

	public WebElement getInputContr() {
		return inputContr;
	}

	public WebElement getInputClassif() {
		return inputClassif;
	}

	public WebElement getInputICMS() {
		return inputICMS;
	}

	public WebElement getInputHREDI() {
		return inputHREDI;
	}

	public WebElement getInputExecutarPedido() {
		return inputExecutarPedido;
	}

	public WebElement getInputBaixarRelatorio() {
		return inputBaixarRelatorio;
	}

	public WebElement getInputIMpressora() {
		return inputIMpressora;
	}

}
