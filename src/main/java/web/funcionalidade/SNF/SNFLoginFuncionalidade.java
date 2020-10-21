package web.funcionalidade.SNF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.CredentialsUsers;
import web.model.Urls;
import web.pages.SNF.SNFHomePage;
import web.pages.SNF.SNFLoginPage;
import web.pages.SNF.SNFPerfilPage;

public class SNFLoginFuncionalidade extends BaseTest {

	private SNFLoginPage login;
	private SNFPerfilPage perfil;
	private SNFHomePage home;

	public SNFLoginFuncionalidade() {
		this.login = new SNFLoginPage(webDriver);
		this.perfil = new SNFPerfilPage(webDriver);
		this.home = new SNFHomePage(webDriver);
	}

	public void loginSNF(String usuario) {
		webDriver.get(Urls.snf_sit);
		wait.until(ExpectedConditions.visibilityOf(this.login.getInputUser()));
		this.login.getInputUser().sendKeys(usuario);
		this.login.getInputPass().sendKeys(CredentialsUsers.USER_WEB_SNF_QA.password());
		this.login.getBtnLogin().click();
		wait.until(ExpectedConditions.visibilityOf(this.perfil.getBtnCarregar()));
		addEvidenciaWeb("Acesso ao SNF");
	}

	public void SelecionarPerfil(String TipoUnidade, String Unidade) {
		this.perfil = new SNFPerfilPage(webDriver);
		this.setTipoUnidade(TipoUnidade);
		this.setUnidade(Unidade);
		addEvidenciaWeb("Perfil");
		this.perfil.getBtnCarregar().click();
		wait.until(ExpectedConditions.visibilityOf(this.home.getMenuAdministracao()));
		addEvidenciaWeb("Perfil Carregado");

	}

	public void setTipoUnidade(String TipoUnidade) {
		Select TipoUn = new Select(this.perfil.getSelectTipoUnidade());
		wait.until(ExpectedConditions.elementToBeClickable(this.perfil.getSelectTipoUnidade()));
		this.perfil.getSelectTipoUnidade().sendKeys(TipoUnidade);
		if (!TipoUn.getFirstSelectedOption().getText().equals(TipoUnidade)) {
			this.setTipoUnidade(TipoUnidade);
		}
	}

	public void setUnidade(String Unidade) {
		WebElement Un = null;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(this.perfil.getSelectFilial()));
			Un = webDriver.findElement(By.xpath("//Select[@formcontrolname=\"buId\"]"));
			Un.sendKeys(Unidade);
		} catch (Exception e) {
			Un = webDriver.findElement(By.xpath("//Select[@formcontrolname=\"buId\"]"));
			Un.sendKeys(Unidade);
		}
	}
}
