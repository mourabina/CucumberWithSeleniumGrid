package web.funcionalidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.enums.AgendamentoCPT85Enum;
import web.bean.enums.DigitacaoPedidosINPE2Enum;
import web.bean.enums.GeracaoPedidosGERPDEnum;
import web.bean.interfaces.AgendamentoCPT85Interface;
import web.bean.interfaces.DigitacaoPedidosINPE2Interface;
import web.bean.interfaces.GeracaoPedidosGERPDInterface;
import web.pages.AgendamentoCPT85Page;
import web.pages.DigitacaoPedidosINPE2Page;
import web.pages.GeracaoPedidosGERPDPage;
import web.pages.HomePage;

public class HibridoSADSNFFuncionalidade extends BaseTest {

	private HomePage home;
	private GeracaoPedidosGERPDPage gerpd;
	private DigitacaoPedidosINPE2Page inpe2;
	private waitLoading load;
	private AgendamentoCPT85Page agenda;

	public HibridoSADSNFFuncionalidade() {
		this.home = new HomePage(webDriver);
		this.gerpd = new GeracaoPedidosGERPDPage(webDriver);
		this.inpe2 = new DigitacaoPedidosINPE2Page(webDriver);
		this.load = new waitLoading();
		this.agenda = new AgendamentoCPT85Page(webDriver);

	}

	public String geradorPedidoGeral(String tipoPedido) {

		String numeroPedido = null;

		switch (tipoPedido) {
		case "Estocado":
			this.home.getInputProxiTela().sendKeys("GERPD");
			this.home.getBtnTransmitir().click();
			this.preencherCampoValorHibrido("Comprador", "017");
			this.preencherCampoValorHibrido("Fornec", "3523912");
			this.preencherCampoValorHibrido("Pesquisa", "56849");
			this.preencherCampoValorHibrido("Classif Ped", "N");
			this.gerpd.getBt_consultarTabelaCompra().click();
			this.preencherCampoValorHibrido("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
			this.incluirPrimeiroItemHibrido();
			this.salvarInformacoesPedidoHibrido();
			this.gerpd.getBt_ExecutarPedido();
			numeroPedido = this.gerpd.getMsg().getText().split(" ")[1];

			break;

		case "Cross":
			this.home.getInputProxiTela().sendKeys("INPE2");
			this.home.getBtnTransmitir().click();
			this.preencherCampoValorINPE2Hibibro("Produto", "6814");
			this.inpe2.getBt_ConsultarLoja().click();
			this.preencherCampoValorINPE2Hibibro("Comprador", "028");
			this.preencherCampoValorINPE2Hibibro("Fornec", "3512102");
			this.preencherCampoValorINPE2Hibibro("Classif Ped", "N");
			this.preencherCampoValorINPE2Hibibro("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
			this.incluirItensCrossHibidro(1);
			this.inpe2.getInputExecutarPedido().click();
			numeroPedido = this.inpe2.getMsg().getText().split(" ")[1];

			break;

		case "DSD":
			this.home.getInputProxiTela().sendKeys("INPE2");
			this.home.getBtnTransmitir().click();
			this.preencherCampoValorINPE2Hibibro("Produto", "32916");
			this.inpe2.getBt_ConsultarLoja().click();
			this.preencherCampoValorINPE2Hibibro("Comprador", "043");
			this.preencherCampoValorINPE2Hibibro("Fornec", "3514753");
			this.preencherCampoValorINPE2Hibibro("Classif Ped", "N");
			this.preencherCampoValorINPE2Hibibro("Preco Compra", "45,00");
			this.preencherCampoValorINPE2Hibibro("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
			this.incluirItensCrossHibidro(1);
			this.inpe2.getInputExecutarPedido().click();
			numeroPedido = this.inpe2.getMsg().getText().split(" ")[1];

			break;
		}

		return numeroPedido;
	}

	public void preencherCampoValorHibrido(String campo, String valor) {
		if (campo.equalsIgnoreCase("classif ped")) {
			this.selecionarValorComboBox(campo, valor);
			this.selecionarValorCampoClassificacao();
		} else {
			GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum
					.valueOf(campo.replace(" ", "_").toUpperCase());
			pedido.getElement(this.gerpd).clear();
			pedido.getElement(this.gerpd).sendKeys(valor);
			addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
		}
	}

	public void preencherCampoValorINPE2Hibibro(String campo, String valor) {
		if (campo.equalsIgnoreCase("classif ped")) {
			this.selecionarValorComboBox(campo, valor);
			this.selecionarValorCampoClassificacao();
			addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
		} else {
			DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
					.valueOf(campo.replace(" ", "_").toUpperCase());
			pedido.getElement(this.inpe2).clear();
			pedido.getElement(this.inpe2).sendKeys(valor);
			addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
		}
	}

	public void selecionarValorComboBox(String campo, String valor) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.gerpd));
		combo.selectByValue(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void selecionarValorCampoClassificacao() {
		if (GeracaoData.retornaHoraAtual() >= 1510)
			this.selecionarValorComboBox("HR Edi", "S");
	}

	public void salvarInformacoesPedidoHibrido() {
		VariaveisEstaticas.setFORNEC(this.gerpd.getInputForn().getAttribute("value"));
		VariaveisEstaticas.setFILIAL(this.gerpd.getInputFlial().getAttribute("value"));
		VariaveisEstaticas.setCOMPRADOR(this.gerpd.getInputComp().getAttribute("value"));
		VariaveisEstaticas.setQUANT(this.gerpd.getQtdeCompra().getAttribute("value"));
		VariaveisEstaticas.setDATA_ENTRADA(this.gerpd.getInputDatas1().getAttribute("value"));
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getInpuPesqui().getAttribute("value"));
		VariaveisEstaticas.setCLASSIF_PED(this.retornaValorCampoComboHibrido("Classif Ped"));
	}

	public String retornaValorCampoComboHibrido(String campo) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		Select combo = new Select(pedido.getElement(this.gerpd));
		return combo.getFirstSelectedOption().getAttribute("value");

	}

