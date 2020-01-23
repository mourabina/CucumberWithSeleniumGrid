package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ConsultaInformacoesGeraisProdutoCPC10Page extends BaseTest {

	@FindBy(id = "LABEL66")
	private WebElement labelTituloPagina;

	@FindBy(id = "PDV")
	private WebElement inputPDV;

	@FindBy(id = "COD_PROD")
	private WebElement inputItem;

	@FindBy(id = "T_COD_LOJA")
	private WebElement inputLoja;

	@FindBy(id = "TL_FORN")
	private WebElement inputForn;

	@FindBy(id = "NOME_PROD")
	private WebElement textDescricaoItem;

	@FindBy(id = "TL_EMBCD1")
	private WebElement textEmbDep;

	@FindBy(id = "TL_CONVCD")
	private WebElement textUnidade;

	@FindBy(id = "COD_UPCREAL")
	private WebElement textUPCReal;

	@FindBy(id = "COD_LINHA")
	private WebElement textCodLinha;

	@FindBy(id = "NOME_LINHA")
	private WebElement textNomeLinha;

	@FindBy(id = "COD_SUBL")
	private WebElement textCodSubl;

	@FindBy(id = "NOME_SUBL")
	private WebElement textNomeSubl;

	@FindBy(id = "TIPO_EAN")
	private WebElement textTipoEAN;

	@FindBy(id = "COD_EAN")
	private WebElement textCodEAN;

	@FindBy(id = "COD_COMPR")
	private WebElement textIDComprElement;

	@FindBy(id = "NOME_COMPR")
	private WebElement textNomeCompr;

	@FindBy(id = "TL_EMB01")
	private WebElement textTipoEmb;

	@FindBy(id = "TL_FATCN")
	private WebElement textQuantEmb;

	@FindBy(id = "MODALIDADE")
	private WebElement textModalidade;

	@FindBy(id = "TL_GAR")
	private WebElement textGarantia;

	@FindBy(id = "COD_FORN")
	private WebElement textCodForncedor;

	@FindBy(id = "NOME_FORN")
	private WebElement textNomeForcedor;

	@FindBy(id = "CGCFORN")
	private WebElement textCGCFornecedor;

	@FindBy(id = "SITUACAO")
	private WebElement textSituacao;

	@FindBy(id = "DT_ULTRANS")
	private WebElement textPDV;

	@FindBy(id = "DT_IMPLANT")
	private WebElement textImpl;

	@FindBy(id = "DT_SIT")
	private WebElement textSIT;

	@FindBy(id = "ITEMA_VDCP")
	private WebElement textItemA;

	@FindBy(id = "TL_MODA")
	private WebElement textModa;

	@FindBy(id = "SEMAN_PROG")
	private WebElement textPDL;

	@FindBy(id = "ESPECIF1")
	private WebElement textOBS1;

	@FindBy(id = "ESPECIF2")
	private WebElement textOBS2;

	@FindBy(id = "ESPECIF3")
	private WebElement textOBS3;

	@FindBy(id = "ESPECIF4")
	private WebElement textOBS4;

	@FindBy(id = "TIPO_CESTA")
	private WebElement textCesta;

	@FindBy(id = "MULT_EAN")
	private WebElement multiEan;

	@FindBy(id = "TIPOINF")
	private WebElement restVDA;

	ConsultaInformacoesGeraisProdutoCPC10Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMultiEan() {
		return multiEan;
	}

	public WebElement getRestVDA() {
		return restVDA;
	}

	public WebElement getTextCesta() {
		return textCesta;
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
