package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFParametrizacaoEtiquetasSIFPage {

	@FindBy(xpath = "//h2[text()=\"Parametrização de Etiquetas SIF\"]")
	private WebElement tituloPage;

	@FindBy(id = "cnpj")
	private WebElement Cpf_Cnpj;

	@FindBy(id = "vendorName")
	private WebElement NomeFornecedor;

	@FindBy(id = "govtInspectionCode")
	private WebElement CodigoSIF;

	// ========================================Adicionar Parametrização de Etiqueta
	// SIF===========================================================

	@FindBy(xpath = "//input[@formcontrolname='cnpj']")
	private WebElement inputCpf_Cnpj;

	@FindBy(xpath = "//input[@formcontrolname='vendorName']")
	private WebElement inputNomeFornecedor;

	@FindBy(xpath = "//input[@formcontrolname='govtInspectionCode']")
	private WebElement inputCodigoSif;

	@FindBy(xpath = "//input[@formcontrolname='cnpj']/ancestor::div[@class='input-group']/div/button/i")
	private WebElement btPesquisaCPF_CNPJ;

	@FindBy(xpath = "//input[@formcontrolname='vendorName']/ancestor::div[@class='input-group']/div/button/i")
	private WebElement btPesquisaNomeFornecedor;

	public SNFParametrizacaoEtiquetasSIFPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputCpf_Cnpj() {
		return inputCpf_Cnpj;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputCodigoSif() {
		return inputCodigoSif;
	}

	public WebElement getBtPesquisaCPF_CNPJ() {
		return btPesquisaCPF_CNPJ;
	}

	public WebElement getBtPesquisaNomeFornecedor() {
		return btPesquisaNomeFornecedor;
	}

	public WebElement getTituloPage() {
		return tituloPage;
	}

	public WebElement getCpf_Cnpj() {
		return Cpf_Cnpj;
	}

	public WebElement getNomeFornecedor() {
		return NomeFornecedor;
	}

	public WebElement getCodigoSIF() {
		return CodigoSIF;
	}

}
