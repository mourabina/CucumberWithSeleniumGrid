package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatoriosItensReparadosPage {

	@FindBy(xpath = "//h2[@class='text-left']")
	private WebElement labelTituloPagina;

	@FindBy(id = "item")
	private WebElement inputItem;

	@FindBy(id = "cnpjFornecedor")
	private WebElement inputCNPAssiFornecedor;

	@FindBy(id = "dtInicio")
	private WebElement inputDataInicio;

	@FindBy(id = "dtFim")
	private WebElement inputDataFim;

	@FindBy(xpath = "//tr[@class='even']/td")
	private WebElement gridResultado;

	SNFRelatoriosItensReparadosPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputItem() {
		return inputItem;
	}

	public WebElement getInputCNPAssiFornecedor() {
		return inputCNPAssiFornecedor;
	}

	public WebElement getInputDataInicio() {
		return inputDataInicio;
	}

	public WebElement getInputDataFim() {
		return inputDataFim;
	}

	public WebElement getGridResultado() {
		return gridResultado;
	}

}
