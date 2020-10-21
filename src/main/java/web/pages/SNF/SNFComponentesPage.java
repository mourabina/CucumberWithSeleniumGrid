package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFComponentesPage {

	@FindBy(xpath = "//button[contains(text(),'Salvar')]")
	private WebElement btnSalvar;

	@FindBy(xpath = "//button[contains(text(),'Histórico')]")
	private WebElement btnHistorico;

	@FindBy(xpath = "//a[child::i[@class = \fa fa-arrow-left\"]]")
	private WebElement btnRetornar;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-eraser\"]]")
	private WebElement btnLimpar;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-search\"]]")
	private WebElement btnPesquisar;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-sync-alt\"]]")
	private WebElement btnSincronizar;

	@FindBy(xpath = "//a[child::i[@class = \"fa fa-edit\"]]")
	private WebElement btnEditar;

	@FindBy(xpath = "//a[child::i[@class = \"fa fa-trash-alt\"]]")
	private WebElement btnRemover;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-angle-right\"]]")
	private WebElement btnProximaPagina;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-angle-double-right\"]]")
	private WebElement btnUltimaPagina;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-angle-left\"]]")
	private WebElement btnPaginaAnterior;

	@FindBy(xpath = "//a[child::i[@class = \"fas fa-angle-double-left\"]]")
	private WebElement btnPrimeiraPagina;

	@FindBy(xpath = "//a[child::i[@class = \"fa fa-plus-circle\"]]")
	private WebElement btnAdicionar;

	@FindBy(xpath = "//button[child::i[@class = \"fa fa-print\"]]")
	private WebElement brnImprimir;

	@FindBy(xpath = "//i[contains(@class,\"fa-spin\")]")
	private WebElement LoadingIcon;

	@FindBy(xpath = "//table[@class='table table-striped']//tr/th")
	private List<WebElement> listaHerderFormatoOrigem;

	@FindBy(xpath = "//table[@class='table table-hover']//tbody/tr/td")
	private List<WebElement> listaValueGriResultado;

	@FindBy(xpath = "//table[@class='table table-hover']//tr/th")
	private List<WebElement> listaHerderGridResultado;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr/td")
	private List<WebElement> listaValuesFormatoOrigem;

	@FindBy(xpath = "//button[contains(text(),'Confirmar')]")
	private WebElement btnConfirmar;

	@FindBy(xpath = "//button[contains(text(),'Cancelar')]")
	private WebElement btnCancelar;

	@FindBy(xpath = "//div[@id='print-section']//table[@class='table table-striped']//tbody/tr/*")
	private List<WebElement> valuesGridSelecionarMensagensDinamicas;

	@FindBy(xpath = "//div[@id='print-section']//table[@class='table table-striped']//thead//th")
	private List<WebElement> headerGridSelecionarMensagensDinamicas;

	public SNFComponentesPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public List<WebElement> getValuesGridSelecionarMensagensDinamicas() {
		return valuesGridSelecionarMensagensDinamicas;
	}

	public List<WebElement> getHeaderGridSelecionarMensagensDinamicas() {
		return headerGridSelecionarMensagensDinamicas;
	}

	public List<WebElement> getListaValueGriResultado() {
		return listaValueGriResultado;
	}

	public List<WebElement> getListaHerderGridResultado() {
		return listaHerderGridResultado;
	}

	public WebElement getBtnCancelar() {
		return btnCancelar;
	}

	public WebElement getBtnConfirmar() {
		return btnConfirmar;
	}

	public WebElement getBtnHistorico() {
		return btnHistorico;
	}

	public List<WebElement> getListaHerderFormatoOrigem() {
		return listaHerderFormatoOrigem;
	}

	public List<WebElement> getListaValuesFormatoOrigem() {
		return listaValuesFormatoOrigem;
	}

	public WebElement getBtnLimpar() {
		return btnLimpar;
	}

	public WebElement getBtnPesquisar() {
		return btnPesquisar;
	}

	public WebElement getBtnSincronizar() {
		return btnSincronizar;
	}

	public WebElement getBtnEditar() {
		return btnEditar;
	}

	public WebElement getBtnRemover() {
		return btnRemover;
	}

	public WebElement getBtnProximaPagina() {
		return btnProximaPagina;
	}

	public WebElement getBtnUltimaPagina() {
		return btnUltimaPagina;
	}

	public WebElement getBtnPaginaAnterior() {
		return btnPaginaAnterior;
	}

	public WebElement getBtnPrimeiraPagina() {
		return btnPrimeiraPagina;
	}

	public WebElement getBtnAdicionar() {
		return btnAdicionar;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}

	public WebElement getBtnRetornar() {
		return btnRetornar;
	}

	public WebElement getBrnImprimir() {
		return brnImprimir;
	}

	public WebElement getLoadingIcon() {
		return LoadingIcon;
	}

}
