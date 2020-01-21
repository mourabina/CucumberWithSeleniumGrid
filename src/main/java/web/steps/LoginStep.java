package web.steps;

import io.cucumber.java.pt.Dado;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade login;
	
	public LoginStep() {
		this.login = new LoginFuncionalidade();
	}

	@Dado("^que estou logado no \"([^\"]*)\" com usuario/filial \"([^\"]*)\"/\"([^\"]*)\"$")
	public void loginSAD(String ambiente, String user, String filial) throws Throwable {
		this.login.loginSAD(ambiente ,user, filial);
	}

	@Dado("^acessar a tela \"([^\"]*)\" \\(SAD\\)$")
	public void acessarATelaSAD(String tela) {
		this.login.acessarTela(tela);	
	}

}
