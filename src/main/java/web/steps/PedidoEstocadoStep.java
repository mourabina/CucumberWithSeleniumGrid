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
		this.pedidos.limparPedido(params);
		this.pedidos.clicarBotaoConsultarTabelaCompra();
		this.pedidos.incluirItens(qtde);
	}

	@Dado("preencho os campos mais os campos de Data")
	public void preencherCamposObrigtorios(DataTable params) {
		this.pedidos.limparPedido(params);
		this.incluirItem(params);
	}

	@Dado("^preencho os campos da GERPD$")
	public void preencherFormulario(DataTable params) {
		this.pedidos.preencherCampos(params);
	}

	@Dado("^que tenha um item excluido$")
	public void adcionarExcluirItem(DataTable params) {
		this.incluirItem(params);
		this.acionarBtnConsultar();
		this.pedidos.excluirPrimeiroItem();
	}

	@Dado("^que tenha um item incluso$")
	public void incluirItem(DataTable params) {
		this.pedidos.preencherCampos(params);
		this.pedidos.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
		this.pedidos.limparPedido(params);
		this.pedidos.salvarInformacoesPedido();
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
	public void preencherCampoValor(String campo, String valor) {
		this.pedidos.preencherCampoValor(campo, valor);
	}

	@Quando("^clico no botao Consultar Tabela de Compra$")
	public void acionarBtConsultarTabelaCompra() {
		this.pedidos.clicarBotaoConsultarTabelaCompra();

	}

	@Quando("^preencher os campos Datas com o valor \"([^\"]*)\"$")
	public void preencherCamposDatas(String valor) {
		this.pedidos.preencherCamposDatas(valor);
	}

	@Quando("clico no botao Consultar Pedido")
	public void acionarBtnConsultar() {
		this.pedidos.clicarBtnConsultaPedido();
	}

	@Quando("^pesquiso pelo fornecedor na SOLPD$")
	public void pesquisaFornecSOLPD() {
		this.login.acessarTela("SOLPD");
		this.solpd.preencherCampoValor("forn", VariaveisEstaticas.getFORNEC());
		this.pedidos.executarComandoEnter();
	}

	@Quando("^consultar o fornecedor (\\d+) na SOLPD$")
	public void consultaFornSOLPD(int forn) {
		this.login.acessarTela("SOLPD");
		this.solpd.preencherCampoValor("Forn", Integer.toString(forn));
		this.solpd.pesquisar();
	}

	@Quando("^excluo um item do pedido$")
	public void excluirItemPedido() {
		this.pedidos.clicarBtnConsultaPedido();
		this.pedidos.excluirPrimeiroItem();
	}

	@Entao("^deve ser gerado um numero do pedido$")
	public void validarGeracaoNumeroPedido() {
		Assert.assertTrue("Número Pedido não foi gerador",
				this.pedidos.retornaMensagemExibida().contains("Seu numero de requisição !"));
	}

	@Entao("^deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD$")
	public void validarExibicaoDadosPedidosEstocados() throws ParseException {
		Assert.assertEquals(this.solpd.retornaValorCampo("Loja"), VariaveisEstaticas.getFILIAL());
		Assert.assertEquals(this.solpd.retornaValorCampo("Grid Local"), VariaveisEstaticas.getCOMPRADOR());
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
	public void verificarGridItem() {
		this.pedidos.verificaItemGrid(1);
		assertEquals(this.pedidos.retornaValorCampo("Descricao do produto"), VariaveisEstaticas.getDESCRICAO());
		assertEquals(this.pedidos.retornaValorCampo("codigo do produto"), VariaveisEstaticas.getCOD_PRODUTO());

	}

	@Entao("^deve retornar o item com situação \"([^\"]*)\"$")
	public void validarItemSOLPD(String status) {
		assertEquals(VariaveisEstaticas.getCOD_PRODUTO(), this.solpd.retornaValorCampo("Produto"));
		assertTrue(
				"Hora de exclusão: " + VariaveisEstaticas.getHORA() + " - Hora Sistema: "
						+ this.solpd.retornaValorCampo("Hora Registro").toString(),
				this.solpd.retornaValorCampo("Hora Registro").contains(VariaveisEstaticas.getHORA()));
		assertEquals(this.solpd.retornaValorCampo("Situacao registro"), status);
	}

	@Entao("^deve apresentar a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		Assert.assertTrue(this.pedidos.retornaMensagemExibida().contains(msg));
	}

	@Entao("^deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
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
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.pedidos.retornaItens(qtde));
		this.pedidos.excluirMultiplosItens(qtde);
	}

	@Entao("^a grid deve apresentar o item excluido com a situação \"([^\"]*)\"$")
	public void verificarPrimeiroItemSituacao(String sit) throws ParseException {
		assertTrue("Item não encontrado com situação/hora de cancelamento correta",
				this.pedidos.verificarItemSOLPD(VariaveisEstaticas.getMap().get(0).get("Codigo"), sit));
	}

	@Entao("^a grid deve apresentar os itens excluidos com a situação \"([^\"]*)\"$")
	public void verificarTodosItensInclusos(String sit) {
		VariaveisEstaticas.getMap().forEach(x -> {
			try {
				assertTrue("Item: " + x.get("Codigo") + ", não encontrado com situação/hora de cancelamento correta",
						this.pedidos.verificarItemSOLPD(x.get("Codigo"), sit));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		});
	}

	@Dado("^que tenha (\\d+) itens excluidos$")
	public void excluirMultiplosItens(int qtde, DataTable params) {
		this.incluirMaisItens(qtde, params);
		this.acionarBtnConsultar();
		this.pedidos.excluirMultiplosItens(qtde);
	}

	@Quando("^acionar o botao Executar Pedido$")
	public void acionarBotaoExecutarPedido() {
		this.pedidos.acionarBtnExecutarPedido();
		this.pedidos.aguardaReload();

	}

	@Dado("^que tenha um pedido com um item$")
	public void executarPedidoComItem(DataTable params) {
		this.incluirItem(params);
		this.pedidos.limparPedido(params);
	}

	@Entao("^grid deve apresentar o produto pesquisado$")
	public void gridDeveApresentarOProdutoPesquisado() throws Throwable {
		this.pedidos.verificarConsultaItem(VariaveisEstaticas.getCOD_PRODUTO());
	}

	@Quando("^tento incluir (\\d+) item na GERPD$")
	public void incluirItemGERPD(int qtde, DataTable params) throws Throwable {
		this.incluirMaisItens(qtde, params);

	}

	@Quando("^clico no botao Alterar$")
	public void acionarBtnAlterar() {
		this.pedidos.acionarBtnAlterar();
	}

	@Entao("^deve apresentar a mensagem o numero do pedido$")
	public void validarGeracaoPedido() {
		Assert.assertTrue("Número do Pedido não foi Gerado", this.pedidos.valdiarGeracaoNumeroPedido());

	}
}
