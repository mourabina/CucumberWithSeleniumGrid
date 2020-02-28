package web.funcionalidade;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
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
		GeracaoPedidosGERPDInterface pedido = GeracaoPedidosGERPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.gerpd).clear();
		pedido.getElement(this.gerpd).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
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
	}

	public String retornaMensagemExibida() {
		addEvidenciaWeb("Mensagem Exibida");
		return this.gerpd.getMsg().getText();
	}

	public void clicarBotaoConsultarTabelaCompra() {
		addEvidenciaWeb("Clicando no botão Consulta Tabela de Compra");
		this.gerpd.getBt_consultarTabelaCompra().click();
		
	}
	public void preencherCamposDatas(String valor) {
		this.preencherCampoValor("Data 1", valor);
		this.preencherCampoValor("Data 2", valor);
		this.preencherCampoValor("Data 3", valor);
	}
	

}
