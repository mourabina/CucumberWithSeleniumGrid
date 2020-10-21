package web.steps.SNF;

import org.junit.Assert;

import commons.BaseTest;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNFInserirNotaFiscalManualFuncionalidade;

public class SNFInserirNFManualStep extends BaseTest {

	private SNFInserirNotaFiscalManualFuncionalidade NFManual;

	public SNFInserirNFManualStep() {
		this.NFManual = new SNFInserirNotaFiscalManualFuncionalidade();
	}

	@Quando("^criar um nota fiscal manual$")
	public void notaFiscalManual() {
		addEvidenciaWeb("Tela 'Fornecedor NF' acessada");
		this.NFManual.preencherNfManualSucesso();
		this.NFManual.clicarBotaoSavarNF();
	}

	@Quando("^preencho todos os campos menos o campo \"([^\"]*)\"$")
	public void preenchimentoParcial(String elem) {
		addEvidenciaWeb("Tela 'Fornecedor NF' acessada");
		this.NFManual.preencherNfManualMenosNumeroSerie(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com letras$")
	public void preechimentoCampoLetras(String campo) {
		this.NFManual.preecherLetras(campo);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com caracteres especiais$")
	public void preenchimentoCampoCaracteresEspeciais(String campo) {
		this.NFManual.preencherCaracteresEspeciais(campo);
		this.NFManual.clicarCampoIncricaoEstadual();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com valor negativo$")
	public void preechimentoValorNegativo(String campo) {
		this.NFManual.preencherValorNegativo(campo);
	}

	@Quando("^preencho todos e nao seleciono um valor no campo \"([^\"]*)\"$")
	public void preenchimentoSemSelecionarOpcao(String elem) {
		this.NFManual.preencherNfManualSucesso();
		this.NFManual.unidadeNegocioSelecione();

	}

	@Entao("^deve ser apresentado a seção pedido da nf$")
	public void validarSecaoPedidoNF() {
		this.NFManual.verificarSessaoPedidoNF();
	}

	@Entao("^o botao Salvar deve estar desabilitado$")
	public void validarBotaoSalvar() {
		Assert.assertFalse("Botão Salvar Desabilitado", this.NFManual.botaoSalvarDesabilitado());
	}

	@Entao("^o botao Salvar deve estar habilitado$")
	public void verificarBtnSalvar() {
		Assert.assertTrue("Botão Salvar Habilitado", this.NFManual.botaoSalvarDesabilitado());
	}

	@Entao("^o campo \"([^\"]*)\" deve estar vazio$")
	public void verificarCampoVazio(String campo) {
		Assert.assertTrue("Campo não está vazio", this.NFManual.verificarCampoVazio(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar com valor positivo$")
	public void verificarCampoValorPositivo(String campo) {
		Assert.assertTrue("Campo está com valor negativo", this.NFManual.verificarValorPositivo(campo));
	}

	@Entao("^o campo \"([^\"]*)\" nao deve estar vazio$")
	public void verificarCampoPreenchido(String campo) {
		Assert.assertFalse("Campo esta vazio", this.NFManual.verificarCampoVazio(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve ter o valor \"([^\"]*)\"$")
	public void validarValorCampoNumericoNFManual(String campo, String valor) {
 		Assert.assertEquals(this.NFManual.retornaValorCampo(campo), valor);		
	}

	@Entao("^deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void deveraSerExibidoValorNoCampo(String valor, String campo) {
		Assert.assertEquals(this.NFManual.retornaValorCamposData(campo), valor);		
	}
}
