package web.funcionalidade.SNF;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_VisualizarNotaFiscal;
import web.bean.interfaces.SNF_VisualizarRecebimento;
import web.pages.SNF.SNFVisualizarNotasFiscaisPage;
import web.pages.SNF.SNFVisualizarRecebimentoPage;

public class SNFObterAgendamentoFuncionalidade extends BaseTest {

	private SNFVisualizarRecebimentoPage recebi;
	private SNFVisualizarNotasFiscaisPage nf;
	private waitLoading wl;

	public SNFObterAgendamentoFuncionalidade() {
		this.recebi = new SNFVisualizarRecebimentoPage(webDriver);
		this.nf = new SNFVisualizarNotasFiscaisPage(webDriver);
		this.wl = new waitLoading();
	}

	public void preencherCamposPesquisaRecebimentoCompleto() {
		Select select = new Select(recebi.getInputFilial());
		select.selectByValue("7467");
		this.recebi.getInputNumeroAgendamento().sendKeys("454501");
		Select situacao = new Select(this.recebi.getInputSituacao());
		situacao.selectByVisibleText("Chegada do caminhão");
		this.recebi.getInputDataAgenda().sendKeys("17/09/2019");
		this.recebi.getInpuNumeroPedido().sendKeys("90900009");
		this.recebi.getInputNumeroFornecedor().sendKeys("682532585562532");
		this.recebi.getinputNumeroRecebimento().sendKeys("454502");
	}

	public Boolean getUnidadeNegocio() {
		Select filial = new Select(this.recebi.getInputFilial());
		return filial.getFirstSelectedOption().getAttribute("text").toString().equals("Selecione...");
	}

	
	public void clicarBotaoLimpar() {
		this.recebi.getButtonLipar().click();
	}

	public Boolean getInputSituacao() {
		addEvidenciaWeb("Campo Vazio");
		Select situacao = new Select(this.recebi.getInputSituacao());
		return situacao.getFirstSelectedOption().getAttribute("text").equals("Selecione...");
	}
	
	public Boolean NumeroAgendamento() {
		addEvidenciaWeb("Campo Vazio");
		return this.recebi.getInputNumeroAgendamento().getAttribute("value").isEmpty();
	}

	public Boolean InputDataAgenda() {
		addEvidenciaWeb("Campo Vazio");
		return this.recebi.getInputDataAgenda().getAttribute("value").isEmpty();
	}
	public Boolean InpuNumeroPedido() {
		addEvidenciaWeb("Campo Vazio");
		return this.recebi.getInpuNumeroPedido().getAttribute("value").isEmpty();
	}

	public Boolean InputNumeroFornecedor() {
		addEvidenciaWeb("Campo Vazio");
		return this.recebi.getInputNumeroFornecedor().getAttribute("value").isEmpty();
	}

	public void preencherCampoData() {
		this.recebi.getInputDataAgenda().sendKeys(GeracaoData.retornaDataAtual());
		addEvidenciaWeb("Campo Data Agenda Preenchido com Data Atual");
	}

	public Boolean getinputNumeroRecebimento() {
		addEvidenciaWeb("Campo Vazio");
		return this.recebi.getinputNumeroRecebimento().getAttribute("value").isEmpty();
	}

	public void preecherLetras(String elem) {
		SNF_VisualizarRecebimento manu = web.bean.enums.SNF_VisualizarRecebimentoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());

		SeleniumRobot.MoveToElementWeb(manu.getElement(this.recebi));
		manu.getElement(this.recebi).sendKeys("ABCD");
		addEvidenciaWeb("Digitando valores Invalidos");
	}
	
	public void selecionarSituacao(String campo, String situacao) {
		SNF_VisualizarRecebimento situ = web.bean.enums.SNF_VisualizarRecebimentoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select select = new Select(situ.getElement(this.recebi));
		select.selectByVisibleText(situacao);
		this.recebi.getButtonPesquisar().click();
		this.wl.loading();
		addEvidenciaWeb("Selecionado o valor  :" + situacao + "Para o campo  :" + campo);
	}

	public void preencherCaracteresEspeciais(String elem) {
		SNF_VisualizarRecebimento manu = web.bean.enums.SNF_VisualizarRecebimentoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.recebi));
		manu.getElement(this.recebi).sendKeys("~!@#$%^&*()-+=\\/");
		addEvidenciaWeb("Digitando valores Invalidos");
	}

	public void preencherCaracteresNumeros(String elem) {
		SNF_VisualizarRecebimento manu = web.bean.enums.SNF_VisualizarRecebimentoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.recebi));
		manu.getElement(this.recebi).sendKeys("25365874");
		addEvidenciaWeb("Digitando valores Validos");
	}

	public boolean verificarCampoVazio(String elem) {
		SNF_VisualizarRecebimento manu = web.bean.enums.SNF_VisualizarRecebimentoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
    	SeleniumRobot.MoveToElementWeb(manu.getElement(this.recebi));
		addEvidenciaWeb("Campo Está Vazio");
		return manu.getElement(this.recebi).getAttribute("value").isEmpty();
	}
	
	public boolean verificarCampoVazioNF(String elem) {
		SNF_VisualizarNotaFiscal manu = SNF_VisualizarNotaFiscal
				.valueOf(elem.replace(" ", "_").toUpperCase());
    	SeleniumRobot.MoveToElementWeb(manu.getElement(this.nf));
		addEvidenciaWeb("Campo Está Vazio");
		return manu.getElement(this.nf).getAttribute("value").isEmpty();
	}

	public void preencherCampoDataValorInvalido() {
		this.recebi.getInputDataAgenda().sendKeys("35/09/2019");
		addEvidenciaWeb("Inserido valor ivalido");
		this.recebi.getInpuNumeroPedido().click();
	}


	public String pegarValorDataAgenda() {
		addEvidenciaWeb("Campo Data Agenda não aceita valor Invalido");
		return this.recebi.getInputDataAgenda().getAttribute("value").toString();
	}

	public boolean botãoSalvarDesabilitado(){
		return this.recebi.getButtonPesquisar().isEnabled();
	}
	
	public void preencherCamposPesquisas(String elem, String valor) {
		SNF_VisualizarRecebimento manu = web.bean.enums.SNF_VisualizarRecebimentoEnum.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.recebi));
		manu.getElement(this.recebi).sendKeys(valor);
		this.recebi.getButtonPesquisar().click();
		this.wl.loading();
		addEvidenciaWeb("Preenchedo o campo  " + elem + " com o valor " + valor);
	}

}
