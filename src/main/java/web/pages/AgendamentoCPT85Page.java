package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class AgendamentoCPT85Page extends BaseTest {

	@FindBy(id = "idLABEL28")
	private WebElement labelTituloPagina;

	@FindBy(id = "idBTINQUIRY_FX")
	private WebElement buttonConsultar;

	@FindBy(id = "idBTINCLUDE_FX")
	private WebElement buttonIncluir;

	@FindBy(id = "idBTMODIFY_FX")
	private WebElement buttonAlterar;

	@FindBy(id = "idBTDELETE_FX")
	private WebElement buttonDeletar;

	@FindBy(id = "idBTREFRESH_FX")
	private WebElement buttonFinalizar;

	@FindBy(id = "idTNUMAGEND")
	private WebElement inputAgenda;

	@FindBy(id = "idTDATAGEND")
	private WebElement inputDataAgenda;

	@FindBy(id = "idTDATAENT")
	private WebElement inputDataEntrada;

	@FindBy(id = "idTHORA")
	private WebElement inputHoraEntrada;

	@FindBy(id = "idTMIN")
	private WebElement inputMinutoEntrada;

	@FindBy(id = "idTFILIALPO")
	private WebElement inputFilial;

	@FindBy(id = "idTFILORI")
	private WebElement inputFilialOrigem;

	@FindBy(id = "idTNUMNOTA")
	private WebElement inputNummeroNota;

	@FindBy(id = "idTSERNOTA")
	private WebElement inputSerieNota;

	@FindBy(id = "idTNOMETRNSP")
	private WebElement inputTransportadora;

	@FindBy(id = "idTCHEGVEIC")
	private WebElement inputVeicuNoCD;

	@FindBy(id = "idTB_TPVEIC")
	private WebElement selectTipoVeiculo;

	@FindBy(id = "idTB_TPCARGA")
	private WebElement selectTipoCarga;

	@FindBy(id = "idTB_TPENTREGA")
	private WebElement selectTipoEntrega;

	@FindBy(id = "idTB_TPAGENDA")
	private WebElement selectTipoAgendaElement;

	@FindBy(id = "idTCONTATO")
	private WebElement inputContato;

	@FindBy(id = "idTFONE")
	private WebElement inputTelefone;

	@FindBy(id = "idTPEREC")
	private WebElement inputPerecivel;

	@FindBy(id = "idTCOMENT")
	private WebElement inputOBS;

	@FindBy(id = "idTRISCO")
	private WebElement inputAltoRisco;

	@FindBy(id = "idTPEDIDO")
	private WebElement inputPedido;

	@FindBy(id = "idTSALDO")
	private WebElement inputSaldo;

	@FindBy(id = "idTSALDOAGEND")
	private WebElement inputAAgendar;

	@FindBy(id = "idTVOLS")
	private WebElement inputVolumes;

	@FindBy(id = "idTDTCANC")
	private WebElement inputDataCancelamento;

	@FindBy(id = "idTTPPED")
	private WebElement inputTipoPedido;

	@FindBy(id = "idXTACAO1")
	private WebElement gridResultadoCheckBox1;

	@FindBy(id = "idXTPEDIDO11")
	private WebElement gridResultadoAcao1;

	@FindBy(id = "idXTNOMEFORN11")
	private WebElement gridResultadoFornecedor1;

	@FindBy(id = "idXTQTVOL11")
	private WebElement gridResultadoQuantVolum1;

	@FindBy(id = "idXTRECEIVER1")
	private WebElement gridResultadoReceiver1;

	@FindBy(id = "idXTDTCANC11")
	private WebElement gridResultadoDataCancelamento1;

	@FindBy(id = "idXTTPPED11")
	private WebElement gridResultadoTipoPedido;

	AgendamentoCPT85Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
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

}
