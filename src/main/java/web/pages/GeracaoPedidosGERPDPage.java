package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class GeracaoPedidosGERPDPage extends BaseTest {

	@FindBy(id = "LABEL55")
	private WebElement labelTituloPagina;

	@FindBy(id = "COD_COMPR")
	private WebElement inputComp;

	@FindBy(id = "COD_FORN")
	private WebElement inputForn;

	@FindBy(id = "TL_HREDI")
	private WebElement inputHREDI;

	@FindBy(id = "MOV")
	private WebElement inputMov;

	@FindBy(id = "ACAO")
	private WebElement inputOpcao;

	@FindBy(id = "ITEM_PESQ")
	private WebElement inpuPesqui;

	@FindBy(id = "T_COD_FIL")
	private WebElement inputFlial;

	@FindBy(id = "COD_DISTR")
	private WebElement inputDist;

	@FindBy(id = "T_FIL_REDESP")
	private WebElement inputRedesp;

	@FindBy(id = "FRETE")
	private WebElement inputFrete;

	@FindBy(id = "COD_TRANSP")
	private WebElement inputCodTranspo;

	@FindBy(id = "DATA1")
	private WebElement inputDatas1;

	@FindBy(id = "DATA2")
	private WebElement inputDatas2;

	@FindBy(id = "DATA3")
	private WebElement inputDatas3;

	@FindBy(id = "PED_GRATIS")
	private WebElement inputGratis;

	@FindBy(id = "CLASSIF")
	private WebElement inputClassif;

	@FindBy(id = "COD_HD")
	private WebElement inputIDPRZ;

	@FindBy(id = "PRZ_HD")
	private WebElement inputTextPRZ;

	@FindBy(id = "NUM_CONTR")
	private WebElement inputCont;

	@FindBy(id = "NUM_EVE")
	private WebElement inputEVE;

	@FindBy(id = "EMP_R3")
	private WebElement inputEmpre;

	@FindBy(id = "OPC_EST")
	private WebElement inputEstoc;

	@FindBy(id = "OBSERV")
	private WebElement inputObs;

	@FindBy(id = "XCOD_PROD1")
	private WebElement inputCodProduto;

	@FindBy(id = "XNOME_PROD1")
	private WebElement inputDescProduto;

	@FindBy(id = "XPR_COMPRA1")
	private WebElement inputValorCompra1;

	@FindBy(id = "XDESCX1")
	private WebElement inputValorDesc;

	@FindBy(id = "XIPI1")
	private WebElement inputValorDesc1;

	@FindBy(id = "XBONIF1")
	private WebElement inputBonificacao;

	@FindBy(id = "XICM1")
	private WebElement inputICMS;

	@FindBy(id = "XCOD1")
	private WebElement inputPrazo1;

	@FindBy(id = "XPRZ1")
	private WebElement inputPrazo2;

	@FindBy(id = "XDESCTO1")
	private WebElement inputDFIN1;

	@FindBy(id = "XBONUS1")
	private WebElement inputBonus;

	@FindBy(id = "XIMP1")
	private WebElement inputIMP;

	@FindBy(id = "XEMB1")
	private WebElement inputEMB;

	@FindBy(id = "XLES1")
	private WebElement inputLES;

	@FindBy(id = "XPV_ATU1")
	private WebElement inputPVATU;

	@FindBy(id = "XMRG_REAL1XSD")
	private WebElement inputMReal;

	@FindBy(id = "XMRG_REAL1")
	private WebElement inputMReal1;

	@FindBy(id = "XPEND_FATM1")
	private WebElement inputPendFatur;

	@FindBy(id = "XDDE1")
	private WebElement inputDDE;

	@FindBy(id = "XPEND_FORN1")
	private WebElement inputPendForne;

	@FindBy(id = "EXEC_PED")
	private WebElement inputExecutarPedido;

	@FindBy(id = "EXEC_REL")
	private WebElement inputBaixaRelatorio;

	@FindBy(id = "EXEC_IMP")
	private WebElement inputIMpressora;

	@FindBy(id = "DESCTO_HD")
	private WebElement inputDesconto;

	@FindBy(id = "BONUS_HD")
	private WebElement bonus;

	GeracaoPedidosGERPDPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBonus() {
		return bonus;
	}

	public WebElement getInputDesconto() {
		return inputDesconto;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputComp() {
		return inputComp;
	}

	public WebElement getInputForn() {
		return inputForn;
	}

	public WebElement getInputHREDI() {
		return inputHREDI;
	}

	public WebElement getInputMov() {
		return inputMov;
	}

	public WebElement getInputOpcao() {
		return inputOpcao;
	}

	public WebElement getInpuPesqui() {
		return inpuPesqui;
	}

	public WebElement getInputFlial() {
		return inputFlial;
	}

	public WebElement getInputDist() {
		return inputDist;
	}

	public WebElement getInputRedesp() {
		return inputRedesp;
	}

	public WebElement getInputFrete() {
		return inputFrete;
	}

	public WebElement getInputCodTranspo() {
		return inputCodTranspo;
	}

	public WebElement getInputDatas1() {
		return inputDatas1;
	}

	public WebElement getInputDatas2() {
		return inputDatas2;
	}

	public WebElement getInputDatas3() {
		return inputDatas3;
	}

	public WebElement getInputGratis() {
		return inputGratis;
	}

	public WebElement getInputClassif() {
		return inputClassif;
	}

	public WebElement getInputIDPRZ() {
		return inputIDPRZ;
	}

	public WebElement getInputTextPRZ() {
		return inputTextPRZ;
	}

	public WebElement getInputCont() {
		return inputCont;
	}

	public WebElement getInputEVE() {
		return inputEVE;
	}

	public WebElement getInputEmpre() {
		return inputEmpre;
	}

	public WebElement getInputEstoc() {
		return inputEstoc;
	}

	public WebElement getInputObs() {
		return inputObs;
	}

	public WebElement getInputCodProduto() {
		return inputCodProduto;
	}

	public WebElement getInputDescProduto() {
		return inputDescProduto;
	}

	public WebElement getInputValorCompra1() {
		return inputValorCompra1;
	}

	public WebElement getInputValorDesc() {
		return inputValorDesc;
	}

	public WebElement getInputValorDesc1() {
		return inputValorDesc1;
	}

	public WebElement getInputBonificacao() {
		return inputBonificacao;
	}

	public WebElement getInputICMS() {
		return inputICMS;
	}

	public WebElement getInputPrazo1() {
		return inputPrazo1;
	}

	public WebElement getInputPrazo2() {
		return inputPrazo2;
	}

	public WebElement getInputDFIN1() {
		return inputDFIN1;
	}

	public WebElement getInputBonus() {
		return inputBonus;
	}

	public WebElement getInputIMP() {
		return inputIMP;
	}

	public WebElement getInputEMB() {
		return inputEMB;
	}

	public WebElement getInputLES() {
		return inputLES;
	}

	public WebElement getInputPVATU() {
		return inputPVATU;
	}

	public WebElement getInputMReal() {
		return inputMReal;
	}

	public WebElement getInputMReal1() {
		return inputMReal1;
	}

	public WebElement getInputPendFatur() {
		return inputPendFatur;
	}

	public WebElement getInputDDE() {
		return inputDDE;
	}

	public WebElement getInputPendForne() {
		return inputPendForne;
	}

	public WebElement getInputExecutarPedido() {
		return inputExecutarPedido;
	}

	public WebElement getInputBaixaRelatorio() {
		return inputBaixaRelatorio;
	}

	public WebElement getInputIMpressora() {
		return inputIMpressora;
	}

}
