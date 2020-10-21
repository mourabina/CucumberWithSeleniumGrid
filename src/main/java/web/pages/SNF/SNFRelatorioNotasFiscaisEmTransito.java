package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFRelatorioNotasFiscaisEmTransito {

	@FindBy(xpath = "//table[@class='table table-hover']/tbody//tr")
	private WebElement listaResultadoGrid;

	@FindBy(id = "nfId")
	private WebElement inputNumeroNF;

	@FindBy(id = "dtInicio")
	private WebElement inputDataInicio;

	@FindBy(xpath = "//*[@id='receiveStatus']//span[@class='dropdown-btn']")
	private WebElement selectStatusAgendamento;

	@FindBy(xpath = "//*[@id='codFilial']//span[@class='dropdown-btn']")
	private WebElement selectFilialDestino;

	@FindBy(id = "dtFim")
	private WebElement inputDataFim;

	SNFRelatorioNotasFiscaisEmTransito(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);

	}

	public WebElement getInputNumeroNF() {
		return inputNumeroNF;
	}

	public WebElement getInputDataInicio() {
		return inputDataInicio;
	}

	public WebElement getSelectStatusAgendamento() {
		return selectStatusAgendamento;
	}

	public WebElement getSelectFilialDestino() {
		return selectFilialDestino;
	}

	public WebElement getInputDataFim() {
		return inputDataFim;
	}

	public WebElement getListaResultadoGrid() {
		return listaResultadoGrid;
	}

}
