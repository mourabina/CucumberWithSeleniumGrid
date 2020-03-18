package web.steps;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.DigitacaoPedidosDSDCROSSFuncionalidade;

public class PedidoDSDStep {

	private DigitacaoPedidosDSDCROSSFuncionalidade inpe;

	public PedidoDSDStep() {
		this.inpe = new DigitacaoPedidosDSDCROSSFuncionalidade();
	}

	@Quando("preencho o campo {string} com o valor {string} da tela INPE")
	public void preenchoCampoTelaInpe2(String campo, String valor) {
		this.inpe.preencherCampoValor(campo, valor);
	}

	@Entao("^deve ser exibido no GRID o \"([^\"]*)\" e a \"([^\"]*)\" na Tela Inpe$")
	public void validarExibicaoLabelsTelaInpe(String campo1, String campo2) {
		Assert.assertFalse("Camapo " + campo1 + "Não está sendo exibido",
				this.inpe.retornaValorCampo(campo1).equals(" "));
		Assert.assertFalse("Camapo " + campo2 + "Não está sendo exibido",
				this.inpe.retornaValorCampo(campo1).equals(" "));
	}

	@Quando("^clico no botao Consultar Lojas$")
	public void acionarBtnConsultarLojas() {
		this.inpe.ClicarBotaConsultarLojas();

	}

	@Quando("^preencho os campos mais os campos de Data de Entrega e Classif Ped$")
	public void preencherCamposDataEntrega(DataTable params) {
		this.inpe.preencherCampos(params);
		this.inpe.selecionarValorCampoClassificacao();
		this.inpe.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(2));

	}

	@Dado("^que tenha (\\d+) itens inclusos DSD$")
	public void incluirItenDSD(int quant, DataTable params) {
		this.inpe.preencherCampos(params);
		this.inpe.preencherCampoValor("DT Entrega", GeracaoData.retornaDataAtualMaisDias(1));
		this.inpe.limparPedidoINPE2(params);
		this.inpe.clicarBotaoConsultarLoja();
		this.inpe.incluirItens(quant);
	}
}
