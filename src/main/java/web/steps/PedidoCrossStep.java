package web.steps;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Assert;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.DigitacaoPedidosDSDCROSSFuncionalidade;

public class PedidoCrossStep extends BaseTest {

	private DigitacaoPedidosDSDCROSSFuncionalidade dsdCross;

	public PedidoCrossStep() {
		this.dsdCross = new DigitacaoPedidosDSDCROSSFuncionalidade();

	}

	@Dado("pesquiso uma loja com o campo {string} com o valor {string}")
	public void pesquisarLoja(String campo, String valor) {
		this.dsdCross.preencherCampoValor(campo, valor);
		this.dsdCross.clicarBotaoConsultarLoja();

	}

	@Dado("que tenha {int} itens inclusos Cross")
	public void incluirItemCross(Integer quant, DataTable params) throws ParseException {
		this.dsdCross.preencherCampos(params);
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.limparPedidoINPE2(params);
		this.dsdCross.ClicarBotaConsultarLojas();
		this.dsdCross.incluirItens(quant);

	}

	@Entao("^a grid da Tela SOLPD deve apresentar os (\\d+) itens inclusos$")
	public void validarLojaQuantItensGridINPE2(int quant) throws ParseException {
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.dsdCross.retornaItens(quant));

	}

	@Dado("^que tenha \"([^\"]*)\" item Cross Excluido$")
	public void incluirExcluirItem(int quant, DataTable params) throws ParseException {
		this.incluirItemCross(quant, params);
		this.dsdCross.acionarBtnConsultarPedido();
		this.dsdCross.selecionarLojasINPE2();
		this.dsdCross.ClicarBotaoExcluir();
	}

	@Entao("^deve ser populado o Grid de Resultados da INPE$")
	public void validarGridPopuladoINPE2() {
		this.dsdCross.verificarTodosResultadoGrid();
	}

	@Quando("^clico no botao Pesquisar Lojas$")
	public void acionatBtnPesquisarLoja() {
		this.dsdCross.ClicarBotaConsultarLojas();
	}

	@Entao("^deve exibir a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		Assert.assertTrue("A mensagem não condiz com o esperado", this.dsdCross.retornaMensagem().contains(msg));
	}

	@Quando("^clico no botao Pesquisar Pedido$")
	public void acionatBtnPesquisarPedido() {
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedido com o campo \"([^\"]*)\" contendo o valor \"([^\"]*)\"$")
	public void consultarPedidoPreenchendoCampo(String campo, String valor) {
		this.dsdCross.preencherCampoValor(campo, valor);
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedidos com os campos preenchidos$")
	public void consultarPedidoPreenchendoCampos(DataTable params) {
		this.dsdCross.preencherCampos(params);
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedidos com os campos obrigatorios preenchidos$")
	public void preencherCamposMenosDataEntrega(DataTable params) {
		this.consultarPedidoPreenchendoCampos(params);
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.limparPedidoINPE2(params);
		this.dsdCross.acionarBtnConsultarPedido();

	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void validarPreenchimentoCampos(String campo, String valor) {
		this.dsdCross.preencherCampoValor(campo, valor);
	}

	@Quando("^preencho os campos Quantidade com o valor \"([^\"]*)\"$")
	public void preenherCampoQauntidadeGrid(String valor) {
		this.dsdCross.validarCampoQuantidadeGrid(valor);

	}

	@Quando("^tento incluir (\\d+) item na INPE2$")
	public void incluirItemINPE2(int quant, DataTable params) throws ParseException {
		this.incluirItemCross(quant, params);
	}

	@Entao("^deve exibir a mensagem \"([^\"]*)\" ou \"([^\"]*)\"$")
	public void verificarMultiplasMensagens(String msg, String msg2) throws Throwable {
		Assert.assertTrue("A mensagem não condiz com o esperado", this.dsdCross.retornaMensagem().contains(msg)||this.dsdCross.retornaMensagem().contains(msg2));
	}

}
