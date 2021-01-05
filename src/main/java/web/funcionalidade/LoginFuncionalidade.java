package web.funcionalidade;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.BaseTest;
import web.pages.LoginPage;

public class LoginFuncionalidade extends BaseTest {

	private LoginPage login;
	private WebDriverWait wait;

	public LoginFuncionalidade() {
		this.login = new LoginPage(getwebDriver());
		this.wait = new WebDriverWait(getwebDriver(), 80);

	}

	public void loginSAD() {
		getwebDriver().get("http://srbarriga.herokuapp.com/");
		addEvidenciaWeb("Acessado a URL do Site do Senhor Barriga");

	}

	public void auntenticar(String usuario, String senha) {
		this.wait.until(ExpectedConditions.visibilityOf(this.login.getInputEmail()));
		this.login.getInputEmail().sendKeys(usuario);
		this.login.getInputSenha().sendKeys(senha);
		addEvidenciaWeb("Digitado Usuário se Senha");

	}
	
	public void preencherCampoSenha(String senha) {
		this.login.getInputSenha().sendKeys(senha);
		addEvidenciaWeb("Digitado a senha  :" + senha);
	}
	
	public void preencherCampoEmail(String email) {
		this.login.getInputEmail().sendKeys(email);
		addEvidenciaWeb("Digitando o Email  :"  + email);
	}
	
	public String retonaMenagemExibida() {
		return this.login.getMsgExibida().getText();
	}

	public void clicarBotaoEntrar() {
		addEvidenciaWeb("Clicando no bptão Entra");
		this.login.getButtonLogin().click();
	}
	
	public boolean validarMensagensExistententes(List<String> msg) {
		List<WebElement> lista = this.login.getListaMensagens();
		List<String> lista1 = new ArrayList<String>();

		for (int i = 0; i < lista.size(); i++) {
			lista1.add(lista.get(i).getText());
		}

		addEvidenciaWeb("Validando Mensagem Exibida");
		return lista1.equals(msg);
	}
	
	public void clicarMenuNovoUsuario() {
		addEvidenciaWeb("Clicando Menu NovoUsuario");
		this.login.getItemMenuNovoUsuario().click();
	}

}
