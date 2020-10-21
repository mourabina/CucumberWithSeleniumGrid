package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFHomePage {
	// ---------------------------------------- ADMINISTRAÃ‡ÃƒO
	// -----------------------//
	@FindBy(xpath = "//a[@aria-controls=\"Administração\"]")
	private WebElement MenuAdministracao;

	@FindBy(xpath = "//a[@aria-controls=\"Manutenção de Acesso\"]")
	private WebElement MenuManAcesso;

	@FindBy(xpath = "//a[@href=\"#/adm-user\" and contains(text(),\"Usuário\")]")
	private WebElement MenuUsuario;

	@FindBy(xpath = "//a[@href=\"#/adm-profile\"]")
	private WebElement MenuPerfil;

	// ---------------------------------------Parametrizações Operações
	// Logistica----------------------//
	@FindBy(xpath = "//a[@aria-controls=\"Parametrizações Operações/Logística\"]")
	private WebElement MenuParametrizacoesOperacoesLogistica;

	@FindBy(xpath = "//a[@href=\"#/adm-tolerance-maintenance\"]")
	private WebElement MenuManTolerancia;

	@FindBy(xpath = "//a[@href=\"#/adm-container-maintenance\"]")
	private WebElement MenuManContainer;

	@FindBy(xpath = "//a[@href=\"#/adm-carrier-maintenance\"]")
	private WebElement MenuManTransportadora;

	@FindBy(xpath = "//a[@href=\"#/adm-vendor-maintenance\"]")
	private WebElement MenuManFornecedor;

	// ---------------------------------------RECEBIMENTO--------------------------//
	@FindBy(xpath = "//a[@aria-controls=\"Recebimento\"]")
	private WebElement MenuRecebimento;

	// @FindBy(xpath = "//a[@aria-controls=\"Nota Fiscal\"]")
	@FindBy(xpath = "//a[contains(text(),'Nota Fiscal')]")
	private WebElement MenuNotaFiscal;

	@FindBy(xpath = "//a[@href=\"#/out-view-nf-shipping-return-shipping\"]")
	private WebElement MenuVisualizarNFRemessa;

	@FindBy(xpath = "//a[@href=\"#/inb-receiver\"]")
	private WebElement MenuVisualizarRecebimento;

	@FindBy(xpath = "//a[@href=\"#/adm-distribution-item\"]")
	private WebElement MenuConversaoPacoteVendedor;

	@FindBy(xpath = "//a[@aria-controls=\"Manutenção SIF\"]")
	private WebElement MenuManSIF;

	@FindBy(xpath = "//a[@href=\"#/vendor-govt-inspection\"]")
	private WebElement MenuParaEtiquetasSIF;

	@FindBy(xpath = "//a[@href=\"#/adm-type-store-lbl-printer\"]")
	private WebElement MenuParaImpressorasSIF;

	@FindBy(xpath = "//a[@href=\"#/sif-label-printing\"]")
	private WebElement MenuImpreEtiquetasSIF;

	@FindBy(xpath = "//a[@href=\"#/sif-message-parameterization\"]")
	private WebElement MenuParaMensagemSIF;

	@FindBy(xpath = "//a[@href=\"#/maintenance-partial-receipt\"]")
	private WebElement MenuManRecebimentoParcial;
	// -----------------------------------------REVISÃO
	// FISCAL---------------------------//
	@FindBy(xpath = "//a[@href=\"#/fiscal-review\"]")
	private WebElement MenuRevisaoFiscal;
	// -----------------------------------------SAIDA-----------------------------------//
	@FindBy(xpath = "//a[@aria-controls='Emissão de Notas Fiscais']")
	private WebElement MenuEmissaoNotaFiscal;

	@FindBy(xpath = "//a[@href=\"#/out-shipment\"]")
	private WebElement MenuEmbarque;

	@FindBy(xpath = "//div[@id='Emissão de Notas Fiscais']//a[@aria-controls='Operações/Logística']")
	private WebElement MenuOperaçoesLogistica;

	@FindBy(xpath = "//a[@href=\"#/out-adjusted-tags\"]")
	private WebElement MenuEtiquetaAjustada;

	@FindBy(xpath = "//a[@href=\"#/out-nf-adjustment\"] ")
	private WebElement MenuNotaFiscalAjuste;

	@FindBy(xpath = "//a[@href=\"#/out-return-label\"] ")
	private WebElement MenuEtiquetaRetorno;

	@FindBy(xpath = "//a[@href=\"#/out-cancel-nf\"] ")
	private WebElement MenuCancelamento;

	@FindBy(xpath = "//a[@href=\"#/out-nota-fiscal\"] ")
	private WebElement SubMenuEmissaoNotaFiscal;

	@FindBy(xpath = "//div[@id='Emissão de Notas Fiscais']//a[@aria-controls='Fiscal']")
	private WebElement SubMenuFiscal;

	@FindBy(xpath = "//a[@href=\"#/out-annulment-invoice\"]")
	private WebElement MenuConsultaNFParaAnulacao;
	// ------------------------------------PARAMETRIZAÇÂO
	// FISCAL----------------------//

	@FindBy(xpath = "//a[@aria-controls='Parâmetros Gerais'] ")
	private WebElement MenuParametrosGerais;

	@FindBy(xpath = "//a[@aria-controls=\"Parametrizações Fiscais\"] ")
	private WebElement MenuParametrizacaoFiscais;

	@FindBy(xpath = "//a[@href=\"#/adm-nature-operation\"]")
	private WebElement MenuNaturezaOperacao;

	@FindBy(xpath = "//a[@href=\"#/adm-profile-nat-oper\"]")
	private WebElement MenuPerfilNatureza;

	@FindBy(xpath = "//a[@href=\"#/adm-substitute-insc\"]")
	private WebElement MenuInscricaoSubstituto;

	@FindBy(xpath = "//a[@href=\"#/adm-st-param-dev-op\"]")
	private WebElement MenuParamSTOpDevolucao;

	@FindBy(xpath = "//a[@href=\"#/adm-legal-message\"]")
	private WebElement MenuMensagemLegal;

	@FindBy(xpath = "//a[@href=\"#/adm-master-data-form\"]")
	private WebElement MenuDadosMestre;
	// ------------------------------------Relatórios----------------------//
	@FindBy(xpath = "//a[@href=\"#/report-list\"]")
	private WebElement MenuAcompRelatorios;

	@FindBy(xpath = "//a[@class= 'btn btn-primary mr-1 re-btn-fa']")
	private WebElement buttonMais;

	public SNFHomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMenuParametrizacoesOperacoesLogistica() {
		return MenuParametrizacoesOperacoesLogistica;
	}

	public WebElement getMenuOperaçoesLogistica() {
		return MenuOperaçoesLogistica;
	}

	public WebElement getSubMenuEmissaoNotaFiscal() {
		return SubMenuEmissaoNotaFiscal;
	}

	public WebElement getSubMenuFiscal() {
		return SubMenuFiscal;
	}

	public WebElement getMenuParametrosGerais() {
		return MenuParametrosGerais;
	}

	public WebElement getMenuAdministracao() {
		return MenuAdministracao;
	}

	public WebElement getMenuRecebimento() {
		return MenuRecebimento;
	}

	public WebElement getMenuManAcesso() {
		return MenuManAcesso;
	}

	public WebElement getMenuUsuario() {
		return MenuUsuario;
	}

	public WebElement getMenuPerfil() {
		return MenuPerfil;
	}

	public WebElement getMenuPerfilNatureza() {
		return MenuPerfilNatureza;
	}

	public WebElement getMenuManTolerancia() {
		return MenuManTolerancia;
	}

	public WebElement getMenuManContainer() {
		return MenuManContainer;
	}

	public WebElement getMenuManTransportadora() {
		return MenuManTransportadora;
	}

	public WebElement getMenuManFornecedor() {
		return MenuManFornecedor;
	}

	public WebElement getMenuNotaFiscal() {
		return MenuNotaFiscal;
	}

	public WebElement getMenuVisualizarNFRemessa() {
		return MenuVisualizarNFRemessa;
	}

	public WebElement getMenuVisualizarRecebimento() {
		return MenuVisualizarRecebimento;
	}

	public WebElement getMenuConversaoPacoteVendedor() {
		return MenuConversaoPacoteVendedor;
	}

	public WebElement getMenuManSIF() {
		return MenuManSIF;
	}

	public WebElement getMenuParaEtiquetasSIF() {
		return MenuParaEtiquetasSIF;
	}

	public WebElement getMenuParaImpressorasSIF() {
		return MenuParaImpressorasSIF;
	}

	public WebElement getMenuImpreEtiquetasSIF() {
		return MenuImpreEtiquetasSIF;
	}

	public WebElement getMenuParaMensagemSIF() {
		return MenuParaMensagemSIF;
	}

	public WebElement getMenuManRecebimentoParcial() {
		return MenuManRecebimentoParcial;
	}

	public WebElement getMenuRevisaoFiscal() {
		return MenuRevisaoFiscal;
	}

	/*
	 * public WebElement getMenuSaida() { return MenuSaida; }
	 */

	public WebElement getMenuEmbarque() {
		return MenuEmbarque;
	}

	/*
	 * public WebElement getMenuAjuste() { return MenuAjuste; }
	 */

	public WebElement getMenuEtiquetaAjustada() {
		return MenuEtiquetaAjustada;
	}

	public WebElement getMenuNotaFiscalAjuste() {
		return MenuNotaFiscalAjuste;
	}

	public WebElement getMenuEtiquetaRetorno() {
		return MenuEtiquetaRetorno;
	}

	public WebElement getMenuCancelamento() {
		return MenuCancelamento;
	}

	public WebElement getMenuEmissaoNotaFiscal() {
		return MenuEmissaoNotaFiscal;
	}

	public WebElement getMenuConsultaNFParaAnulacao() {
		return MenuConsultaNFParaAnulacao;
	}

	public WebElement getMenuParametrizacaoFiscais() {
		return MenuParametrizacaoFiscais;
	}

	public WebElement getMenuNaturezaOperacao() {
		return MenuNaturezaOperacao;
	}

	public WebElement getMenuInscricaoSubstituto() {
		return MenuInscricaoSubstituto;
	}

	public WebElement getMenuParamSTOpDevolucao() {
		return MenuParamSTOpDevolucao;
	}

	public WebElement getMenuMensagemLegal() {
		return MenuMensagemLegal;
	}

	public WebElement getMenuDadosMestre() {
		return MenuDadosMestre;
	}

	public WebElement geMenuAcompRelatoriost() {
		return MenuAcompRelatorios;
	}

	public WebElement getMenuAcompRelatorios() {
		return MenuAcompRelatorios;
	}

	public WebElement getButtonMais() {
		return buttonMais;
	}
}
