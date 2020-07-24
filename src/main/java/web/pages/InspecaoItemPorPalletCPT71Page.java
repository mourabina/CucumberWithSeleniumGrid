package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspecaoItemPorPalletCPT71Page {

	@FindBy(id = "TL_RECEIVER_PESQ")
	private WebElement input_Rcvr;

	@FindBy(id = "TL_DTRCV_PESQ")
	private WebElement input_DTRcvr;

	@FindBy(id = "TL_PROD_PESQ")
	private WebElement input_Produto;

	@FindBy(id = "TL_NUM_PLT_PESQ")
	private WebElement input_PalletPesquisa;

	@FindBy(id = "TL_VOLTA_checkbox")
	private WebElement checkBox_Voltar;

	@FindBy(id = "TL_PEDIDO")
	private WebElement input_Pedido;

	@FindBy(id = "TL_FORN")
	private WebElement input_Fornec;

	@FindBy(id = "TL_DOCA")
	private WebElement input_Doca;

	@FindBy(id = "TL_QTD_FBE")
	private WebElement input_QTD_FBE;

	@FindBy(id = "TL_PESO_FBE")
	private WebElement input_Peso_FBE;

	@FindBy(id = "TL_DIF_QTD")
	private WebElement input_DIF_QTD;

	@FindBy(id = "TL_DIF_PESO")
	private WebElement input_DIF_PESO;

	@FindBy(id = "panel_TL_ACAO_0_checkbox")
	private WebElement checkbox_GRID_Acao;

	@FindBy(id = "panel_TL_NUM_PLT_0")
	private WebElement input_GRID_Num_pallet;

	@FindBy(id = "panel_TL_SEQ_PLT_0")
	private WebElement input_GRID_SEQ_pallet;

	@FindBy(id = "panel_TL_ATIVO_0")
	private WebElement input_GRID_Ativo;

	@FindBy(id = "panel_TL_QTD_CXS_0")
	private WebElement input_GRID_QTD_CXS;

	@FindBy(id = "panel_TL_PESO_CX_0")
	private WebElement input_GRID_TARA_EMB;

	@FindBy(id = "panel_TL_PESO_PLT_0")
	private WebElement input_GRID_TARA_PLT;

	@FindBy(id = "panel_TL_PESO_BRT_0")
	private WebElement input_GRID_PESO_BRT;

	@FindBy(id = "panel_TL_PESO_LIQ_0")
	private WebElement input_GRID_Peso_LIQ;

	@FindBy(id = "panel_TL_DT_VAL_0")
	private WebElement input_GRID_Validade;

	@FindBy(id = "panel_TL_SIF_0")
	private WebElement input_GRID_Sif;

	@FindBy(id = "panel_TL_QTD_DEV_0")
	private WebElement input_GRID_QTD_Dev;

	@FindBy(id = "panel_TL_PESO_LIQ_DEV_0")
	private WebElement input_GRID_Peso_Dev;

	public InspecaoItemPorPalletCPT71Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInput_Rcvr() {
		return input_Rcvr;
	}

	public WebElement getInput_DTRcvr() {
		return input_DTRcvr;
	}

	public WebElement getInput_Produto() {
		return input_Produto;
	}

	public WebElement getInput_PalletPesquisa() {
		return input_PalletPesquisa;
	}

	public WebElement getCheckBox_Voltar() {
		return checkBox_Voltar;
	}

	public WebElement getInput_Pedido() {
		return input_Pedido;
	}

	public WebElement getInput_Fornec() {
		return input_Fornec;
	}

	public WebElement getInput_Doca() {
		return input_Doca;
	}

	public WebElement getInput_QTD_FBE() {
		return input_QTD_FBE;
	}

	public WebElement getInput_Peso_FBE() {
		return input_Peso_FBE;
	}

	public WebElement getInput_DIF_QTD() {
		return input_DIF_QTD;
	}

	public WebElement getInput_DIF_PESO() {
		return input_DIF_PESO;
	}

	public WebElement getCheckbox_GRID_Acao() {
		return checkbox_GRID_Acao;
	}

	public WebElement getInput_GRID_Num_pallet() {
		return input_GRID_Num_pallet;
	}

	public WebElement getInput_GRID_SEQ_pallet() {
		return input_GRID_SEQ_pallet;
	}

	public WebElement getInput_GRID_Ativo() {
		return input_GRID_Ativo;
	}

	public WebElement getInput_GRID_QTD_CXS() {
		return input_GRID_QTD_CXS;
	}

	public WebElement getInput_GRID_TARA_EMB() {
		return input_GRID_TARA_EMB;
	}

	public WebElement getInput_GRID_TARA_PLT() {
		return input_GRID_TARA_PLT;
	}

	public WebElement getInput_GRID_PESO_BRT() {
		return input_GRID_PESO_BRT;
	}

	public WebElement getInput_GRID_Peso_LIQ() {
		return input_GRID_Peso_LIQ;
	}

	public WebElement getInput_GRID_Validade() {
		return input_GRID_Validade;
	}

	public WebElement getInput_GRID_Sif() {
		return input_GRID_Sif;
	}

	public WebElement getInput_GRID_QTD_Dev() {
		return input_GRID_QTD_Dev;
	}

	public WebElement getInput_GRID_Peso_Dev() {
		return input_GRID_Peso_Dev;
	}

}
