package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFAdicionarNaturezaOperacaoPage {

	@FindBy(xpath = "//input[@formcontrolname= 'code']")
	private WebElement inputCodigoNaturezaOperacao;

	@FindBy(xpath = "//select[@formcontrolname= 'operationType']")
	private WebElement selectTipoOperacao;

	@FindBy(xpath = "//select[@formcontrolname= 'allowPriceInput']")
	private WebElement selectPermiteDigitarPreco;

	@FindBy(xpath = "//select[@formcontrolname=\"cdStatus\"]")
	private WebElement selectSituacaoNatureza;

	public WebElement getSelectPermiteDigitarPreco() {
		return selectPermiteDigitarPreco;
	}

	@FindBy(xpath = "//select[@formcontrolname= 'idNatOperGroup']")
	private WebElement selectAgrupamento;

	@FindBy(id = "idNatOperRef")
	private WebElement selectNaturezaOperacao;

	@FindBy(xpath = "//input[@formcontrolname= 'description']")
	private WebElement inputDescricaoNaturezaOperacao;

	@FindBy(xpath = "//select[@formcontrolname='allowPriceInput']")
	private WebElement selectPermiteDigitarPrecoUnitario;

	@FindBy(xpath = "//input[@formcontrolname= 'objectNgroupId']")
	private WebElement inputCodigoID;

	@FindBy(xpath = "//input[@formcontrolname= 'indAccountingDesc']")
	private WebElement inputIndicaNaturezaContabil;

	@FindBy(xpath = "//input[@formcontrolname= 'indSubstInscDesc']")
	private WebElement inputDestInscSubstituto;

	@FindBy(xpath = "//input[@formcontrolname= 'indLegalEntityDesc']")
	private WebElement inputPermiteOperacaoColigadas;

	@FindBy(xpath = "//input[@formcontrolname= 'indIssueDestDesc']")
	private WebElement inputDestinoEmissao;

	@FindBy(xpath = "//input[@formcontrolname= 'idSearchTypeNfDesc']")
	private WebElement inputTipoNFReferente;

	@FindBy(xpath = "//input[@formcontrolname= 'indReqAccountDesc']")
	private WebElement inputExigeContaContabil;

	@FindBy(xpath = "//input[@formcontrolname=\"idSelTypeDstDesc\"]")
	private WebElement inputTipoSelecaoDestino;

	@FindBy(xpath = "//input[@formcontrolname = 'indVendorDestDesc']")
	private WebElement inputPermiteDestinoFornecedor;

	@FindBy(xpath = "//input[@formcontrolname = 'indGenTypeNfDesc']")
	private WebElement inputTipoGeracaoNotaFiscal;

	@FindBy(xpath = "//input[@formcontrolname = 'indManipProdDesc']")
	private WebElement inputPermiteProdutosManipulados;

	@FindBy(xpath = "//input[@formcontrolname = 'indReqRemitParamDesc']")
	private WebElement inputExigeParamRecRemessa;

	@FindBy(xpath = "//select[@formcontrolname = 'indGetCfop']")
	private WebElement selectObtemCFOP;

	@FindBy(xpath = "//input[@formcontrolname = 'printedNatOperNf']")
	private WebElement inputDescricaoNaturezaOPeracaoNF;

	@FindBy(xpath = "//select[@formcontrolname = 'idNatOperRef']")
	private WebElement selectTipoNaturezaOPeracaoReferente;

	@FindBy(xpath = "//select[@formcontrolname = 'idCfopSelectType']")
	private WebElement selectTipoSelecao;

	@FindBy(xpath = "//select[@formcontrolname = 'cfopOperCode']")
	private WebElement selectCFOP;

	@FindBy(xpath = "//select[@class ='custom-select d-block w-100']")
	private WebElement selectTipoNFReferente;

	@FindBy(xpath = "//select[@formcontrolname='idCfopTypeNf']")
	private WebElement selectCFOPNF;

	@FindBy(xpath = "//select[@formcontrolname='cfopIntraCode']")
	private WebElement selectDentroUF;

	@FindBy(xpath = "//select[@formcontrolname='cfopInterCode']")
	private WebElement selectForaUF;

	@FindBy(xpath = "//select[@formcontrolname='cfopExpCode']")
	private WebElement selectExportacao;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst00Cd']")
	private WebElement selectCFOPNotaFiscalCST0;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst10Cd']")
	private WebElement selectCFOPNotaFiscalCST10;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst20Cd']")
	private WebElement selectCFOPNotaFiscalCST20;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst30Cd']")
	private WebElement selectCFOPNotaFiscalCST30;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst40Cd']")
	private WebElement selectCFOPNotaFiscalCST40;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst41Cd']")
	private WebElement selectCFOPNotaFiscalCST41;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst50Cd']")
	private WebElement selectCFOPNotaFiscalCST50;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst51Cd']")
	private WebElement selectCFOPNotaFiscalCST51;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst60Cd']")
	private WebElement selectCFOPNotaFiscalCST60;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst70Cd']")
	private WebElement selectCFOPNotaFiscalCST70;

	@FindBy(xpath = "//select[@formcontrolname='cfopCst90Cd']")
	private WebElement selectCFOPNotaFiscalCST90;

	@FindBy(xpath = "//select[@formcontrolname='indUpdateStock']")
	private WebElement selectAtualizarEstoque;

	@FindBy(xpath = "//select[@formcontrolname='indTechAssit']")
	private WebElement selectControleAssitenciaTecnica;

	@FindBy(xpath = "//select[@formcontrolname='indRecovIcmsSt']")
	private WebElement selectRecuperaICMSST;

	@FindBy(xpath = "//select[@formcontrolname='indReqNfRef']")
	private WebElement selectObrigaNotaFiscalReferente;

	@FindBy(xpath = "//select[@formcontrolname='indPartialRec']")
	private WebElement selectPermiteRecebimentoParcial;

	@FindBy(xpath = "//button[contains(text(), 'Mensagem Legal')]")
	private WebElement buttonMensagemLegal;

	@FindBy(xpath = "//button[contains(text(), 'Salvar')]")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//button[contains(text(), 'Histórico')]")
	private WebElement buttonHistorico;

	@FindBy(xpath = "//button[@class = 'btn btn-default']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//div[contains(text(), 'Dados da Natureza de Operação')]")
	private WebElement labelDadosNaturezaOperacao;

	@FindBy(xpath = "//div[@class='col-12 text-left']")
	private WebElement msgError;

	@FindBy(xpath = "//div[contains(text(),'Formato de Origem e Destino X Tipo de Nota Fiscal')]//ancestor::div[@class='card mb-2']//i[@class='fa fa-plus-circle'] ")
	private WebElement buttonMaisRemessaRetorno;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr/td")
	private WebElement listaFormatoRemessaRetorno;

	@FindBy(xpath = "//div[contains(text(),'Parâmetros Adicionais')]")
	private WebElement labelParemetrosAdicionais;

	@FindBy(xpath = "//select[@formcontrolname='idBuTpOrig']")
	private WebElement selectUnOrigem;

	@FindBy(xpath = "//select[@formcontrolname='idBuTpDest']")
	private WebElement selectUnDestino;

	@FindBy(xpath = "//select[@formcontrolname='idNfType']")
	private WebElement selectTipoNota;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement buttonAdicionar;

	@FindBy(xpath = "//div[@class='modal-body']/p")
	private WebElement msgOrigem;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement buttonRemover;

	@FindBy(xpath = "//div[contains(text(),'Parâmetros Recebimento Remessa e Retorno de Remessa')]/parent::div//div[@class='card-body text-left']//i[1]")
	private WebElement buttonMaisCFOPPermitidos;

	@FindBy(id = "cfopOperCode")
	private WebElement selectCFOPPermitido;

	@FindBy(xpath = "//button[@class='btn btn-primary ml-3 rounded']")
	private WebElement buttonAdicionarCFOPPermitidos;

	@FindBy(xpath = "//div[@class='col-sm-7 text-left align-middle']")
	private WebElement labelUser;

	@FindBy(xpath = "//h4[@class='modal-title']")
	private WebElement labelTituloPaginaHistorico;

	@FindBy(xpath = "//label[contains(text(),\"Usuário\")]//parent::div//input")
	private WebElement inputUsuaio;

	public SNFAdicionarNaturezaOperacaoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSelectNaturezaOperacao() {
		return selectNaturezaOperacao;
	}

	public WebElement getButtonMaisCFOPPermitidos() {
		return buttonMaisCFOPPermitidos;
	}

	public WebElement getSelectCFOPPermitido() {
		return selectCFOPPermitido;
	}

	public WebElement getButtonAdicionarCFOPPermitidos() {
		return buttonAdicionarCFOPPermitidos;
	}

	public WebElement getInputUsuaio() {
		return inputUsuaio;
	}

	public WebElement getButtonHistorico() {
		return buttonHistorico;
	}

	public WebElement getLabelTituloPaginaHistorico() {
		return labelTituloPaginaHistorico;
	}

	public WebElement getLabelUser() {
		return labelUser;
	}

	public WebElement getButtonRemover() {
		return buttonRemover;
	}

	public WebElement getMsgOrigem() {
		return msgOrigem;
	}

	public WebElement getButtonAdicionar() {
		return buttonAdicionar;
	}

	public WebElement getSelectUnOrigem() {
		return selectUnOrigem;
	}

	public WebElement getSelectUnDestino() {
		return selectUnDestino;
	}

	public WebElement getSelectTipoNota() {
		return selectTipoNota;
	}

	public WebElement getSelectPermiteDigitarPrecoUnitario() {
		return selectPermiteDigitarPrecoUnitario;
	}

	public WebElement getLabelParemetrosAdicionais() {
		return labelParemetrosAdicionais;
	}

	public WebElement getListaFormatoRemessaRetorno() {
		return listaFormatoRemessaRetorno;
	}

	public WebElement getButtonMaisRemessaRetorno() {
		return buttonMaisRemessaRetorno;
	}

	public WebElement getMsgError() {
		return msgError;
	}

	public WebElement getLabelDadosNaturezaOperacao() {
		return labelDadosNaturezaOperacao;
	}

	public WebElement getInputCodigoNaturezaOperacao() {
		return inputCodigoNaturezaOperacao;
	}

	public WebElement getSelectTipoOperacao() {
		return selectTipoOperacao;
	}

	public WebElement getSelectSituacaoNatureza() {
		return selectSituacaoNatureza;
	}

	public WebElement getSelectAgrupamento() {
		return selectAgrupamento;
	}

	public WebElement getInputDescricaoNaturezaOperacao() {
		return inputDescricaoNaturezaOperacao;
	}

	public WebElement getInputCodigoID() {
		return inputCodigoID;
	}

	public WebElement getInputIndicaNaturezaContabil() {
		return inputIndicaNaturezaContabil;
	}

	public WebElement getInputDestInscSubstituto() {
		return inputDestInscSubstituto;
	}

	public WebElement getInputPermiteOperacaoColigadas() {
		return inputPermiteOperacaoColigadas;
	}

	public WebElement getInputDestinoEmissao() {
		return inputDestinoEmissao;
	}

	public WebElement getInputTipoNFReferente() {
		return inputTipoNFReferente;
	}

	public WebElement getInputExigeContaContabil() {
		return inputExigeContaContabil;
	}

	public WebElement getInputTipoSelecaoDestino() {
		return inputTipoSelecaoDestino;
	}

	public WebElement getInputPermiteDestinoFornecedor() {
		return inputPermiteDestinoFornecedor;
	}

	public WebElement getInputTipoGeracaoNotaFiscal() {
		return inputTipoGeracaoNotaFiscal;
	}

	public WebElement getInputPermiteProdutosManipulados() {
		return inputPermiteProdutosManipulados;
	}

	public WebElement getInputExigeParamRecRemessa() {
		return inputExigeParamRecRemessa;
	}

	public WebElement getSelectObtemCFOP() {
		return selectObtemCFOP;
	}

	public WebElement getInputDescricaoNaturezaOPeracaoNF() {
		return inputDescricaoNaturezaOPeracaoNF;
	}

	public WebElement getSelectTipoNaturezaOPeracaoReferente() {
		return selectTipoNaturezaOPeracaoReferente;
	}

	public WebElement getSelectTipoSelecao() {
		return selectTipoSelecao;
	}

	public WebElement getSelectCFOP() {
		return selectCFOP;
	}

	public WebElement getSelectTipoNFReferente() {
		return selectTipoNFReferente;
	}

	public WebElement getSelectCFOPNF() {
		return selectCFOPNF;
	}

	public WebElement getSelectDentroUF() {
		return selectDentroUF;
	}

	public WebElement getSelectForaUF() {
		return selectForaUF;
	}

	public WebElement getSelectExportacao() {
		return selectExportacao;
	}

	public WebElement getSelectCFOPNotaFiscalCST0() {
		return selectCFOPNotaFiscalCST0;
	}

	public WebElement getSelectCFOPNotaFiscalCST10() {
		return selectCFOPNotaFiscalCST10;
	}

	public WebElement getSelectCFOPNotaFiscalCST20() {
		return selectCFOPNotaFiscalCST20;
	}

	public WebElement getSelectCFOPNotaFiscalCST30() {
		return selectCFOPNotaFiscalCST30;
	}

	public WebElement getSelectCFOPNotaFiscalCST40() {
		return selectCFOPNotaFiscalCST40;
	}

	public WebElement getSelectCFOPNotaFiscalCST41() {
		return selectCFOPNotaFiscalCST41;
	}

	public WebElement getSelectCFOPNotaFiscalCST50() {
		return selectCFOPNotaFiscalCST50;
	}

	public WebElement getSelectCFOPNotaFiscalCST51() {
		return selectCFOPNotaFiscalCST51;
	}

	public WebElement getSelectCFOPNotaFiscalCST60() {
		return selectCFOPNotaFiscalCST60;
	}

	public WebElement getSelectCFOPNotaFiscalCST70() {
		return selectCFOPNotaFiscalCST70;
	}

	public WebElement getSelectCFOPNotaFiscalCST90() {
		return selectCFOPNotaFiscalCST90;
	}

	public WebElement getSelectAtualizarEstoque() {
		return selectAtualizarEstoque;
	}

	public WebElement getSelectControleAssitenciaTecnica() {
		return selectControleAssitenciaTecnica;
	}

	public WebElement getSelectRecuperaICMSST() {
		return selectRecuperaICMSST;
	}

	public WebElement getSelectObrigaNotaFiscalReferente() {
		return selectObrigaNotaFiscalReferente;
	}

	public WebElement getSelectPermiteRecebimentoParcial() {
		return selectPermiteRecebimentoParcial;
	}

	public WebElement getButtonMensagemLegal() {
		return buttonMensagemLegal;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

}
