package commons.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import web.pages.SNF.SNFComponentesPage;

public class ComponentesFuncionalidade extends BaseTest{

	private SNFComponentesPage componentes;

	
	public ComponentesFuncionalidade() {
		this.componentes = new SNFComponentesPage(webDriver);
		
	}
	
	public void clicarSalvar() {
		wait.until(ExpectedConditions.elementToBeClickable(this.componentes.getBtnSalvar()));
		this.componentes.getBtnSalvar().click();
	}
	
	public void clicarRetornar() {
		wait.until(ExpectedConditions.elementToBeClickable(this.componentes.getBtnRetornar()));
		this.componentes.getBtnRetornar().click();
	}
	
	public void clicarLimpar() {
		wait.until(ExpectedConditions.elementToBeClickable(this.componentes.getBtnLimpar()));
		this.componentes.getBtnLimpar().click();
		addEvidenciaWeb("Acionar bot�o limpar");
	}
	
	public void clicarPesquisar() {
		wait.until(ExpectedConditions.elementToBeClickable(this.componentes.getBtnPesquisar()));
		this.componentes.getBtnPesquisar().click();
	}
	
	public void clicarMais() {
		wait.until(ExpectedConditions.elementToBeClickable(this.componentes.getBtnAdicionar()));
		this.componentes.getBtnAdicionar().click();
	}
}
