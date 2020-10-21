package web.steps.SNF;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNF_AdicionarNaturezaOperacaoFuncionalidade;
import web.funcionalidade.SNF.SNF_InscricaoSubstitutoFuncionalidade;
import web.funcionalidade.SNF.SNF_MensagemLegalFuncionalidade;

public class SNFMensagemLegalStep {

	private SNF_MensagemLegalFuncionalidade mensag;
	private SNF_AdicionarNaturezaOperacaoFuncionalidade and;
	private SNF_InscricaoSubstitutoFuncionalidade insc;

	public SNFMensagemLegalStep() {
		this.mensag = new SNF_MensagemLegalFuncionalidade();
		this.and = new SNF_AdicionarNaturezaOperacaoFuncionalidade();
		this.insc = new SNF_InscricaoSubstitutoFuncionalidade();

	}

	@Quando("^preencho todos os campos Obrigatorios e clico em Salvar$")
	public void preencherCamposObrigatorios() {
		this.and.preencherCampoCodNaturezaOperacao(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.and.preencherTodoCamposMenosCodNatOperacao();
		this.and.clicarBotaoSalvar();
	}

	@Quando("^seleciono o valor \"([^\"]*)\" no campo \"([^\"]*)\" estilo selecao e clico em pesquisar da aba \"([^\"]*)\"$")
	public void selecionarValorCampoTelaMensagemLegal(String valor, String campo, String aba) {
		this.mensag.selecionarValorCampoSelecao(campo, valor);
		this.mensag.clicarBotaoPesquisaAbas(aba);
		this.mensag.clicarBotaAdicionarAbas(aba);
	}

	@Entao("^deve ser exibido a seguinte mensagem \"([^\"]*)\"$")
	public void validarMensagemSucessoExibida(String msg) {
		Assert.assertEquals(msg, this.mensag.retornaMensagemAdicionarRegistro());
	}

	@Entao("^deve ser apresentado os campos \"([^\"]*)\" e \"([^\"]*)\" vazios$")
	public void validarCamposVazios(String campo1, String campo2) {
		Assert.assertTrue("Campo não está vazio" + campo1, this.mensag.validarCamposVazios(campo1));
		Assert.assertTrue("Campo não está vazio" + campo2, this.mensag.validarCamposVazios(campo2));
	}

	@Entao("^deve ser exibida a tela Historico com o valor \"([^\"]*)\" no campo Usuario$")
	public void validarTelaHistorico(String valor) {
			Assert.assertEquals(this.mensag.pegarValorUnicoTelaHistoricol("Usuário"),valor);
	}


	@Entao("^deve ser exibida a tela Natureza de Operacao$")
	public void vTelaNaturezaOperacao() {
		Assert.assertTrue("Campo não Habilitado",
				this.and.validaHablitadoDesabilitadoCampoSuperio("Codigo de Natureza de Operacao"));
		Assert.assertTrue("Campo não Habilitado",
				this.and.validaHablitadoDesabilitadoCampoSuperio("Situacao da natureza"));
		Assert.assertTrue("Campo não Habilitado", this.and.validaHablitadoDesabilitadoCampoSuperio("Tipo de Operacao"));
		Assert.assertTrue("Campo não Habilitado",
				this.and.validaHablitadoDesabilitadoCampoSuperio("Descricao de Natureza de Operacao"));
		Assert.assertTrue("Campo não Habilitado", this.and.validaHablitadoDesabilitadoCampoSuperio("Agrupamento"));
	}

	@Entao("^o valor apresentado no campo Visualização por Local na data de referência deve ser igual a data atual$")
	public void validarInformacaoDataReferencia() {
		this.mensag.moverParaBtnRetornar();
		Assert.assertEquals(GeracaoData.retornaDataAtual().toString(),
				this.mensag.retornaValorCampo("Visualizar Por Local de Referencia"));
		Assert.assertTrue("Campo não Habilitado",
				this.mensag.validarCampoMensagemHabilitado("Visualizar Por Local de Referencia"));
	}

	@Entao("^deve ser exibido o campo Natureza de operacao nao Editavel$")
	public void validarCampoNaoEditavel() {
		Assert.assertTrue("Campo Natureza de Operação não está somente editavel",
				this.mensag.validarCampoNaturezaOperacao());
	}

	@Entao("^deve ser exibido no campo Visualização por Local na data de referência a mensagem selecionada da aba \"([^\"]*)\"$")
	public void validarMensagemExibidaVisualizarLocalReferenciav(String aba) {
		Assert.assertTrue("Não contem a Mensagem Legal selecionada",
				this.mensag.retonarTextoVisualizarLocalReferencia("Mensagem Legal",VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL()));
	}

	@Entao("^deve ser apresentado o campo \"([^\"]*)\" disponivel somente para leitura$")
	public void validarCampoSomenteLeitura(String campo) {
		Assert.assertTrue("Campo " + campo + "não está disponivel somente para leitura",
				this.mensag.validarCampoSomenteLeitura(campo));

	}

	@Quando("^faço o preenchimento de todos os valores menos os campos de Data$")
	public void PreenchimentoTodosValoresMenosData() {
		this.mensag.selecionarMensagemLegal();
	}

	@Quando("^salvo o valor do campo Usuario$")
	public void deveSalvarValorCampoUsuario() {
		this.mensag.salvarValorCampoUsuarioNaturezaOperacao();

	}

	@Quando("^clico no botao Historico da aba \"([^\"]*)\"$")
	public void clicaAbaEstadualHistorico(String aba) {
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.HistoricoAba(aba);
	}

	@Quando("^faco a selecao da Mensagem Legal da aba \"([^\"]*)\"$")
	public void selecionarMesagemLegal(String aba) {
		this.mensag.selecionarMensagemLegal(aba, "1");
	}

	@Quando("^digito a data de \"([^\"]*)\" menor que a Data \"([^\"]*)\"$")
	public void digitoADataDeMenorQueAData(String dataInicio, String dataFim) {
		this.mensag.selecionarValorCampoSelecao(dataInicio, GeracaoData.retornaDataAtualMenosMeses(1));
		this.mensag.selecionarValorCampoSelecao(dataFim, GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();
	}

	@Quando("^faco o preenchimento completo e clico em Salvar$")
	public void preenchimentoMenagemLegalCompletoClicoSalvar() {
		this.and.preencherCampoCodNaturezaOperacao(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.and.preencherTodoCamposMenosCodNatOperacao();
		this.mensag.clicarBotaoSalvar();
	}

	@Quando("^seleciono uma mensagem Legal para a aba Nacional$")
	public void selecionarMensagemLegalAba() {
		this.mensag.selecionarMensagemAbaNacional();
	}

	@Quando("^seleciono uma nova Mensagem Legal para a Aba Nacional$")
	public void selecionarMaisUmaMensgaemLegal() {
		this.mensag.selecionarNovaMensagemAbaNacional();
	}

	@E("^preencho os campos \"([^\"]*)\", \"([^\"]*)\" com os valores \"([^\"]*)\", \"([^\"]*)\" e clico em  pesquisar$")
	public void preencherSomenteCampos(String campo1, String campo2, String valor1, String valor2) {
		this.mensag.clicarBotaoPesquisaAbas("Nacional");
		this.mensag.clicarBotaAdicionarAbas("Nacional");
		this.mensag.selecionarValorCampoSelecao(campo1, valor1);
		this.mensag.selecionarValorCampoSelecao(campo2, valor2);
		this.mensag.clicarBotaoPesquisarTelaAdicionar();

	}

	@E("^seleciono o valor \"([^\"]*)\" no campo \"([^\"]*)\" na tela de Mensagem legal$")
	public void selecionarValorMensagemLegal(String valor, String campo) {
		this.mensag.selecionarValorCampoSelecao(campo, valor);

	}

	@Quando("^clico no botao Mensagem Legal no final da pagina$")
	public void clicaBotaMensagemLegalFinalPagina() {
		this.and.clicarBotaoMensagemLegalSemLoad();
	}

	@Entao("^deve ser exibido na coluna \"([^\"]*)\" do Grid a mensagem selecionada$")
	public void deveSerExibidoNaColunaDoGridAMensagemSelecionada(String coluna) {
		Assert.assertTrue("Não contem a mensagem", this.mensag.retornaValorGridSelecionaMensagemLegal(coluna)
				.contains(VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL()));
	}

	@Quando("^clico no botao Editar da aba Nacional$")
	public void clicarEditarGridResultadoDaAbaNacional() {
		this.mensag.clicarBotaoEditarGridResultado();
	}

	@Entao("^deve ser exibido a Tela \"([^\"]*)\" com o campo \"([^\"]*)\" preenchido$")
	public void validarTelaEditarRegistro(String titulo, String campo) {
		Assert.assertEquals(titulo, this.mensag.retornaTituloPaginaEditarRegistro());
		Assert.assertTrue("Campo " + campo + "está vazio", this.mensag.validarCamposVazios(campo));
	}

	@E("^clico no campo \"([^\"]*)\" da aba \"([^\"]*)\"$")
	public void clicarCampoAba(String campo, String aba) {
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.clicarCampoSelecaoSemLoading(campo);
	}

	@Entao("^deve ser exibido uma lista com o Estados Federativos do campo \"([^\"]*)\"$")
	public void valdiarExibicaoListaEstadosFederativosdoCampo(String aba) {
		Assert.assertEquals(this.insc.listaEstadosFederativos(), this.mensag.retorlistaCamposSelecao(aba));

	}

	@Entao("^deve ser exibido as opcoes \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void deveSerExibidoAsOpoesNoCampo(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6, String valor7,
			String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		lista.add(valor4);
		lista.add(valor5);
		lista.add(valor6);
		lista.add(valor7);
		Assert.assertEquals(this.mensag.retorlistaCamposSelecao(campo), lista);

	}

	@Entao("^nao deve ser exibido o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarNaoExibicaoValor(String valor, String campo) {
		Assert.assertFalse("Valor FN está sendo exibido", this.mensag.retorlistaCamposSelecao(campo).contains(valor));

	}

	@E("^seleciono uma mensagem Legal para a aba \"([^\"]*)\" com o valor \"([^\"]*)\"$")
	public void selecionarMensagemLegalComValor(String aba, String valor) {
		this.mensag.selecionarMensagemLegal(aba, valor);

	}

	@E("^clico na aba \"([^\"]*)\"$")
	public void clicarAba(String aba) {
		this.mensag.clicarCampoSelecao(aba);
	}

	@Entao("^deve ser exibido as duas mensagens selecionada no campo Visualização por local na data de referência$")
	public void valdiarExibicaoMensagensLegaisSeleciondas() {
		System.out.println(VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL());
		System.out.println(VariaveisEstaticas.getDESCRICAO_NOVA_MENSAGEM_LEGAL());
		Assert.assertTrue("Não contem a Mensagem Legal selecionada",
				this.mensag.retonarTextoVisualizarLocalReferencia("Mensagem Legal",VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL()));
		Assert.assertTrue("Não contem a Mensagem Legal selecionada", this.mensag
				.retonarTextoVisualizarLocalReferencia("Mensagem Legal",VariaveisEstaticas.getDESCRICAO_NOVA_MENSAGEM_LEGAL()));
	}

	@E("^Clico no botao \\+ da aba \"([^\"]*)\" e clico no campo \"([^\"]*)\"$")
	public void clicarBotaoMaisClicarCampoTipo(String aba, String campo) {
		this.mensag.clicarBotaAdicionarAbas(aba);
		this.mensag.clicarCampoSelecaoSemLoading(campo);
	}

	@Entao("^deve ser exibido asa opcoes \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarListaElementos(String valor1, String valor2, String valor3, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertEquals(this.mensag.retorlistaCamposSelecao(campo), lista);

	}

	@E("^seleciono os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" nos campos \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void SelecionarValoes(String valor1, String valor2, String valor3, String campo1, String campo2,
			String campo3) {
		this.mensag.selecionarValorCampoSelecao(campo1, valor1);
		this.mensag.selecionarValorCampoSelecao(campo2, valor2);
		this.mensag.selecionarValorCampoSelecao(campo3, valor3);

	}

	@E("^clico em pesquisar na aba \"([^\"]*)\"$")
	public void clicarPesquisarAba(String aba) {
		this.mensag.clicarBotaoPesquisaAbas(aba);
	}

	@E("^clico no botao \\+ da aba \"([^\"]*)\"$")
	public void clicarBotaoAdicionarAba(String aba) {
		this.mensag.clicarBotaAdicionarAbas(aba);
	}

	@E("^clico em pesquisar da tela Adicionar Resgistro da aba \"([^\"]*)\"$")
	public void clicarBotaoPesquisarAdicionaResgistro(String aba) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padrão");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distrobuição");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();

	}

	@E("^digito o valor \"([^\"]*)\" invalido no campo \"([^\"]*)\"$")
	public void digitarValorInvalido(String valor, String campo) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba Estadual");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao(campo, valor);
		this.mensag.selecionarValorCampoSelecao("Inicio da Vigencia", valor);
	}

	@Entao("^deve ser apresentado o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarValorExibidoCampoSelecao(String valor, String campo) {
		Assert.assertEquals(this.mensag.retornaValorCampo(campo), valor);

	}

	@E("^digito no campo \"([^\"]*)\" o valor menor que o campo \"([^\"]*)\"$")
	public void dataFimVigenciarMenorQueDataInicioVigencia(String inicioVigencia, String fimVigencia) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba Estadual");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padrão");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distrobuição");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao(inicioVigencia, GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao(fimVigencia, GeracaoData.retornaDataAtualMenosMeses(1));
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();

	}

	@E("^clico no bota Historico da aba \"([^\"]*)\"$")
	public void clicoNoBotaHistoricoDaAba(String aba) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padrão");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distrobuição");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();
		this.mensag.salvarValorCampoUsuario();
	    this.mensag.clicarBotaoBotaoHistoricoEstadual();
	}

	@Entao("^o campo \"([^\"]*)\" deve esta desabilitado para Edicao e deve exibir a mensagem legal selecionda$")
	public void ValidarExibicaoMensagemCampoDesabilitado(String campo) {
		Assert.assertTrue(
				this.mensag.retonarTextoVisualizarLocalReferencia("Mensagem Legal",VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL()));
		Assert.assertTrue("Campo " + campo + " não está somente para leitura",
				this.mensag.validarCampoMensagemHabilitado(campo));

	}

	@E("^seleciono uma mensagem Legal para a aba \"([^\"]*)\" com o valor \"([^\"]*)\" para o campo \"([^\"]*)\"$")
	public void selecionarAbaSelecionarValorParaCampo(String aba, String valor, String campo) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba " + aba);
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", valor);
		this.mensag.clicarBotaoPesquisaAbas(aba);
		this.mensag.clicarBotaAdicionarAbas(aba);
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padrão");
		this.mensag.selecionarValorCampoSelecao(campo, valor);
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();
	}

	@Entao("^deve ser exido na coluna \"([^\"]*)\" o valor \"([^\"]*)\" no Grid de Resultados$")
	public void deveSerExidoNaColunaOValorNoGridDeResultados(String coluna, String valor) {
		Assert.assertTrue(this.mensag.retonarTextoVisualizarLocalReferencia(coluna,valor));
	}

	@E("^digito o valor \"([^\"]*)\" no campo \"([^\"]*)\" da pesquisa de Mensagem legal$")
	public void digitarValorPesquisaMemsagemLegal(String valor, String campo) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba Estadual");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distrobuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distrobuição");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.selecionarValorCampoSelecao(campo, valor);
		this.mensag.clicarBotaoPesquisarSelecionarMensagem();
	}

	@Entao("^o campo \"([^\"]*)\" deve esta vazio$")
	public void validarCampoVazio(String campo) {
		Assert.assertTrue("Campo não está vazio", this.mensag.validarCamposVazios(campo));

	}

	@Entao("^deve conter na coluna \"([^\"]*)\" o valor \"([^\"]*)\" do Grid de Resultado da Tela Selecionar mensagem legal$")
	public void validarColunaGridResultadoAdiocaoMensagemLegal(String campo, String valor) {
		Assert.assertEquals(this.mensag.retornaValorGridSelecionaSelecionarMensagem(campo), valor);
	}

	@E("^clico no botao \"([^\"]*)\" sem preencher nehum campo$")
	public void acessarPaginaSelecionarMensagensLegais(String botao) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba Estadual");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Estado", "Acre");
		this.mensag.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distrobuição");
		this.mensag.clicarBotaoPesquisaAbas("Estadual");
		this.mensag.clicarBotaAdicionarAbas("Estadual");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distrobuição");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.clicarCampoSelecaoSemLoading(botao);
	}

	@Entao("^deve ser preenchido o Grid de Resultados com Mensagens já cadastradas$")
	public void validarRetornoGridResultadoSelecionarMensagemLegal() {
			Assert.assertFalse("Grid de Resultado Selecionar Mensagem Legal está Vazio",
				this.mensag.gridResultadoNaoVazioSelecionarMensagem());

	}

	@Entao("^deve ser apresentado a tela de Adicionar Registro com o campo \"([^\"]*)\" vazio e desabilitado para edicao$")
	public void validarTelaAdicionarResgistroCampoDesabilitadoVazio(String campo) {
		Assert.assertTrue("Campo está Habilitado para Edição", this.mensag.validarCampoSomenteLeitura(campo));
		Assert.assertTrue("Campo não está Vazio", this.mensag.validarCamposVazios(campo));

	}

	@E("^clico na aba \"([^\"]*)\" e no campo \"([^\"]*)\"$")
	public void clicarAbaClicarCampo(String aba, String campo) {
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.clicarCampoSelecaoSemLoading(campo);

	}

	@Entao("^deve ser exibida uma lista com os itens \"([^\"]*)\" e \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarListaCamposAbaFilial(String valor1, String valor2, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		Assert.assertEquals(this.mensag.retorlistaCamposSelecao(campo), lista);
	}

	@Entao("^deve ser exibida a mensagem \"([^\"]*)\" na aba Filial$")
	public void validarMensagemSucessoAbaFialial(String msg) {
		Assert.assertEquals(this.mensag.restornaMensagemSucessoAbaFilial(), msg);
	}

	@E("^devo clicar no botao Mensagem Legal$")
	public void devoClicarBotaoMensagemLegalComLoad() {
		this.and.clicarBotaoMensagemLegal();

	}

	@E("^clico no botao Editar do Grid de Resultado Aba Filial$")
	public void clicarBotaoEditarGridResultadoAbafilial() {
		this.mensag.selecionarMensagemLegal("Filial", "1");
		this.mensag.clicarBotaoEditarGridResultado();
	}

	@E("^clico na aba \"([^\"]*)\" e no campo \"([^\"]*)\" da tela de Adicionar Mensagem$")
	public void clicarAbaClicarCampoTelaAdicionarMensagem(String aba, String campo) {
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.clicarCampoSelecaoSemLoading(campo);

	}

	@Entao("^deve ser exibida uma lista com os itens \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarExibicaoOpcoesTelaAdicionarRegistro(String valor1, String valor2, String valor3, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertEquals(this.mensag.retorlistaCamposSelecao(campo), lista);
	}

	@E("^clico no botao Pesquisar da tela de Adicionar Resgitro$")
	public void clicarBotaoPesquisarTelaAdicionarRegistro() {
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
	}

	@E("^digito no campo \"([^\"]*)\" a data atual e no campo \"([^\"]*)\" uma data inferio a de Inicio da Vigencia$")
	public void validarCampoFimDaVigenciaComDataInferiorInicioVigencia(String inicio, String fim) {
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao(inicio, GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao(fim, GeracaoData.retornaDataAtualMenosMeses(1));
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();

	}

	@E("^digito no campo \"([^\"]*)\" valor inferior a data atual e no campo \"([^\"]*)\" uma data Superior a de Data Atual$")
	public void validarCampoInicioVigenciaComDataInferiorAtual(String inicio, String fim) {
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao(inicio, GeracaoData.retornaDataAtualMenosMeses(1));
		this.mensag.selecionarValorCampoSelecao(fim, GeracaoData.retornaDataAtualMaisMeses(1));
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();
	}

	@E("^altero a data do campo \"([^\"]*)\" para uma data futura e clico em Salvar$")
	public void validarAltecaoDeMensagemLegal(String fim) throws Throwable {
		this.mensag.selecionarMensagemLegal("Filial", "1");
		this.mensag.clicarBotaoEditarGridResultado();
		this.mensag.selecionarValorCampoSelecao(fim, GeracaoData.retornaDataAtualMaisMeses(2));
		this.mensag.clicarBotaoSalvarAdicionarRegistro();

	}

	@E("^clico no botao Historico da Aba \"([^\"]*)\"$")
	public void clicarBotaoHistoricoAbaFilial(String aba){
		this.mensag.clicarCampoSelecao(aba);
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.adicionarMensagemAbaEstadual();
		this.mensag.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.mensag.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.clicarBotaoSalvarAdicionarRegistro();
		this.mensag.clicarCampoSelecao("Local Mensagem Filial");
		this.mensag.salvarValorCampoUsuario();
		this.mensag.HistoricoAba(aba);
		
	}

	@Entao("^o campo \"([^\"]*)\" deve está disponivel somente para leitura$")
	public void validarCampoDisponivelParaLeitura(String campo){
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.HistoricoAba("Aba Filial");
		Assert.assertTrue("Campo " + campo + " não está disponivel somente para leitura", this.mensag.validarCampoMensagemHabilitado(campo));
		
	}

	@Entao("^o campo \"([^\"]*)\" deve ser igual a data atual e habilitado para edicao$")
	public void validarCampoDataHabilitadoParaEdicao(String campo) throws Throwable {
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.HistoricoAba("Aba Filial");
		Assert.assertEquals(this.mensag.retornaValorCampo(campo), GeracaoData.retornaDataAtual());
	}

	@Entao("^o campo \"([^\"]*)\" deve ser exibido somente para leitura$")
	public void validarCampoUsuarioDisponivelSomenteLeitura(String campo){
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.HistoricoAba("Aba Filial");
		Assert.assertTrue("Campo " + campo + "Não está disponivel somente para leitura", this.mensag.validarCampoSomenteLeitura(campo));
	}

	@E("^clico no botao \"([^\"]*)\" sem preencher nehum campo da aba Filial$")
	public void validarBotaoCancelarAbaFilial(String botao){
		this.and.clicarBotaoMensagemLegal();
		this.mensag.clicarCampoSelecao("Aba Filial");
		this.mensag.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisaAbas("Filial");
		this.mensag.clicarBotaAdicionarAbas("Filial");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados adicionais");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Dinãmica");
		this.mensag.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensag.clicarBotaoPesquisarTelaAdicionar();
		this.mensag.clicarCampoSelecaoSemLoading(botao);
	}

}
