package web.funcionalidade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import web.bean.enums.GeracaoPedidosGERPDEnum;
import web.bean.interfaces.GeracaoPedidosGERPDInterface;
import web.pages.GeracaoPedidosGERPDPage;

public class PedidosEstocadosFuncionalidade extends BaseTest {

	private GeracaoPedidosGERPDPage gerpd;
	

	public PedidosEstocadosFuncionalidade() {
		this.gerpd = new GeracaoPedidosGERPDPage(webDriver);
		
	}

	public void preencherCampoValor(String campo, String valor) {
		if (campo.equalsIgnoreCase("classif ped"))
			this.selecionarValorComboBox(campo, valor);
		else {
			GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
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
			});
		});
	}

	public void clicarBotaoConsultaPedido() {
		addEvidenciaWeb("Clicando no Botão Consultar Tabela Compra");
		this.gerpd.getBt_consultarPedido().click();
		waitForPageToLoad(webDriver);
	}

	public String retornaMensagemExibida() {
		addEvidenciaWeb("Mensagem Exibida");
		return this.gerpd.getMsg().getText();
	}

	public void clicarBotaoConsultarTabelaCompra() {
		addEvidenciaWeb("Clicando no botão Consulta Tabela de Compra");
		this.gerpd.getBt_consultarTabelaCompra().click();
		this.aguardaReload();
	}

	public void aguardaReload() {
		waitForPageToLoad(webDriver);
	}

	public void verificarTodosResultadoGrid() {
		int qtde = webDriver.findElements(By.xpath("//span/span[contains(@id,\"panel_panel\")]")).size();
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_COD_PROD_" + i)).getText();
			assertFalse("Campo Codigo está vazio",
					webDriver.findElement(By.id("panel_COD_PROD_" + i)).getAttribute("value").isEmpty());
			assertFalse("Campo Nome produto está vazio",
					webDriver.findElement(By.id("panel_NOME_PROD_" + i)).getAttribute("value").isEmpty());
		}
	}

	public void verificaPrimeiroItemGrid() {
		int qtde = webDriver.findElements(By.xpath("//span/span[contains(@id,\"panel_panel\")]")).size();
		for (int i = 0; i < qtde; i++) {
			webDriver.findElement(By.id("panel_COD_PROD_" + i)).getText();
			if (i == 0) {
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

	public void preencherCamposDatas(String valor) {
		this.preencherCampoValor("Data 1", valor);
		this.preencherCampoValor("Data 2", valor);
		this.preencherCampoValor("Data 3", valor);
	}

	public void incluirPrimeiroItem() {
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getCodItem().getAttribute("value"));
		VariaveisEstaticas.setDESCRICAO(this.gerpd.getDescricaoItem().getAttribute("value"));
		this.gerpd.getOpcaoItemCheckbox().click();
		this.gerpd.getQtdeCompra().sendKeys("10");
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
	
	public void clicarBotaoIncluir() {
		this.gerpd.getBt_incluir().click();
	}
		
	public void clicarBotaoExecutarPedido() {
		this.gerpd.getBt_ExeutarPedido().click();
	}
	
	public void salvarInformacoesPedido() {
		VariaveisEstaticas.setFORNEC(this.gerpd.getInputForn().getAttribute("value"));
		VariaveisEstaticas.setFILIAL(this.gerpd.getInputFlial().getAttribute("value"));
		VariaveisEstaticas.setCOMPRADOR(this.gerpd.getInputComp().getAttribute("value"));
		VariaveisEstaticas.setQUANT(this.gerpd.getQtdeCompra().getAttribute("value"));
		VariaveisEstaticas.setDATA_ENTRADA(this.gerpd.getInputDatas1().getAttribute("value"));
		VariaveisEstaticas.setCOD_PRODUTO(this.gerpd.getCodItem().getAttribute("value"));
	}
	
	public void executarComandoEnter() {
		Actions builder = new Actions(webDriver);        
		builder.sendKeys(Keys.ENTER).perform();
	}
	
	public void excluirPrimeiroItem() {
		this.gerpd.getOpcaoItemCheckbox().click();
		this.gerpd.getBt_excluir().click();
		this.aguardaReload();
	}

}
