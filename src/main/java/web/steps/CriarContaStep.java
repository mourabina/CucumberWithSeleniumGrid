package web.steps;

import org.junit.Assert;

import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.CriarContaFuncionalidade;
import web.funcionalidade.HomeFuncionalidade;

public class CriarContaStep {
	
	private HomeFuncionalidade home;
	private CriarContaFuncionalidade conta;
	
	public CriarContaStep() {
		this.home = new HomeFuncionalidade();
		this.conta = new CriarContaFuncionalidade();
		
	}
	
	@Dado("acesso a pagina Adicionar Conta")
	public void acessoAPaginaAdicionarConta() {
	    this.home.acessarAdicionarConta();
	}

	@Dado("preencho o campo Nome com novo valor")
	public void preenchoCampoNomeComNovoValor() {
	    this.conta.preencherCampoNome();
	}

	@Quando("clico no Botao Salvar")
	public void clicoNoBotaoSalvar() {
	    this.conta.clicaBotaoSalvar();
	}
	@Dado("tenho uma conta já criada")
	public void tenhoUmaContaJaCriada() {
	    this.conta.preencherCampoNome();
	    this.conta.clicaBotaoSalvar();
	    this.home.acessarAdicionarConta();
	}

	@Dado("preencho o campo nome com valor já criado")
	public void preenchoCampoNomeComValorJaCriado() {
	    this.conta.preencherCampoNome(VariaveisEstaticas.getNOME());
	}
	
	@Quando("clico no Botao Deletar Conta")
	public void clicoNoBotaoDeletarConta() {
	    this.home.acessarListaConta();
		this.conta.deletarConta();
	}

	@Entao("sistem exibi a mensagen {string}  na tela de Adicionar Conta")
	public void sistemExibiAMensagenNaTelaDeAdicionarConta(String msg) {
	    Assert.assertEquals(this.conta.retonaMensagemExibida(), msg);
	}

}
