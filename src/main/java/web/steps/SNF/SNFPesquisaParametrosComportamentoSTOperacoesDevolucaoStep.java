package web.steps.SNF;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoFuncionalidade;
import web.funcionalidade.SNF.SNF_InscricaoSubstitutoFuncionalidade;

public class SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoStep {

	private SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoFuncionalidade pesq;
	private waitLoading load;
	private SNF_InscricaoSubstitutoFuncionalidade insc;

	public SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoStep() {
		this.pesq = new SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoFuncionalidade();
		this.load = new waitLoading();
		this.insc = new SNF_InscricaoSubstitutoFuncionalidade();

	}

	@Quando("^clico no campo de selecao \"([^\"]*)\"$")
	public void acionarCampoSelecao(String campo) {
		this.load.loading();
		this.pesq.clicarCampoEstiloSelecao(campo);
	}

	@Entao("^deve ser apresentado os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void validarInformacaoCamposSelecao(String valor1, String valor2, String valor3, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertTrue("Itens exibidos incorretamente", this.pesq.validaValorCamposEstiloSelecao(lista, campo));
	}

	@Entao("^deve ser apresentado no campo \"([^\"]*)\" uma Lista de Estados Federativos do Brasil$")
	public void validarExibicaoListaEstadosFederativosBrasil(String campo) {
		Assert.assertEquals(this.insc.listaEstadosFederativos().size(),
				this.pesq.retornaValorCamposEstiloSelecao(campo).size());
		Assert.assertTrue(
				this.insc.listaEstadosFederativos().containsAll(this.pesq.retornaValorCamposEstiloSelecao(campo)));
	}

	@Quando("^seleciono o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionarValorCampoSelecao(String valor, String campo) {
		this.pesq.selecionaValorCampoEstiloSelecao(campo, valor);
	}

	@Quando("^clico no botao pesquisa$")
	public void acionarBtnPesquisar() {
		this.pesq.clicarBotaoPesquisarPesquisaParametros();
	}

