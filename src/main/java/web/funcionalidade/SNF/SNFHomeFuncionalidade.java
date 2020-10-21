package web.funcionalidade.SNF;

import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import web.bean.enums.SNF_AcessarMenu;
import web.bean.interfaces.SNF_Menu;
import web.pages.SNF.SNFFornecedorNFPage;
import web.pages.SNF.SNFHomePage;
import web.pages.SNF.SNFVisualizarNotasFiscaisPage;

public class SNFHomeFuncionalidade extends BaseTest{
	
	private SNFHomePage home;
	private SNFVisualizarNotasFiscaisPage VisualizarNF;
	private SNFFornecedorNFPage FornecedorNF; 
	
	public SNFHomeFuncionalidade() {
		this.home = new SNFHomePage(webDriver);
		this.VisualizarNF = new SNFVisualizarNotasFiscaisPage(webDriver);
		this.FornecedorNF = new SNFFornecedorNFPage(webDriver);
	}
	
	public void acessarFornecedorNF() {
		this.home.getMenuRecebimento().click();
		wait.until(ExpectedConditions.elementToBeClickable(this.home.getMenuNotaFiscal()));
		this.home.getMenuNotaFiscal().click();
		wait.until(ExpectedConditions.elementToBeClickable(this.VisualizarNF.getButtonMais()));
		this.VisualizarNF.getButtonMais().click();
		wait.until(ExpectedConditions.visibilityOf(this.FornecedorNF.getUnidadeNegocio()));
		addEvidenciaWeb("Tela 'Fornecedor NF' acessada");
	}
	
	public void AcessaMenu(String elem) throws InterruptedException {
		Thread.sleep(1000);
		SNF_Menu menu = SNF_AcessarMenu.valueOf(elem.replace(" ", "_").replace("/","_").toUpperCase());
		wait.until(ExpectedConditions.visibilityOfAllElements(menu.getElement(this.home)));
		wait.until(ExpectedConditions.elementToBeClickable(menu.getElement(this.home)));
		menu.getElement(this.home).click();
	}
	
}
