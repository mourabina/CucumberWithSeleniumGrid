
package web.steps.SNF;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNF_InscricaoSubstitutoFuncionalidade;

public class SNFInscricaoSubstitutoStep extends BaseTest {

	private SNF_InscricaoSubstitutoFuncionalidade insc;
	private waitLoading load;

	public SNFInscricaoSubstitutoStep() {
		this.insc = new SNF_InscricaoSubstitutoFuncionalidade();
		this.load = new waitLoading();
	}

	@Quando("^seleciono a opção \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selectValorCampo(String valor, String campo) {
		this.insc.selecionarValorCamposPesquisaSelecao(campo, valor);
	}

	@Entao("^o campo \"([^\"]*)\" deve exibir o valor \"([^\"]*)\"$")
	public void verificarCampoValor(String campo, String valor) {
		Assert.assertEquals(this.insc.retornoValorCamposPesquisaInput(campo), valor);
	}

	@Quando("^clico no campo de pesquisa \"([^\"]*)\"$")
	public void acionarCampo(String campo) {
		this.insc.clicarCamposPesquisaSelecao(campo);
	}

	@Quando("^seleciono a opçao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionarOpcaoCampoSelecao(String valor, String campo) {
		this.insc.selecionarValorCamposPesquisaSelecao(campo, valor);
	}

	@Quando("^seleciono a opçao \"([^\"]*)\" no campo \"([^\"]*)\" e a opçao \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void selecionoValoresCamposSelecao(String opcao1, String campo1, String opcao2, String campo2) {
		this.insc.selecionarValorCamposPesquisaSelecao(campo1, opcao1);
		this.insc.selecionarValorCamposPesquisaSelecao(campo2, opcao2);
	}

	@Quando("^seleciono opçao \"([^\"]*)\" campo \"([^\"]*)\" a opçao \"([^\"]*)\" campo \"([^\"]*)\" e opcao \"([^\"]*)\" campo \"([^\"]*)\"$")
	public void selecionarValoresCamposSelecao(String opcao, String campo, String opcao1, String campo1, String opcao2,
			String campo2) {
		this.insc.selecionarValorCamposPesquisaSelecao(campo, opcao);
		this.insc.selecionarValorCamposPesquisaSelecao(campo1, opcao1);
		this.insc.selecionarValorCamposPesquisaSelecao(campo2, opcao2);
	}

	@Quando("^clico no botao Pesquisar da tela de Inscricao Substituto$")
	public void buttonPesquisarInscricaoSubstituto() {
		this.insc.clicarBotaoInscricaoSubstituto();
	}

	@Quando("^clico no botao Editar do Grid de Resultado$")
	public void btnEditarGridResultado() {
		this.insc.clicaBotaEditarGridResultadoSemLoad();
	}

	@Quando("^salvo o valor da coluna \"([^\"]*)\" no grid de resultado$")
	public void guardarValorColunaGrid(String coluna) {
		this.insc.pegarValorUnicoGridResultado(coluna);
	}

