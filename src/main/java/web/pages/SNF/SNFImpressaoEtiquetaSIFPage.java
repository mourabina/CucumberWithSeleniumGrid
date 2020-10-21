package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFImpressaoEtiquetaSIFPage {

	@FindBy(id = "businessUnit")
	private WebElement filial;

	@FindBy(xpath = "//label[@for=\"notaFiscalNbr\"]/ancestor::div[@class='form-group row']//div/input")
	private WebElement numeroNF;

	@FindBy(id = "//label[@for=\"seriesFrmCd\"]/ancestor::div[@class='form-group row']//div/input")
	private WebElement numeroSerie;

	@FindBy(xpath = "//p[@class='alert alert-danger sticky-top']")
	private WebElement msg;

	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private List<WebElement> headGridResultado;

	@FindBy(xpath = "//table[@class='table table-hover']/tbody/tr/td")
	private List<WebElement> valueGridResultado;

	public SNFImpressaoEtiquetaSIFPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsg() {
		return msg;
	}

	public List<WebElement> getHeadGridResultado() {
		return headGridResultado;
	}

	public List<WebElement> getValueGridResultado() {
		return valueGridResultado;
	}

	public WebElement getFilial() {
		return filial;
	}

	public WebElement getNumeroNF() {
		return numeroNF;
	}

	public WebElement getNumeroSerie() {
		return numeroSerie;
	}
}
