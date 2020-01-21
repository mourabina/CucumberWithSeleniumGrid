package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class GeracaoPedidosGERPDPage extends BaseTest {
  
	@FindBy(id = "idLABEL55")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "idCOD_COMPR")
	private WebElement inputComp;
	
	@FindBy(id = "idCOD_FORN")
	private WebElement inputForn;
	
	@FindBy(id = "idTL_HREDI")
	private WebElement inputHREDI;
	
	@FindBy(id = "idMOV")
	private WebElement inputMov;
	
	@FindBy(id = "idACAO")
	private WebElement inputOpcao;
	
	@FindBy(id = "idITEM_PESQ")
	private WebElement inpuPesqui;
	
	@FindBy(id = "idT_COD_FIL")
	private WebElement inputFlial;
	
	@FindBy(id = "idCOD_DISTR")
	private WebElement inputDist;
	
	@FindBy(id = "idT_FIL_REDESP")
	private WebElement inputRedesp;
	
	@FindBy(id = "idFRETE")
	private WebElement inputFrete;
	
	@FindBy(id = "idCOD_TRANSP")
	private WebElement inputCodTranspo;
	
	@FindBy(id = "idDATA1")
	private WebElement inputDatas1;
	
	@FindBy(id = "idDATA2")
	private WebElement inputDatas2;
	
	@FindBy(id = "idDATA3")
	private WebElement inputDatas3;
	
	@FindBy(id = "idPED_GRATIS")
	private WebElement inputGratis;
	
	@FindBy(id = "idCLASSIF")
	private WebElement inputClassif;
	
	@FindBy(id = "idCOD_HD")
	private WebElement inputIDPRZ;
	
	@FindBy(id = "idPRZ_HD")
	private WebElement inputTextPRZ;
	
	@FindBy(id = "idNUM_CONTR")
	private WebElement inputCont;
	
	@FindBy(id = "idNUM_EVE")
	private WebElement inputEVE;
	
	@FindBy(id = "idEMP_R3")
	private WebElement inputEmpre;
	
	@FindBy(id = "idOPC_EST")
	private WebElement inputEstoc;
	
	@FindBy(id = "idOBSERV")
	private WebElement inputObs;
	
	@FindBy(id = "idXCOD_PROD1")
	private WebElement inputCodProduto;
	
	@FindBy(id = "idXNOME_PROD1")
	private WebElement inputDescProduto;
	
	@FindBy(id = "idXPR_COMPRA1")
	private WebElement inputValorCompra1;
	
	@FindBy(id = "idXDESCX1")
	private WebElement inputValorDesc;
	
	@FindBy(id = "idXIPI1")
	private WebElement inputValorDesc1;
	
	@FindBy(id = "idXBONIF1")
	private WebElement inputBonificacao;
	
	@FindBy(id = "idXICM1")
	private WebElement inputICMS;
	
	@FindBy(id = "idXCOD1")
	private WebElement inputPrazo1;
	
	@FindBy(id = "idXPRZ1")
	private WebElement inputPrazo2;
	
	@FindBy(id = "idXDESCTO1")
	private WebElement inputDFIN1;
	
	@FindBy(id = "idXBONUS1")
	private WebElement inputBonus;
	
	@FindBy(id = "idXIMP1")
	private WebElement inputIMP;
	
	@FindBy(id = "idXEMB1")
	private WebElement inputEMB;
	
	@FindBy(id = "idXLES1")
	private WebElement inputLES;
	
	@FindBy(id = "idXPV_ATU1")
	private WebElement inputPVATU;
	
	@FindBy(id = "idXMRG_REAL1XSD")
	private WebElement inputMReal;
	
	@FindBy(id = "idXMRG_REAL1")
	private WebElement inputMReal1;
	
	@FindBy(id = "idXPEND_FATM1")
	private WebElement inputPendFatur;
	
	@FindBy(id = "idXDDE1")
	private WebElement inputDDE;
	
	@FindBy(id = "idXPEND_FORN1")
	private WebElement inputPendForne;
	
	@FindBy(id = "idEXEC_PED")
	private WebElement inputExecutarPedido;
	
	@FindBy(id = "idEXEC_REL")
	private WebElement inputBaixaRelatorio;
	
	@FindBy(id = "idEXEC_IMP")
	private WebElement inputIMpressora;

	GeracaoPedidosGERPDPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
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
