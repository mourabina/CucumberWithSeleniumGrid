package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFAdicionarToleranciaRecebimentoPereciveisPage {
	
	@FindBy(xpath ="//h4[text()='Adicionar Toler�ncia no recebimento de perec�veis']")
	private WebElement tituloPagina;
	
	@FindBy(id ="typeFormatTolerance")
	private WebElement selectFormato;
	
	@FindBy(id = "typeTolerance")
	private WebElement selectTipoPeso;
	
	@FindBy(id = "portfolioId")
	private WebElement selectPortifolio;
	
	@FindBy(id = "value")
	private WebElement inputValor;
	
	@FindBy(id ="qty")
	private WebElement inpuQuantidadePorcento;
	
	@FindBy(xpath = "//button[@class='btn btn-default mr-2']")
	private WebElement buttonRetornar;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement buttonSalvar;

	public SNFAdicionarToleranciaRecebimentoPereciveisPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getSelectFormato() {
		return selectFormato;
	}

	public WebElement getSelectTipoPeso() {
		return selectTipoPeso;
	}

	public WebElement getInputValor() {
		return inputValor;
	}

	public WebElement getInpuQuantidadePorcento() {
		return inpuQuantidadePorcento;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getSelectPortifolio() {
		return selectPortifolio;
	}
}
