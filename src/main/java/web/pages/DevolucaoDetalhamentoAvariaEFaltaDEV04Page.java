package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DevolucaoDetalhamentoAvariaEFaltaDEV04Page {

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement input_dep;

	@FindBy(id = "TL_STATUS_AJU")
	private WebElement input_statusAjuste;

	@FindBy(id = "TL_IND_ORIGEM")
	private WebElement input_origem;

	@FindBy(id = "TL_OPCAO")
	private WebElement input_opcao;

	@FindBy(id = "TL_PROD")
	private WebElement input_produto;

	@FindBy(id = "TL_DESCRI")
	private WebElement input_descricao;

	@FindBy(id = "TL_FRACAO")
	private WebElement input_fracao;

	@FindBy(id = "TL_RECEIVER")
	private WebElement input_receiver;

	@FindBy(id = "TL_DT_RCV")
	private WebElement input_dataReceiver;

	@FindBy(id = "TL_DTAJU")
	private WebElement input_dataAjuste;

	@FindBy(id = "TL_HRAJU")
	private WebElement input_horaAjuste;

	@FindBy(id = "TL_PEDIDO")
	private WebElement input_pedido;

	@FindBy(id = "TL_TIPO_AJU_DESCR")
	private WebElement input_tipoAjuste;

	@FindBy(id = "TL_FORNEC")
	private WebElement input_fornec;

	@FindBy(id = "TL_SEQ_AJU_ORIG")
	private WebElement input_etiqDevOrig;

	@FindBy(id = "TL_QTDE_DEV")
	private WebElement input_qtdDevOrig;

	@FindBy(id = "TL_PESO_DEV")
	private WebElement input_pesoDevOrig;

	@FindBy(id = "TL_QTD_FBE")
	private WebElement input_qtdFbe;

	@FindBy(id = "TL_QTD_CONF")
	private WebElement input_qtdConf;

	@FindBy(id = "TL_PESO_FBE")
	private WebElement input_pesoFbe;

	@FindBy(id = "TL_PESO_CONF")
	private WebElement input_pesoConf;

	@FindBy(id = "TL_SEQ_AJU_A")
	private WebElement input_etiqDev1;

	@FindBy(id = "TL_SEQ_AJU_F")
	private WebElement input_etiqDev2;

	@FindBy(id = "TL_QTDE_A")
	private WebElement input_qtdeAvarias;

	@FindBy(id = "TL_QTDE_F")
	private WebElement input_qtdeFaltas;

	@FindBy(id = "TL_PESO_A")
	private WebElement input_pesoAvarias;

	@FindBy(id = "TL_PESO_F")
	private WebElement input_pesoFaltas;

	@FindBy(id = "BTN_VOLTA_FX")
	private WebElement buuton_voltar;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	public DevolucaoDetalhamentoAvariaEFaltaDEV04Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInput_dep() {
		return input_dep;
	}

	public WebElement getInput_statusAjuste() {
		return input_statusAjuste;
	}

	public WebElement getInput_origem() {
		return input_origem;
	}

	public WebElement getInput_opcao() {
		return input_opcao;
	}

	public WebElement getInput_produto() {
		return input_produto;
	}

	public WebElement getInput_descricao() {
		return input_descricao;
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

	public WebElement getInput_dataAjuste() {
		return input_dataAjuste;
	}

	public WebElement getInput_horaAjuste() {
		return input_horaAjuste;
	}

	public WebElement getInput_pedido() {
		return input_pedido;
	}

	public WebElement getInput_tipoAjuste() {
		return input_tipoAjuste;
	}

	public WebElement getInput_fornec() {
		return input_fornec;
	}

	public WebElement getInput_etiqDevOrig() {
		return input_etiqDevOrig;
	}

	public WebElement getInput_qtdDevOrig() {
		return input_qtdDevOrig;
	}

	public WebElement getInput_pesoDevOrig() {
		return input_pesoDevOrig;
	}

	public WebElement getInput_qtdFbe() {
		return input_qtdFbe;
	}

	public WebElement getInput_qtdConf() {
		return input_qtdConf;
	}

	public WebElement getInput_pesoFbe() {
		return input_pesoFbe;
	}

	public WebElement getInput_pesoConf() {
		return input_pesoConf;
	}

	public WebElement getInput_etiqDev1() {
		return input_etiqDev1;
	}

	public WebElement getInput_etiqDev2() {
		return input_etiqDev2;
	}

	public WebElement getInput_qtdeAvarias() {
		return input_qtdeAvarias;
	}

	public WebElement getInput_qtdeFaltas() {
		return input_qtdeFaltas;
	}

	public WebElement getInput_pesoAvarias() {
		return input_pesoAvarias;
	}

	public WebElement getInput_pesoFaltas() {
		return input_pesoFaltas;
	}

	public WebElement getBuuton_voltar() {
		return buuton_voltar;
	}

	public WebElement getMsg() {
		return msg;
	}

}
