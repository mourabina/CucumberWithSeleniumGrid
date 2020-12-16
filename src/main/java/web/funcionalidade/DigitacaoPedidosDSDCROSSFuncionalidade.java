package web.funcionalidade;

import static org.junit.Assert.assertFalse;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import web.bean.enums.DigitacaoPedidosINPE2Enum;
import web.bean.interfaces.DigitacaoPedidosINPE2Interface;
import web.pages.DigitacaoPedidosINPE2Page;

public class DigitacaoPedidosDSDCROSSFuncionalidade extends BaseTest {

	private DigitacaoPedidosINPE2Page inpe2;
	private PedidosEstocadosFuncionalidade pedido;
	private LoginFuncionalidade login;

	public DigitacaoPedidosDSDCROSSFuncionalidade() {
		this.inpe2 = new DigitacaoPedidosINPE2Page(webDriver);
		this.pedido = new PedidosEstocadosFuncionalidade();
		this.login = new LoginFuncionalidade();

	}

	public void preencherCampoValor(String campo, String valor) {
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
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.inpe2));
		pedido.getElement(this.inpe2).click();
		combo.selectByValue(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void limparCampos(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.inpe2).clear();
		addEvidenciaWeb("Campo: " + campo + " está vazio");
	}

	public void selecionarCampoCombo(String campo, String valor) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.inpe2));
		combo.selectByVisibleText(valor);
		addEvidenciaWeb("Campo: " + campo + " Selecionado com o valor " + valor);
	}

	public String retornaValorCampo(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.inpe2).getAttribute("value");

	}

	public boolean validarCampoVazio(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Campo " + campo);
		return pedido.getElement(this.inpe2).getAttribute("value").isEmpty();

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

	public void ClicarBotaConsultarLojas() {
		addEvidenciaWeb("Clicando no Botão Consultar Lojas");
		this.inpe2.getBt_ConsultarLoja().click();

	}

	public void selecionarLoja() {
		this.inpe2.getCheckboxOpcaoLoja().click();

	}

	public void clicarBotaoConsultarLoja() {
		this.inpe2.getBt_ConsultarLoja().click();
		this.pedido.aguardaReload();
		addEvidenciaWeb("Botão Consultar Loja Acionado com Sucesso");
	}

	public void clicarBotaoIncluir() {
		this.inpe2.getBt_incluir().click();
		this.pedido.aguardaReload();
		addEvidenciaWeb("Botão Incluir Acionado com Sucesso");
	}

	public List<Map<String, String>> retornaItens(int qtde) throws ParseException {
		List<Map<String, String>> values = new ArrayList<Map<String, String>>();
		;

		for (int i = 0; i < qtde; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("Codigo", webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value"));
			map.put("Data Entrega", GeracaoData
					.retornaDataFormatada(webDriver.findElement(By.id("panel_DATA_X_" + i)).getAttribute("value")));
			map.put("Quantidade", webDriver.findElement(By.id("panel_QUANT_" + i)).getAttribute("value"));
			values.add(map);
		}

		return values;
	}

	public void incluirItens(int qtdeItens) {
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
		this.clicarBotaoIncluir();
	}

	public void incluirItensComQuantidades(int qtdeItens, String quant) {
		addEvidenciaWeb("Verificar se item está sendo apresentado");

		List<Map<String, String>> values = new ArrayList<Map<String, String>>();

		for (int i = 0; i < qtdeItens; i++) {
			Map<String, String> map = new HashMap<String, String>();
			webDriver.findElement(By.id("panel_QTDADE1_" + i)).clear();
			webDriver.findElement(By.id("panel_QTDADE1_" + i)).sendKeys(quant);
			webDriver.findElement(By.id("panel_TL_OPC1_" + i + "_checkbox")).click();
			map.put("Codigo", webDriver.findElement(By.id("TL_PROD")).getAttribute("value"));
			map.put("Data Entrega", webDriver.findElement(By.id("TL_DTENT")).getAttribute("value").replace(":", ""));
			VariaveisEstaticas.setCOD_PRODUTO(webDriver.findElement(By.id("TL_PROD")).getAttribute("value"));
			map.put("Quantidade", quant);
			values.add(map);
			addEvidenciaWeb("Incluindo item: " + webDriver.findElement(By.id("TL_DESC")).getAttribute("value"));
		}
		VariaveisEstaticas.setMap(values);
		this.salvarInformacao();
		this.clicarBotaoIncluir();
	}

	public void excluirMultiplosItensIMPE2(int qtde) {
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_OPCAO_" + i + "_checkbox")).click();
		}
		this.inpe2.getBt_excluir().click();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(194));
		this.pedido.aguardaReload();
	}

	public void excluirIntensINPE2(int qtde) {
		this.login.acessarTela("INPE2");
		this.preencherCampoValor("Produto", VariaveisEstaticas.getCOD_PRODUTO());
		this.preencherCampoValor("Comprador", VariaveisEstaticas.getCOMPRADOR());
		this.preencherCampoValor("Fornec", VariaveisEstaticas.getFORNEC());
		this.selecionarValorCampoClassificacao();
		this.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.inpe2.getBt_ConsultarPedido().click();
		this.pedido.aguardaReload();
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_TL_OPC1_" + i + "_checkbox")).click();
		}
		this.inpe2.getBt_excluir().click();
		this.pedido.aguardaReload();
		addEvidenciaWeb("Intens Excluidos");
	}

	public void ClicarBotaoExcluir() {
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.inpe2.getBt_excluir().click();
		this.pedido.aguardaReload();
	}

	public void acionarBtnConsultarPedido() {
		addEvidenciaWeb("Clicando Botão Consultar Pedido");
		this.inpe2.getBt_ConsultarPedido().click();
		this.pedido.aguardaReload();
	}

	public void verificarTodosResultadoGrid() {
		int qtde = webDriver.findElements(By.xpath("//input[contains(@id, 'panel_FILENT1_WM_') and @value != '']"))
				.size();
		for (int i = 0; i < qtde; i++) {
			assertFalse("Campo Codigo está vazio",
					webDriver.findElement(By.id("panel_FILENT1_WM_" + i)).getAttribute("value").isEmpty());
			assertFalse("Campo Nome produto está vazio",
					webDriver.findElement(By.id("panel_NOMEFIL1_" + i)).getAttribute("value").isEmpty());
		}
	}

	public void selecionarLojasINPE2() {
		int qtdeLinhas = webDriver.findElements(By.xpath("//span/span[contains(@id,\"panel_panel\")]")).size();
		int qtdeColunas = webDriver.findElements(By.xpath("//*[contains(@id,'panel_NOMEFIL')]")).size() / qtdeLinhas;
		for (int y = 1; y <= qtdeColunas; y++) {
			for (int i = 0; i < qtdeLinhas; i++) {
				if (!webDriver.findElement(By.id("panel_FILENT" + y + "_WM_" + i)).getAttribute("value").isEmpty()) {
					webDriver.findElement(By.id("panel_TL_OPC" + y + "_" + i + "_checkbox")).click();
				}
			}

		}

	}

	public void limparPedidoINPE2(DataTable params) {
		this.acionarBtnConsultarPedido();
		if (!SeleniumRobot.existElementWeb("//div[@id='alerta_sad']")) {
			this.selecionarLojasINPE2();
			this.ClicarBotaoExcluir();
		}
		this.login.voltarHomePage();
		this.login.acessarTela("INPE2");
		this.preencherCampos(params);
		this.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));

	}

	public void validarCampoQuantidadeGrid(String valor) {
		int qtdeLinhas = webDriver.findElements(By.xpath("//span/span[contains(@id,\"panel_panel\")]")).size();
		int qtdeColunas = webDriver.findElements(By.xpath("//*[contains(@id,'panel_NOMEFIL')]")).size() / qtdeLinhas;
		for (int y = 1; y <= qtdeColunas; y++) {
			for (int i = 0; i < qtdeLinhas; i++) {
				webDriver.findElement(By.id("panel_QTDADE" + y + "_" + i)).clear();
				webDriver.findElement(By.id("panel_QTDADE" + y + "_" + i)).sendKeys(valor);

			}

		}
		addEvidenciaWeb("Campos Quantidade preenchidos com o valor :" + valor);
	}

	public String retornaMensagem() {
		wait.until(ExpectedConditions.visibilityOf(this.inpe2.getMsg()));
		addEvidenciaWeb("Mensagem Exibida: " + this.inpe2.getMsg().getText());
		return this.inpe2.getMsg().getText();
	}

	public void selecionarValorCampoClassificacao() {
		if (GeracaoData.retornaHoraAtual() >= 1615)
			this.selecionarValorComboBox("Hr Edi", "S");
	}

	public void clicarBotaoFinalziar() {
		this.inpe2.getInputExecutarPedido().click();
	}

	public void gerarPedidoCross(DataTable params, int quantidade, String valor) {
		this.limparPedidoINPE2(params);
		this.preencherCampos(params);
		this.selecionarValorCampoClassificacao();
		this.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(2));
		this.ClicarBotaConsultarLojas();
		this.incluirItensComQuantidades(quantidade, valor);
		this.clicarBotaoFinalziar();

	}
	
	public void salvarInformacao() {
		VariaveisEstaticas.setFILIAL_SAD(this.inpe2.getLabelCodigoFilial().getAttribute("value"));
		VariaveisEstaticas.setFORNEC(this.inpe2.getInputFornecedor().getAttribute("value"));
		VariaveisEstaticas.setCOMPRADOR("0" +this.inpe2.getInputComprador().getAttribute("value"));
		VariaveisEstaticas.setQUANT(this.inpe2.getGridQuantidade().getAttribute("value"));
		VariaveisEstaticas.setCOD_PRODUTO(this.inpe2.getInputProduto().getAttribute("value"));
		VariaveisEstaticas.setCLASSIF_PED(this.retornaValorCampo("Classif Ped"));
	}

}
