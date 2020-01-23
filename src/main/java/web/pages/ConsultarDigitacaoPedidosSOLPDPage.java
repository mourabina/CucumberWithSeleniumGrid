package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ConsultarDigitacaoPedidosSOLPDPage extends BaseTest{
	
	@FindBy(id = "LABEL20")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "COD_LOC")
	private WebElement inputLocal;
	
	@FindBy(id = "COD_FORNEC")
	private WebElement inputFornecedor;
	
	@FindBy(id = "COD_LOJA_WM")
	private WebElement inputFilial;
	
	@FindBy(id = "COD_COMPR")
	private WebElement inputCompr;
	
	@FindBy(id = "COD_PROD_PESQ")
	private WebElement inputProduto;
	
	@FindBy(id = "DATA_PESQ")
	private WebElement inputData;
	
	@FindBy(id = "HORA_PESQ")
	private WebElement inputHora;  
	
	@FindBy(id = "SIT_PESQ")
	private WebElement inputSituacao;
	
	@FindBy(id = "XCOD_LOCAL1")
	private WebElement textLocal;
	
	@FindBy(id = "XCOD_FORN1")
	private WebElement textFornecedor;
	
	@FindBy(id = "XNOME_FORN1")
	private WebElement textNomeFornecedor;
	
	@FindBy(id = "XEST1")
	private WebElement textUF;
	
	@FindBy(id = "XLOJA_WM1")
	private WebElement textLoja;
	
	@FindBy(id = "XCOMPR1")
	private WebElement textCPR;
	
	@FindBy(id = "XCOD_TIPO1")
	private WebElement textTP;
	
	@FindBy(id = "XCOD_TAB1")
	private WebElement textTAB;
	
	@FindBy(id = "XCLASS1")
	private WebElement textClassificacao;
	
	@FindBy(id = "XDESC_CLAS1")
	private WebElement textDescCalssificacao;
	
	@FindBy(id = "XCOD_PROD1")
	private WebElement textProduto;
	
	@FindBy(id = "XQUANT1")
	private WebElement textQuanti;
	
	@FindBy(id = "XPRECO1")
	private WebElement textPreco;
	
	@FindBy(id = "XDESCX1")
	private WebElement textDesconto;
	
	@FindBy(id = "XDATA_X1")
	private WebElement textDataEntrada;
	
	@FindBy(id = "XDATA_DIG1")
	private WebElement textDataDigitada;
	
	@FindBy(id = "XHORA_DIG1")
	private WebElement textHoraDigitada;

	ConsultarDigitacaoPedidosSOLPDPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
		
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputLocal() {
		return inputLocal;
	}

	public WebElement getInputFornecedor() {
		return inputFornecedor;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputCompr() {
		return inputCompr;
	}

	public WebElement getInputProduto() {
		return inputProduto;
	}

	public WebElement getInputData() {
		return inputData;
	}

	public WebElement getInputHora() {
		return inputHora;
	}

	public WebElement getInputSituacao() {
		return inputSituacao;
	}

	public WebElement getTextLocal() {
		return textLocal;
	}

	public WebElement getTextFornecedor() {
		return textFornecedor;
	}

	public WebElement getTextNomeFornecedor() {
		return textNomeFornecedor;
	}

	public WebElement getTextUF() {
		return textUF;
	}

	public WebElement getTextLoja() {
		return textLoja;
	}

	public WebElement getTextCPR() {
		return textCPR;
	}

	public WebElement getTextTP() {
		return textTP;
	}

	public WebElement getTextTAB() {
		return textTAB;
	}

	public WebElement getTextClassificacao() {
		return textClassificacao;
	}

	public WebElement getTextDescCalssificacao() {
		return textDescCalssificacao;
	}

	public WebElement getTextProduto() {
		return textProduto;
	}

	public WebElement getTextQuanti() {
		return textQuanti;
	}

	public WebElement getTextPreco() {
		return textPreco;
	}

	public WebElement getTextDesconto() {
		return textDesconto;
	}

	public WebElement getTextDataEntrada() {
		return textDataEntrada;
	}

	public WebElement getTextDataDigitada() {
		return textDataDigitada;
	}

	public WebElement getTextHoraDigitada() {
		return textHoraDigitada;
	}

}
