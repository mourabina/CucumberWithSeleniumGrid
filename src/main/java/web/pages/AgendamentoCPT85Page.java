package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class AgendamentoCPT85Page extends BaseTest {

	@FindBy(id = "LABEL28")
	private WebElement labelTituloPagina;

	@FindBy(id = "BTINQUIRY_FX")
	private WebElement buttonConsultar;
	
	@FindBy(id = "Button1_FX")
	private WebElement buttonConsultarPedido;	

	@FindBy(id = "BTINCLUDE_FX")
	private WebElement buttonIncluir;

	@FindBy(id = "BTMODIFY_FX")
	private WebElement buttonAlterar;

	@FindBy(id = "BTDELETE_FX")
	private WebElement buttonDeletar;

	@FindBy(id = "BTREFRESH_FX")
	private WebElement buttonFinalizar;

	@FindBy(id = "TNUMAGEND")
	private WebElement inputAgenda;

	@FindBy(id = "TDATAGEND")
	private WebElement inputDataAgenda;

	@FindBy(id = "TDATAENT")
	private WebElement inputDataEntrada;

	@FindBy(id = "THORA")
	private WebElement inputHoraEntrada;

	@FindBy(id = "TMIN")
	private WebElement inputMinutoEntrada;

	@FindBy(id = "TFILIALPO")
	private WebElement inputFilial;

	@FindBy(id = "TFILORI")
	private WebElement inputFilialOrigem;

	@FindBy(id = "TNUMNOTA")
	private WebElement inputNummeroNota;

	@FindBy(id = "TSERNOTA")
	private WebElement inputSerieNota;

	@FindBy(id = "TNOMETRNSP")
	private WebElement inputTransportadora;

	@FindBy(id = "TCHEGVEIC")
	private WebElement inputVeicuNoCD;

	@FindBy(id = "TB_TPVEIC")
	private WebElement selectTipoVeiculo;

	@FindBy(id = "TB_TPCARGA")
	private WebElement selectTipoCarga;

	@FindBy(id = "TB_TPENTREGA")
	private WebElement selectTipoEntrega;

	@FindBy(id = "TB_TPAGENDA")
	private WebElement selectTipoAgendaElement;

	@FindBy(id = "TCONTATO")
	private WebElement inputContato;

	@FindBy(id = "TFONE")
	private WebElement inputTelefone;

	@FindBy(id = "TPEREC")
	private WebElement inputPerecivel;

	@FindBy(id = "TCOMENT")
	private WebElement inputOBS;

	@FindBy(id = "TRISCO")
	private WebElement inputAltoRisco;

	@FindBy(id = "TPEDIDO")
	private WebElement inputPedido;

	@FindBy(id = "TSALDO")
	private WebElement inputSaldo;

	@FindBy(id = "TSALDOAGEND")
	private WebElement inputAAgendar;

	@FindBy(id = "TVOLS")
	private WebElement inputVolumes;

	@FindBy(id = "TDTCANC")
	private WebElement inputDataCancelamento;

	@FindBy(id = "TTPPED")
	private WebElement inputTipoPedido;

	@FindBy(id = "XTACAO1")
	private WebElement gridResultadoCheckBox1;

	@FindBy(id = "XTPEDIDO11")
	private WebElement gridResultadoAcao1;

	@FindBy(id = "XTNOMEFORN11")
	private WebElement gridResultadoFornecedor1;

	@FindBy(id = "XTQTVOL11")
	private WebElement gridResultadoQuantVolum1;

	@FindBy(id = "XTRECEIVER1")
	private WebElement gridResultadoReceiver1;

	@FindBy(id = "XTDTCANC11")
	private WebElement gridResultadoDataCancelamento1;

	@FindBy(id = "XTTPPED11")
	private WebElement gridResultadoTipoPedido;

	@FindBy(id = "TDTPREV")
	private WebElement entradaPrevista;

	@FindBy(id = "alerta_sad")
	private WebElement msgExibida;
	
	@FindBy(id = "Button4_FX")
	private WebElement incluirPedido;
	
	@FindBy(id = "TL_REENVIO_FX")
	private WebElement reenvioSNF;

	

	public AgendamentoCPT85Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsgExibida() {
		return msgExibida;
	}

	public WebElement getEntradaPrevista() {
		return entradaPrevista;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonConsultar() {
		return buttonConsultar;
	}

	public WebElement getButtonIncluir() {
		return buttonIncluir;
	}

	public WebElement getButtonAlterar() {
		return buttonAlterar;
	}

	public WebElement getButtonDeletar() {
		return buttonDeletar;
	}

	public WebElement getButtonFinalizar() {
		return buttonFinalizar;
	}

	public WebElement getInputAgenda() {
		return inputAgenda;
	}

	public WebElement getInputDataAgenda() {
		return inputDataAgenda;
	}

	public WebElement getInputDataEntrada() {
		return inputDataEntrada;
	}

	public WebElement getInputHoraEntrada() {
		return inputHoraEntrada;
	}

	public WebElement getInputMinutoEntrada() {
		return inputMinutoEntrada;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputFilialOrigem() {
		return inputFilialOrigem;
	}

	public WebElement getInputNummeroNota() {
		return inputNummeroNota;
	}

	public WebElement getInputSerieNota() {
		return inputSerieNota;
	}

	public WebElement getInputTransportadora() {
		return inputTransportadora;
	}

	public WebElement getInputVeicuNoCD() {
		return inputVeicuNoCD;
	}

	public WebElement getSelectTipoVeiculo() {
		return selectTipoVeiculo;
	}

	public WebElement getSelectTipoCarga() {
		return selectTipoCarga;
	}

	public WebElement getSelectTipoEntrega() {
		return selectTipoEntrega;
	}

	public WebElement getSelectTipoAgendaElement() {
		return selectTipoAgendaElement;
	}

	public WebElement getInputContato() {
		return inputContato;
	}

	public WebElement getInputTelefone() {
		return inputTelefone;
	}

	public WebElement getInputPerecivel() {
		return inputPerecivel;
	}

	public WebElement getInputOBS() {
		return inputOBS;
	}

	public WebElement getInputAltoRisco() {
		return inputAltoRisco;
	}

	public WebElement getInputPedido() {
		return inputPedido;
	}

	public WebElement getInputSaldo() {
		return inputSaldo;
	}

	public WebElement getInputAAgendar() {
		return inputAAgendar;
	}

	public WebElement getInputVolumes() {
		return inputVolumes;
	}

	public WebElement getInputDataCancelamento() {
		return inputDataCancelamento;
	}

	public WebElement getInputTipoPedido() {
		return inputTipoPedido;
	}

	public WebElement getGridResultadoCheckBox1() {
		return gridResultadoCheckBox1;
	}

	public WebElement getGridResultadoAcao1() {
		return gridResultadoAcao1;
	}

	public WebElement getGridResultadoFornecedor1() {
		return gridResultadoFornecedor1;
	}

	public WebElement getGridResultadoQuantVolum1() {
		return gridResultadoQuantVolum1;
	}

	public WebElement getGridResultadoReceiver1() {
		return gridResultadoReceiver1;
	}

	public WebElement getGridResultadoDataCancelamento1() {
		return gridResultadoDataCancelamento1;
	}

	public WebElement getGridResultadoTipoPedido() {
		return gridResultadoTipoPedido;
	}
	
	public WebElement getIncluirPedido() {
		return incluirPedido;
	}
	
	public WebElement getButtonConsultarPedido() {
		return buttonConsultarPedido;
	}
	
	public WebElement getReenvioSNF() {
		return reenvioSNF;
	}
}
