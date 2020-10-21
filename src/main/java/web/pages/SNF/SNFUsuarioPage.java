package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFUsuarioPage {

	@FindBy(xpath = "//h4[@class='mb-5 text-left']")
	private WebElement tituloEditaUsuario;

	@FindBy(name = "username")
	private WebElement inputUsuario;

	@FindBy(name = "name")
	private WebElement inputName;

	@FindBy(name = "email")
	private WebElement inputEmail;

	@FindBy(name = "departmentId")
	private WebElement selectPortifolio;

	@FindBy(name = "typeBusinessUnitId")
	private WebElement selectTipoUnidadeNegocio;

	@FindBy(xpath = "//*[@name='businessUnits']//span[@class='dropdown-btn']")
	private WebElement selectFilial;

	@FindBy(name = "businessStructure")
	private WebElement selectEstruturaNegocio;

	@FindBy(name = "deleted")
	private WebElement selectSituação;

	@FindBy(xpath = "//*[@name='profiles']//span[@class='dropdown-btn']")
	private WebElement selectPerfies;

	@FindBy(id = "comments")
	private WebElement inputComentarios;

	@FindBy(xpath = "//button[@class='btn btn-default mr-2']")
	private WebElement btRetornar;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btSalvar;

	// ==========================================Tela Pesquisa de
	// Usuário======================================================

	@FindBy(id = "name")
	private WebElement inputPesqNome;

	@FindBy(id = "username")
	private WebElement inputPesqUsuario;

	@FindBy(id = "typeBusinessUnitId")
	private WebElement selectPesqTipoUnidadeNegocio;

	@FindBy(id = "businessUnitId")
	private WebElement selectPesqFilial;

	@FindBy(id = "deleted")
	private WebElement selectPesqSituacao;

	public SNFUsuarioPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTituloEditaUsuario() {
		return tituloEditaUsuario;
	}

	public WebElement getInputUsuario() {
		return inputUsuario;
	}

	public WebElement getInputName() {
		return inputName;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public WebElement getSelectPortifolio() {
		return selectPortifolio;
	}

	public WebElement getSelectTipoUnidadeNegocio() {
		return selectTipoUnidadeNegocio;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getSelectEstruturaNegocio() {
		return selectEstruturaNegocio;
	}

	public WebElement getSelectSituação() {
		return selectSituação;
	}

	public WebElement getSelectPerfies() {
		return selectPerfies;
	}

	public WebElement getInputComentarios() {
		return inputComentarios;
	}

	public WebElement getBtRetornar() {
		return btRetornar;
	}

	public WebElement getBtSalvar() {
		return btSalvar;
	}

	public WebElement getInputPesqNome() {
		return inputPesqNome;
	}

	public WebElement getInputPesqUsuario() {
		return inputPesqUsuario;
	}

	public WebElement getSelectPesqTipoUnidadeNegocio() {
		return selectPesqTipoUnidadeNegocio;
	}

	public WebElement getSelectPesqFilial() {
		return selectPesqFilial;
	}

	public WebElement getSelectPesqSituacao() {
		return selectPesqSituacao;
	}

}
