package web.steps.SNF;

import org.junit.Assert;

import commons.funcionalidade.ComponentesFuncionalidade;
import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNFObterAgendamentoFuncionalidade;

public class SNFObterAgendamentoStep {

	private SNFObterAgendamentoFuncionalidade obter;
	private waitLoading wl;
	private ComponentesFuncionalidade componentes;

	public SNFObterAgendamentoStep() {
		this.obter = new SNFObterAgendamentoFuncionalidade();
		this.wl = new waitLoading();
		this.componentes = new ComponentesFuncionalidade();
	}

	@Dado("^preencho todos os campos com informacoes validas$")
	public void preenchimentoCompletoValido() {
		this.wl.loading();
		this.obter.preencherCamposPesquisaRecebimentoCompleto();	
	}
	
	@Quando("^aciono o botao limpar$")
	public void acionoOBotaoLimpar(){
		this.componentes.clicarLimpar();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Letras$")
	public void preenchoOCampoComLetras(String elem) {
		this.obter.preecherLetras(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Caracteres Especiais$")
	public void preenchoOCampoComCaracteresEspeciais(String elem) {
		this.obter.preencherCaracteresEspeciais(elem);
	}

	@Quando("^preencho o campo Data Agenda com o valor valor valido$")
	public void preenchoCampoDataAgendaComValorValorValido() {
		this.obter.preencherCampoData();
	}

	@Quando("^preencho o campo Data Agenda com o valor Data Invalida$")
	public void preenchimentoInvalidoDataAgenda() {
		this.obter.preencherCampoDataValorInvalido();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Numeros$")
	public void preenchimentoCampoNumeros(String elem) {
		this.obter.preencherCaracteresNumeros(elem);
	}
	
	@Quando("^efetuo uma pesquisa atraves do campo Undiade de Negocio e \"([^\"]*)\" com o valor \"([^\"]*)\" \\(Visualizar Recebimento\\)$")
	public void prencherCamposTelaPesquisaVisualiarRecebimento(String campo, String valor){
		this.obter.preencherCamposPesquisas(campo, valor);
	}
	

	@Quando("^efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo \"([^\"]*)\" seleciono o valor \"([^\"]*)\" \\(Visualizar Recebimento\\)$")
	public void selecionarValorCamposSituacaoComFilial(String campo,String valor){
		this.obter.selecionarSituacao(campo,valor);
	}


	@Entao("^o botao Pesquisar devera esta desabilitado$")
	public void oBotaoPesquisarDeveraEstaDesabilitado() {
		Assert.assertTrue("Botão Pesquisar não está desabilitado", this.obter.botãoSalvarDesabilitado());
	}

	@Entao("^todos os campos devem estar vazios \\(Visualizar Recebimento\\)$")
	public void todosOsCamposDevemEstaVazios() {
		Assert.assertTrue("Campo Unidade de Negocio nao esta com valor Selecione...", this.obter.getUnidadeNegocio());
		Assert.assertTrue("Campo Numero Agendamanto nao vazio", this.obter.verificarCampoVazio("Numero Agendamento"));
		Assert.assertTrue("Campo Situacao nao esta com valor Selecione...", this.obter.getInputSituacao());
		Assert.assertTrue("Campo Data Agenda nao esta Vazio", this.obter.verificarCampoVazio("Data Agenda"));
		Assert.assertTrue("Campo Numero Fornecedor nao esta vazio", this.obter.verificarCampoVazio("Numero Fornecedor"));
		Assert.assertTrue("Campo Numero Pedido nao esta Vazio", this.obter.verificarCampoVazio("Numero Pedido"));
		Assert.assertTrue("Campo Numero Recebimento nao esta Vazio", this.obter.getinputNumeroRecebimento());

	}

	@Entao("^deve apresentar o valor \"([^\"]*)\" no campo Data Agenda$")
	public void deveraSerApresentadoOValorNoCampoDataAgenda(String msg) {
		Assert.assertEquals(this.obter.pegarValorDataAgenda(), msg);
	}

	@Entao("^o campo \"([^\"]*)\" deve estar vazio \\(Agendamento\\)$")
	public void validarCampoNaoDeveEstaVazioAgendamento(String elem){
		Assert.assertTrue("Campo nao esta Vazio", this.obter.verificarCampoVazio(elem));
	}

	@Entao("^campo \"([^\"]*)\" deve ter o valor diferente de vazio$")
	public void campoDeveraTerValorDiferenteDeVazio(String elem) {
		Assert.assertFalse("Campo esta Vazio", this.obter.verificarCampoVazio(elem));	
	}


	
	
}
