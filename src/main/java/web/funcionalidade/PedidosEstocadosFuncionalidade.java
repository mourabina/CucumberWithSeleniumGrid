package web.funcionalidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import web.bean.enums.GeracaoPedidosGERPDEnum;
import web.bean.interfaces.GeracaoPedidosGERPDInterface;
import web.pages.GeracaoPedidosGERPDPage;

public class PedidosEstocadosFuncionalidade extends BaseTest {

	private GeracaoPedidosGERPDPage gerpd;
	private LoginFuncionalidade login;

	public PedidosEstocadosFuncionalidade() {
		this.gerpd = new GeracaoPedidosGERPDPage(webDriver);
		this.login = new LoginFuncionalidade();

	}

	public void preencherCampoValor(String campo, String valor) {
		if (campo.equalsIgnoreCase("classif ped")) {
			this.selecionarValorComboBox(campo, valor);
			this.selecionarValorCampoClassificacao();	
		}
		else {
			GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum
					.valueOf(campo.replace(" ", "_").toUpperCase());
			pedido.getElement(this.gerpd).clear();
			pedido.getElement(this.gerpd).sendKeys(valor);
			addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
		}
	}

	public void selecionarValorComboBox(String campo, String valor) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.gerpd));
		combo.selectByValue(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void limparCampos(String campo) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.gerpd).clear();
		addEvidenciaWeb("Campo: " + campo + " está vazio");
	}

	public String retornaValorCampo(String campo) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.gerpd).getAttribute("value");

	}
	
	public String retornaValorCampoCombo(String campo) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		Select combo = new Select(pedido.getElement(this.gerpd));
		return combo.getFirstSelectedOption().getAttribute("value");

	}

	public boolean validaCampoVazio(String campo) {
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Campo " + campo);
		return pedido.getElement(this.gerpd).getAttribute("value").isEmpty();

	}

	public void preencherCampos(DataTable params) {
		params.asMaps().forEach(line -> {
			Set<String> headers = line.keySet();
			headers.forEach(header -> {
				this.preencherCampoValor(header, line.get(header));
				VariaveisEstaticas.guardarValores(header, line.get(header));
			});
		});
	}

	public void clicarBtnConsultaPedido() {
		addEvidenciaWeb("Clicando no Botão Consultar Tabela Compra");
		this.gerpd.getBt_consultarPedido().click();
		waitForPageToLoad(webDriver);
	}

	public String retornaMensagemExibida() {
		wait.until(ExpectedConditions.visibilityOf(this.gerpd.getMsg()));
		addEvidenciaWeb("Mensagem Exibida");
		return this.gerpd.getMsg().getText();
	}

	public void clicarBotaoConsultarTabelaCompra() {
		VariaveisEstaticas.setFORNEC(this.retornaValorCampo("Fornec"));
		VariaveisEstaticas.setDATA_ENTRADA(this.retornaValorCampo("Data 1"));
		addEvidenciaWeb("Clicando no botão Consulta Tabela de Compra");
		this.gerpd.getBt_consultarTabelaCompra().click();
		this.aguardaReload();
	}

	public void aguardaReload() {
		waitForPageToLoad(webDriver);
	}

	public void verificarTodosResultadoGrid() {
		int qtde = webDriver.findElements(By.xpath(this.gerpd.getGridResultados())).size();
		for (int i = 0; i < qtde; i++) {
			assertFalse("Campo Codigo está vazio",
					webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value").isEmpty());
			assertFalse("Campo Nome produto está vazio",
					webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value").isEmpty());
		}
	}

	public void verificaItemGrid(int qtdeItens) {
		addEvidenciaWeb("Verificar se item está sendo apresentado");
		int qtde = webDriver.findElements(By.xpath(this.gerpd.getGridResultados())).size();
		for (int i = 0; i < qtde; i++) {
			if (i < qtdeItens) {
				assertFalse("Campo Codigo está vazio",
						webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value").isEmpty());
				assertFalse("Campo Nome produto está vazio",
						webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value").isEmpty());
			} else {
				assertTrue("Campo Codigo não está vazio",
						webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value").isEmpty());
				assertTrue("Campo Nome produto não está vazio",
						webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value").isEmpty());
			}
		}
	}

	public void verificarConsultaItem(String codigo) {
		assertFalse("Campo Codigo está vazio", this.gerpd.getCodItem().getAttribute("value").isEmpty());
		assertFalse("Campo Nome produto está vazio", this.gerpd.getDescricaoItem().getAttribute("value").isEmpty());
		assertEquals(this.gerpd.getCodItem().getAttribute("value").toString(), codigo);
	}

	public void incluirItens(int qtdeItens) {
		addEvidenciaWeb("Verificar se item está sendo apresentado");

		List<Map<String, String>> values = new ArrayList<Map<String, String>>();
		;

		for (int i = 0; i < qtdeItens; i++) {
			Map<String, String> map = new HashMap<String, String>();
			webDriver.findElement(By.id("panel_QTD1_" + i)).sendKeys("10");
			webDriver.findElement(By.id("panel_OPCAO_" + i + "_checkbox")).click();
			map.put("Codigo", webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value"));
			map.put("Descricao", webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value"));
			map.put("Quantidade", "10");
			values.add(map);
			addEvidenciaWeb(
					"Incluindo item: " + webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value"));
		}
		VariaveisEstaticas.setMap(values);
		this.gerpd.getBt_incluir().click();
		this.aguardaReload();
	}

	public List<Map<String, String>> retornaItens(int qtde) {
		List<Map<String, String>> values = new ArrayList<Map<String, String>>();
		;

		for (int i = 0; i < qtde; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("Codigo", webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value"));
			map.put("Descricao", webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value"));
			map.put("Quantidade", webDriver.findElement(By.id("panel_QTD1_" + i)).getAttribute("value"));
			values.add(map);
		}

		return values;
	}

	public List<Map<String, String>> retornaItensSOLPD(int qtde) {
		List<Map<String, String>> values = new ArrayList<Map<String, String>>();
		;

		for (int i = 0; i < qtde; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("Codigo", webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value"));
			map.put("Descricao", webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value"));
			map.put("Quantidade", webDriver.findElement(By.id("panel_QTD1_" + i)).getAttribute("value"));
			values.add(map);
		}

		return values;
	}

	public void excluirMultiplosItens(int qtde) {
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_OPCAO_" + i + "_checkbox")).click();
		}
		this.gerpd.getBt_excluir().click();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.aguardaReload();
	}

	public void excluirTodosItensPedido() {
		int qtde = webDriver.findElements(By.xpath(this.gerpd.getGridResultados())).size();

		for (int i = 0; i < qtde; i++) {
			if (!webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value").isEmpty())
				webDriver.findElement(By.id("panel_OPCAO_" + i + "_checkbox")).click();
		}
		this.gerpd.getBt_excluir().click();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.aguardaReload();
	}

	public void preencherCamposDatas(String valor) {
		this.preencherCampoValor("Data 1", valor);
		this.preencherCampoValor("Data 2", valor);
		this.preencherCampoValor("Data 3", valor);
	}

	public void incluirPrimeiroItem() {
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getCodItem().getAttribute("value"));
		VariaveisEstaticas.setDESCRICAO(this.gerpd.getDescricaoItem().getAttribute("value"));
		this.gerpd.getOpcaoItemCheckbox().click();
		this.gerpd.getQtdeCompra().clear();
		this.gerpd.getQtdeCompra().sendKeys("10");
		addEvidenciaWeb("Incluindo primeiro item da lista no pedido");
		VariaveisEstaticas.setQUANT(this.gerpd.getQtdeCompra().getAttribute("value"));
		this.gerpd.getBt_incluir().click();
		this.aguardaReload();
	}

	public void selecionarComboBox() {
		this.gerpd.getOpcaoItemCheckbox().click();
	}

	public void preencherCampoCompra(String quant) {
		this.gerpd.getQtdeCompra().clear();
		this.gerpd.getQtdeCompra().sendKeys(quant);
	}

	public void acionarBtnIncluir() {
		this.gerpd.getBt_incluir().click();
	}
	
	public void acionarBtnAlterar() {
		this.gerpd.getBt_alterar().click();
		this.aguardaReload();
	}
	public void acionarBtnExecutarPedido() {
		this.gerpd.getBt_ExeutarPedido().click();
	}

	public void salvarInformacoesPedido() {
		VariaveisEstaticas.setFORNEC(this.gerpd.getInputForn().getAttribute("value"));
		VariaveisEstaticas.setFILIAL(this.gerpd.getInputFlial().getAttribute("value"));
		VariaveisEstaticas.setCOMPRADOR(this.gerpd.getInputComp().getAttribute("value"));
		VariaveisEstaticas.setQUANT(this.gerpd.getQtdeCompra().getAttribute("value"));
		VariaveisEstaticas.setDATA_ENTRADA(this.gerpd.getInputDatas1().getAttribute("value"));
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getInpuPesqui().getAttribute("value"));
		VariaveisEstaticas.setCLASSIF_PED(this.retornaValorCampoCombo("Classif Ped"));
	}

	public void executarComandoEnter() {
		Actions builder = new Actions(webDriver);
		builder.sendKeys(Keys.ENTER).perform();
	}

	public void excluirPrimeiroItem() {
		this.gerpd.getOpcaoItemCheckbox().click();
		this.gerpd.getBt_excluir().click();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.aguardaReload();
	}

	public void excluirIntensGERPD(int qtde) {

		this.login.acessarTela("GERPD");
		this.preencherCampoValor("Comprador", VariaveisEstaticas.getCOMPRADOR());
		this.preencherCampoValor("Fornec", VariaveisEstaticas.getFORNEC());
		this.preencherCampoValor("Classif Ped",VariaveisEstaticas.getCLASSIF_PED());;
		this.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
		this.preencherCampoValor("Pesquisa", VariaveisEstaticas.getCOD_PRODUTO());
		this.gerpd.getBt_consultarPedido().click();
		this.aguardaReload();
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_OPCAO_" + i + "_checkbox")).click();
		}
		this.gerpd.getBt_excluir().click();
		this.aguardaReload();
		addEvidenciaWeb("Intens Excluidos");
	}

	public boolean verificarItemSOLPD(String codItem, String situacao) throws ParseException {
		boolean registro = false;

		do {
			int qtdeRegistros = webDriver.findElements(By.xpath("//span[@id=\"panel_span\"]/span")).size();

			for (int i = 0; i < qtdeRegistros; i++) {
				String cod = webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value").toString();
				String hora = webDriver.findElement(By.id("panel_HORA_DIG_" + i)).getAttribute("value").toString();
				String sit = webDriver.findElement(By.id("panel_COD_SIT_" + i)).getAttribute("value").toString();
				String fornec = webDriver.findElement(By.id("panel_COD_FORN_" + i)).getAttribute("value").toString();
				String data = webDriver.findElement(By.id("panel_DATA_X_" + i)).getAttribute("value").toString();
				if (cod.equals(codItem) && hora.contains(VariaveisEstaticas.getHORA()) && sit.equals(situacao)
						&& fornec.equals(VariaveisEstaticas.getFORNEC())
						&& VariaveisEstaticas.getDATA_ENTRADA().equals(GeracaoData.retornaDataFormatada(data))) {
					registro = true;
				}
			}

			if (!registro) {
				this.executarComandoEnter();
			}

		} while (!SeleniumRobot.existElementWeb("//*[@value='FIM DE PESQUISA']") && !registro);

		return registro;
	}

	public void limparPedido(DataTable params) {
		this.clicarBtnConsultaPedido();
		if (!SeleniumRobot.existElementWeb("//div[@id='alerta_sad']")) {
			this.excluirTodosItensPedido();
		}
		this.login.voltarHomePage();
		this.login.acessarTela("GERPD");
		this.preencherCampos(params);
		this.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));

	}

	public void selecionarValorCampoClassificacao() {
		if (GeracaoData.retornaHoraAtual() >= 1510) 
			this.selecionarValorComboBox("Hr Edi", "S");
	}
}
