package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class DigitacaoPedidosINPE2Page extends BaseTest {
	
	@FindBy(id = "idLABEL34")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "idTL_REG")
	private WebElement inputRegional;
	
	@FindBy(id = "idOPCAO")
	private WebElement inputOpcao;
	
	@FindBy(id = "idTL_PROD")
	private WebElement inputProduto;
	
	@FindBy(id = "idTL_FORN")
	private WebElement inputFornecedor;
	
	@FindBy(id = "idQTDE")
	private WebElement inputQuatidade;
	
	@FindBy(id = "idNUM_EVE")
	private WebElement inputEvento;
	
	@FindBy(id = "idTL_OBSP")
	private WebElement inputObservacao;
	
	@FindBy(id = "idTL_COMP")
	private WebElement inputComprador;
	
	@FindBy(id = "idTL_PCOMPRA")
	private WebElement inputPRCompras;
	
	@FindBy(id = "idTL_PEDGRAT")
	private WebElement inputGratis;
	
	@FindBy(id = "idTL_DTENT")
	private WebElement inputDataEntrega;
	
	@FindBy(id = "idTL_DESCT")
	private WebElement inputDesconto;
	
	@FindBy(id = "idTL_MOTG")
	private WebElement inputMotivo;
	
	@FindBy(id = "idTL_CPAGTO")
	private WebElement inputCodigoPagamento;
	
	@FindBy(id = "idNUM_CONTR")
	private WebElement inputContr;
	
	@FindBy(id = "idTL_CLASP")
	private WebElement inputClassif;
	
	@FindBy(id = "idTL_ICM")
	private WebElement inputICMS;
	
	@FindBy(id = "idTL_HREDI")
	private WebElement inputHREDI;
	
	@FindBy(id = "idEXEC_PED")
	private WebElement inputExecutarPedido;
	
	@FindBy(id = "idEXEC_REL")
	private WebElement inputBaixarRelatorio;
	
	@FindBy(id = "idEXEC_IMP")
	private WebElement inputIMpressora;

	public DigitacaoPedidosINPE2Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
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
