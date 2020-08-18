package web.steps;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
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
	public void novaConsultaAgenda() {
		VariaveisEstaticas.setAGENDA(this.agenda.retornaValorCampo("Agenda"));
		this.login.acessarTela("CPT85");
		this.agenda.preencherCampoValor("Agenda", VariaveisEstaticas.getAGENDA());
		this.agenda.clicarBotaoConsultar();

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

	@Quando("^altero as informacoes da Agenda e clico em Alterar$")
	public void alterarInformacoesAgenda() {
		this.agenda.alterarInformacoesAgenda();
		this.agenda.clicarBotaoAlterar();
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

	@Quando("^preencho o campo \"([^\"]*)\" com os valores \"([^\"]*)\"$")
	public void preencherCampoComValoresInvalidos(String campo, String valor) {
		this.agenda.preencherCampoValor(campo, valor);

	}

	@E("^preencho os campos de Hora$")
	public void preenchoOsCamposDeHora(DataTable params) {
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Hora Prev Entrada", GeracaoData.retornaProxHora());
		this.agenda.preencherCampos(params);
	}

	@E("^preencho os campos de Data$")
	public void preenchoOsCamposData(DataTable params) {
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Hora Prev Entrada", GeracaoData.retornaHoraAntesAtual());
		this.agenda.preencherCampos(params);
	}

	@E("^preencho os campos de Hora e Data Entrada$")
	public void validarPreenchimentoCamposDataAgendaLentras(DataTable params) {
		this.agenda.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Hora Prev Entrada", GeracaoData.retornaProxHora());
		this.agenda.preencherCampos(params);
	}

	@E("^preencho os campos de Hora e Data Agenda$")
	public void validarPreenchimentoCampoHoraPrevisEntradaLetras(DataTable params) {
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampos(params);
	}

	@E("^altero o campo \"([^\"]*)\" deixando ele em branco, depois aciono o botao Alterar$")
	public void deveAlterarValorCampo(String campo) {
		this.agenda.limparCampos(campo);
		;
		this.agenda.clicarBotaoAlterar();

	}

	@E("^altero o campo \"([^\"]*)\" para Hora anterior a atual, depois aciono o botao Alterar$")
	public void alterarValorCampoDataHoraAnteriorAtual(String campo) {
		this.agenda.preencherCampoValor(campo, GeracaoData.retornaHoraAntesAtual());
		this.agenda.clicarBotaoAlterar();

	}

	@E("^altero o campo \"([^\"]*)\" para \"([^\"]*)\" depois clico em Alterar$")
	public void alterarValorCampoHoraEntrega(String campo, String valor) {
		this.agenda.preencherCampoValor(campo, valor);
		this.agenda.clicarBotaoAlterar();

	}

	@Entao("^o campo \"([^\"]*)\" deve ser preenchido com o valor da Agenda$")
	public void validarCriacaoAgenda(String campo) {
		Assert.assertFalse("Campo Agenda não está vazio", this.agenda.validaCampoVazio(campo));

	}

	@Entao("^deve ser exibido a mensagem \"(.*)\"$")
	public void valdiarMensagemExibida(String msg) {
		Assert.assertTrue(this.agenda.retornaMensagemExibida().contains(msg));

	}

	@Entao("^deve ser exibido a mensagem no Alert \"([^\"]*)\"$")
	public void validarExibicaoMensagemAlert(String mmsg) {
		Assert.assertTrue("Mensagem não Encontrada", this.agenda.retornaMensagemAlert().contains(mmsg));
	}

	@Entao("^deve ser exibido a seguinte mensagem \"([^\"]*)\"$")
	public void deveSerExibidoASeguinteMensagem(String mensagem) {
		mensagem = mensagem.replace("[HORA]", this.agenda.retornaValorCampo("Hora Prev Entrada").split(":")[0]);
		Assert.assertTrue(this.agenda.retornaMensagemExibida().contains(mensagem));
	}

	@Entao("^o campo \"([^\"]*)\" deve esta vazio$")
	public void validarCampoVazio(String campo) {
		Assert.assertTrue("Campo " + campo + "Não Está Vazio", this.agenda.validaCampoVazio(campo));

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

	@E("^preencho somente os campos de Datas e Hora$")
	public void preencherCampoDataHora(){
		this.agenda.preencherCampoValor("Data Agenda", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Data Prev Entrada", GeracaoData.retornaDataAtual());
		this.agenda.preencherCampoValor("Hora Prev Entrada", GeracaoData.retornaProxHora());
	}

	@Quando("^clico no botao consultar$")
	public void acionarBotaoConsultar(){
		this.agenda.clicarBotaoConsultar();
		
	}


}
