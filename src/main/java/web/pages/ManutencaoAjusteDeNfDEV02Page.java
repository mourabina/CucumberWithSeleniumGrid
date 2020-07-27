package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoAjusteDeNfDEV02Page {

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement input_Dep;

	@FindBy(id = "TL_DT_AJU_PESQ")
	private WebElement input_Data_Ajuste;

	@FindBy(id = "TL_STATUS_PESQ")
	private WebElement select_status;

	@FindBy(id = "TL_RECEIVER_PESQ")
	private WebElement input_Receiver;

	@FindBy(id = "TL_SEQ_AJU_PESQ")
	private WebElement input_Num_Etiqueta;

	@FindBy(id = "TL_VOLTA")
	private WebElement checkbox_Voltar;

	@FindBy(id = "panel_OPCAO1_0")
	private WebElement checkbox_Opc_Grid;

	@FindBy(id = "panel_TL_MOTIVO_0")
	private WebElement input_Mot_Grid;

	@FindBy(id = "panel_TL_PROD_0")
	private WebElement input_GRID_Produto;

	@FindBy(id = "panel_TL_DTAJU_0")
	private WebElement input_GRID_Data;

	@FindBy(id = "panel_TL_HRAJU_0")
	private WebElement input_GRID_Hora;

	@FindBy(id = "panel_TL_USUAJU_0")
	private WebElement input_GRID_Usuario;

	@FindBy(id = "panel_TL_TIPO_AJU_0")
	private WebElement input_GRID_Tipo;

	@FindBy(id = "panel_TL_STATUS_0")
	private WebElement input_GRID_Status;

	@FindBy(id = "panel_TL_FRACAO_0")
	private WebElement input_GRID_Fracao;

	@FindBy(id = "panel_TL_RECEIVER_0")
	private WebElement input_GRID_Receiver;

	@FindBy(id = "panel_TL_PEDIDO_0")
	private WebElement input_GRID_Pedido;

	@FindBy(id = "panel_TL_SEQ_AJU_0")
	private WebElement input_GRID_NUum_Sequemcia;

	@FindBy(id = "panel_TL_IND_ORIGEM_0")
	private WebElement input_GRID_Origem;

	@FindBy(id = "panel_TL_DTRCVR_0")
	private WebElement input_GRID_DTRCVR;

	@FindBy(id = "panel_TL_FORNEC_0")
	private WebElement input_GRID_Fornec;

	@FindBy(id = "TL_MENS")
	private WebElement text_MGS;

	public ManutencaoAjusteDeNfDEV02Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInput_Dep() {
		return input_Dep;
	}

	public WebElement getInput_Data_Ajuste() {
		return input_Data_Ajuste;
	}

	public WebElement getSelect_status() {
		return select_status;
	}

	public WebElement getInput_Receiver() {
		return input_Receiver;
	}

	public WebElement getInput_Num_Etiqueta() {
		return input_Num_Etiqueta;
	}

	public WebElement getCheckbox_Voltar() {
		return checkbox_Voltar;
	}

	public WebElement getCheckbox_Opc_Grid() {
		return checkbox_Opc_Grid;
	}

	public WebElement getInput_Mot_Grid() {
		return input_Mot_Grid;
	}

	public WebElement getInput_GRID_Produto() {
		return input_GRID_Produto;
	}

	public WebElement getInput_GRID_Data() {
		return input_GRID_Data;
	}

	public WebElement getInput_GRID_Hora() {
		return input_GRID_Hora;
	}

	public WebElement getInput_GRID_Usuario() {
		return input_GRID_Usuario;
	}

	public WebElement getInput_GRID_Tipo() {
		return input_GRID_Tipo;
	}

	public WebElement getInput_GRID_Status() {
		return input_GRID_Status;
	}

	public WebElement getInput_GRID_Fracao() {
		return input_GRID_Fracao;
	}

	public WebElement getInput_GRID_Receiver() {
		return input_GRID_Receiver;
	}

	public WebElement getInput_GRID_Pedido() {
		return input_GRID_Pedido;
	}

	public WebElement getInput_GRID_NUum_Sequemcia() {
		return input_GRID_NUum_Sequemcia;
	}

	public WebElement getInput_GRID_Origem() {
		return input_GRID_Origem;
	}

	public WebElement getInput_GRID_DTRCVR() {
		return input_GRID_DTRCVR;
	}

	public WebElement getInput_GRID_Fornec() {
		return input_GRID_Fornec;
	}

	public WebElement getText_MGS() {
		return text_MGS;
	}

}
