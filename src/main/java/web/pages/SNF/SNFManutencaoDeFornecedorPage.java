package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFManutencaoDeFornecedorPage {

	@FindBy(xpath = "//input[@formcontrolname='vendorNbr']")
	private WebElement inputCodigoFornecedor;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	private WebElement inputNomeFornecedor;

	@FindBy(xpath = "//input[@formcontrolname='cnpjCpf']")
	private WebElement inputCNPJ_CPF;

	@FindBy(xpath = "//input[@formcontrolname='address']")
	private WebElement inputNomeDaRua;

	@FindBy(xpath = "//input[@formcontrolname='addressNbr']")
	private WebElement inputNumero;

	@FindBy(xpath = "//input[@formcontrolname='addressInfo']")
	private WebElement inputComplemento;

	@FindBy(xpath = "//input[@formcontrolname='state']")
	private WebElement inputEstado;

	@FindBy(xpath = "//input[@formcontrolname='cityId']")
	private WebElement inputCidade;

	@FindBy(xpath = "//input[@formcontrolname='neighborhood']")
	private WebElement inputBairro;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private WebElement inputTelefone;

	@FindBy(xpath = "//input[@formcontrolname='postalCode']")
	private WebElement inputCodigoPostal;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement inputEmail;

	@FindBy(xpath = "//input[@formcontrolname='danfeYN']")
	private WebElement inputDanfe;

	@FindBy(xpath = "//input[@formcontrolname='inscEst']")
	private WebElement inputInscricaoEstadual;

	@FindBy(xpath = "//input[@formcontrolname='inscMun']")
	private WebElement inputInscricaoMunicipal;

	@FindBy(xpath = "//input[@formcontrolname='idSuframa']")
	private WebElement inputIdSuframa;

	@FindBy(xpath = "//input[@formcontrolname='ean']")
	private WebElement inputEAN;

	@FindBy(xpath = "//label[@for=\"cnpjStatus\"]/parent::div//select")
	private WebElement selectSituacaoCNPJ;

	@FindBy(xpath = "//input[@formcontrolname='natureType']")
	private WebElement inputTipoNatureza;

	@FindBy(xpath = "//input[@formcontrolname='cnaePrimary']")
	private WebElement inputCNAEPrimario;

	@FindBy(xpath = "//input[@formcontrolname='cnaeDescPrimary']")
	private WebElement inpuDescCNAEPrimario;

	@FindBy(xpath = "//input[@formcontrolname='cnaeSecundary']")
	private WebElement inputCNAESecundario;

	@FindBy(xpath = "//input[@formcontrolname='cnaeDescSecundary']")
	private WebElement inputDescCNAESecundario;

	@FindBy(xpath = "//input[@formcontrolname='funrural']")
	private WebElement inputFuneral;

	@FindBy(xpath = "//select[@formcontrolname='discountAmtIpiBasic']")
	private WebElement selectValorDescoscontoIPIBasico;

	@FindBy(xpath = "//select[@formcontrolname='discountAmtBaseIcms']")
	private WebElement selectValorDescoscontoBaseICMS;

	@FindBy(xpath = "//select[@formcontrolname='discountAmtBaseIcmsSt']")
	private WebElement selectValorDescoscontoBaseICMSST;

	@FindBy(xpath = "//select[@formcontrolname='freightAmtIpiBasic']")
	private WebElement selectValorFreteIPIBasico;

	@FindBy(xpath = "//select[@formcontrolname='freightAmtBaseIcms']")
	private WebElement selectValorFreteBaseICMS;

	@FindBy(xpath = "//select[@formcontrolname='freightAmtBaseIcmsSt']")
	private WebElement selectValorBaseICMSST;

	@FindBy(xpath = "//select[@formcontrolname='adicionalAmtIpiBasic']")
	private WebElement selectDespesasAdicionaisIPIBasico;

	@FindBy(xpath = "//select[@formcontrolname='adicionalAmtBaseIcms']")
	private WebElement selectDespesasAdicionaisBaseICMS;

	@FindBy(xpath = "//select[@formcontrolname='adicionalAmtBaseIcmsSt']")
	private WebElement selectDespesasAdicionaisBaseICMSST;

	@FindBy(xpath = "//select[@formcontrolname='ipiBasicBaseIcms']")
	private WebElement selectIPIBasicoBaseICMS;

	@FindBy(xpath = "//select[@formcontrolname='ipiBasicBaseIcmsSt']")
	private WebElement selectIPIBasicoBaseICMSST;

	@FindBy(xpath = "//select[@formcontrolname='indicaIcms']")
	private WebElement selectIPIBasicoIndicaICMS;

	@FindBy(xpath = "//select[@formcontrolname='indicaPis']")
	private WebElement selectIPIBasicoIndicaPis;

	@FindBy(xpath = "//select[@formcontrolname='indicaCofins']")
	private WebElement selectIPIBasicoIndicaConfins;

	@FindBy(xpath = "//select[@formcontrolname='filialReparos']")
	private WebElement selectFilialReparos;

	@FindBy(xpath = "//select[@formcontrolname='importerIndicator']")
	private WebElement selectImporterIndicador;

	@FindBy(xpath = "//select[@formcontrolname='regimeEspecial']")
	private WebElement selectRegimeEspecial;

	@FindBy(xpath = "//select[@formcontrolname='apuracaoFiscal']")
	private WebElement selectEscrituracaoApuracaoFiscalICMSST;

	@FindBy(xpath = "//select[@formcontrolname='contabilizacao']")
	private WebElement selectContabilizacaoICMSSTCreditado;

	@FindBy(xpath = "//select[@formcontrolname='transferencia']")
	private WebElement selectTranferenciaCustoMedio;

	@FindBy(xpath = "//input[@formcontrolname='dataEfetiva']")
	private WebElement inputDataEfetiva;

	@FindBy(xpath = "//input[@formcontrolname='dataVencimento']")
	private WebElement inputDataVencimento;

	@FindBy(xpath = "//input[@formcontrolname='lastChangeId']")
	private WebElement inputUsuarioUltimaAtualizacao;

	@FindBy(xpath = "//input[@formcontrolname='lastChangeTs']")
	private WebElement inputDataUltimaAlteracao;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement buttonAtualizar;

	@FindBy(xpath = "//button[contains(text(),'Histórico')]")
	private WebElement buttonHistorico;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement buttonRetornar;

	// ==================================Tela de Pesquisa de Manutenção
	// Fornecedor=================================================//

	@FindBy(xpath = "//a[@class='btn btn-secondary mr-2']/i")
	private WebElement btAtualizar;

	@FindBy(xpath = "//input[@placeholder='Procurar...']")
	private WebElement inputProcurar;

	@FindBy(xpath = "//a[@class='btn btn-success ml-2 mb-2']")
	private WebElement btGerarExcel;

	@FindBy(id = "vendorNbr")
	private WebElement pesquisaCodigoFornecedor;

	@FindBy(xpath = "//label[contains(text(),'Tipo Documento')]/ancestor::div[@class='form-group row']//select")
	private WebElement inputPesquisaTipoDocumento;

	@FindBy(id = "companyId")
	private WebElement inputPesquisaEmpresa;

	@FindBy(id = "cnpjCpf")
	private WebElement inputesquisaNumeroCNPJ;

	@FindBy(id = "businessUnitId")
	private WebElement inputPesquisaFilial;

	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private WebElement headGridResultado;

	@FindBy(xpath = "//table[@class='table table-hover']/tbody/tr/td")
	private WebElement valueGridResultado;

	@FindBy(xpath = "//a[@class='btn btn-link']")
	private WebElement btEditar;

	@FindBy(xpath = "//a[@class='btn btn-default text-secondary mr-2 float-right']/i")
	private WebElement btLimpar;

	@FindBy(xpath = "//button[@class='btn btn-primary float-right']/i")
	private WebElement btPesquisar;

	public SNFManutencaoDeFornecedorPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectContabilizacaoICMSSTCreditado() {
		return selectContabilizacaoICMSSTCreditado;
	}

	public WebElement getBtAtualizar() {
		return btAtualizar;
	}

	public WebElement getInputProcurar() {
		return inputProcurar;
	}

	public WebElement getBtGerarExcel() {
		return btGerarExcel;
	}

	public WebElement getPesquisaCodigoFornecedor() {
		return pesquisaCodigoFornecedor;
	}

	public WebElement getInputPesquisaTipoDocumento() {
		return inputPesquisaTipoDocumento;
	}

	public WebElement getInputPesquisaEmpresa() {
		return inputPesquisaEmpresa;
	}

	public WebElement getInputesquisaNumeroCNPJ() {
		return inputesquisaNumeroCNPJ;
	}

	public WebElement getInputPesquisaFilial() {
		return inputPesquisaFilial;
	}

	public WebElement getHeadGridResultado() {
		return headGridResultado;
	}

	public WebElement getValueGridResultado() {
		return valueGridResultado;
	}

	public WebElement getBtEditar() {
		return btEditar;
	}

	public WebElement getBtLimpar() {
		return btLimpar;
	}

	public WebElement getBtPesquisar() {
		return btPesquisar;
	}

	public WebElement getInputCodigoFornecedor() {
		return inputCodigoFornecedor;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputCNPJ_CPF() {
		return inputCNPJ_CPF;
	}

	public WebElement getInputNomeDaRua() {
		return inputNomeDaRua;
	}

	public WebElement getInputNumero() {
		return inputNumero;
	}

	public WebElement getInputComplemento() {
		return inputComplemento;
	}

	public WebElement getInputEstado() {
		return inputEstado;
	}

	public WebElement getInputCidade() {
		return inputCidade;
	}

	public WebElement getInputBairro() {
		return inputBairro;
	}

	public WebElement getInputTelefone() {
		return inputTelefone;
	}

	public WebElement getInputCodigoPostal() {
		return inputCodigoPostal;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public WebElement getInputDanfe() {
		return inputDanfe;
	}

	public WebElement getInputInscricaoEstadual() {
		return inputInscricaoEstadual;
	}

	public WebElement getInputInscricaoMunicipal() {
		return inputInscricaoMunicipal;
	}

	public WebElement getInputIdSuframa() {
		return inputIdSuframa;
	}

	public WebElement getInputEAN() {
		return inputEAN;
	}

	public WebElement getSelectSituacaoCNPJ() {
		return selectSituacaoCNPJ;
	}

	public WebElement getInputTipoNatureza() {
		return inputTipoNatureza;
	}

	public WebElement getInputCNAEPrimario() {
		return inputCNAEPrimario;
	}

	public WebElement getInpuDescCNAEPrimario() {
		return inpuDescCNAEPrimario;
	}

	public WebElement getInputCNAESecundario() {
		return inputCNAESecundario;
	}

	public WebElement getInputDescCNAESecundario() {
		return inputDescCNAESecundario;
	}

	public WebElement getInputFuneral() {
		return inputFuneral;
	}

	public WebElement getSelectValorDescoscontoIPIBasico() {
		return selectValorDescoscontoIPIBasico;
	}

	public WebElement getSelectValorDescoscontoBaseICMS() {
		return selectValorDescoscontoBaseICMS;
	}

	public WebElement getSelectValorDescoscontoBaseICMSST() {
		return selectValorDescoscontoBaseICMSST;
	}

	public WebElement getSelectValorFreteIPIBasico() {
		return selectValorFreteIPIBasico;
	}

	public WebElement getSelectValorFreteBaseICMS() {
		return selectValorFreteBaseICMS;
	}

	public WebElement getSelectValorBaseICMSST() {
		return selectValorBaseICMSST;
	}

	public WebElement getSelectDespesasAdicionaisIPIBasico() {
		return selectDespesasAdicionaisIPIBasico;
	}

	public WebElement getSelectDespesasAdicionaisBaseICMS() {
		return selectDespesasAdicionaisBaseICMS;
	}

	public WebElement getSelectDespesasAdicionaisBaseICMSST() {
		return selectDespesasAdicionaisBaseICMSST;
	}

	public WebElement getSelectIPIBasicoBaseICMS() {
		return selectIPIBasicoBaseICMS;
	}

	public WebElement getSelectIPIBasicoBaseICMSST() {
		return selectIPIBasicoBaseICMSST;
	}

	public WebElement getSelectIPIBasicoIndicaICMS() {
		return selectIPIBasicoIndicaICMS;
	}

	public WebElement getSelectIPIBasicoIndicaPis() {
		return selectIPIBasicoIndicaPis;
	}

	public WebElement getSelectIPIBasicoIndicaConfins() {
		return selectIPIBasicoIndicaConfins;
	}

	public WebElement getSelectFilialReparos() {
		return selectFilialReparos;
	}

	public WebElement getSelectImporterIndicador() {
		return selectImporterIndicador;
	}

	public WebElement getSelectRegimeEspecial() {
		return selectRegimeEspecial;
	}

	public WebElement getSelectEscrituracaoApuracaoFiscalICMSST() {
		return selectEscrituracaoApuracaoFiscalICMSST;
	}

	public WebElement getSelectTranferenciaCustoMedio() {
		return selectTranferenciaCustoMedio;
	}

	public WebElement getInputDataEfetiva() {
		return inputDataEfetiva;
	}

	public WebElement getInputDataVencimento() {
		return inputDataVencimento;
	}

	public WebElement getInputUsuarioUltimaAtualizacao() {
		return inputUsuarioUltimaAtualizacao;
	}

	public WebElement getInputDataUltimaAlteracao() {
		return inputDataUltimaAlteracao;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getButtonHistorico() {
		return buttonHistorico;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

}
