package web.steps.SNF;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;

import commons.funcionalidade.ComponentesFuncionalidade;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNFNaturezaOperacaoDadosComplementaresFuncionalidade;
import web.funcionalidade.SNF.SNF_AdicionarNaturezaOperacaoFuncionalidade;

public class SNFNaturezaOperacaoDadosComplementaresStep {

	private SNFNaturezaOperacaoDadosComplementaresFuncionalidade nat;
	private ComponentesFuncionalidade comp;
	private waitLoading load;
	private SNF_AdicionarNaturezaOperacaoFuncionalidade adn;

	public SNFNaturezaOperacaoDadosComplementaresStep() {
		this.nat = new SNFNaturezaOperacaoDadosComplementaresFuncionalidade();
		this.comp = new ComponentesFuncionalidade();
		this.load = new waitLoading();
		this.adn = new SNF_AdicionarNaturezaOperacaoFuncionalidade();
	}

	@Entao("^digito os valores \"([^\"]*)\" no campo Codigo da Natureza$")
	public void preencherCampoCodigoNatureza(String valor) {
		this.load.loading();
		this.nat.preecherCampoCodigoNatureza(valor);
		this.comp.clicarPesquisar();
		this.load.loading();
	}

	@Entao("^deve ser exido a mensagem \"([^\"]*)\" no grid de Resultados$")
	public void verificarGridResultado(String valor) {
		Assert.assertEquals(valor, this.nat.retornaValorGridResultado());
	}

	@Entao("^deve ser apresentado somente as opcoes \"([^\"]*)\" e \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void verificarDuasOpcoesSelect(String valor1, String valor2, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add("Selecione...");
		lista.add(valor1);
		lista.add(valor2);
		Assert.assertTrue("Não está sendo paresentado os valores corretos",
				this.nat.verificarListaXCampo(lista, campo));
	}

