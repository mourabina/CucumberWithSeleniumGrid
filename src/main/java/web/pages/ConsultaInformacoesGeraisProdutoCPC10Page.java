package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ConsultaInformacoesGeraisProdutoCPC10Page extends BaseTest{
	
	@FindBy(id = "idLABEL66")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "idPDV")
	private WebElement inputPDV;
	
	@FindBy(id = "idCOD_PROD")
	private WebElement inputItem;
	
	@FindBy(id = "idT_COD_LOJA")
	private WebElement inputLoja;
	
	@FindBy(id = "idTL_FORN")
	private WebElement inputForn;
	
	@FindBy(id = "idNOME_PROD")
	private WebElement textDescricaoItem;
	
	@FindBy(id = "idTL_EMBCD1")
	private WebElement textEmbDep;
	
	@FindBy(id = "idTL_CONVCD")
	private WebElement textUnidade;
	
	@FindBy(id = "idCOD_UPCREAL")
	private WebElement textUPCReal;
	
	@FindBy(id = "idCOD_LINHA")
	private WebElement textCodLinha;
	
	@FindBy(id = "idNOME_LINHA")
	private WebElement textNomeLinha;
	
	@FindBy(id = "idCOD_SUBL")
	private WebElement textCodSubl;
	
	@FindBy(id = "idNOME_SUBL")
	private WebElement textNomeSubl;
	
	@FindBy(id = "idTIPO_EAN")
	private WebElement textTipoEAN;
	
	@FindBy(id = "idCOD_EAN")
	private WebElement textCodEAN;
	
	@FindBy(id = "idCOD_COMPR")
	private WebElement textIDComprElement;
	
	@FindBy(id = "idNOME_COMPR")
	private WebElement textNomeCompr;
	
	@FindBy(id = "idTL_EMB01")
	private WebElement textTipoEmb;
	
	@FindBy(id = "idTL_FATCN")
	private WebElement textQuantEmb;
	
	@FindBy(id= "idMODALIDADE")
	private WebElement textModalidade;
	
	@FindBy(id = "idTL_GAR")
	private WebElement textGarantia;
	
	@FindBy(id = "idCOD_FORN")
	private WebElement textCodForncedor;
	
	@FindBy(id = "idNOME_FORN")
	private WebElement textNomeForcedor;
	
	@FindBy(id = "idCGCFORN")
	private WebElement textCGCFornecedor;
	
	@FindBy(id = "idSITUACAO")
	private WebElement textSituacao;
	
	@FindBy(id = "idDT_ULTRANS")
	private WebElement textPDV;
	
	@FindBy(id = "idDT_IMPLANT")
	private WebElement textImpl;
	
	@FindBy(id = "idDT_SIT")
	private WebElement textSIT;
	
	@FindBy(id = "idITEMA_VDCP")
	private WebElement textItemA;
	
	@FindBy(id ="idTL_MODA")
	private WebElement textModa;
	
	@FindBy(id = "idSEMAN_PROG")
	private WebElement textPDL;
	
	@FindBy(id = "idESPECIF1")
	private WebElement textOBS1;
	
	@FindBy(id = "idESPECIF2")
	private WebElement textOBS2;
	
	@FindBy(id = "idESPECIF3")
	private WebElement textOBS3;
	
	@FindBy(id = "idESPECIF4")
	private WebElement textOBS4;
	
	ConsultaInformacoesGeraisProdutoCPC10Page(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputPDV() {
		return inputPDV;
	}

	public WebElement getInputItem() {
		return inputItem;
	}

	public WebElement getInputLoja() {
		return inputLoja;
	}

	public WebElement getInputForn() {
		return inputForn;
	}

	public WebElement getTextDescricaoItem() {
		return textDescricaoItem;
	}

	public WebElement getTextEmbDep() {
		return textEmbDep;
	}

	public WebElement getTextUnidade() {
		return textUnidade;
	}

	public WebElement getTextUPCReal() {
		return textUPCReal;
	}

	public WebElement getTextCodLinha() {
		return textCodLinha;
	}

	public WebElement getTextNomeLinha() {
		return textNomeLinha;
	}

	public WebElement getTextCodSubl() {
		return textCodSubl;
	}

	public WebElement getTextNomeSubl() {
		return textNomeSubl;
	}

	public WebElement getTextTipoEAN() {
		return textTipoEAN;
	}

	public WebElement getTextCodEAN() {
		return textCodEAN;
	}

	public WebElement getTextIDComprElement() {
		return textIDComprElement;
	}

	public WebElement getTextNomeCompr() {
		return textNomeCompr;
	}

	public WebElement getTextTipoEmb() {
		return textTipoEmb;
	}

	public WebElement getTextQuantEmb() {
		return textQuantEmb;
	}

	public WebElement getTextModalidade() {
		return textModalidade;
	}

	public WebElement getTextGarantia() {
		return textGarantia;
	}

	public WebElement getTextCodForncedor() {
		return textCodForncedor;
	}

	public WebElement getTextNomeForcedor() {
		return textNomeForcedor;
	}

	public WebElement getTextCGCFornecedor() {
		return textCGCFornecedor;
	}

	public WebElement getTextSituacao() {
		return textSituacao;
	}

	public WebElement getTextPDV() {
		return textPDV;
	}

	public WebElement getTextImpl() {
		return textImpl;
	}

	public WebElement getTextSIT() {
		return textSIT;
	}

	public WebElement getTextItemA() {
		return textItemA;
	}

	public WebElement getTextModa() {
		return textModa;
	}

	public WebElement getTextPDL() {
		return textPDL;
	}

	public WebElement getTextOBS1() {
		return textOBS1;
	}

	public WebElement getTextOBS2() {
		return textOBS2;
	}

	public WebElement getTextOBS3() {
		return textOBS3;
	}

	public WebElement getTextOBS4() {
		return textOBS4;
	}

}
