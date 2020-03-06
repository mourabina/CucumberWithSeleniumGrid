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
	public void incluirIntesCross(Integer quant, DataTable params) throws ParseException {
		this.dsdCross.preencherCampos(params);
		this.dsdCross.selecionarValorCampoClassificacao();
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.incluirItens(quant);

	}

	@Entao("^a grid da Tela INPE deve apresentar os (\\d+) itens inclusos$")
	public void validarLojaQuantiIntensGridINPE2(int quant) throws ParseException {
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.dsdCross.retornaItens(quant));
		this.dsdCross.excluirMultiplosItensIMPE2(quant);
	}

	@Entao("^a grid da Tela \"([^\"]*)\" deve apresentar os (\\d+) itens inclusos$")
	public void validarLojaQuantiIntensGridINPE2(String tela, int quant) throws ParseException {
		assertEquals("Itens não são os mesmos que os inseridos", VariaveisEstaticas.getMap(),
				this.dsdCross.retornaItens(quant));
		this.solpd.pegarValoresParaExclusao();
		this.dsdCross.excluirIntensINPE2(quant);
	}

	@Dado("^que tenha \"([^\"]*)\" iten Cross Excluido com o Produto \"([^\"]*)\"$")
	public void incluirExcluirIten(int quant, String valor, DataTable params){
		this.dsdCross.preencherCampoValor("Produto", valor);
		this.dsdCross.clicarBotaoConsultarLoja();
		this.dsdCross.preencherCampos(params);
		this.dsdCross.selecionarValorCampoClassificacao();
		this.dsdCross.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.incluirItens(quant);
		this.dsdCross.clicarBotaoConcultarPedido();
		this.dsdCross.selecionarLojasINPE2();
		VariaveisEstaticas.setHORA(GeracaoData.retornaHHmm(195));
		this.dsdCross.ClicarBotaoExcluir();
	}

	@Entao("^deve ser populado o Grid de Resultados da INPE$")
	public void validarGridPopuladoINPE2(){
		this.dsdCross.verificarTodosResultadoGrid();
	}

	@Quando("^clico no botao Pesquisar Lojas sem preencher nenhum campo$")
	public void acionarBotaoPesquisarLojasSemPreencherCampos(){
		this.dsdCross.ClicarBotaConsultarLojas();
	}

	@Entao("^deve ser exibida a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg){
		Assert.assertTrue("A mensagem: " + msg , this.dsdCross.retornaMensagem().contains(msg));
		
	}

	@Quando("^clico no botao Pesquisar Pedido sem preencher nenhum campo$")
	public void acionarBotaoPesquisarPedidoSemPreencherCampos(){
		this.dsdCross.clicarBotaoConcultarPedido();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\" e clico em consultar Pedido$")
	public void preencherCampoConsultarPedido(String campo, String valor){
		this.dsdCross.preencherCampoValor(campo, valor);
		this.dsdCross.clicarBotaoConcultarPedido();
	}

	@Quando("^preencho os campos e clico em Consultar Pedido$")
	public void preencherCamposClicarBotaoConsultarPedido(DataTable params){
		this.dsdCross.preencherCampos(params);
		this.dsdCross.clicarBotaoConcultarPedido();
		
	}

	@Quando("^preencho os campos e \"([^\"]*)\" e clico em Consultar Pedido$")
	public void preencherCamposMenosDataEntrega(String dtEntrega, DataTable params){
		this.preencherCamposClicarBotaoConsultarPedido(params);
		this.dsdCross.preencherCampoValor(dtEntrega, GeracaoData.retornaDataAtualMaisDias(1));
		this.dsdCross.clicarBotaoConcultarPedido();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void validarPeenchimenentoCampos(String campo, String valor){
		this.dsdCross.preencherCampoValor(campo, valor);
	}

}
