package web.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.ConsultaDigitacaoDePedidosSOLPDFuncionalidade;
import web.funcionalidade.LoginFuncionalidade;
import web.funcionalidade.PedidosEstocadosFuncionalidade;

public class PedidoEstocadoStep {

	private PedidosEstocadosFuncionalidade pedidos;
	private ConsultaDigitacaoDePedidosSOLPDFuncionalidade solpd;
	private LoginFuncionalidade login;

	public PedidoEstocadoStep() {
		this.pedidos = new PedidosEstocadosFuncionalidade();
		this.solpd = new ConsultaDigitacaoDePedidosSOLPDFuncionalidade();
		this.login = new LoginFuncionalidade();
	}

	@Dado("^que tenha (\\d+) itens inclusos$")
	public void incluirMaisItens(int qtde, DataTable params) {
		this.preencherCamposObrigtorios(params);
		this.pedidos.clicarBotaoConsultarTabelaCompra();
		this.pedidos.incluirItens(qtde);
	}

	@Dado("preencho os campos mais os campos de Data")
	public void preencherCamposObrigtorios(DataTable dataTable) {
		this.pedidos.preencherCampos(dataTable);
		this.pedidos.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
	}

	@Dado("^preencho os campos da GERPD$")
	public void preencherFormulario(DataTable params) {
		this.pedidos.preencherCampos(params);
	}

	@Dado("^que tenha um item excluido$")
	public void adcionarExcluirItem(DataTable params){
		this.incluirItem(params);
		this.acionarBtnConsultar();
		this.pedidos.verificaItemGrid(1);
		this.pedidos.excluirPrimeiroItem();
	}

	@Dado("^que tenha um item incluso$")
	public void incluirItem(DataTable params) {
		this.pedidos.preencherCampos(params);
		this.pedidos.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
		this.pedidos.clicarBotaoConsultarTabelaCompra();
		this.pedidos.incluirPrimeiroItem();
	}

	@Dado("^seleciono a opcao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionarValorCampoComboBox(String valor, String campo) {
		this.pedidos.selecionarValorComboBox(campo, valor);
		this.pedidos.clicarBotaoConsultarTabelaCompra();
		this.pedidos.aguardaReload();
	}

	@Quando("^preencher o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void preencherCamposValores(String campo, String valor) {
		this.pedidos.preencherCampoValor(campo, valor);

	}

	@Quando("^clico no botao Consultar Tabela de Compra$")
	public void acionarBotaoConsultarTabelaCompra() {
		this.pedidos.clicarBotaoConsultarTabelaCompra();

	}

	@Quando("^preencher os campos Datas com o valor \"([^\"]*)\"$")
	public void preencherTodosCamposDatas(String valor) {
		this.pedidos.preencherCamposDatas(valor);
	}

	@Quando("^Seleciono produto e digito a quantidade \"([^\"]*)\" e clico nos botaes incluir e Executar Pedido$")
	public void selecionarProdutoDigitarQuantClicarBotaoIncluir(String quant) {
		this.pedidos.selecionarComboBox();
		this.pedidos.preencherCampoCompra(quant);
		this.pedidos.salvarInformacoesPedido();
		this.pedidos.clicarBotaoIncluir();
		this.pedidos.aguardaReload();
		this.pedidos.clicarBotaoExecutarPedido();
	}

	@Quando("clico no botao Consultar Pedido")
	public void acionarBtnConsultar() {
		this.pedidos.clicarBotaoConsultaPedido();
	}

	@Quando("^faco uma pesquisa na tela \"([^\"]*)\" com o campo \"([^\"]*)\"$")
	public void facoUmaPesquisaNaTelaComOCampo(String tela, String campo) {
		this.login.acessarTela(tela);
		this.solpd.preencherCampoValor(campo, VariaveisEstaticas.getFORNEC());
		this.pedidos.executarComandoEnter();
	}

	@Quando("^consultar o fornecedor (\\d+) na SOLPD$")
	public void consultaFornSOLPD(int forn) {
		this.login.acessarTela("SOLPD");
		this.solpd.preencherCampoValor("Forn", Integer.toString(forn));
		this.solpd.pesquisar();
	}

	@Entao("^deve ser gerado um numero do pedido$")
	public void validarGeracaoNumeroPedido() {
		Assert.assertTrue("Número Pedido não foi gerador",
				this.pedidos.retornaMensagemExibida().contains("Seu numero de requisição !"));
	}

	@Entao("^deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD$")
	public void validarExibicaoDadosPedidosEstocados() throws ParseException {
		Assert.assertEquals(this.solpd.retornaValorCampo("Loja"), VariaveisEstaticas.getFILIAL());
		Assert.assertEquals(this.solpd.retornaValorCampo("Compr"), VariaveisEstaticas.getCOMPRADOR());
		Assert.assertEquals(this.solpd.retornaValorCampo("Produto"), VariaveisEstaticas.getCOD_PRODUTO());
		Assert.assertEquals(this.solpd.retornaValorCampo("Qtda"), VariaveisEstaticas.getQUANT());
		Assert.assertTrue(GeracaoData.retornaDataFormatada(this.solpd.retornaValorCampo("Data").toString())
				.contains(VariaveisEstaticas.getDATA_ENTRADA()));

	}

	@Entao("^grid deve estar populada$")
	public void verificarGrid() {
		this.pedidos.verificarTodosResultadoGrid();
	}

	@Entao("^a grid deve apresentar somente o item incluso$")
	public void verificarGridUmItem() {
		this.pedidos.verificaItemGrid(1);
		assertEquals(this.pedidos.retornaValorCampo("Descricao do produto"), VariaveisEstaticas.getDESCRICAO());
		assertEquals(this.pedidos.retornaValorCampo("codigo do produto"), VariaveisEstaticas.getCOD_PRODUTO());
		this.pedidos.excluirPrimeiroItem();
	}


	@Entao("^deve retornar o item com status \"([^\"]*)\"$")
	public void validarItemSOLPD(String status) {
		assertEquals(VariaveisEstaticas.getCOD_PRODUTO(), this.solpd.retornaValorCampo("Produto"));
		assertTrue(this.solpd.retornaValorCampo("Hora registro").contains(VariaveisEstaticas.getHORA()));
		assertEquals(this.solpd.retornaValorCampo("Situacao registro"), status);
	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		Assert.assertTrue(this.pedidos.retornaMensagemExibida().contains(msg));
	}

	@Então("^deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarExibicaoValorCampo(String valor, String campo) {
		Assert.assertEquals(valor, this.pedidos.retornaValorCampo(campo));
	}

	@Entao("^deve ser exibido no GRID o \"([^\"]*)\" e a \"([^\"]*)\"$")
	public void valdiarExibicaoInfomacaoItensGRidResultado(String campo1, String campo2) {
		Assert.assertFalse("Campo " + campo1 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo1));
		Assert.assertFalse("Campo " + campo2 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo2));
	}

	@Entao("^a grid deve apresentar os (\\d+) itens inclusos$")
	public void verificarMultiplosItens(int qtde) {
		this.pedidos.verificaItemGrid(2);
		System.out.println(VariaveisEstaticas.getMap());
		System.out.println(this.pedidos.retornaItens(qtde));
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.pedidos.retornaItens(qtde));
		this.pedidos.excluirMultiplosItens(qtde);
	}
}
