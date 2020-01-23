package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class VisaoGeralEDIGRPage extends BaseTest {
	
	@FindBy(id = "LABEL20")
	private WebElement textTituloPagina;
	
	@FindBy(id = "CODFORN")
	private WebElement inputCodFornecedor;
	
	@FindBy(id = "NOMEREDUZ")
	private WebElement textNomeFornecedorReduzido;
	
	@FindBy(id = "REG")
	private WebElement inputReginonal;
	
	@FindBy(id = "EDIFIL_WM")
	private WebElement inputFilial;
	
	@FindBy(id = "TL_FORNCNPJ")
	private WebElement inputCNPJ;
	
	@FindBy(id = "TL_TEMREP")
	private WebElement inputNomeFornecedor;
	
	@FindBy(id = "TL_INCLUSAO")
	private WebElement inputDataInclusaoEmTexto;
	
	@FindBy(name = "TL_EDITTCB")
	private WebElement checkBoxVerRegionais;
	
	@FindBy(id = "HORAEDI")
	private WebElement inputHorarioLimte;
	
	@FindBy(id = "SITPEDCB")
	private WebElement selectPedido;
	
	@FindBy(id = "SITINVOICCB")
	private WebElement selectNotaFiscal;
	
	@FindBy(name = "PEDPALLETCB")
	private WebElement checkBoxPedidoComGrade;
	
	@FindBy(name = "TL_PESOKGCB")
	private WebElement checkBoxRecebimentoEmKilo;
	
	@FindBy(id = "SITINVRPTCB")
	private WebElement selectPosicaoEstoque;
	
	@FindBy(id = "SITCOMDISCB")
	private WebElement selectRetornoNotaFiscal;
	
	@FindBy(id = "SITRAECB")
	private WebElement selectSituacao;
	
	@FindBy(id = "TIPORAECB")
	private WebElement selectTipo;
	
	@FindBy(id = "TL_FORNEAN")
	private WebElement inputEANFornecedor;
	
	@FindBy(name = "TL_EDICB")
	private WebElement checkBoxEDIAutomatico;
	
	@FindBy(id = "XTL_SEL1")
	private WebElement selectADD_CHEG_DEL;
	
	@FindBy(id = "XEDIDOC1")
	private WebElement selectDocumento;
	
	@FindBy(id = "XOVERLAY1")
	private WebElement selectVan;
	
	@FindBy(id = "XSITEDI1")
	private WebElement selectSituacaoEDI;
	
	@FindBy(id = "XCAIXAPOSTAL1")
	private WebElement inputEANCaixaPostal;

	VisaoGeralEDIGRPage(){
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTextTituloPagina() {
		return textTituloPagina;
	}

	public WebElement getInputCodFornecedor() {
		return inputCodFornecedor;
	}

	public WebElement getTextNomeFornecedorReduzido() {
		return textNomeFornecedorReduzido;
	}

	public WebElement getInputReginonal() {
		return inputReginonal;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputDataInclusaoEmTexto() {
		return inputDataInclusaoEmTexto;
	}

	public WebElement getCheckBoxVerRegionais() {
		return checkBoxVerRegionais;
	}

	public WebElement getInputHorarioLimte() {
		return inputHorarioLimte;
	}

	public WebElement getSelectPedido() {
		return selectPedido;
	}

	public WebElement getSelectNotaFiscal() {
		return selectNotaFiscal;
	}

	public WebElement getCheckBoxPedidoComGrade() {
		return checkBoxPedidoComGrade;
	}

	public WebElement getCheckBoxRecebimentoEmKilo() {
		return checkBoxRecebimentoEmKilo;
	}

	public WebElement getSelectPosicaoEstoque() {
		return selectPosicaoEstoque;
	}

	public WebElement getSelectRetornoNotaFiscal() {
		return selectRetornoNotaFiscal;
	}

	public WebElement getSelectSituacao() {
		return selectSituacao;
	}

	public WebElement getSelectTipo() {
		return selectTipo;
	}

	public WebElement getInputEANFornecedor() {
		return inputEANFornecedor;
	}

	public WebElement getCheckBoxEDIAutomatico() {
		return checkBoxEDIAutomatico;
	}

	public WebElement getSelectADD_CHEG_DEL() {
		return selectADD_CHEG_DEL;
	}

	public WebElement getSelectDocumento() {
		return selectDocumento;
	}

	public WebElement getSelectVan() {
		return selectVan;
	}

	public WebElement getSelectSituacaoEDI() {
		return selectSituacaoEDI;
	}

	public WebElement getInputEANCaixaPostal() {
		return inputEANCaixaPostal;
	}

}
