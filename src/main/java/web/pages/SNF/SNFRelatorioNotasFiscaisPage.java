package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatorioNotasFiscaisPage {

	@FindBy(id = "buId")
	private WebElement selectFilial;

	@FindBy(xpath = "//*[@id='buId']//input[@placeholder='Procurar']")
	private WebElement inputUnidadeNegocio;

	@FindBy(xpath = "//*[@id='buId']//ul[@class='item1']//div")
	private WebElement checkBoxMarcarTodos;

	@FindBy(xpath = "//*[@id='buId']//ul[@class='item2']//div")
	private WebElement checkBoxResultadoPesquisaUnidadeNegocio;

	@FindBy(id = "tipoNf")
	private WebElement selectTipoNF;

	@FindBy(xpath = "//h2[text()='Notas Fiscais']")
	private WebElement labelTituloPagina;

	@FindBy(id = "dtInicio")
	private WebElement inputDataInicio;

	@FindBy(id = "numeroNf")
	private WebElement inputNumeroNF;

	@FindBy(id = "status")
	private WebElement selectStatus;

	@FindBy(id = "tipoOperacao")
	private WebElement selectTipoOperacao;

	@FindBy(id = "cfopCd")
	private WebElement inputCFOP;

	@FindBy(id = "dtFim")
	private WebElement inputDataFim;

	@FindBy(id = "serieNf")
	private WebElement inputSerieNF;

	@FindBy(id = "tipoRelatorio")
	private WebElement selectTipoRelatorio;

	SNFRelatorioNotasFiscaisPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);

	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getInputUnidadeNegocio() {
		return inputUnidadeNegocio;
	}

	public WebElement getCheckBoxMarcarTodos() {
		return checkBoxMarcarTodos;
	}

	public WebElement getCheckBoxResultadoPesquisaUnidadeNegocio() {
		return checkBoxResultadoPesquisaUnidadeNegocio;
	}

	public WebElement getSelectTipoNF() {
		return selectTipoNF;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputDataInicio() {
		return inputDataInicio;
	}

	public WebElement getInputNumeroNF() {
		return inputNumeroNF;
	}

	public WebElement getSelectStatus() {
		return selectStatus;
	}

	public WebElement getSelectTipoOperacao() {
		return selectTipoOperacao;
	}

	public WebElement getInputCFOP() {
		return inputCFOP;
	}

	public WebElement getInputDataFim() {
		return inputDataFim;
	}

	public WebElement getInputSerieNF() {
		return inputSerieNF;
	}

	public WebElement getSelectTipoRelatorio() {
		return selectTipoRelatorio;
	}

}
