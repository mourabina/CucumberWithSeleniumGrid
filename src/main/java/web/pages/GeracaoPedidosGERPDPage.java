package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeracaoPedidosGERPDPage {

	@FindBy(id = "form")
	private WebElement form;

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

	@FindBy(id = "EXEC_PED")
	private WebElement inputExecutarPedido;

	@FindBy(id = "BT_CONSULTA")
	private WebElement bt_consultarPedido;

	@FindBy(id = "BT_CONSULTA2")
	private WebElement bt_consultarTabelaCompra;

	@FindBy(id = "BT_ADD")
	private WebElement bt_incluir;

	@FindBy(id = "BT_CHG")
	private WebElement bt_alterar;

	@FindBy(id = "BT_DEL")
	private WebElement bt_excluir;

	@FindBy(id = "panel_PR_COMPRA_0")
	private WebElement inpuGridtPrecoCompra;

	@FindBy(id = "panel_DESCX_0")
	private WebElement inputGridDesconto;

	@FindBy(id = "panel_IPI_0")
	private WebElement inputGridIPI;

	@FindBy(id = "panel_BONIF_0")
	private WebElement inputGridBonificacao;

	@FindBy(id = "panel_ICM_0")
	private WebElement inputGridICM;

	@FindBy(id = "panel_PEND_FORN_0")
	private WebElement inputGridPrecoFornecedor;

	@FindBy(id = "panel_ESTOQ_0")
	private WebElement inputGridEstoque;

	@FindBy(id = "panel_DDE_0")
	private WebElement inputGridDDE;

	@FindBy(id = "panel_QTD1_0")
	private WebElement qtdeCompra;

	@FindBy(id = "panel_OPCAO_0_checkbox")
	private WebElement opcaoItemCheckbox;

	@FindBy(id = "panel_COD_PROD_0")
	private WebElement codItem;

	@FindBy(id = "panel_NOME_PROD_0")
	private WebElement descricaoItem;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	@FindBy(id = "EXEC_PED_FX")
	private WebElement bt_ExeutarPedido;

	public GeracaoPedidosGERPDPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBt_ExeutarPedido() {
		return bt_ExeutarPedido;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getInpuGridtPrecoCompra() {
		return inpuGridtPrecoCompra;
	}

	public WebElement getInputGridDesconto() {
		return inputGridDesconto;
	}

	public WebElement getInputGridIPI() {
		return inputGridIPI;
	}

	public WebElement getInputGridBonificacao() {
		return inputGridBonificacao;
	}

	public WebElement getInputGridICM() {
		return inputGridICM;
	}

	public WebElement getInputGridPrecoFornecedor() {
		return inputGridPrecoFornecedor;
	}

	public WebElement getInputGridEstoque() {
		return inputGridEstoque;
	}

	public WebElement getInputGridDDE() {
		return inputGridDDE;
	}

	public WebElement getQtdeCompra() {
		return qtdeCompra;
	}

	public WebElement getOpcaoItemCheckbox() {
		return opcaoItemCheckbox;
	}

	public WebElement getCodItem() {
		return codItem;
	}

	public WebElement getDescricaoItem() {
		return descricaoItem;
	}

	public WebElement getBt_consultarPedido() {
		return bt_consultarPedido;
	}

	public WebElement getBt_consultarTabelaCompra() {
		return bt_consultarTabelaCompra;
	}

	public WebElement getBt_incluir() {
		return bt_incluir;
	}

	public WebElement getBt_alterar() {
		return bt_alterar;
	}

	public WebElement getBt_excluir() {
		return bt_excluir;
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

	public WebElement getInputExecutarPedido() {
		return inputExecutarPedido;
	}

	public WebElement getForm() {
		return form;
	}
}
