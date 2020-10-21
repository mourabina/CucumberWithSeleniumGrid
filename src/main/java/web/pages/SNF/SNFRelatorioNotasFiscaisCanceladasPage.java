package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatorioNotasFiscaisCanceladasPage {

	@FindBy(xpath = "//h2[text()='Notas Fiscais Canceladas']")
	private WebElement labelTituloPagina;

	@FindBy(xpath = "//span[@class='input-group-btn']//i[@class='fas fa-file-excel']")
	private WebElement buttonGerarExcel;

	@FindBy(xpath = "//input[@placeholder='Procurar...']")
	private WebElement inputProcurar;

	@FindBy(xpath = "//span[@class='dropdown-btn']")
	private WebElement selectFilial;

	@FindBy(xpath = "//input[@placeholder='Procurar']")
	private WebElement inputUnidadeNegocio;

	@FindBy(xpath = "//ul[@class='item1']//div")
	private WebElement checkBoxMarcarTodos;

	@FindBy(xpath = "//ul[@class='item2']//div")
	private WebElement checkBoxResultadoPesquisaUnidadeNegocio;

	@FindBy(id = "dtInicio")
	private WebElement inputDataInicio;

	@FindBy(id = "dtFim")
	private WebElement inputDataFim;

	SNFRelatorioNotasFiscaisCanceladasPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonGerarExcel() {
		return buttonGerarExcel;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getFilial() {
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

	public WebElement getInputDataInicio() {
		return inputDataInicio;
	}

	public WebElement getInputDataFim() {
		return inputDataFim;
	}

}