	@Entao("^no campo \"([^\"]*)\" do Grid de Resultado deve conter o valor \"([^\"]*)\"$")
	public void validarRetornoGridResultado(String campo, String valor) {
		this.nat.pegarValorUnicoGridResultado(campo);
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				VariaveisEstaticas.getVALOR_GRID().contains(valor));
	}

	@Entao("^todos os campos devem voltar para o estado inicial$")
	public void verificarValorPadrao() {
		Assert.assertTrue(this.nat.retornaValorCampoSelecao("Agrupamento", "Selecione..."));
		Assert.assertTrue(this.nat.retornaValorCampoSelecao("Natureza de Operacao", "Selecione..."));
		Assert.assertTrue(this.nat.retornaValorCampoSelecao("Tipo de Operacao", "Selecione..."));
		Assert.assertTrue("Campo não está Vazio", this.nat.campoCodigoNaturezaVazio());
		Assert.assertTrue(this.nat.retornaValorCampoSelecao("Situacao da Natureza", "Selecione..."));
	}

	@Entao("^deve retornar as Natureza de operacao cadastradas$")
	public void gridResultadosComRetornoNaturezaOperacao() {
		Assert.assertFalse("Grid de Resultados Vazio", this.nat.gridResultadoNaoVazio());

	}

	@Entao("^o campo \"([^\"]*)\" deve conter o valor \"([^\"]*)\" e o campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
	public void validarValoresGridResultado(String campo1, String valor1, String campo2, String valor2) {
		this.load.loading();
		this.nat.pegarValorUnicoGridResultado(campo2);
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo1, valor1));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				VariaveisEstaticas.getVALOR_GRID().contains(valor2));
	}

	@Entao("^deve ser apresentado a tela de Natureza de Operacao com o titulo \"([^\"]*)\"$")
	public void verificarTelaNaturezaOperacao(String tela) {
		Assert.assertEquals(tela, this.nat.retornaTextoTelaNaturezaOperacao());
	}

	@Entao("^o campo \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\"$")
	public void resultadoPesquisaTresCampos(String campo1, String valor1, String campo2, String valor2, String campo3,
			String valor3) {
		this.nat.pegarValorUnicoGridResultado(campo3);
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo1, valor1));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo2, valor2));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				VariaveisEstaticas.getVALOR_GRID().contains(valor3));
	}

	@Entao("^o campo \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\"$")
	public void validarRetornoPesquisa(String campo1, String valor1, String campo2, String valor2, String campo3,
			String valor3, String campo4, String valor4) {
		this.nat.pegarValorUnicoGridResultado(campo3);
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo1, valor1));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo2, valor2));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				VariaveisEstaticas.getVALOR_GRID().contains(valor3));
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado(campo4, valor4));

	}

	@Entao("^será apreentado a tela de Criação de Natureza de Operação$")
	public void verificarTelaCriacaoNatOper() {
		this.load.loading();
		Assert.assertTrue("Campo não está Vazio", this.adn.getCodNaturezaOperazaVazio());
	}

	@Entao("^deve ser apresentado somente as opcoes \"([^\"]*)\" e \"([^\"]*)\" no campo Situacao da Natureza$")
	public void verificarOpcoesSituacaoNatureza(String opcao1, String opcao2) {
		List<String> lista = new ArrayList<String>();
		lista.add(opcao1);
		lista.add(opcao2);
		Assert.assertTrue("Lista de valores não está correta", this.adn.verificaValoresSitucaoNatureza(lista));
	}

	@Entao("^deve ser apresentado somente as opcoes \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void verificarTresOpcoes(String opcao1, String opcao2, String opcao3) {
		List<String> lista = new ArrayList<String>();
		lista.add(opcao1);
		lista.add(opcao2);
		lista.add(opcao3);
		Assert.assertTrue("Lista de valores não está correta", this.adn.verificaValoresTipoOperacao(lista));
	}

	@Entao("^o campo Descricao Natureza de operacao na NF deve estar desabilitado para edicao$")
	public void verificarDescNAturezaDesabilitado() {
		Assert.assertFalse("Campo não está Desabilitado", this.adn.campoDescricaoNatureza());
	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\"$")
	public void verificarMensagem(String msg) {
		Assert.assertEquals(msg, this.adn.mensagemErro());
	}

	@Entao("^deve ser apresentado o valor \"([^\"]*)\" digitado$")
	public void verificarCampoValorDigitado(String valor) {
		Assert.assertEquals(valor, this.adn.getValorDescNaturezaOperacao());
	}

	@Entao("^deve ser apresentado somente os valores \"([^\"]*)\" e \"([^\"]*)\"$")
	public void verificarSelectObterCFOP(String valor1, String valor2) {
		List<String> lista = new ArrayList<String>();
		lista.add("Selecione...");
		lista.add(valor1);
		lista.add(valor2);
		Assert.assertTrue("Não está sendo paresentado os valores corretos", this.adn.verificaValoresObtemCFOP(lista));
	}

	@Entao("^o campo Descricao Natureza de operacao na NF deve esta habilitado para edicao$")
	public void verificarDescNatHabilitado() {
		Assert.assertTrue("Campo não está Desabilitado", this.adn.campoDescricaoNatureza());
	}

	@Entao("^o campo \"([^\"]*)\" na NF deve estar desabilitado para edicao$")
	public void verificarCampoDesabilitadoEdicao(String campo) {
		Assert.assertFalse("Campo " + campo + " está desabilitado para Edição",
				this.adn.validarCamposDesabilitadoHabilitados(campo));
	}

	@Entao("^o campo \"([^\"]*)\" na NF deve estar habilitado para edicao e como valor utilizado no cadastro$")
	public void verificarCampoHabilitadoEdicao(String elem) {
		Assert.assertTrue("Campo" + elem + " não está habilitado para Edição",
				this.adn.validarCamposDesabilitadoHabilitados(elem));

		Assert.assertEquals(this.adn.retornaValorCampoSelecao(elem), VariaveisEstaticas.getVALOR_GRID());
	}

	@Entao("^deve ser apresentado somente os valores \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void verificarCampoSelectTresOpcoes(String valor1, String valor2, String valor3, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertTrue("Valores apresentados não estão corretos", this.adn.verificaValoresListaCampo(lista, campo));
	}

	@Entao("^deve ser exibida a mensagem \"([^\"]*)\"$")
	public void verificarMensagemOr(String msg) {
		Assert.assertEquals(this.adn.retornaMensagem(), msg);
	}

	@Entao("^deve ser exibido o registro na secao Formato de origem e destino X tipo de nota fiscal$")
	public void verificarRegistroOrigemDestinoXTipoNF() {

		Assert.assertTrue("Elementros Não encontrados",
				this.adn.validaRegistrosCadastrados(this.adn.retornaListaMaps(), VariaveisEstaticas.getLISTA()));
	}

	@Entao("^o campo \"([^\"]*)\" deve exibir \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void verificarSelectCampoAddNat(String campo, String valor1, String valor2, String valor3) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertTrue("Existe elementos não visiveis", this.adn.verificaValoresListaCampo(lista, campo));
	}

	@Entao("^o registro deve ser excluido com sucesso$")
	public void verificarExclusaoRegistro() {
		MatcherAssert.assertThat(this.adn.retornaListaMaps(), Matchers.not(VariaveisEstaticas.getLISTA()));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar habilitado para edicao e como valor utilizado no cadastro$")
	public void verificarCampoHabilitadoEValor(String elem) {
		Assert.assertTrue("Campo" + elem + " está habilitado para Edição",
				this.adn.validarCamposDesabilitadoHabilitados(elem));

		Assert.assertEquals(this.adn.retornaValorCampoInput(elem), VariaveisEstaticas.getVALOR_GRID());
	}

	@Quando("^clico no box \"([^\"]*)\"$")
	public void acionarSelect(String campo) {
		this.nat.clicarCampoNatOperDadosComp(campo);
		this.load.loading();
	}

	@Quando("^preencho todos os campos$")
	public void preechimentoCompletoForm() {
		this.load.loading();
		this.nat.preencherTodosOsCampos();
	}

	@Quando("^clico no botão Pesquisar sem preencher nenhum campo$")
	public void acionarBtnPesquisar() {
		this.load.loading();
		this.comp.clicarPesquisar();
		this.load.loading();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\" e \"([^\"]*)\" como Valor \"([^\"]*)\"$")
	public void preenchoCamposComValoresValidos(String campo1, String valor1, String campo2, String valor2) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo1, valor1);
		this.nat.selecionaValorCampoSelecao(campo2, valor2);
		this.comp.clicarPesquisar();
		//this.load.loading();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\" e Código da natureza como Valor \"([^\"]*)\"$")
	public void preencherCamposValoresCorretos(String campo1, String valor1, String valor2) {
		this.nat.selecionaValorCampoSelecao(campo1, valor1);
		this.nat.preecherCampoCodigoNatureza(valor2);
		this.comp.clicarPesquisar();
		this.load.loading();
	}

	@Quando("^preencho \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" como \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\"$")
	public void preecherCampos(String campo1, String valor1, String campo2, String valor2, String campo3,
			String valor3) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo1, valor1);
		this.nat.selecionaValorCampoSelecao(campo2, valor2);
		this.nat.selecionaValorCampoSelecao(campo3, valor3);
	}

	@Quando("^preencho \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" como \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" com \"([^\"]*)\"$")
	public void preenchoCamposQuatroParamentros(String campo1, String valor1, String campo2, String valor2,
			String campo3, String valor3, String campo4, String valor4) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo1, valor1);
		this.nat.selecionaValorCampoSelecao(campo2, valor2);
		this.nat.selecionaValorCampoSelecao(campo3, valor3);
		this.nat.selecionaValorCampoSelecao(campo4, valor4);

	}

	@Quando("^clico no botao Mais$")
	public void acionarBtnMais() {
		this.nat.clicarBotaoMais();
	}

	@Quando("^preencho o formulario com dados já cadastrados$")
	public void preenchimentoFormularioJaCadastrados() {
		// this.load.loading();
		this.adn.preencherFormularioDadosCadastrados();
	}

	@Quando("^preencho o formulario somente com o Tipo de Nota ja cadastrado$")
	public void preencherFormularioTipoDeNotaJaCadastrado() {
		// this.load.loading();
		this.adn.preencherFormularioCadastradosTipoNota();

	}

	@Quando("^clico no botão Remover$")
	public void acionarBtnRemover() {
		// this.load.loading();
		this.adn.excluirRegistro();
	}

	@Quando("^clico no campo \"([^\"]*)\"$")
	public void acionarCampoParam(String campo) {
		// this.load.loading();
		this.adn.clicarCamposSelecao(campo);
	}

	@E("^clico no botão Limpar$")
	public void acionarBtnLimpar() {
		this.comp.clicarLimpar();
	}

	@E("^clico no botao Editar$")
	public void acionarBotaoParam() {
		this.nat.clicaBotaEditarGridResultado();
	}

	@E("^clico no botão Pesquisar$")
	public void acionoBtnPesquisar() {
		this.comp.clicarPesquisar();
	}

	@E("^preencho o campo Codigo da Natureza de Operacao com o valor \"([^\"]*)\"$")
	public void preenchimento(String valor) {
		this.load.loading();
		this.adn.preencherCampoCodNaturezaOperacao(valor);
	}

	@E("^preencho o restantes dos campos obrigatorios e clico em Salvar$")
	public void preencherCamposClicarBotaoSalvar() {
		this.adn.preencherTodoCamposMenosCodNatOperacao();
		this.adn.clicarBotaoSalvar();
	}

	@E("^clico no campo de Selecao \"([^\"]*)\"$")
	public void acionaCampoSelect(String elem) {
		this.load.loading();
		this.adn.clicarCamposSelecao(elem);
	}

	@E("^seleciono a opcao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void preenchimentoSelectValorCampo(String valor, String elem) {
		this.load.loading();
		this.adn.preencherCampoSelecao(elem, valor);
	}


	@Quando("^clico em pesquisar depois Editar$")
	public void acionarPesquisarEEditar() {
		this.load.loading();
		this.comp.clicarPesquisar();
		this.nat.clicaBotaEditarGridResultado();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\" na tela d Pesquisa$")
	public void preencherCamposTelaPesquisa(String campo, String valor) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo, valor);
		this.comp.clicarPesquisar();
		this.load.loading();
	}

	@E("^salvo o valor da coluna \"([^\"]*)\"$")
	public void guardarValorColuna(String coluna) {
		this.nat.pegarValorUnicoGridResultado(coluna);
	}

	@Entao("^Todos os campos da secão Agrupamento da Natura de Operação deverem está preenchidos e desabilitados$")
	public void verificarFormularioCompletoAgrupNatOper() {
		Assert.assertTrue("Campo Codigo ID está vazio", this.adn.retornarCampoNaoVazio("Codigo ID"));
		Assert.assertTrue("Campo Codigo ID não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Codigo ID"));
		Assert.assertTrue("Campo Indica lançamento contábil não está preenchido",
				this.adn.retornarCampoNaoVazio("Indica Lancamento Contabil"));
		Assert.assertTrue("Campo Indica lançamento contábil não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Indica Lancamento Contabil"));
		Assert.assertTrue("Campo Destaca insc. de substituto não está preenchido",
				this.adn.retornarCampoNaoVazio("Destaca Insc de Substituto"));
		Assert.assertTrue("Campo Destaca insc. de substituto não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Destaca Insc de Substituto"));
		Assert.assertTrue("Campo Permite Operacao Coligadas não está preenchido",
				this.adn.retornarCampoNaoVazio("Permite Operacao Coligadas"));
		Assert.assertTrue("Campo Permite Operacao Coligadas não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Permite Operacao Coligadas"));
		Assert.assertTrue("Campo Destino Emissao não está preenchido",
				this.adn.retornarCampoNaoVazio("Destino Emissao"));
		Assert.assertTrue("Campo Destino Emissao não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Destino Emissao"));
		Assert.assertTrue("Campo Tipo de NF Referente não está preenchido",
				this.adn.retornarCampoNaoVazio("Tipo de NF Referente"));
		Assert.assertTrue("Campo Tipo de NF Referente não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Tipo de NF Referente"));
		Assert.assertTrue("Campo Exige Conta Contabil não está preenchido",
				this.adn.retornarCampoNaoVazio("Exige Conta Contabil"));
		Assert.assertTrue("Campo Exige Conta Contabil não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Exige Conta Contabil"));
		Assert.assertTrue("Campo Permite Destino Fonecedor não está preenchido",
				this.adn.retornarCampoNaoVazio("Permite Destino Fornecedor"));
		Assert.assertTrue("Campo Permite Destino Fonecedor não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Permite Destino Fornecedor"));
		Assert.assertTrue("Campo Tipo de Geracao de Nota Fiscal não está preenchido",
				this.adn.retornarCampoNaoVazio("Tipo de Geracao de Nota Fiscal"));
		Assert.assertTrue("Campo Tipo de Geracao de Nota Fiscal não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Tipo de Geracao de Nota Fiscal"));
		Assert.assertTrue("Campo Permite Produtos Manipulados não está preenchido",
				this.adn.retornarCampoNaoVazio("Permite Produtos Manipulados"));
		Assert.assertTrue("Campo Permite Produtos Manipulados não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Permite Produtos Manipulados"));
		Assert.assertTrue("Campo Tipo de Selecao de Destino não está preenchido",
				this.adn.retornarCampoNaoVazio("Tipo de Selecao de Destino"));
		Assert.assertTrue("Campo Tipo de Selecao de Destino não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Tipo de Selecao de Destino"));
		Assert.assertTrue("Campo Exige Param Rec Remessa não está preenchido",
				this.adn.retornarCampoNaoVazio("Exige Param Rec Remessa"));
		Assert.assertTrue("Campo Exige Param Rec Remessa não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("Exige Param Rec Remessa"));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar habilitado para edição$")
	public void verificaCampoHabilitadoEdicao(String campo) {
		Assert.assertTrue("Campo : " + campo + " não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados(campo));
	}

	@Entao("^o campo \"([^\"]*)\" na NF deve estar habilitado para edicao$")
	public void verificaCampoVazioEdicao(String elem) {
		Assert.assertTrue("Campo  " + elem + " não está habilitado para edição", this.adn.retornarCampoNaoVazio(elem));
	}

	@Entao("^o campo \"([^\"]*)\" no formulario de Natureza de operacao deve estar habilitado para edicao$")
	public void validarCampoNaoVazioEditavei(String campo) {
		Assert.assertFalse("Campo  " + campo + " não está habilitado para edição",
				this.adn.retornarCampoNaoVazio(campo));
	}

	@Entao("^os campos da secao CFOP da Nota Fiscal por CST deve está habilitados para edicao$")
	public void verificarSecaoCFOP() {
		Assert.assertTrue("Campo CFOP 0 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 0"));
		Assert.assertTrue("Campo CFOP 10 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 10"));
		Assert.assertTrue("Campo CFOP 20 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 20"));
		Assert.assertTrue("Campo CFOP 30 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 30"));
		Assert.assertTrue("Campo CFOP 40 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 40"));
		Assert.assertTrue("Campo CFOP 41 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 41"));
		Assert.assertTrue("Campo CFOP 50 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 50"));
		Assert.assertTrue("Campo CFOP 51 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 51"));
		Assert.assertTrue("Campo CFOP 60 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 60"));
		Assert.assertTrue("Campo CFOP 70 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 70"));
		Assert.assertTrue("Campo CFOP 90 não está desabilitado",
				this.adn.validarCamposDesabilitadoHabilitados("CFOP 90"));
	}

	@E("^preencho todos os campos obrigatorios e clico em Salvar$")
	public void preenchimentoTodosCamposObrigatoriosNatOper() {
		this.adn.preencherCampoCodNaturezaOperacao(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.adn.preencherTodoCamposMenosCodNatOperacao();
		this.adn.clicarBotaoSalvar();
	}

	@Entao("^deve ser exibido o nome do usuario \"([^\"]*)\" criador do cadastro$")
	public void verificarUsuarioCadastro(String valor) {
		this.load.loading();
		this.adn.clicarButtonRetornar();
		this.load.loading();
		this.nat.preecherCampoCodigoNatureza(VariaveisEstaticas.getCODIGO());
		this.comp.clicarPesquisar();
		this.nat.clicaBotaEditarGridResultado();
		Assert.assertEquals(valor, this.adn.retornaUsuario());
	}

	@Entao("^deve ser exibido a Data da Ultima Atualização$")
	public void verificarDataDeAtualizacao() {
		this.load.loading();
		this.adn.clicarButtonRetornar();
		this.load.loading();
		this.nat.preecherCampoCodigoNatureza(VariaveisEstaticas.getCODIGO());
		this.comp.clicarPesquisar();
		this.nat.clicaBotaEditarGridResultado();
		Assert.assertEquals(GeracaoData.retornaDataAtual(), this.adn.retornaDataUltimaAtualizacao());
	}

	@Entao("^o botao Salvar deve esta desabilitado$")
	public void verificarBtnSalvarDesabilitado() {
		Assert.assertFalse("Botão Salvar não está desabilitado", this.adn.buttonSalvarDesabilitado());
	}

	@Entao("^deve ser apresentado os dados em nova pesquisa$")
	public void verificarGridDeResultado() {
		this.load.loading();
		this.adn.clicarButtonRetornar();
		this.load.loading();
		this.nat.preecherCampoCodigoNatureza(VariaveisEstaticas.getCODIGO());
		this.comp.clicarPesquisar();
		this.load.loading();
		Assert.assertTrue("Valor não está presente no Grid de Resultados",
				this.nat.pegarValirGridResultado("Código de Natureza", VariaveisEstaticas.getCODIGO()));
	}

	@E("^clico no botao Historico$")
	public void clicarBtnHistorico() {
		// this.load.loading();
		this.adn.clicarBotaoHistorico();
	}

	@Entao("^deve ser apresentado a tela \"([^\"]*)\"$")
	public void verificarTelaParam(String tela) {
		Assert.assertEquals(tela, this.adn.telaHistorico());
	}

	@E("^clico no botao Retornar$")
	public void clicarBtnRetornar() {
		this.adn.clicarBotaoRetornar();

	}

	@Entao("^deve ser apresentado a tela de Pesquisa de Natureza de Operacao$")
	public void verificarApresenacaoNaturezaOperacao() {
		this.load.loading();
		Assert.assertTrue("Botão Pesquisar não está habilitado nem Presente na Tela",
				this.adn.buttonPesquisarAtivado());
		Assert.assertTrue("Botão Adicionar não está habilitado nem Presente na Tela", this.adn.buttonMaisAtivado());
	}

	@Quando("^clico no botao Mensagem Legal$")
	public void clicarBtnMensagemLegal() {
		this.adn.clicarBotaoMensagemLegalSemLoad();
	}

	@Entao("^deve ser apresentado a tela de \"([^\"]*)\"$")
	public void verificarTelaTitulo(String titulo) {
		this.load.loading();
		Assert.assertEquals(titulo, this.adn.retornaTituloPaginaMensagemLegal());
	}

	@Entao("^deve ser apresentado o registro cadastrado$")
	public void verificarRegistroCadastrado() {
		Assert.assertEquals(VariaveisEstaticas.getCODIGO(),
				this.adn.pegarValorUnicoGridResultado("Natureza de Operação"));
	}

	@E("^edito o cadastro e salvo$")
	public void editarRegistro() {
		this.load.loading();
		this.adn.clicarButtonRetornar();
		this.load.loading();
		this.nat.preecherCampoCodigoNatureza(VariaveisEstaticas.getCODIGO());
		this.comp.clicarPesquisar();
		this.nat.clicaBotaEditarGridResultado();

	}

	@Entao("^deve ser apresentado o registro  com o cadastrado alterado na tela de historico$")
	public void verificarTelaHistorico() {
		this.adn.limpaCampoCodNaturezaOperacao();
		this.adn.preencherCampoCodNaturezaOperacao(GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.adn.clicarBotaoSalvar();
		this.load.loading();
		this.adn.limparCampoCodNaturezaPesquisa();
		this.nat.preecherCampoCodigoNatureza(VariaveisEstaticas.getCODIGO());
		this.comp.clicarPesquisar();
		this.load.loading();
		this.nat.clicaBotaEditarGridResultado();
		this.adn.clicarBotaoHistorico();
		Assert.assertEquals(VariaveisEstaticas.getCODIGO(),
				this.adn.pegarValorUnicoGridResultado("Natureza de Operação"));
	}

	@Quando("^seleciono o valor \"([^\"]*)\" no campo \"([^\"]*)\" na tela de Pesquisa$")
	public void selecionarValorTelaPesquisaSelect(String valor, String campo) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo, valor);
		this.comp.clicarPesquisar();
	}

	@Quando("^preencho o campo Codigo de Natureza com o valor \"([^\"]*)\" e \"([^\"]*)\" como Valor \"([^\"]*)\"$")
	public void prencherCampoNaturezaOperacaoComDigoNatureza(String valor, String campo1, String valor1) {
		this.load.loading();
		this.preencherCamposValoresCorretos(campo1, valor1, valor);
		this.comp.clicarPesquisar();
		// this.load.loading();

	}

	@Quando("^preencho \"([^\"]*)\" com \"([^\"]*)\" e \"([^\"]*)\" como \"([^\"]*)\" e preencho o campo Codigo de natureza com \"([^\"]*)\"$")
	public void selecionarDoisCamposSeletComCampoCodigoNatureza(String campo1, String valor1, String campo2,
			String valor2, String valor3) {
		this.load.loading();
		this.nat.selecionaValorCampoSelecao(campo1, valor1);
		this.preencherCamposValoresCorretos(campo2, valor2, valor3);
		this.comp.clicarPesquisar();
		// this.load.loading();

	}

	@E("^preencho o campo \"([^\"]*)\" com o valor \"([^\"]*)\" na natureza de op$")
	public void preenchimentoDoCampoComValores(String campo, String valor) {
		this.adn.preencherCampoSelecao(campo, valor);
	}
}
