package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatoriosTabelaNotas {
	
	@FindBy(xpath = "//h2[@class='text-left']")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "tipo")
	private WebElement selectTipo;
	
	@FindBy(id = "tipoOperacao")
	private WebElement selectTipoOperacao;
	
	@FindBy(id = "dtInicia")
	private WebElement inputDataInicio;
	
	@FindBy(id = "numNf")
	private WebElement inputNumeroNF;
	
	@FindBy(id = "//*[@id='cfop']/div/div/span")
	private WebElement selectCFOP;
	
	@FindBy(id = "//*[@id='codFilial']/div/div/span")
	private WebElement selectFilial;
	
	@FindBy(id = "//*[@id='tipoNf']/div/div/span")
	private WebElement selectTipoNotaFiscal;
	
	@FindBy(id = "dtFim")
	private WebElement inputDataFim;
	
	@FindBy(id = "numNfSerie")
	private WebElement inputNumeroSerie;
	
	@FindBy(id = "canceledYN")
	private WebElement inputNotasCanceladas;
	
	@FindBy(xpath = "//tr[@class='even']/td")
	private WebElement griResultado;
	
	SNFRelatoriosTabelaNotas(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getSelectTipo() {
		return selectTipo;
	}

	public WebElement getSelectTipoOperacao() {
		return selectTipoOperacao;
	}

	public WebElement getInputDataInicio() {
		return inputDataInicio;
	}

	public WebElement getInputNumeroNF() {
		return inputNumeroNF;
	}

	public WebElement getSelectCFOP() {
		return selectCFOP;
	}

	public WebElement getFilial() {
		return selectFilial;
	}

	public WebElement getSelectTipoNotaFiscal() {
		return selectTipoNotaFiscal;
	}

	public WebElement getInputDataFim() {
		return inputDataFim;
	}

	public WebElement getInputNumeroSerie() {
		return inputNumeroSerie;
	}

	public WebElement getInputNotasCanceladas() {
		return inputNotasCanceladas;
	}

	public WebElement getGriResultado() {
		return griResultado;
	}

}
