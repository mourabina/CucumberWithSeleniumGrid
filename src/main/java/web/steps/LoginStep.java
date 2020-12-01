package web.steps;

import java.io.FileNotFoundException;
import java.text.ParseException;

import commons.SNFApi;
import commons.funcionalidade.GeracaoData;
import io.cucumber.java.pt.Dado;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade login;
	private SNFApi auth;

	public LoginStep() {
		this.login = new LoginFuncionalidade();
		this.auth = new SNFApi();
	}

	@Dado("^que estou logado com usuario/filial \"([^\"]*)\"/\"([^\"]*)\"$")
	public void loginSAD(String user, String filial) throws FileNotFoundException {
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

}
