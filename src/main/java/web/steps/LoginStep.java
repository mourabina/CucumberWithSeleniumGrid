package web.steps;

import io.cucumber.java.pt.Dado;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade login;
	
	public LoginStep() {
		this.login = new LoginFuncionalidade();
	}

	@Dado("^que estou logado com usuario/filial \"([^\"]*)\"/\"([^\"]*)\"$")
	public void loginSAD(String user, String filial){
		this.login.loginSAD(user, filial);
	}

	@Dado("^que estou na tela \"([^\"]*)\"$")
	public void acessarATelaSAD(String tela) {
		this.login.acessarTela(tela);	
	}

}
