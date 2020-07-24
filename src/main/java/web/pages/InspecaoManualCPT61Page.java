package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspecaoManualCPT61Page {

	@FindBy(id = "InspecaoManualCPT61")
	private WebElement text_dep;

	@FindBy(id = "TL_RECEIVER_PESQ")
	private WebElement input_rcvr;

	@FindBy(id = "TL_DTRCV_PESQ")
	private WebElement input_dataRcvr;

	@FindBy(id = "TL_DOCA")
	private WebElement input_Doca;

	@FindBy(id = "TL_PEDIDO")
	private WebElement input_Pedido;

	@FindBy(id = "TL_FORN")
	private WebElement input_CodForn;

	@FindBy(id = "TL_NOME")
	private WebElement input_NomeFornec;

	@FindBy(id = "TL_PROD_PESQ")
	private WebElement input_ProdutoPesquisa;

	@FindBy(id = "TL_IND_DIVERG_PESQ")
	private WebElement input_FiltroIndDiverge;

	@FindBy(id = "TL_FINALIZAR")
	private WebElement input_Finalizar;

	@FindBy(id = "TL_REJEITAR")
	private WebElement input_Rejeitar;

	@FindBy(id = "TL_CONF_DIV")
	private WebElement input_ConfDivergencias;

	@FindBy(id = "TL_CORRECAO_SNF_FX")
	private WebElement button_CorrecaoSNF;

	@FindBy(id = "panel_TL_PROD_0")
	private WebElement grid_Produto;

	@FindBy(id = "panel_TL_ACAO_0")
	private WebElement grid_Acao;

	@FindBy(id = "panel_TL_DESCRI_0")
	private WebElement grid_Descricao;

	@FindBy(id = "panel_TL_QTD_FBE_0")
	private WebElement grid_QTDFBE;

	@FindBy(id = "panel_TL_QTD_CONF_0")
	private WebElement grid_QTDCONF;

	@FindBy(id = "panel_TL_QTD_DEV_0")
	private WebElement grid_QTDDEV;

	@FindBy(id = "panel_TL_DIVERGENCIA_0")
	private WebElement grid_Divergencias;

	@FindBy(id = "panel_TL_PESO_FBE_0")
	private WebElement grid_PesoFBE;

	@FindBy(id = "panel_TL_PESO_LIQ_CONF_0")
	private WebElement grid_PesoConf;

	@FindBy(id = "panel_TL_PESO_LIQ_DEV_0")
	private WebElement grid_PesoDev;

	@FindBy(id = "panel_TL_PESO_BRT_CONF_0")
	private WebElement grid_PesoBRTDEv;

	@FindBy(id = "panel_TL_DIF_QTD_0")
	private WebElement grid_QTDDiferencas;

	@FindBy(id = "panel_TL_DIF_PESO_0")
	private WebElement grid_PesoDIferencas;

	@FindBy(id = "TL_CANCEL_GUIA")
	private WebElement button_CancelamentoCompletoGuia;

	public InspecaoManualCPT61Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getText_dep() {
		return text_dep;
	}

	public WebElement getInput_rcvr() {
		return input_rcvr;
	}

	public WebElement getInput_dataRcvr() {
		return input_dataRcvr;
	}

	public WebElement getInput_Doca() {
		return input_Doca;
	}

	public WebElement getInput_Pedido() {
		return input_Pedido;
	}

	public WebElement getInput_CodForn() {
		return input_CodForn;
	}

	public WebElement getInput_NomeFornec() {
		return input_NomeFornec;
	}

	public WebElement getInput_ProdutoPesquisa() {
		return input_ProdutoPesquisa;
	}

	public WebElement getInput_FiltroIndDiverge() {
		return input_FiltroIndDiverge;
	}

	public WebElement getInput_Finalizar() {
		return input_Finalizar;
	}

	public WebElement getInput_Rejeitar() {
		return input_Rejeitar;
	}

	public WebElement getInput_ConfDivergencias() {
		return input_ConfDivergencias;
	}

	public WebElement getButton_CorrecaoSNF() {
		return button_CorrecaoSNF;
	}

	public WebElement getGrid_Produto() {
		return grid_Produto;
	}

	public WebElement getGrid_Acao() {
		return grid_Acao;
	}

	public WebElement getGrid_Descricao() {
		return grid_Descricao;
	}

	public WebElement getGrid_QTDFBE() {
		return grid_QTDFBE;
	}

	public WebElement getGrid_QTDCONF() {
		return grid_QTDCONF;
	}

	public WebElement getGrid_QTDDEV() {
		return grid_QTDDEV;
	}

	public WebElement getGrid_Divergencias() {
		return grid_Divergencias;
	}

	public WebElement getGrid_PesoFBE() {
		return grid_PesoFBE;
	}

	public WebElement getGrid_PesoConf() {
		return grid_PesoConf;
	}

	public WebElement getGrid_PesoDev() {
		return grid_PesoDev;
	}

	public WebElement getGrid_PesoBRTDEv() {
		return grid_PesoBRTDEv;
	}

	public WebElement getGrid_QTDDiferencas() {
		return grid_QTDDiferencas;
	}

	public WebElement getGrid_PesoDIferencas() {
		return grid_PesoDIferencas;
	}

	public WebElement getButton_CancelamentoCompletoGuia() {
		return button_CancelamentoCompletoGuia;
	}

}
