package web.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.CredentialsUsers;
import commons.funcionalidade.VariaveisEstaticas;
import web.model.Urls;
import web.pages.HomePage;
import web.pages.LoginPage;
import web.pages.RF.LoginRFABRPage;

public class LoginFuncionalidade extends BaseTest {

	private LoginPage login;
	private HomePage home;
	private LoginRFABRPage RF;

	public LoginFuncionalidade() {
		this.login = new LoginPage(webDriver);
		this.home = new HomePage(webDriver);
		this.RF = new LoginRFABRPage(webDriver);
	}

	public void loginSAD(String usuario, String filial) {
		webDriver.get(Urls.SAD_QA);
		wait.until(ExpectedConditions.visibilityOf(this.login.getInputUser()));
		VariaveisEstaticas.setUSUARIO(usuario);
		this.login.getInputUser().sendKeys(usuario);
		this.login.getInputPass().sendKeys(CredentialsUsers.USER_WEB_SAD_QA.password());
		this.login.getInputEmpresa().sendKeys("01");
		VariaveisEstaticas.setFILIAL(filial);
		this.login.getInputFilial().sendKeys(filial);
		this.login.getBtnLogin().click();
		addEvidenciaWeb("Acesso ao SAD");
	}
	
	public void loginSADSAMS(String usuario, String filial) {
		webDriver.get(Urls.SAD_SAMS);
		wait.until(ExpectedConditions.visibilityOf(this.login.getInputUser()));
		VariaveisEstaticas.setUSUARIO(usuario);
		this.login.getInputUser().sendKeys(usuario);
		this.login.getInputPass().sendKeys(CredentialsUsers.USER_WEB_SAD_SAMS.password());
		this.login.getInputEmpresa().sendKeys("01");
		VariaveisEstaticas.setFILIAL(filial);
		this.login.getInputFilial().sendKeys(filial);
		this.login.getBtnLogin().click();
		addEvidenciaWeb("Acesso ao SAD SAMS");
		
	}
	
	public void acessarAmbienteSAD(String ambiente,String usuario, String filial) {
		switch (ambiente) {
		case "SADVAREJO":
			this.loginSAD(usuario, filial);
			break;
		case "SADSAMS":
			this.loginSADSAMS(usuario, filial);
			break;	

		default:
			break;
		}
	}

	public void acessarTela(String tela) {
		this.home.getInputProxiTela().sendKeys(tela);
		this.home.getBtnTransmitir().click();
		addEvidenciaWeb("Acesso a tela: " + tela);
	}

	public void voltarHomePage() {
		this.home.getHomePageIcon().click();
		addEvidenciaWeb("Homepage acessada");
	}

	public void acessarRF(String usuario) {
		wait.until(ExpectedConditions.visibilityOf(this.RF.getInputUsuario()));
		this.RF.getInputUsuario().sendKeys(usuario);
		this.RF.getInputSenha().sendKeys(CredentialsUsers.USER_WEB_SAD_QA.password());
		this.RF.getInputEmpresa().sendKeys("01");
		this.RF.getInputFilialWM().sendKeys(VariaveisEstaticas.getFILIAL());
		this.RF.getButtonOK().click();
		addEvidenciaWeb("Acesso ao RF");
	}
}
