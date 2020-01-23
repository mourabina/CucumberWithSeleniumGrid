package web.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.CredentialsUsers;
import web.model.Urls;
import web.pages.HomePage;
import web.pages.LoginPage;

public class LoginFuncionalidade extends BaseTest{
	
	private LoginPage login;
	private HomePage home;
			
	public LoginFuncionalidade() {
		this.login = new LoginPage(webDriver);
		this.home = new HomePage(webDriver);
	}
	public void loginSAD(String usuario, String filial) {
		webDriver.get(Urls.SAD_QA);
		wait.until(ExpectedConditions.visibilityOf(this.login.getInputUser()));
		this.login.getInputUser().sendKeys(usuario);
		this.login.getInputPass().sendKeys(CredentialsUsers.USER_WEB_SAD_QA.password());
		this.login.getInputEmpresa().sendKeys("01");
		this.login.getInputFilial().sendKeys(filial);
		this.login.getBtnLogin().click();
		addEvidenciaWeb("Acesso ao SAD");
	}
	
	public void acessarTela(String tela) {
		this.home.getInputProxiTela().sendKeys(tela);
		this.home.getBtnTransmitir().click();
	}
}
