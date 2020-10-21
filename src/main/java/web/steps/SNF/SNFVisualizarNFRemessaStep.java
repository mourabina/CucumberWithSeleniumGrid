package web.steps.SNF;

import org.junit.Assert;

import commons.funcionalidade.ComponentesFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNF_VisualizarNotaFiscalRemessaFuncionalidade;

public class SNFVisualizarNFRemessaStep {

	private SNF_VisualizarNotaFiscalRemessaFuncionalidade remessa;
	private ComponentesFuncionalidade comp;

	public SNFVisualizarNFRemessaStep() {

		this.remessa = new SNF_VisualizarNotaFiscalRemessaFuncionalidade();
		this.comp = new ComponentesFuncionalidade();
	}

	@Dado("^preencho todos os campos da Tela com informacoes validas$")
	public void preenchimentoFormularioVNFR() {
		this.remessa.preencherTodosCamposPesquisarRemessa();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Numeros \\(Visualizar NF Remessa\\)$")
	public void preencherCampoNumerosVNFR(String elem) {
		this.remessa.preencherCaracteresNumeros(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Caracteres Especiais \\(Visualizar NF Remessa\\)$")
	public void preencherCampoCaracteresEspeciaisVNFR(String elem) {
		this.remessa.preencherCaracteresEspeciais(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Letras \\(Visualizar NF Remessa\\)$")
	public void preencherCampoLetrasVNFR(String elem) {
		this.remessa.preecherLetras(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" Valor \"([^\"]*)\" \\(Visualizar NF Remessa\\)$")
	public void preencherCampoValorVNFR(String campo, String valor) {
		this.remessa.preencherCampoDataInvalida(campo, valor);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com uma Data Valida \\(Visualizar NF Remessa\\)$")
	public void preencherCampoComDataValidaVNFR(String campo) {
		this.remessa.preencherCampoDataValida(campo);
	}

	@Quando("^clico no botao limpar$")
	public void acionarBtnLimpar() {
		this.comp.clicarLimpar();
	}

	@Quando("^efetuo uma pesquisa atraves do campo Unidade de Negocio e \"([^\"]*)\" com o valor \"([^\"]*)\" \\(Visualizar NF Remessa\\)$")
	public void preencherCamposTelaPesquisaVisualizarRemessa(String campo, String valor) {
		this.remessa.preencherCamposPesquisa(campo, valor);
		this.remessa.clicarBotaoPesquisar();
	}

	@Entao("^o campo \"([^\"]*)\" devera apresentar o valor \"([^\"]*)\" \\(Visualizar NF Remessa\\)$")
	public void verificaCampoValorVNFR(String campo, String msg) {
		Assert.assertEquals(this.remessa.validarTextoCampoData(campo), msg);
	}

	@Entao("^o campo \"([^\"]*)\" nao deve estar vazio \\(Visualizar NF Remessa\\)$")
	public void verificaCampoNaoVazioVNFR(String campo) {
		Assert.assertFalse("Campo Esta Vazio", this.remessa.verificarCampoVazio(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar vazio \\(Visualizar NF Remessa\\)$")
	public void verificarCampoEstaVazioVNFR(String campo) {
		Assert.assertTrue("Campo Nao Esta Vazio", this.remessa.verificarCampoVazio(campo));
	}

	@Entao("^todos os campos devem estar vazios \\(Visualizar NF Remessa\\)$")
	public void verificarTodosCamposEstaoVazios() {
		Assert.assertEquals("Selecione...",
				this.remessa.verificaUnidadeNegocioSelecione());
		Assert.assertTrue("Campo Nome Fornecedor não está vazio", this.remessa.verificarCampoVazio("Nome Fornecedor"));
		Assert.assertTrue("Campo Série não está vazio", this.remessa.verificarCampoVazio("Serie"));
		Assert.assertEquals("Selecione...", this.remessa.verificaSituacaoSelecione());
		Assert.assertTrue("Campo Nota Fiscal não está vazio", this.remessa.verificarCampoVazio("Nota Fiscal"));
	}
}
