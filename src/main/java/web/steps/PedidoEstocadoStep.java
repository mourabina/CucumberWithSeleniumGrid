package web.steps;

import java.text.ParseException;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
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

	@Dado("preencho os campos mais os campos de Data")
	public void preencherCamposObrigtorios(DataTable dataTable) {
		this.pedidos.preencherCampos(dataTable);
		this.pedidos.preencherCampoValor("Data 1", GeracaoData.retornaDataAtualMaisDias(1));
	}

	@Quando("clico no botao Consultar Pedido")
	public void acionarBotaoConsultarPedido() {
		this.pedidos.clicarBotaoConsultaPedido();
	}

	@Dado("^preencho os campos da GERPD$")
	public void preencherFormulario(DataTable params){
		this.pedidos.preencherCampos(params);
	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		Assert.assertTrue(this.pedidos.retornaMensagemExibida().contains(msg));

	}

	@E("^preencher o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void preencherCamposValores(String campo, String valor) {
		this.pedidos.preencherCampoValor(campo, valor);

	}

	@Entao("^deve ser exibido no GRID o \"([^\"]*)\" e a \"([^\"]*)\"$")
	public void valdiarExibicaoInfomacaoItensGRidResultado(String campo1, String campo2) {
		Assert.assertFalse("Camapo " + campo1 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo1));
		Assert.assertFalse("Camapo " + campo2 + "Não está sendo exibido", this.pedidos.validaCampoVazio(campo2));
	}

	@E("^seleciono a opcao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionarValorCampoComboBox(String valor, String campo) {
		this.pedidos.selecionarValorComboBox(campo, valor);
		this.pedidos.clicarBotaoConsultarTabelaCompra();
		this.pedidos.aguardaReload();

	}

	@Então("^deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarExibicaoValorCampo(String valor, String campo) {
		Assert.assertEquals(valor, this.pedidos.retornaValorCampo(campo));

	}

	@Quando("^clico no botao Consultar Tabela de Compra$")
	public void acionarBotaoConsultarTabelaCompra() {
		this.pedidos.clicarBotaoConsultarTabelaCompra();

	}

	@Entao("^grid deve estar populada$")
	public void verificarGrid(){
		this.pedidos.verificarGrid();


	}

	@Quando("^preencher os campos Datas com o valor \"([^\"]*)\"$")
	public void preencherTodosCamposDatas(String valor) {
		this.pedidos.preencherCamposDatas(valor);

	}

	@Quando("^Seleciono produto e digito a quantidade \"([^\"]*)\" e clico nos botaes incluir e Executar Pedido$")
	public void selecionarProdutoDigitarQuantClicarBotaoIncluir(String quant){
		this.pedidos.selecionarComboBox();
		this.pedidos.preencherCampoCompra(quant);
		this.pedidos.clicarBotaoIncluir();
		this.pedidos.aguardaReload();
		this.pedidos.salvarInformacoesPedido();
		this.pedidos.clicarBotaoExecutarPedido();
	}

	@Entao("^deve ser gerado um numero do pedido$")
	public void validarGeracaoNumeroPedido(){
		Assert.assertTrue("Número Pedido não foi gerador", this.pedidos.retornaMensagemExibida().contains("Seu numero de requisição !"));
	}

	@Quando("^faco uma pesquisa na tela \"([^\"]*)\" com o campo \"([^\"]*)\"$")
	public void facoUmaPesquisaNaTelaComOCampo(String tela, String campo){
		this.login.acessarTela(tela);
		this.solpd.preencherCampoValor(campo, VariaveisEstaticas.getFORNEC());
		this.pedidos.executarComandoEnter();
	}

	@Entao("^deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD$")
	public void validarExibicaoDadosPedidosEstocados() throws ParseException{
		Assert.assertEquals(this.solpd.retornaValorCampo("Loja"), VariaveisEstaticas.getFILIAL());
		Assert.assertEquals(this.solpd.retornaValorCampo("Compr"), VariaveisEstaticas.getCOMPRADOR());
		Assert.assertEquals(this.solpd.retornaValorCampo("Produto"), VariaveisEstaticas.getCOD_PRODUTO());
		Assert.assertEquals(this.solpd.retornaValorCampo("Qtda"), VariaveisEstaticas.getQUANT());
		String a = GeracaoData.retornaDataFormatada(this.solpd.retornaValorCampo("Data").toString());
		Assert.assertEquals(GeracaoData.retornaDataFormatada(this.solpd.retornaValorCampo("Data").toString()), VariaveisEstaticas.getDATA_ENTRADA());
		
	}

}
