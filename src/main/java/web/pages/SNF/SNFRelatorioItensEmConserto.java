package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatorioItensEmConserto {

	@FindBy(xpath = "//h2[text()='Itens em Conserto']")
	private WebElement labelTituloPagina;

	@FindBy(id = "item")
	private WebElement inputItem;

	@FindBy(id = "cnpjFornecedor")
	private WebElement inputCNPJAssisFornecedor;

	@FindBy(id = "codDepto")
	private WebElement selectDepartamento;

	@FindBy(xpath = "//*[@id='buIdLoja']//span[@class='dropdown-btn']")
	private WebElement selectFilial;

	@FindBy(xpath = "//tr[@class='even']/td")
	private WebElement gridResultado;

	SNFRelatorioItensEmConserto(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputItem() {
		return inputItem;
	}

	public WebElement getInputCNPJAssisFornecedor() {
		return inputCNPJAssisFornecedor;
	}

	public WebElement getSelectDepartamento() {
		return selectDepartamento;
	}

	public WebElement getGridResultado() {
		return gridResultado;
	}

}
