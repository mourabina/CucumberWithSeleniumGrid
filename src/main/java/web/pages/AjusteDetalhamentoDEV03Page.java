package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjusteDetalhamentoDEV03Page {

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement input_Dep;

	@FindBy(id = "TL_STATUS_AJU")
	private WebElement input_statusAjuste;

	@FindBy(id = "TL_IND_ORIGEM")
	private WebElement input_origem;

	@FindBy(id = "TL_TIPO_AJU")
	private WebElement input_tipoAjuste;

	@FindBy(id = "TL_USU_ACAT_DIV")
	private WebElement input_usuAcatDiverge;

	@FindBy(id = "TL_FRACAO")
	private WebElement input_fracao;

	@FindBy(id = "TL_RECEIVER")
	private WebElement input_receiver;

	@FindBy(id = "TL_DT_RCV")
	private WebElement input_dataReceiver;

	@FindBy(id = "TL_DT_QA")
	private WebElement input_dataQA;

	@FindBy(id = "TL_HR_QA")
	private WebElement input_horaQA;

	@FindBy(id = "TL_PEDIDO")
	private WebElement input_pedido;

	@FindBy(id = "TL_FORNEC")
	private WebElement input_fornecedor;

	@FindBy(id = "TL_DTLTM")
	private WebElement input_dataSNF;

	@FindBy(id = "TL_HRLTM")
	private WebElement input_horaSNF;

	@FindBy(id = "TL_SEQ_AJU")
	private WebElement input_seqAjuste;

	@FindBy(id = "TL_USUAJU")
	private WebElement input_usuAjuste;

	@FindBy(id = "TL_DTAJU")
	private WebElement input_dtAjuste;

	@FindBy(id = "TL_HRAJU")
	private WebElement input_hrAjuste;

	@FindBy(id = "TL_PROD")
	private WebElement input_produto;

	@FindBy(id = "TL_DESCRI")
	private WebElement input_descricao;

	@FindBy(id = "TL_END_AJU_QA")
	private WebElement input_endAjusQA;

	@FindBy(id = "TL_NUMPALETE")
	private WebElement input_NumPallet;

	@FindBy(id = "TL_QTD_DEV")
	private WebElement input_DTDDEV;

	@FindBy(id = "TL_PESO_DEV")
	private WebElement input_PesoDEV;

	@FindBy(id = "TL_CUSTO_ITEM")
	private WebElement input_valorCusto;

	@FindBy(id = "BTN_VOLTA_FX")
	private WebElement button_voltar;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	public AjusteDetalhamentoDEV03Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInput_Dep() {
		return input_Dep;
	}

	public WebElement getInput_statusAjuste() {
		return input_statusAjuste;
	}

	public WebElement getInput_origem() {
		return input_origem;
	}

	public WebElement getInput_tipoAjuste() {
		return input_tipoAjuste;
	}

	public WebElement getInput_usuAcatDiverge() {
		return input_usuAcatDiverge;
	}

	public WebElement getInput_fracao() {
		return input_fracao;
	}

	public WebElement getInput_receiver() {
		return input_receiver;
	}

	public WebElement getInput_dataReceiver() {
		return input_dataReceiver;
	}

	public WebElement getInput_dataQA() {
		return input_dataQA;
	}

	public WebElement getInput_horaQA() {
		return input_horaQA;
	}

	public WebElement getInput_pedido() {
		return input_pedido;
	}

	public WebElement getInput_fornecedor() {
		return input_fornecedor;
	}

	public WebElement getInput_dataSNF() {
		return input_dataSNF;
	}

	public WebElement getInput_horaSNF() {
		return input_horaSNF;
	}

	public WebElement getInput_seqAjuste() {
		return input_seqAjuste;
	}

	public WebElement getInput_usuAjuste() {
		return input_usuAjuste;
	}

	public WebElement getInput_dtAjuste() {
		return input_dtAjuste;
	}

	public WebElement getInput_hrAjuste() {
		return input_hrAjuste;
	}

	public WebElement getInput_produto() {
		return input_produto;
	}

	public WebElement getInput_descricao() {
		return input_descricao;
	}

	public WebElement getInput_endAjusQA() {
		return input_endAjusQA;
	}

	public WebElement getInput_NumPallet() {
		return input_NumPallet;
	}

	public WebElement getInput_DTDDEV() {
		return input_DTDDEV;
	}

	public WebElement getInput_PesoDEV() {
		return input_PesoDEV;
	}

	public WebElement getInput_valorCusto() {
		return input_valorCusto;
	}

	public WebElement getButton_voltar() {
		return button_voltar;
	}

	public WebElement getMsg() {
		return msg;
	}

}
