package web.funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {

	private HomePage home;
	private WebDriverWait wait;

	public HomeFuncionalidade() {
		this.home = new HomePage(getwebDriver());
		this.wait = new WebDriverWait(getwebDriver(), 80);
	}

	public String msgSucesso() {
		addEvidenciaWeb("Mensagem exibida  : " + this.home.getMegSucesso().getText());
		return this.home.getMegSucesso().getText();
	}

	public void acessarAdicionarConta() {
		this.wait.until(ExpectedConditions.visibilityOf(this.home.getMenuContas()));
		this.home.getMenuContas().click();
		addEvidenciaWeb("Clicando no Opção Adicionar");
		this.home.getSubMenuAdicionar().click();
	}

	public void acessarListaConta() {
		this.wait.until(ExpectedConditions.visibilityOf(this.home.getMenuContas()));
		this.home.getMenuContas().click();
		addEvidenciaWeb("Clicando no Opção Listar");
		this.home.getSubMenuListar().click();
	}

	public void acessarTelaHome() {
		this.home.getMenuHome().click();
	}
	
	public void acessarTelaResumoMensal() {
		this.home.getMenuResumoMensal().click();
	}

	public String retonarValorSaldo() {
		
		WebElement valor = getwebDriver().findElement(By.xpath(
				"//table[@id='tabelaSaldo']//tbody//tr//td[text()='" + VariaveisEstaticas.getNOME() + "']/../td[2]"));
		wait.until(ExpectedConditions.visibilityOf(valor));
		return valor.getText();
	}

}
