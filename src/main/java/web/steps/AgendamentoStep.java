package web.steps;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.AgendamentoFuncionalidade;
import web.funcionalidade.LoginFuncionalidade;

public class AgendamentoStep {

	private AgendamentoFuncionalidade agenda;
	private LoginFuncionalidade login;

	public AgendamentoStep() {
		this.agenda = new AgendamentoFuncionalidade();
		this.login = new LoginFuncionalidade();
	}

	@Dado("^preencho os campos de Datas e Hora$")
	public void preenchoOsCampos(DataTable params) {
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Hora Prev Entrada", GeracaoData.retornaProxHora());
		this.agenda.preencherCampos(params);
	}

	@Quando("^clico no botao incluir$")
	public void clicarBotaoIncluir() {
		this.agenda.clicarBotaoIncluir();
	}

	@Quando("^faco a consulta com a agenda recem gerada$")
	public void salvarValorCampoAgendaFacoNovaConsultaValorAgenda() {
		VariaveisEstaticas.setAGENDA(this.agenda.retornaValorCampo("Agenda"));
		this.login.acessarTela("CPT85");
		this.agenda.preencherCampoValor("Agenda", VariaveisEstaticas.getAGENDA());
		this.agenda.clicarBotaoConsultar();

	}

	@Entao("^o campo \"([^\"]*)\" deve ser preenchido com o valor da Agenda$")
	public void validarCriacaoAgenda(String campo) {
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio(campo));

	}

	@Dado("^que tenha uma agenda criada$")
	public void criaAgenda(DataTable params) {
		this.preenchoOsCampos(params);
		this.agenda.incluirAguardar();
		VariaveisEstaticas.setAGENDA(this.agenda.retornaValorCampo("Agenda"));
	}

	@Quando("^pesquisar a agenda$")
	public void pequisarAgendaCriada() {
		this.login.voltarHomePage();
		this.login.acessarTela("CPT85");
		this.agenda.preencherCampoValor("Agenda", VariaveisEstaticas.getAGENDA());
		this.agenda.clicarBotaoConsultar();
	}

	@Entao("^deve retornar os dados da agenda$")
	public void validarCamposPreenchidos() {
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Agenda"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Data Agenda"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Data Prev Entrada"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Hora Prev Entrada"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Transportadora"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Contato"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Fone"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Perecivel"));
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio("Alto Risco"));
	}

	@Quando("^altero as informacoes da Agenda e clico em Alterar$")
	public void alterarInformacoesAgenda() {
		this.agenda.alterarInformacoesAgenda();
		this.agenda.clicarBotaoAlterar();
	}

	@Entao("^deve ser exibido a mensagem \"(.*)\"$")
	public void valdiarMensagemExibida(String msg) {
		Assert.assertTrue(this.agenda.retornaMensagemExibida().contains(msg));
	}

	@Quando("^acionar o botão deletar$")
	public void deletarEConsultar() {
		this.agenda.deletarConsultar();
	}

	@Quando("^altero as informacoes da Agenda e aciono o botao Alterar$")
	public void alterarInformacoesAgendaClicarBotaoAlterar(DataTable params) {
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampos(params);
		this.agenda.clicarBotaoAlterar();

	}

}
