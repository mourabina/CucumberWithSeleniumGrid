package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFInscricaoSubstitutoPage {

	@FindBy(id = "idBu")
	private WebElement filialEmitente;

	@FindBy(id = "destStateProvCd")
	private WebElement estadoDestino;

	@FindBy(id = "statusCode")
	private WebElement situacao;

	@FindBy(xpath = "//label[@for ='originState']/following-sibling::div//input")
	private WebElement estadoOrigem;

	@FindBy(xpath = "//label[@for =\"cnpjNbr\"]/following-sibling::div//input")
	private WebElement cnpj;

	@FindBy(xpath = "//input[@formcontrolname=\"substInscNbr\"]")
	private WebElement inscricaoSubstituto;

	@FindBy(xpath = "//input[@formcontrolname=\"originState\"]")
	private WebElement cadEstadoOrigem;

	@FindBy(xpath = "//input[@formcontrolname=\"cnpjNbr\"]")
	private WebElement cadCnpj;

	@FindBy(xpath = "//input[@formcontrolname=\"lastTs\"]")
	private WebElement manutencao;

	@FindBy(xpath = "//input[@formcontrolname=\"lastChangeUserID\"]")
	private WebElement usuario;

	@FindBy(xpath = "//button[@class='btn btn-default ml-2']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//button[contains(text(),'Salvar')]")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//p[@class='alert alert-success sticky-top']")
	private WebElement msg;

	// ===================================================================Tela
	// PEsquisar Inscrição
	// Substituto====================================================

	@FindBy(xpath = "//h4[@class='mb-5 text-left']")
	private WebElement labelTituloPagina;

	@FindBy(id = "idBu")
	private WebElement selecaoFilialEmitente;

	@FindBy(xpath = "//label[@for='originState']/ancestor::div[@class='form-group row']//input")
	private WebElement inputEstadoOrigem;

	@FindBy(xpath = "//label[@for='cnpjNbr']/ancestor::div[@class='form-group row']//input")
	private WebElement inputCNPJ;

	@FindBy(id = "destStateProvCd")
	private WebElement selecEstadoDestino;

	@FindBy(xpath = "//button[contains(text(),'Histórico')]")
	private WebElement buttonHistorico;

	@FindBy(xpath = "//button[@class='btn btn-primary float-right']")
	private WebElement buttonPesquisar;

	// ==================================================Tela Histórico Inscrição do
	// Substituto============================================================

	@FindBy(xpath = "//h4[@class ='modal-title']")
	private WebElement labelTituloHistoricoInscricao;

	// ======================================================================================================================================================

	public SNFInscricaoSubstitutoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getLabelTituloHistoricoInscricao() {
		return labelTituloHistoricoInscricao;
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getSelecaoFilialEmitente() {
		return selecaoFilialEmitente;
	}

	public WebElement getInputEstadoOrigem() {
		return inputEstadoOrigem;
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getSelecEstadoDestino() {
		return selecEstadoDestino;
	}

	public WebElement getButtonHistorico() {
		return buttonHistorico;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getFilialEmitente() {
		return filialEmitente;
	}

	public WebElement getEstadoDestino() {
		return estadoDestino;
	}

	public WebElement getSituacao() {
		return situacao;
	}

	public WebElement getEstadoOrigem() {
		return estadoOrigem;
	}

	public WebElement getCnpj() {
		return cnpj;
	}

	public WebElement getInscricaoSubstituto() {
		return inscricaoSubstituto;
	}

	public WebElement getCadEstadoOrigem() {
		return cadEstadoOrigem;
	}

	public WebElement getCadCnpj() {
		return cadCnpj;
	}

	public WebElement getManutencao() {
		return manutencao;
	}

	public WebElement getUsuario() {
		return usuario;
	}
}
