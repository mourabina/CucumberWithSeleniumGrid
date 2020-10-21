package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFToleranciaRecebimentoPereciveisPage {

	@FindBy(xpath = "//h2[text()='Tolerância no Recebimento de Perecíveis']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//i[@class = 'fa fa-plus-circle']")
	private WebElement buttonMais;

	@FindBy(xpath = "//i[@class = 'fas fa-sync-alt']")
	private WebElement buttonAtualizar;

	@FindBy(xpath = "//input[@class = 'form-control rounder']")
	private WebElement inputProcurar;

	@FindBy(id = "portfolioId")
	private WebElement selectTipoPortifolio;

	@FindBy(id = "typeTolerance")
	private WebElement selectTipoPeso;

	@FindBy(id = "typeFormatTolerance")
	private WebElement selectFormato;

	// ==================================Tela Adicionar/Editar Tolerancia de
	// Recebimento Pereciveis=============================

	@FindBy(id = "portfolioId")
	private WebElement selectAddTipoPortifolio;

	@FindBy(id = "typeTolerance")
	private WebElement selectAddTipoPeso;

	@FindBy(id = "typeFormatTolerance")
	private WebElement selectAddFormato;

	@FindBy(id = "value")
	private WebElement inputAddValor;

	@FindBy(id = "qty")
	private WebElement inputQuantidadePorcento;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btSalvar;

	@FindBy(xpath = "//button[@class='btn btn-default mr-2']")
	private WebElement btRetornar;

	public SNFToleranciaRecebimentoPereciveisPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectTipoPortifolio() {
		return selectTipoPortifolio;
	}

	public WebElement getSelectTipoPeso() {
		return selectTipoPeso;
	}

	public WebElement getSelectFormato() {
		return selectFormato;
	}

	public WebElement getSelectAddTipoPortifolio() {
		return selectAddTipoPortifolio;
	}

	public WebElement getSelectAddTipoPeso() {
		return selectAddTipoPeso;
	}

	public WebElement getSelectAddFormato() {
		return selectAddFormato;
	}

	public WebElement getInputAddValor() {
		return inputAddValor;
	}

	public WebElement getInputQuantidadePorcento() {
		return inputQuantidadePorcento;
	}

	public WebElement getBtSalvar() {
		return btSalvar;
	}

	public WebElement getBtRetornar() {
		return btRetornar;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

}
