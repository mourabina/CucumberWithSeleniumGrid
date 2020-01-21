package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class VisaoGeralEDIGRPage extends BaseTest {
	
	@FindBy(id = "idLABEL20")
	private WebElement textTituloPagina;
	
	@FindBy(id = "idCODFORN")
	private WebElement inputCodFornecedor;
	
	@FindBy(id = "idNOMEREDUZ")
	private WebElement textNomeFornecedorReduzido;
	
	@FindBy(id = "idREG")
	private WebElement inputReginonal;
	
	@FindBy(id = "idEDIFIL_WM")
	private WebElement inputFilial;
	
	@FindBy(id = "TL_FORNCNPJ")
	private WebElement inputCNPJ;
	
	@FindBy(id = "idTL_TEMREP")
	private WebElement inputNomeFornecedor;
	
	@FindBy(id = "TL_INCLUSAO")
	private WebElement inputDataInclusaoEmTexto;
	
	@FindBy(name = "TL_EDITTCB")
	private WebElement checkBoxVerRegionais;
	
	@FindBy(id = "idHORAEDI")
	private WebElement inputHorarioLimte;
	
	@FindBy(id = "idSITPEDCB")
	private WebElement selectPedido;
	
	@FindBy(id = "idSITINVOICCB")
	private WebElement selectNotaFiscal;
	
	@FindBy(name = "PEDPALLETCB")
	private WebElement checkBoxPedidoComGrade;
	
	@FindBy(name = "TL_PESOKGCB")
	private WebElement checkBoxRecebimentoEmKilo;
	
	@FindBy(id = "idSITINVRPTCB")
	private WebElement selectPosicaoEstoque;
	
	@FindBy(id = "idSITCOMDISCB")
	private WebElement selectRetornoNotaFiscal;
	
	@FindBy(id = "idSITRAECB")
	private WebElement selectSituacao;
	
	@FindBy(id = "idTIPORAECB")
	private WebElement selectTipo;
	
	@FindBy(id = "idTL_FORNEAN")
	private WebElement inputEANFornecedor;
	
	@FindBy(name = "TL_EDICB")
	private WebElement checkBoxEDIAutomatico;
	
	@FindBy(id = "idXTL_SEL1")
	private WebElement selectADD_CHEG_DEL;
	
	@FindBy(id = "idXEDIDOC1")
	private WebElement selectDocumento;
	
	@FindBy(id = "idXOVERLAY1")
	private WebElement selectVan;
	
	@FindBy(id = "idXSITEDI1")
	private WebElement selectSituacaoEDI;
	
	@FindBy(id = "idXCAIXAPOSTAL1")
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
