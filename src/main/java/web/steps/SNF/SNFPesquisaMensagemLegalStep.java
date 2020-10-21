package web.steps.SNF;

import org.junit.Assert;

import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNF_PesquisaMensagemLegalFuncionalidade;

public class SNFPesquisaMensagemLegalStep {
	
	private SNF_PesquisaMensagemLegalFuncionalidade pesqui;
	private waitLoading wl;


	public SNFPesquisaMensagemLegalStep() {
		this.pesqui = new SNF_PesquisaMensagemLegalFuncionalidade();
		this.wl = new waitLoading();
		
	}
	
	@Quando("^digito o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void setValorCampoPesquisaMesagemLegal(String valor, String campo){
	    this.pesqui.selecionarValorCampoPesquisaMemnsagemLegal(campo, valor);
	}

	@Quando("^clico no botao Pesquisar$")
	public void clicarBotaPesquisar(){
		this.wl.loading();
		this.pesqui.clicarBotaoPesquisar();
	}

	@Entao("^deve ser exibido o valor \"([^\"]*)\" na coluna \"([^\"]*)\" do grid de Resultado$")
	public void validarInformacaoExibidaGridResultado(String valor, String campo) {
	    Assert.assertTrue("Valor não está pesente no resultado de pesquisa", this.pesqui.validarPesquisaParcialDescricao(campo, valor));
	}

	@Quando("^digito os valores \"([^\"]*)\", \"([^\"]*)\" nos campos \"([^\"]*)\" e \"([^\"]*)\"$")
	public void setValoresCamposPesquisa(String valor1, String valor2, String campo1, String campo2){
		 this.pesqui.selecionarValorCampoPesquisaMemnsagemLegal(campo1, valor1);
		 this.pesqui.selecionarValorCampoPesquisaMemnsagemLegal(campo2, valor2);		
	}

	@Entao("^deve ser exibido os valores \"([^\"]*)\", \"([^\"]*)\" nas coluna \"([^\"]*)\" e \"([^\"]*)\" do grid de Resultado$")
	public void validarResultadoGridPesquisaMensagens(String valor1, String valor2, String campo1, String campo2){
		 Assert.assertTrue("Valor não está pesente no resultado de pesquisa", this.pesqui.validarPesquisaParcialDescricao(campo1, valor1));
		 Assert.assertTrue("Valor não está pesente no resultado de pesquisa", this.pesqui.validarPesquisaParcialDescricao(campo2, valor2));
	}

	@Quando("^clico no botao Editar da tela de Pesquisa de Mensagem Legal$")
	public void clicarBotaoEditarPesquisaDeMensagemLegal(){
		this.pesqui.clicaBotaEditarGridResultadoPesquisaMesagem();
	}

	@Entao("^deve ser exibido os campo \"([^\"]*)\" nao habilitado e \"([^\"]*)\" habilitado para edicao$")
	public void validarExibicaoTelaPesquisaMensagemLegal(String campo1, String campo2){	
		Assert.assertFalse("Campo está Habilitado", this.pesqui.validarCampoReadonlyParaEdicaoMensagem(campo1));
		Assert.assertTrue("Campo não está Habilitado", this.pesqui.validarCampoHabilitadoParaEdicaoMensagem(campo2));		
	}

	@Quando("^clico no botao Novo$")
	public void clicarBotaoNovo() {
		this.pesqui.clicarBotaoNovo();		
	}

	@Entao("^deve ser exibido o campo \"([^\"]*)\" habilitado para edicao$")
	public void validarExibicaoDoCampoTelaPesquisa(String campo){
		Assert.assertTrue("Campo não está Habilitado", this.pesqui.validarCampoHabilitadoParaEdicaoMensagem(campo));
		
	}

	@Entao("^deve ser exibido todas as mensagens Legais cadastradas$")
	public void deveSerExibidaMensagensLegaisGridResultado(){
		Assert.assertFalse("Não existe mensagem Cadastrada", this.pesqui.gridResultadoNaoVazioPesquisaMensagem());
		
	}

	@E("^digito um valor no campo \"([^\"]*)\" e clico em Salvar$")
	public void devoPreencherCampoClicarSalavar(String campo){
		this.pesqui.selecionarValorCampoPesquisaMemnsagemLegal(campo, GeradorNumeroRandomico.retornaNumeroAleatorio());
		this.pesqui.clicarBotaoSalvar();
	}

	@Entao("^deve ser exibido na tela a mensagem \"([^\"]*)\"$")
	public void validarMensagemExibidaAdiconarMensagem(String msg){
		Assert.assertEquals(msg, this.pesqui.retornaMensagemSucesso());
	}

	@Entao("^deve ser exibido o botão \"([^\"]*)\" desabilitado$")
	public void validarBotaoSalvarDesabilitado(String botao){
		Assert.assertFalse("Botão Salvar está Habilitado", this.pesqui.validarCampoHabilitadoParaEdicaoMensagem(botao));
		
	}

}