	@Entao("^deve exibir no campo \"([^\"]*)\" os valores \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void verificarSelectComValores(String campo, String valor1, String valor2, String valor3) {
		List<String> lista = new ArrayList<String>();
		lista.add(valor1);
		lista.add(valor2);
		lista.add(valor3);
		Assert.assertTrue("Valores incorretos para o campo " + campo, this.insc.validaValorCamposSelecao(lista, campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve exibir todos os estados federativos$")
	public void verificarEstadosFederativos(String campo) {
		MatcherAssert.assertThat(this.insc.retorValorCamposSelecao(campo),
				Matchers.is(this.insc.listaEstadosFederativos()));
	}

	@Entao("^deve apresentar o campo \"([^\"]*)\" o valor \"([^\"]*)\" no grid de resultados$")
	public void validarResultadoGrid(String campo, String valor) {
		this.load.loading();
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo, valor));
	}

	@Entao("^deve apresentar no campo \"([^\"]*)\" o valor \"([^\"]*)\" e no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
	public void validarCampoValorCampoValor(String campo, String valor, String campo1, String valor1) {
		this.load.loading();
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo, valor));
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo1, valor1));

	}

	@Entao("^deve apresentar no campo \"([^\"]*)\" valor \"([^\"]*)\" no campo \"([^\"]*)\" o valor \"([^\"]*)\" no campo \"([^\"]*)\" valor \"([^\"]*)\"$")
	public void validarCampoValorCampoValorCampoValor(String campo, String valor, String campo1, String valor1,
			String campo2, String valor2) {
		this.load.loading();
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo, valor));
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo1, valor1));
		Assert.assertTrue("Valor não  Encontrado", this.insc.pegarValorGridResultadoInscricao(campo2, valor2));
	}

	@Entao("^deve apresentar a tela de Editar Inscricao Substituto com o titulo \"([^\"]*)\"$")
	public void validarApresentacaoTelaEditarInsc(String titulo) {
		Assert.assertEquals(titulo, this.insc.retornaTituloPagina());
	}

	@Entao("^campo \"([^\"]*)\" deve estar desabilitado$")
	public void verificaCampoDesabilitado(String campo){
		Assert.assertFalse("Campo está Habilitado para Edição", this.insc.retornaStatusCampo(campo));	
	}
	
	@Entao("^campo \"([^\"]*)\" deve estar habilitado$")
	public void verificaCampoHabilitado(String campo){
		Assert.assertTrue("Campo está Habilitado para Edição", this.insc.retornaStatusCampo(campo));	
	}
	
	@Entao("^campo \"([^\"]*)\" de input deve conter o mesmo valor do cadastro$")
	public void verificarValorCadastrado(String campo){
		Assert.assertTrue(
				this.insc.retornoValorCamposPesquisaInput(campo).contains(VariaveisEstaticas.getINSCRICAO_SUBSTITUTO()));
	}
	
	@Entao("^campo \"([^\"]*)\" de select deve conter o mesmo valor do cadastro$")
	public void verificarValorCadastradoSelect(String campo){
		String a = this.insc.retornoValorCamposPesquisaSelect(campo).toUpperCase();
		String b = VariaveisEstaticas.getINSCRICAO_SUBSTITUTO();
		Assert.assertTrue(a.contains(b));
	}

	@Entao("^deve ser apresentado a Tela de Historico com o mesmo valor utilizado no cadastro do campo \"([^\"]*)\"$")
	public void validarApresentacaoTelaHistorico(String campo) {
		Assert.assertTrue("Valor não encontrado no campo " + campo, this.insc
				.pegarValorUnicoTelaHistoricoInscricao(campo).contains(VariaveisEstaticas.getINSCRICAO_SUBSTITUTO()));
	}

	@Quando("^preencho todos os campos obrigatorios e clico em Salvar (Inscrição)$")
	public void preenchimentoCamposObrigatorioESalvar() {
		this.load.loading();
		this.insc.preencherCamposObrigatorios();
	}

	@Entao("^deve apresentar no campo \"([^\"]*)\" a informacao de quando foi criado\\.$")
	public void verificarCampoAoSerCriado(String campo) {
			Assert.assertEquals(this.insc.pegarValorUnicoTelaHistoricoInscricao(campo).split(" ")[0],
				VariaveisEstaticas.getHORA_CRIACAO_INSCRICAO().split(" ")[0]);
	}

	@Entao("^deve ser exibido a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibida(String msg) {
		Assert.assertEquals(msg,this.insc.retornaMensagemAddInscricSubstituto());
	}

	@E("^clico no botao Editar do Grid de Resultado com load$")
	public void clicarBotaoEditarAposLoadComLoad(){
		this.insc.clicaBotaEditarGridResultado();
	}

	@E("^preencho todos os campos editaveis$")
	public void preencherCamposEditaveisInscricaoSubstituto(){
		this.insc.preencherCamposObrigatorios();
	}

	@E("^preencho todos os campos editaveis de Inscricao Substituto$")
	public void prencherCamposDeInscricaoSubstituto(){
		this.insc.preencherCamposObrigatoriosSemLoad();
		
	}

	@E("^altero o valor do campo Inscricao Substituto e clico em Salvar$")
	public void alterarValorCampoInscricaoSubstitutoClicarSalvar(){
		this.insc.alterarValorCampoInscricaoSubstituto();
		
	}

	@Entao("^campo \"([^\"]*)\" nao deve estar habilitado$")
	public void validarCampoNaoHabilitado(String campo){
		Assert.assertFalse("Campo está Habilitado para Edição", this.insc.retornaStatusCampo(campo));
	}


}
