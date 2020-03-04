package web.steps;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
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
		VariaveisEstaticas.setHORA(GeracaoData.retornaHoraAtualMenosSegundos(195));
		this.dsdCross.ClicarBotaoExcluir();
	}

	@Entao("^deve ser populado o Grid de Resultados da INPE$")
	public void validarGridPopuladoINPE2(){
		this.dsdCross.verificarTodosResultadoGrid();
	}

}
