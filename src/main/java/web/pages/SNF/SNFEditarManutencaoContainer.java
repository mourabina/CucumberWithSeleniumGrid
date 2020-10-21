package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEditarManutencaoContainer {

	@FindBy(xpath = "//h4[@class='mb-3 text-left']")
	private WebElement tituloPaginaEditar;

	@FindBy(name = "typeContainerId")
	private WebElement inputIDTipoContainer;

	@FindBy(name = "typeContainerName")
	private WebElement inputDescricaoTipoContainer;

	@FindBy(xpath = "//input[@formcontrolname='itemNbr']")
	private WebElement inputNumeroItemAqui;

	@FindBy(xpath = "//button[@class='btn btn-primary ml-3 rounded']/i")
	private WebElement btProcurarNumeroItemAqui;

	@FindBy(name = "itemDescription")
	private WebElement inputDescricaoPalete;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btSalvar;

	@FindBy(xpath = "//button[@class='btn btn-default mr-2']")
	private WebElement btRetornar;

	@FindBy(xpath = "//p[text()='Alteração efetuada com sucesso!']")
	private WebElement msgAlteracaoSucesso;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement msgErroItenNaoEncontrado;

	public SNFEditarManutencaoContainer(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPaginaEditar() {
		return tituloPaginaEditar;
	}

	public WebElement getBtProcurarNumeroItemAqui() {
		return btProcurarNumeroItemAqui;
	}

	public WebElement getInputDescricaoPalete() {
		return inputDescricaoPalete;
	}

	public WebElement getBtSalvar() {
		return btSalvar;
	}

	public WebElement getBtRetornar() {
		return btRetornar;
	}

	public WebElement getInputIDTipoContainer() {
		return inputIDTipoContainer;
	}

	public WebElement getInputDescricaoTipoContainer() {
		return inputDescricaoTipoContainer;
	}

	public WebElement getInputNumeroItemAqui() {
		return inputNumeroItemAqui;
	}

	public WebElement getMsgAlteracaoSucesso() {
		return msgAlteracaoSucesso;
	}

	public WebElement getMsgErroItenNaoEncontrado() {
		return msgErroItenNaoEncontrado;
	}

}
