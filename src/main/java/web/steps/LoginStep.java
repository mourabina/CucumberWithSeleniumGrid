package web.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.HomeFuncionalidade;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade login;
	private HomeFuncionalidade home;

	public LoginStep() {
		this.login = new LoginFuncionalidade();
		this.home = new HomeFuncionalidade();

	}
	
	@Dado("que estou na pagina de Login do Senhor Barriga")
	public void queEstouLogadoNoSNFComUsuario() {
	   this.login.loginSAD();
	}
	
	@Dado("que Logado na Pagina do Senhor Barriga")
	public void queLogadoNaPaginaDoSenhorBarriga() {
		this.login.loginSAD();
	    this.login.auntenticar("h@h", "h");
	    this.login.clicarBotaoEntrar();
	}
	
	@Dado("digito usuario {string} e Senha {string}")
	public void digitoUsuarioESenha(String usuario, String senha) {
	    this.login.auntenticar(usuario, senha);
	}
	
	@Dado("preencho somente o valor Senha {string}")
	public void preenchoSomenteOValorSenha(String senha) {
	    this.login.preencherCampoSenha(senha);
	}
	
	@Dado("preencho somente o valor Email {string}")
	public void preenchoSomenteValorEmail(String email) {
	    this.login.preencherCampoEmail(email);
	}

	@Quando("clico no Botao Entrar")
	public void clicoNoBotaoEntrar() {
	    this.login.clicarBotaoEntrar();
	}

	@Entao("sistem exibi a mensagem {string}")
	public void sistemExibiAMensagem(String msg) {
		Assert.assertEquals(msg, this.home.msgSucesso());
	    
	}
	
	@Entao("sistem exibi as mensagens {string} e {string}")
	public void sistemExibiAsMensagensE(String msg1, String msg2) {
		List<String> lista = new ArrayList<String>();
		lista.add(msg1);
		lista.add(msg2);
		Assert.assertTrue(this.login.validarMensagensExistententes(lista));
	   
	}
	
	@Entao("sistem exibi a mensagem {string} na tela de Login\"")
	public void sistemExibiAMensagemNaTelaDeLogin(String msg) {
		Assert.assertEquals(this.login.retonaMenagemExibida(), msg);
	    
	}



}
