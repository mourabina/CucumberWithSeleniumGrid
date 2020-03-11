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
import web.funcionalidade.ConsultaDigitacaoDePedidosSOLPDFuncionalidade;
import web.funcionalidade.DigitacaoPedidosDSDCROSSFuncionalidade;

public class PedidoCrossStep extends BaseTest {

	private DigitacaoPedidosDSDCROSSFuncionalidade dsdCross;
	private ConsultaDigitacaoDePedidosSOLPDFuncionalidade solpd;

	public PedidoCrossStep() {
		this.dsdCross = new DigitacaoPedidosDSDCROSSFuncionalidade();
		this.solpd = new ConsultaDigitacaoDePedidosSOLPDFuncionalidade();

	}

	@Dado("pesquiso uma loja com o campo {string} com o valor {string}")
	public void pesquisarLoja(String campo, String valor) {
		this.dsdCross.preencherCampoValor(campo, valor);
		this.dsdCross.clicarBotaoConsultarLoja();

	}

	@Dado("que tenha {int} itens inclusos Cross")
	public void incluirItemCross(Integer quant, DataTable params) throws ParseException {
		this.dsdCross.preencherCampos(params);
		this.dsdCross.selecionarValorCampoClassificacao();
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.ClicarBotaConsultarLojas();
		this.dsdCross.incluirItens(quant);

	}

	@Entao("^a grid da Tela SOLPD deve apresentar os (\\d+) itens inclusos$")
	public void validarLojaQuantItensGridINPE2(int quant) throws ParseException {
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.dsdCross.retornaItens(quant));
		this.solpd.pegarValoresParaExclusao();
		this.dsdCross.excluirIntensINPE2(quant);
	}

	@Dado("^que tenha \"([^\"]*)\" iten Cross Excluido com o Produto \"([^\"]*)\"$")
	public void incluirExcluirItem(int quant, String valor, DataTable params){
		this.dsdCross.preencherCampoValor("Produto", valor);
		this.dsdCross.clicarBotaoConsultarLoja();
		this.dsdCross.preencherCampos(params);
		this.dsdCross.selecionarValorCampoClassificacao();
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.incluirItens(quant);
		this.dsdCross.acionarBtnConsultarPedido();
		this.dsdCross.selecionarLojasINPE2();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.dsdCross.ClicarBotaoExcluir();
	}

	@Entao("^deve ser populado o Grid de Resultados da INPE$")
	public void validarGridPopuladoINPE2(){
		this.dsdCross.verificarTodosResultadoGrid();
	}

	@Quando("^clico no botao Pesquisar Lojas$")
	public void acionatBtnPesquisarLoja(){
		this.dsdCross.ClicarBotaConsultarLojas();
	}

	@Entao("^deve exibir a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg){
		Assert.assertTrue("A mensagem não condiz com o esperado", this.dsdCross.retornaMensagem().contains(msg));		
	}

	@Quando("^clico no botao Pesquisar Pedido$")
	public void acionatBtnPesquisarPedido(){
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedido com o campo \"([^\"]*)\" contendo o valor \"([^\"]*)\"$")
	public void consultarPedidoPreenchendoCampo(String campo, String valor){
		this.dsdCross.preencherCampoValor(campo, valor);
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedidos com os campos preenchidos$")
	public void consultarPedidoPreenchendoCampos(DataTable params){
		this.dsdCross.preencherCampos(params);
		this.dsdCross.acionarBtnConsultarPedido();
	}

	@Quando("^realizo a consulta de pedidos com os campos obrigatorios preenchidos$")
	public void preencherCamposMenosDataEntrega(DataTable params){
		this.consultarPedidoPreenchendoCampos(params);
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.acionarBtnConsultarPedido();
		
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void validarPreenchimentoCampos(String campo, String valor){
		this.dsdCross.preencherCampoValor(campo, valor);
	}

	@Quando("^preencho os campos Quantidade com o valor \"([^\"]*)\"$")
	public void preenherCampoQauntidadeGrid(String valor){
		this.dsdCross.validarCampoQuantidadeGrid(valor);
		
	}

	@Quando("^tento incluir (\\d+) item na INPE2$")
	public void incluirItemINPE2(int quant, DataTable params) throws ParseException {
		this.incluirItemCross(quant, params);
	}
}
