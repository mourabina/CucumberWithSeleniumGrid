package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PedidoFornecedorCPC62Page {

	@FindBy(id = "Label21")
	private WebElement tituloPagina;

	@FindBy(id = "TL_FILIAL_WM")
	private WebElement inputFilial;

	@FindBy(id = "TL_FORNEC")
	private WebElement inputFornecedor;

	@FindBy(id = "TL_COMPR")
	private WebElement inputComprador;

	@FindBy(id = "TL_PED")
	private WebElement inputStatusPedido;

	@FindBy(id = "TL_CGC")
	private WebElement inputCNPJ;

	@FindBy(id = "TL_FNOME")
	private WebElement inputNomeFornecedor;

	@FindBy(id = "TL_DATA")
	private WebElement inputDataPrev;

	@FindBy(id = "panel_TL_OPC_0")
	private WebElement checboxOpcao_0;

	@FindBy(id = "panel_TL_OPC_1")
	private WebElement checboxOpcao_1;

	@FindBy(id = "panel_TL_OPC_2")
	private WebElement checboxOpcao_2;

	@FindBy(id = "panel_TL_FILINQ_WM_0")
	private WebElement gridFilial_0;

	@FindBy(id = "panel_TL_FILINQ_WM_1")
	private WebElement gridFilial_1;

	@FindBy(id = "panel_TL_FILINQ_WM_2")
	private WebElement gridFilial_2;

	@FindBy(id = "panel_TL_FORNINQ_0")
	private WebElement gridForn_0;

	@FindBy(id = "panel_TL_FORNINQ_1")
	private WebElement gridForn_1;

	@FindBy(id = "panel_TL_FORNINQ_2")
	private WebElement gridForn_2;

	@FindBy(id = "panel_TL_PEDIDO_0")
	private WebElement gridPedido_0;

	@FindBy(id = "panel_TL_PEDIDO_1")
	private WebElement gridPedido_1;

	@FindBy(id = "panel_TL_PEDIDO_2")
	private WebElement gridPedido_2;

	@FindBy(id = "panel_TL_DTEMIS_0")
	private WebElement gridDataEmissao_0;

	@FindBy(id = "panel_TL_DTEMIS_1")
	private WebElement gridDataEmissao_1;

	@FindBy(id = "panel_TL_DTEMIS_2")
	private WebElement gridDataEmissao_2;

	@FindBy(id = "panel_TL_VALOR_0")
	private WebElement gridValor_0;

	@FindBy(id = "panel_TL_VALOR_1")
	private WebElement gridValor_1;

	@FindBy(id = "panel_TL_VALOR_2")
	private WebElement gridValor_2;

	@FindBy(id = "panel_TL_DTENTR_0")
	private WebElement gridPreEntrada_0;

	@FindBy(id = "panel_TL_DTENTR_1")
	private WebElement gridPreEntrada_1;

	@FindBy(id = "panel_TL_DTENTR_2")
	private WebElement gridPreEntrada_2;

	@FindBy(id = "panel_TL_CPRINQ_0")
	private WebElement gridCompr_0;

	@FindBy(id = "panel_TL_CPRINQ_1")
	private WebElement gridCompr_1;

	@FindBy(id = "panel_TL_CPRINQ_2")
	private WebElement gridCompr_2;

	@FindBy(id = "panel_TL_SIT_0")
	private WebElement gridSIT_0;

	@FindBy(id = "panel_TL_SIT_1")
	private WebElement gridSIT_1;

	@FindBy(id = "panel_TL_SIT_2")
	private WebElement gridSIT_2;

	@FindBy(id = "panel_TL_TIPO_0")
	private WebElement gridTipo_0;

	@FindBy(id = "panel_TL_TIPO_1")
	private WebElement gridTipo_1;

	@FindBy(id = "panel_TL_TIPO_2")
	private WebElement gridTipo_2;

	@FindBy(id = "panel_TL_EDI_0")
	private WebElement gridEDI_0;

	@FindBy(id = "panel_TL_EDI_1")
	private WebElement gridEDI_1;

	@FindBy(id = "panel_TL_EDI_2")
	private WebElement gridEDI_2;

	@FindBy(id = "panel_TL_PEDIDOWM_0")
	private WebElement gridPedidoWM_0;

	@FindBy(id = "panel_TL_PEDIDOWM_1")
	private WebElement gridPedidoWM_1;

	@FindBy(id = "panel_TL_PEDIDOWM_2")
	private WebElement gridPedidoWM_2;

	public PedidoFornecedorCPC62Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputFilial() {
		return inputFilial;
	}

	public WebElement getInputFornecedor() {
		return inputFornecedor;
	}

	public WebElement getInputComprador() {
		return inputComprador;
	}

	public WebElement getInputStatusPedido() {
		return inputStatusPedido;
	}

	public WebElement getInputCNPJ() {
		return inputCNPJ;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputDataPrev() {
		return inputDataPrev;
	}

	public WebElement getChecboxOpcao_0() {
		return checboxOpcao_0;
	}

	public WebElement getChecboxOpcao_1() {
		return checboxOpcao_1;
	}

	public WebElement getChecboxOpcao_2() {
		return checboxOpcao_2;
	}

	public WebElement getGridFilial_0() {
		return gridFilial_0;
	}

	public WebElement getGridFilial_1() {
		return gridFilial_1;
	}

	public WebElement getGridFilial_2() {
		return gridFilial_2;
	}

	public WebElement getGridForn_0() {
		return gridForn_0;
	}

	public WebElement getGridForn_1() {
		return gridForn_1;
	}

	public WebElement getGridForn_2() {
		return gridForn_2;
	}

	public WebElement getGridPedido_0() {
		return gridPedido_0;
	}

	public WebElement getGridPedido_1() {
		return gridPedido_1;
	}

	public WebElement getGridPedido_2() {
		return gridPedido_2;
	}

	public WebElement getGridDataEmissao_0() {
		return gridDataEmissao_0;
	}

	public WebElement getGridDataEmissao_1() {
		return gridDataEmissao_1;
	}

	public WebElement getGridDataEmissao_2() {
		return gridDataEmissao_2;
	}

	public WebElement getGridValor_0() {
		return gridValor_0;
	}

	public WebElement getGridValor_1() {
		return gridValor_1;
	}

	public WebElement getGridValor_2() {
		return gridValor_2;
	}

	public WebElement getGridPreEntrada_0() {
		return gridPreEntrada_0;
	}

	public WebElement getGridPreEntrada_1() {
		return gridPreEntrada_1;
	}

	public WebElement getGridPreEntrada_2() {
		return gridPreEntrada_2;
	}

	public WebElement getGridCompr_0() {
		return gridCompr_0;
	}

	public WebElement getGridCompr_1() {
		return gridCompr_1;
	}

	public WebElement getGridCompr_2() {
		return gridCompr_2;
	}

	public WebElement getGridSIT_0() {
		return gridSIT_0;
	}

	public WebElement getGridSIT_1() {
		return gridSIT_1;
	}

	public WebElement getGridSIT_2() {
		return gridSIT_2;
	}

	public WebElement getGridTipo_0() {
		return gridTipo_0;
	}

	public WebElement getGridTipo_1() {
		return gridTipo_1;
	}

	public WebElement getGridTipo_2() {
		return gridTipo_2;
	}

	public WebElement getGridEDI_0() {
		return gridEDI_0;
	}

	public WebElement getGridEDI_1() {
		return gridEDI_1;
	}

	public WebElement getGridEDI_2() {
		return gridEDI_2;
	}

	public WebElement getGridPedidoWM_0() {
		return gridPedidoWM_0;
	}

	public WebElement getGridPedidoWM_1() {
		return gridPedidoWM_1;
	}

	public WebElement getGridPedidoWM_2() {
		return gridPedidoWM_2;
	}

}
