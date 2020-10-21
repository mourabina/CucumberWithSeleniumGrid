package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEmissaoDeNotaFiscalPage {

	@FindBy(xpath = "//h4[text()='Emissão Nota Fiscal']")
	private WebElement tutuloPagina;

	@FindBy(xpath = "//input[@formcontrolname='nfStatus']")
	private WebElement inputSituacaoNF;

	@FindBy(xpath = "//select[@formcontrolname='companyId']")
	private WebElement selectEmpresa;

	@FindBy(xpath = "//select[@formcontrolname='buId']")
	private WebElement selectFilial;

	@FindBy(xpath = "//input[@formcontrolname='idNfe']")
	private WebElement inputIDNFe;

	@FindBy(xpath = "//input[@formcontrolname='notaFiscalNbr']")
	private WebElement inputNumeroNFe;

	@FindBy(xpath = "//input[@formcontrolname='serie']")
	private WebElement inputSerie;

	@FindBy(xpath = "//input[@formcontrolname='dtEmissao']")
	private WebElement inputDataEmissao;

	@FindBy(xpath = "//input[@formcontrolname='chaveNfe']")
	private WebElement inputChaveNFe;

	@FindBy(xpath = "//div[@class='row mb-2']//button[contains(text(),'Nova NF')]")
	private WebElement buttonNovaNF;

	@FindBy(xpath = "//div[@class='row mb-2']//button[contains(text(),'Pesquisar')]")
	private WebElement buttonPesquisar;

	/*
	 * @FindBy(xpath = "//input[@formcontrolname='filialName']") private WebElement
	 * inputNomeFilial;
	 */

	@FindBy(xpath = "//input[@formcontrolname='codFornecedor']")
	private WebElement inputCodigoFornecedor;

	@FindBy(xpath = "//input[@formcontrolname='cpfCnpj']")
	private WebElement inputCPF_CNPJ;

	/*
	 * @FindBy(xpath = "//input[@formcontrolname='razaoSocial']") private WebElement
	 * inputRazaoSocial;
	 */

	@FindBy(xpath = "//select[@formcontrolname='idNatOper']")
	private WebElement selectNaturezaOperacao;

	@FindBy(xpath = "//input[@formcontrolname='natOperGroupName']")
	private WebElement inputAgrupamento;

	@FindBy(xpath = "//input[@formcontrolname='operationType']")
	private WebElement inputTipoOperacao;

	@FindBy(xpath = "//select[@formcontrolname='contaContabil']")
	private WebElement selectContaContabil;

	@FindBy(xpath = "//input[@formcontrolname='referNotaFiscalNbr']")
	private WebElement inpuNumeroNotaReferenciada;

	@FindBy(xpath = "//input[@formcontrolname='referNotaFiscalNbr']/ancestor::div[@class='input-group']//button")
	private WebElement buttonPesquisaNumeroNotaReferenciada;

	@FindBy(xpath = "//input[@formcontrolname='referSerie']")
	private WebElement inputSerieNotaReferenciada;

	@FindBy(xpath = "//input[@formcontrolname='dataEntrada']")
	private WebElement inputDataEmissaoReferenciada;

	@FindBy(xpath = "//input[@formcontrolname='referChave']")
	private WebElement inputChaveNFeReferenciada;

	@FindBy(xpath = "//input[@formcontrolname='notaFiscalReferenteId']")
	private WebElement inputIDNFReferenteReferenciada;

	@FindBy(xpath = "//select[@formcontrolname='motivoAnulacao']")
	private WebElement selectMotivoAnulacao;

	@FindBy(xpath = "//textarea[@formcontrolname='observacoes']")
	private WebElement textareaObservacoes;

	@FindBy(xpath = "//textarea[@formcontrolname='comentarioAnulacao']")
	private WebElement textareaComentarioAnulacao;

	@FindBy(xpath = "//select[@formcontrolname='destFilial']")
	private WebElement selectFilialDest;

	@FindBy(xpath = "//input[@formcontrolname='destBuName']")
	private WebElement inputNomeFialialDest;

	@FindBy(xpath = "//input[@formcontrolname='destCnpjCpf']")
	private WebElement inputCNPJ_CPF_DEST;

	@FindBy(xpath = "//input[@formcontrolname='destRazaoSocial']")
	private WebElement inputRazaoSocialDest;

	@FindBy(xpath = "//input[@formcontrolname='destCodFornecedor']")
	private WebElement inputCodigoFornecedorDest;

	@FindBy(xpath = "//input[@formcontrolname='destCodFornecedor']/ancestor::div[@class='input-group']//button")
	private WebElement buttonPesquisarCodigoFornecedorDest;

	@FindBy(xpath = "//select[@formcontrolname='transpTipoFrete']")
	private WebElement selectTransTipoFrete;

	@FindBy(xpath = "//input[@formcontrolname='transpCodigo']")
	private WebElement inputTransCodigo;

	@FindBy(xpath = "//input[@formcontrolname='transpCnpjTransport']")
	private WebElement inputTransCNPJTransporte;

	@FindBy(xpath = "//input[@formcontrolname='transpCnpjTransport']/ancestor::div[@class='input-group']//button")
	private WebElement buttonPesquisarCNPTransporte;

	@FindBy(xpath = "//input[@formcontrolname='transpUf']")
	private WebElement inputTransUF;

	@FindBy(xpath = "//input[@formcontrolname='transpRazaoSocial']")
	private WebElement inputTransRazaoSocial;

	@FindBy(xpath = "//input[@formcontrolname='transpPlacaCaminhao']")
	private WebElement inputTransPlacaCaminhao;

	@FindBy(xpath = "//input[@formcontrolname='transpEndereco']")
	private WebElement inputTransEndereco;

	@FindBy(xpath = "//select[@formcontrolname='transpUfPlaca']")
	private WebElement selectTransUFPlaca;

	@FindBy(xpath = "//div[@class='row mt-3 mb-4']//button[@class='btn btn-primary']/i")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//div[@class='row mb-2']//button/i[@class='fa fa-ban']")
	private WebElement buttonCancelarID;

	@FindBy(xpath = "//div[@class='row mb-2']//button/i[@class='fa fa-history']")
	private WebElement btHistorico;

	@FindBy(xpath = "//div[@class='row mt-3 mb-4']//button[contains(text(), 'Retornar')]")
	private WebElement btRetornar;

	public SNFEmissaoDeNotaFiscalPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtHistorico() {
		return btHistorico;
	}

	public WebElement getBtRetornar() {
		return btRetornar;
	}

	public WebElement getTutuloPagina() {
		return tutuloPagina;
	}

	public WebElement getInputSituacaoNF() {
		return inputSituacaoNF;
	}

	public WebElement getSelectEmpresa() {
		return selectEmpresa;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getInputIDNFe() {
		return inputIDNFe;
	}

	public WebElement getInputNumeroNFe() {
		return inputNumeroNFe;
	}

	public WebElement getInputSerie() {
		return inputSerie;
	}

	public WebElement getInputDataEmissao() {
		return inputDataEmissao;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getInputChaveNFe() {
		return inputChaveNFe;
	}

	public WebElement getButtonNovaNF() {
		return buttonNovaNF;
	}

	public WebElement getInputCodigoFornecedor() {
		return inputCodigoFornecedor;
	}

	public WebElement getInputCPF_CNPJ() {
		return inputCPF_CNPJ;
	}

	public WebElement getSelectNaturezaOperacao() {
		return selectNaturezaOperacao;
	}

	public WebElement getInputAgrupamento() {
		return inputAgrupamento;
	}

	public WebElement getInputTipoOperacao() {
		return inputTipoOperacao;
	}

	public WebElement getSelectContaContabil() {
		return selectContaContabil;
	}

	public WebElement getInpuNumeroNotaReferenciada() {
		return inpuNumeroNotaReferenciada;
	}

	public WebElement getButtonPesquisaNumeroNotaReferenciada() {
		return buttonPesquisaNumeroNotaReferenciada;
	}

	public WebElement getInputSerieNotaReferenciada() {
		return inputSerieNotaReferenciada;
	}

	public WebElement getInputDataEmissaoReferenciada() {
		return inputDataEmissaoReferenciada;
	}

	public WebElement getInputChaveNFeReferenciada() {
		return inputChaveNFeReferenciada;
	}

	public WebElement getInputIDNFReferenteReferenciada() {
		return inputIDNFReferenteReferenciada;
	}

	public WebElement getSelectMotivoAnulacao() {
		return selectMotivoAnulacao;
	}

	public WebElement getTextareaObservacoes() {
		return textareaObservacoes;
	}

	public WebElement getTextareaComentarioAnulacao() {
		return textareaComentarioAnulacao;
	}

	public WebElement getSelectFilialDest() {
		return selectFilialDest;
	}

	public WebElement getInputNomeFialialDest() {
		return inputNomeFialialDest;
	}

	public WebElement getInputCNPJ_CPF_DEST() {
		return inputCNPJ_CPF_DEST;
	}

	public WebElement getInputRazaoSocialDest() {
		return inputRazaoSocialDest;
	}

	public WebElement getInputCodigoFornecedorDest() {
		return inputCodigoFornecedorDest;
	}

	public WebElement getButtonPesquisarCodigoFornecedorDest() {
		return buttonPesquisarCodigoFornecedorDest;
	}

	public WebElement getSelectTransTipoFrete() {
		return selectTransTipoFrete;
	}

	public WebElement getInputTransCodigo() {
		return inputTransCodigo;
	}

	public WebElement getInputTransCNPJTransporte() {
		return inputTransCNPJTransporte;
	}

	public WebElement getButtonPesquisarCNPTransporte() {
		return buttonPesquisarCNPTransporte;
	}

	public WebElement getInputTransUF() {
		return inputTransUF;
	}

	public WebElement getInputTransRazaoSocial() {
		return inputTransRazaoSocial;
	}

	public WebElement getInputTransPlacaCaminhao() {
		return inputTransPlacaCaminhao;
	}

	public WebElement getInputTransEndereco() {
		return inputTransEndereco;
	}

	public WebElement getSelectTransUFPlaca() {
		return selectTransUFPlaca;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonCancelarID() {
		return buttonCancelarID;
	}

}
