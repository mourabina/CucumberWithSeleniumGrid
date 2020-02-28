package web.steps;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.PedidosEstocadosFuncionalidade;

public class PedidoEstocadoStep {

	private PedidosEstocadosFuncionalidade pedidos;

	public PedidoEstocadoStep() {
		this.pedidos = new PedidosEstocadosFuncionalidade();
	}

	@Dado("preencho os campos mais os campos de Data")
	public void preenchoOsCamposMaisOsCamposDeData(DataTable dataTable) {
		this.pedidos.preencherCampos(dataTable);
		this.pedidos.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
	}

	@Quando("clico no botao Consultar Pedido")
	public void clicoNoBotaoConsultarPedido() {
		this.pedidos.clicarBotaoConsultaPedido();
	}

	@Dado("^preencho os campos da GERPD$")
	public void preencherFormulario(DataTable params){
		this.pedidos.preencherCampos(params);
	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg){
		Assert.assertTrue(this.pedidos.retornaMensagemExibida().contains(msg));
		
	}

	@E("^preencher o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void preencherOCampoComOValor(String campo, String valor){
		this.pedidos.preencherCampoValor(campo, valor);
		
	}

	@Entao("^deve ser exibido no GRID o \"([^\"]*)\" e a \"([^\"]*)\"$")
	public void valdiarExibicaoInfomacaoItensGRidResultado(String campo1, String campo2){
		Assert.assertFalse("Camapo " + campo1 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo1));
		Assert.assertFalse("Camapo " + campo2 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo2));
	}

	@E("^seleciono a opcao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionarValorCampoComboBox(String valor, String campo){
		this.pedidos.selecionarValorComboBox(campo, valor);
		
	}

	@Então("^deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void deveSerExibidoOValorNoCampo(String valor, String campo){
		Assert.assertEquals(valor, this.pedidos.retornaValorCampo(campo));
		
	}

	@Quando("^clico no botao Consultar Tabela de Compra$")
	public void clicarBotaoConsultarTabelaCompra(){
		this.pedidos.clicarBotaoConsultarTabelaCompra();
	}

	@Entao("^grid deve estar populada$")
	public void verificarGrid(){
		this.pedidos.verificarGrid();
	}

}