	public void incluirPrimeiroItemHibrido() {
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getCodItem().getAttribute("value"));
		VariaveisEstaticas.setDESCRICAO(this.gerpd.getDescricaoItem().getAttribute("value"));
		this.gerpd.getOpcaoItemCheckbox().click();
		this.gerpd.getQtdeCompra().clear();
		this.gerpd.getQtdeCompra().sendKeys("10");
		addEvidenciaWeb("Incluindo primeiro item da lista no pedido");
		VariaveisEstaticas.setQUANT(this.gerpd.getQtdeCompra().getAttribute("value"));
		this.gerpd.getBt_incluir().click();
		this.load.loading();
	}

	public void incluirItensCrossHibidro(int qtdeItens) {
		addEvidenciaWeb("Verificar se item está sendo apresentado");

		List<Map<String, String>> values = new ArrayList<Map<String, String>>();

		for (int i = 0; i < qtdeItens; i++) {
			Map<String, String> map = new HashMap<String, String>();
			webDriver.findElement(By.id("panel_QTDADE1_" + i)).sendKeys("10");
			webDriver.findElement(By.id("panel_TL_OPC1_" + i + "_checkbox")).click();
			map.put("Codigo", webDriver.findElement(By.id("TL_PROD")).getAttribute("value"));
			map.put("Data Entrega", webDriver.findElement(By.id("TL_DTENT")).getAttribute("value").replace(":", ""));
			VariaveisEstaticas.setCOD_PRODUTO(webDriver.findElement(By.id("TL_PROD")).getAttribute("value"));
			map.put("Quantidade", "10");
			values.add(map);
			addEvidenciaWeb("Incluindo item: " + webDriver.findElement(By.id("TL_DESC")).getAttribute("value"));
		}
		VariaveisEstaticas.setMap(values);
		this.inpe2.getBt_incluir();
	}

	public void criarAgendamentoHibrido(String nunPedido) {
		this.home.getInputProxiTela().sendKeys("CPT85");
		this.home.getBtnTransmitir().click();
		this.preencherCampoValorHibridroAgendamento("Data Agenda", GeracaoData.retornaDataAtualAnoDoisDigitos());
		this.preencherCampoValorHibridroAgendamento("Data Prev Entrada", GeracaoData.retornaDataAtualAnoDoisDigitos());
		this.preencherCampoValorHibridroAgendamento("Hora Prev Entrada", GeracaoData.retornaProxHora());
		this.preencherCampoValorHibridroAgendamento("Transportadora", "TransAutomação");
		this.preencherCampoValorHibridroAgendamento("Contato", "SR Selenium");
		this.preencherCampoValorHibridroAgendamento("Fone", "11 31314040");
		this.preencherCampoValorHibridroAgendamento("Perecivel", "N");
		this.preencherCampoValorHibridroAgendamento("Alto Risco", "N");
		this.agenda.getButtonIncluir().click();
		VariaveisEstaticas.setNUMERO_AGENDA(this.agenda.getInputAgenda().getAttribute("value"));
		this.preencherCampoValorHibridroAgendamento("Pedido", nunPedido);
		this.agenda.getButtonConsultar().click();
		this.preencherCampoValorHibridroAgendamento("Volume", this.agenda.getInputAAgendar().getAttribute("value"));
		this.agenda.getButtonIncluir().click();
		this.agenda.getButtonFinalizar().click();

	}

	public void preencherCampoValorHibridroAgendamento(String campo, String valor) {
		AgendamentoCPT85Interface intAgend = AgendamentoCPT85Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		intAgend.getElement(this.agenda).clear();
		intAgend.getElement(this.agenda).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

}