	@Entao("^o grid deve apresentar o campo \"([^\"]*)\" com valor \"([^\"]*)\"$")
	public void validarInformacaoGridResultadoPesquisa(String campo, String valor) {
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo, valor));
	}

	@Quando("^seleciono os valores \"([^\"]*)\", \"([^\"]*)\" para os campos \"([^\"]*)\", \"([^\"]*)\"$")
	public void selecionarValoresParaCamposSelecao(String valor1, String valor2, String campo1, String campo2) {
		this.pesq.selecionaValorCampoEstiloSelecao(campo1, valor1);
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad(campo2, valor2);
	}

	@Entao("^o grid deve apresentar os campos \"([^\"]*)\", \"([^\"]*)\" com os valores \"([^\"]*)\", \"([^\"]*)\"$")
	public void validarInformacoesGriResultadoPesquisa(String campo1, String campo2, String valor1, String valor2) {
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo1, valor1));
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo2, valor2));

	}

	@Quando("^seleciono os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" para os campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void selecionarValoresResultadoPesquisa(String valor1, String valor2, String valor3, String campo1,
			String campo2, String campo3) {
		this.pesq.selecionaValorCampoEstiloSelecao(campo1, valor1);
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad(campo2, valor2);
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad(campo3, valor3);
	}

	@Entao("^o grid deve apresentar os campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" com os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validarResultado(String campo1, String campo2, String campo3, String valor1, String valor2,
			String valor3) {
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo1, valor1));
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo2, valor2));
		Assert.assertTrue(this.pesq.pegarValorGridResultadoPesquisaParametro(campo3, valor3));
	}

	@Quando("^clico no botao Limpar$")
	public void acionarBtnLimpar() {
		this.pesq.clicarBotaoLimparPesquisaParametros();
	}

	@Entao("^deve apresentar os campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" com os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validarValorPadraoCampoSelecaoPesquisa(String campo1, String campo2, String campo3, String valor1,
			String valor2, String valor3) {
		Assert.assertEquals(valor1, this.pesq.retornaValorSelecionadoSelecao(campo1));
		Assert.assertEquals(valor2, this.pesq.retornaValorSelecionadoSelecao(campo2));
		Assert.assertEquals(valor3, this.pesq.retornaValorSelecionadoSelecao(campo3));

	}

	@Entao("^deve ser apresentado todos os campos obrigatorios habilitados para edicao$")
	public void validarExibicaoTelaParametrosComportamentoSTOperacoesDevolucao() {
		Assert.assertTrue("Campo não habilitado", this.pesq.validarCampoEstiloSelecaoHabilitado("Agrupamento"));
		Assert.assertTrue("Campo não habilitado", this.pesq.validarCampoEstiloSelecaoHabilitado("Cad Formato"));
		Assert.assertTrue("Campo não habilitado", this.pesq.validarCampoEstiloSelecaoHabilitado("Cad Empresa"));
		Assert.assertTrue("Campo não habilitado", this.pesq.validarCampoEstiloSelecaoHabilitado("Estado"));
		Assert.assertEquals("Selecione...", this.pesq.retornaValorSelecionadoSelecao("NF de Ressarcimento"));

	}

	@Quando("^clico no botao Mais pesquisa de Parametros$")
	public void acionarBtnMais() {
		this.pesq.clicarBotaoMaisPesquisaParametros();
	}

	@Entao("^o campo \"([^\"]*)\" deve estar somente para Leitura$")
	public void ValidarCampoSelecaoHabilitadoParaEdicao(String campo) {
		Assert.assertTrue("Campo " + campo + " não está somente para leitura",
				this.pesq.validarCampoEstiloSelecaoLeitura(campo));
	}

	@Entao("^o campo \"([^\"]*)\" não deve estar presente na tela estilo Select$")
	public void verificarCampoNaoApresentado(String campo) {
		Assert.assertFalse("Campo esta sendo exibido na tela", this.pesq.validarCampoNaoExibidoNaTelaSelect(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar presente na tela estilo Select$")
	public void validarCampoExibidoTela(String campo) {
		Assert.assertTrue("Campo esta sendo exibido na tela", this.pesq.validarCampoNaoExibidoNaTelaSelect(campo));

	}

	@Entao("^o campo \"([^\"]*)\" nao deve estar presente na tela estilo Input$")
	public void validarCampoExibidoEstiloImput(String campo) {
		Assert.assertFalse("Campo esta sendo exibido na tela", this.pesq.validarCampoNaoExibidoNaTelaInput(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar presente na tela estilo Input$")
	public void validarCampoTelaEstiloInputVisivel(String campo) {
		Assert.assertTrue("Campo esta sendo exibido na tela", this.pesq.validarCampoNaoExibidoNaTelaInput(campo));
	}

	@Quando("^clico no campo do tipo selecao \"([^\"]*)\"$")
	public void clicarCampoTipoSelecao(String campo) {
		this.pesq.clicarCampoEstiloSelecao(campo);

	}

	@Entao("^deve apresentar os valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void verificarValoresCampo(String valor1, String valor2, String valor3, String campo) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertEquals(lista, this.pesq.retornaValorCamposEstiloSelecao(campo));
	}

	@Quando("^preencho todos os campos obrigatorios e clico no botao Salvar$")
	public void preencherCamposObrigatoriosClicarSalvar() {
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Agrupamento", "Remessa");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Formato", "Atacado");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Empresa", "BOMC - CLUBE DE MULTIFIDELIZACAO");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Estado", "Acre");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("NF de Ressarcimento", "Sim");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Natureza de Operacao", "REMESSA");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Codigo do Item", "11689");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Descricao do Item", "Auto Radio");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CST", "40 - Isenta");
		this.pesq.clicarBotaoSalvarPesquisaParametros();
	}

	@Quando("^deve ser exibida a seguinte mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		String a = VariaveisEstaticas.getMENSAGEM();
		Assert.assertEquals(msg, this.pesq.retornaMensagemExibida());
	}

	@Quando("^preencho somente os campos obrigatorios e clico no botao Salvar$")
	public void preenchimentoObrigatorioESalvar() {
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Agrupamento", "Remessa");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Formato", "Atacado");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Empresa", "BOMC - CLUBE DE MULTIFIDELIZACAO");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Estado", "Acre");
		this.pesq.clicarBotaoSalvarPesquisaParametros();
	}

	@Quando("^efetuo cadastro completo e clico no botao Salvar$")
	public void cadastroCompletoComBotaoSalvar() {
		this.load.loading();
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Agrupamento", "Remessa");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Formato", "Atacado");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CAD Empresa", "BOMC - CLUBE DE MULTIFIDELIZACAO");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Estado", "Acre");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("NF de Ressarcimento", "Sim");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Natureza de Operacao", "REMESSA");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Codigo do Item", "11689");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("Descricao do Item", "Auto Radio");
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad("CST", "40 - Isenta");
		this.pesq.clicarBotaoSalvarPesquisaParametros();
		Assert.assertEquals("Cadastro efetuado com sucesso!", this.pesq.retornaMensagemExibida());
	}

	@Entao("^deve ser exibido na coluna \"([^\"]*)\"  valor \"([^\"]*)\" na tela de Historico$")
	public void validarTelaHistoricoAposCadastro(String coluna, String valor) {
		this.pesq.clicarBotaoPesquisarPesquisaParametros();
		this.pesq.clicaBtnEditarGridResultadoPesquisa();
		this.pesq.clicarBotaoHistoricoPesquisaParametros();
		Assert.assertEquals(this.insc.pegarValorUnicoTelaHistoricoInscricao(coluna), valor);
	}

	@Quando("^seleciono valores \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" para os campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void selecionarValoresTelaPesquisa(String valor1, String valor2, String valor3, String campo1, String campo2,
			String campo3) {
		this.pesq.selecionaValorCampoEstiloSelecao(campo1, valor1);
		this.pesq.selecionaValorCampoEstiloSelecao(campo2, valor2);
		this.pesq.selecionaValorCampoEstiloSelecao(campo3, valor3);
	}

	@Quando("^clico no botao Editar do Grid de Resultado de Pesquisa$")
	public void clicarBotaEditarResultadoPesquisa() {
		this.pesq.clicarBotaoPesquisarPesquisaParametros();
		this.pesq.clicaBtnEditarGridResultadoPesquisa();
	}

	@Quando("^salvo o valor do campo usuario$")
	public void salvarValorCampoUsuario() {
		this.pesq.salvarValorCampoUsuario();
	}

	@Entao("^deve ser exibido a tela de Historico com os dados do registro$")
	public void validarUsuarioTelaHistorico() {
		Assert.assertEquals(this.insc.pegarValorUnicoTelaHistoricoInscricao("Usuário"),
				VariaveisEstaticas.getVALOR_USUARIO());
	}

	@Quando("^clico no botao Retornar da tela de Pesquisa de Parametros$")
	public void acionarBtnRetornarPesquisaParametros() {
		this.pesq.clicarBotaoRetornarPesquisaParametros();
	}

	@E("^altero o valor do campo \"([^\"]*)\" e clico em Salvar$")
	public void alterarValorCampoCodigoItemClicarSalvar(String campo) {
		this.pesq.limparCodigoItem();
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad(campo, GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.pesq.clicarBotaoSalvarPesquisaParametros();
	}

	@E("^faco nova selecao do valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void facoNovaSelecaoDeValor(String valor, String campo) {
		this.pesq.selecionaValorCampoEstiloSelecaoSemLoad(campo, valor);
	}

	@E("^faco um click no campo de selecao \"([^\"]*)\"$")
	public void clicoCampoSelecaoSemLoad(String campo) {
		this.pesq.clicarCampoEstiloSelecaoSemLoad(campo);

	}

}
