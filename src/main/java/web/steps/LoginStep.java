package web.steps;

import java.io.FileNotFoundException;

import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.java.pt.Dado;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade login;

	public LoginStep() {
		this.login = new LoginFuncionalidade();

	}

	@Dado("^que estou logado com usuario/filial \"([^\"]*)\"/\"([^\"]*)\"$")
	public void loginSAD(String user, String filial) throws FileNotFoundException {
		Thread.currentThread().getId();
		VariaveisEstaticas.setUSER_SAD(user);
		VariaveisEstaticas.setFILIAL_SAD(filial);
		this.login.loginSAD(user, filial);
		
	}

	@Dado("^que estou na tela \"([^\"]*)\"$")
	public void acessarATelaSAD(String tela) {
		this.login.acessarTela(tela);
	}

	@Dado("^acessar o RF com usuário \"([^\"]*)\"$")
	public void acessarRF(String usuario) throws Throwable {
		this.login.acessarRF(usuario);
	}
	
	@Dado("que estou logado no ambiente {string} com usuario\\/filial {string}\\/{string}")
	public void AcessarSADPorAmbiente(String ambiente, String usuario, String filial) {
		VariaveisEstaticas.setAMBIENTE(ambiente);
		VariaveisEstaticas.setUSER_SAD(usuario);
		VariaveisEstaticas.setFILIAL_SAD(filial);
		this.login.acessarAmbienteSAD(ambiente, usuario, filial);
	    
	}

}
