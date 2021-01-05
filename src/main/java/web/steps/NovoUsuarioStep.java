package web.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.github.javafaker.Faker;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.CadastraUsuarioFuncionaldiade;
import web.funcionalidade.LoginFuncionalidade;

public class NovoUsuarioStep {
	
	private CadastraUsuarioFuncionaldiade novoUsuario;
	private LoginFuncionalidade login;
	
	public NovoUsuarioStep() {
		this.novoUsuario = new CadastraUsuarioFuncionaldiade();
		this.login = new LoginFuncionalidade();
	}
	
	
	@Dado("acesso a pagina Novo Usuario")
	public void acessoAPaginaNovoUsuario() {
	    this.login.clicarMenuNovoUsuario();
	}

	@Dado("preencho somente o campo {string} com o valor {string}")
	public void preenchoSomenteCampoComValor(String campo, String valor) {
	    this.novoUsuario.preencherCampoNovoUsuario(campo, valor);
	}
	@Quando("clico no Botao Cadastrar")
	public void clicarBotaoCadastrar() {
	    this.novoUsuario.clicarBotaoCadastrar();
	}
	
	@Dado("preencho os campos {string}, {string} e {string} com os valore {string}, {string} e {string}")
	public void preenchoCamposComValore(String campo1, String campo2, String campo3, String valor1, String valor2, String valor3) {
		Faker faker = new Faker();
		this.novoUsuario.preencherCampoNovoUsuario(campo1, valor1);
		this.novoUsuario.preencherCampoNovoUsuario(campo2, faker.internet().emailAddress());
		this.novoUsuario.preencherCampoNovoUsuario(campo3, valor3);
	    
	}

	@Entao("sistem exibi a mensagen {string}  na tela de Novo Usuario")
	public void validarExibicaoMensagem(String msg) {
		Assert.assertEquals(this.novoUsuario.retornaMensagemTelaNovoUsuario(), msg);
	    
	}

	@Entao("sistem exibi as mensagens {string} e {string} na tela de Novo Usuario")
	public void sistemExibiAsMensagensENaTelaDeNovoUsuario(String msg1, String msg2) {
	    List<String> lista = new ArrayList<String>();
	    lista.add(msg1);
	    lista.add(msg2);
	    Assert.assertTrue(this.novoUsuario.validarMensagensExistententes(lista));
	}

}
