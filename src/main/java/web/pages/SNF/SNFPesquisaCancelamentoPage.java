package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFPesquisaCancelamentoPage {
	
	
	@FindBy(xpath = "//h2[text()='Pesquisa e Cancelamento']")
	private WebElement tituloPagina;
	
	@FindBy(id = "companyId")
	private WebElement selectEmpresa;
	
	@FindBy(id = "filiaId")
	private WebElement selectFilial;
	
	@FindBy(xpath = "//label[@for=\"load\"]/parent::div//input")
	private WebElement inputNomeFilial;
	
	@FindBy(xpath = "//label[@for=\"nameForn\"]/parent::div//input")
	private WebElement inputCodigoFornecedor;
	
	@FindBy(xpath = "//label[@for=\"cnpj\"]/parent::div//input")
	private WebElement inputCNPJ;
	
	@FindBy(xpath = "//label[@for=\"razaoSocial\"]/parent::div//input")
	private WebElement inputRazaoSocial;
	
	@FindBy(xpath = "//label[@for=\"idNfe\"]/parent::div//input")
	private WebElement inputIDNFe;
	
	@FindBy(xpath = "//label[@for=\"invoiceNbr\"]/parent::div//input")
	private WebElement inputNumenroNFe;
	
	@FindBy(xpath = "//label[@for=\"nfSer\"]/parent::div//input")
	private WebElement inputSerie;
	
	@FindBy(xpath = "//label[@for=\"createTs'\"]/parent::div//input")
	private WebElement inputDataEmissao;
	
	@FindBy(xpath ="//label[@for=\"keyNfe\"]/parent::div//input")
	private WebElement inputChaveNFe;
	
	@FindBy(xpath = "//button[contains(text(),'Solicitar Cancelamento')]")
	private WebElement buttonSolicitarCancelamento;
	
	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private WebElement headGridResultadoPesquisa;

	public SNFPesquisaCancelamentoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getSelectEmpresa() {
		return selectEmpresa;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getInputNomeFilial() {
		return inputNomeFilial;
	}

	public WebElement getInputCodigoFornecedor() {
		return inputCodigoFornecedor;
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getInputRazaoSocial() {
		return inputRazaoSocial;
	}

	public WebElement getInputIDNFe() {
		return inputIDNFe;
	}

	public WebElement getInputNumenroNFe() {
		return inputNumenroNFe;
	}

	public WebElement getInputSerie() {
		return inputSerie;
	}

	public WebElement getInputDataEmissao() {
		return inputDataEmissao;
	}

	public WebElement getInputChaveNFe() {
		return inputChaveNFe;
	}

	public WebElement getButtonSolicitarCancelamento() {
		return buttonSolicitarCancelamento;
	}

	public WebElement getHeadGridResultadoPesquisa() {
		return headGridResultadoPesquisa;
	}

}
