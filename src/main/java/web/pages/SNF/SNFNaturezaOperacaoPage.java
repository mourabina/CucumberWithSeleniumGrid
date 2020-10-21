package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFNaturezaOperacaoPage {

	@FindBy(xpath = "//h2[text() = 'Natureza de Operação']")
	private WebElement tituloPagina;

	@FindBy(id = "idNatOperGroup")
	private WebElement selectAgrupamento;

	@FindBy(id = "codeFull")
	private WebElement selectNaturezaOperacao;

	@FindBy(id = "operationType")
	private WebElement selectTipoOperacao;

	@FindBy(id = "code")
	private WebElement inputCodigoNatureza;

	@FindBy(id = "cdStatus")
	private WebElement selectSituacaoNatureza;

	@FindBy(xpath = "//i[@class = 'fas fa-eraser']")
	private WebElement buttonLimpar;

	@FindBy(xpath = "//i[@class = 'fas fa-search']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//i[@class = 'fa fa-plus-circle']")
	private WebElement buttonAdicionarNatureza;

	@FindBy(xpath = "//i[@class = 'fas fa-sync-alt']")
	private WebElement buttonAtualizar;

	@FindBy(xpath = "//i[@class = 'fas fa-file-excel']")
	private WebElement buttonGerarExcel;

	@FindBy(xpath = "//input[@class = 'form-control rounder']")
	private WebElement inputPesquisar;

	@FindBy(xpath = "//div[@class='panel-body']//tbody/tr/td")
	private WebElement griResultado;

	@FindBy(xpath = "//p[@class='alert alert-info']")
	private WebElement msg;

	@FindBy(xpath = "//a[contains(@class,'btn btn-primary mr-2')]/i")
	private WebElement buttonMais;

	public SNFNaturezaOperacaoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getGriResultado() {
		return griResultado;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getSelectAgrupamento() {
		return selectAgrupamento;
	}

	public WebElement getSelectNaturezaOperacao() {
		return selectNaturezaOperacao;
	}

	public WebElement getSelectTipoOperacao() {
		return selectTipoOperacao;
	}

	public WebElement getInputCodigoNatureza() {
		return inputCodigoNatureza;
	}

	public WebElement getSelectSituacaoNatureza() {
		return selectSituacaoNatureza;
	}

	public WebElement getButtonLimpar() {
		return buttonLimpar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getButtonAdicionarNatureza() {
		return buttonAdicionarNatureza;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getButtonGerarExcel() {
		return buttonGerarExcel;
	}

	public WebElement getInputPesquisar() {
		return inputPesquisar;
	}

}
