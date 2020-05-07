package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class CadPRPage extends BaseTest {

	@FindBy(id = "TL_TITULO")
	private WebElement labelTituloPagina;

	@FindBy(id = "X_BT_INQ")
	private WebElement buttonConsultar;

	@FindBy(id = "X_BT_ADD")
	private WebElement buttonIncluir;

	@FindBy(id = "X_BT_CHG")
	private WebElement buttonAlterar;

	@FindBy(id = "X_BT_DEL")
	private WebElement buttonExcluir;

	@FindBy(id = "TL_ITEM")
	private WebElement inputCodigoProduto;

	@FindBy(id = "TL_CAB_EAN")
	private WebElement inputEANProduto;

	@FindBy(id = "TL_DESC")
	private WebElement inputDescricao;

	@FindBy(id = "TL_COR")
	private WebElement inputCor;

	@FindBy(id = "TL_TAMANHO")
	private WebElement inputTamanho;

	@FindBy(id = "TL_IDMARCA")
	private WebElement selectMarca;

	@FindBy(id = "TL_SECAO")
	private WebElement inputSecao;

	@FindBy(id = "TL_LINHA")
	private WebElement inputLinha;

	@FindBy(id = "TL_SBLIN")
	private WebElement inpuSubtLinha;

	@FindBy(id = "TL_ITEMSIM")
	private WebElement inpuItemSimilar;

	@FindBy(id = "TL_EMBCMP")
	private WebElement selectEmbCompra;

	@FindBy(id = "TL_FATCONV")
	private WebElement inputQuant;

	@FindBy(id = "TL_EMBVDA")
	private WebElement selectEmbVenda;

	@FindBy(id = "TL_COMPR")
	private WebElement inputComprimento;

	@FindBy(id = "TL_LARG")
	private WebElement inputLargura;

	@FindBy(id = "TL_ALTURA")
	private WebElement inputAltura;

	@FindBy(id = "TL_PESO_LIQ")
	private WebElement inputPesoLiquidoUC;

	@FindBy(id = "TL_PESO")
	private WebElement inputPesoUC;

	@FindBy(id = "TL_PESO_U")
	private WebElement inputPesoLiquidoUV;

	@FindBy(id = "TL_PESOMEDIO_checkbox")
	private WebElement checkboxPesoMedio;

	@FindBy(id = "TL_TPREC")
	private WebElement selectTipoPeso;

	@FindBy(id = "TL_TPEAN")
	private WebElement selectTipoEANProduto;

	@FindBy(id = "TL_TEANEMB")
	private WebElement selectTipoEANEmbalagem;

	@FindBy(id = "TL_EANPRD")
	private WebElement inputcodigoEAN;

	@FindBy(id = "TL_DIGEAN")
	private WebElement inputcodigoEANDigito;

	@FindBy(id = "TL_EANEMB")
	private WebElement inputcodigoEANEmbalagem;

	@FindBy(id = "TL_MULTPACK_checkbox")
	private WebElement checkboxMultiploPack;

	@FindBy(id = "TL_MULTEAN_checkbox")
	private WebElement checkboxMultiploEAN;

	@FindBy(id = "TL_CODUPCREAL")
	private WebElement inputUPCReal;

	@FindBy(id = "TL_DIGUPCREAL")
	private WebElement inputUPCRealDigito;

	@FindBy(id = "TL_TPPROD")
	private WebElement selectTipoProduto;

	@FindBy(id = "TL_IMPORT")
	private WebElement selectOrigemProduto;

	@FindBy(id = "TL_CATEG")
	private WebElement selectCategoria;

	@FindBy(id = "TL_EDI")
	private WebElement selectProdutoEDI;

	@FindBy(id = "TL_LBRANCA_checkbox")
	private WebElement checkboxProdutoLinhaBranca;

	@FindBy(id = "TL_COMISSAO_checkbox")
	private WebElement checkboxProdutocomissionado;

	@FindBy(id = "TL_PEREC_checkbox")
	private WebElement checkboxControleValidade;

	@FindBy(id = "TL_KIT_PROM_checkbox")
	private WebElement checkboxkitPromocional;

	@FindBy(id = "TL_RA_checkbox")
	private WebElement checkboxReabastecimentoAutomaticoRA;

	@FindBy(id = "TL_RVDA_checkbox")
	private WebElement checkboxRestricaoVenda;

	@FindBy(id = "TL_VALID")
	private WebElement validadeProduto;

	@FindBy(id = "TL_TARJAP_checkbox")
	private WebElement checkboxMedicamentoTarjaPreta;

	@FindBy(id = "TL_IDENT")
	private WebElement inputIdentificador;

	@FindBy(id = "TL_REFBAS")
	private WebElement inputRefenciaBasica;

	@FindBy(id = "TL_CFISCAL")
	private WebElement inputClassificacaoFiscal;

	@FindBy(id = "TL_TIPMED")
	private WebElement selectTipoMedida;

	@FindBy(id = "TL_TIPO")
	private WebElement selectTipoIdentificador;

	@FindBy(id = "TL_ENQIPI")
	private WebElement inputIdentificadorIPI;

	@FindBy(id = "TL_TAM_PROD")
	private WebElement inputMedidaProdutoTamanho;

	@FindBy(id = "TL_UNI_PROD")
	private WebElement inputMedidaProdutoUnidade;

	@FindBy(id = "TL_QTD_PCT")
	private WebElement inputMedidaProdutoQauntiPacote;

	@FindBy(id = "TL_TAM_REF")
	private WebElement inputMedidaReferenciaTamanho;

	@FindBy(id = "TL_UNI_REF")
	private WebElement inputMedidaReferenciaUnidade;

	@FindBy(id = "panel_TL_OPC_0")
	private WebElement inputAcaoGrid_0;

	@FindBy(id = "panel_T_TL_FILIAL_0")
	private WebElement selectFilialGrid_0;

	@FindBy(id = "panel_TL_MARGEM_0")
	private WebElement inputMargemGrid_0;

	@FindBy(id = "panel_TL_FORNEC_0")
	private WebElement inputFornecGrid_0;

	@FindBy(id = "panel_TL_LOCENT_0")
	private WebElement inputEntregGrid_0;

	@FindBy(id = "panel_TL_IMPORTADO_0")
	private WebElement inputImportGrid_0;

	@FindBy(id = "panel_TL_ESTFAB_0")
	private WebElement inputFabriGrid_0;

	@FindBy(id = "panel_TL_TIPOENT_0")
	private WebElement inputNatuzGrid_0;

	@FindBy(id = "panel_TL_CODSAZO_0")
	private WebElement inputSazGrid_0;

	@FindBy(id = "panel_TL_SBGRP_0")
	private WebElement inputGrupoGrid_0;

	@FindBy(id = "panel_TL_SIT_0")
	private WebElement inputSitGrid_0;

	@FindBy(id = "panel_TL_MSUSP_0")
	private WebElement inputSuspGrid_0;

	@FindBy(id = "panel_TL_LIB_0")
	private WebElement inputLibGrid_0;

	@FindBy(id = "panel_TL_CLASDIS_0")
	private WebElement inputDistroGrid_0;

	@FindBy(id = "panel_TL_CESTA_0")
	private WebElement inputCestaGrid_0;

	@FindBy(id = "panel_TL_COMPRAUNI_0")
	private WebElement inputCompraUnicaGrid_0;

	@FindBy(id = "panel_TL_REFER_0")
	private WebElement inputReferenciaGrid_0;

	@FindBy(id = "TL_VIGOR_checkbox")
	private WebElement checkboxVigorar;

	@FindBy(id = "TL_DTVIG")
	private WebElement inputDataVigorar;

	@FindBy(id = "TL_PRECO")
	private WebElement inputPreco;

	@FindBy(id = "TL_DESCONT")
	private WebElement inputDesconto;

	@FindBy(id = "TL_BONF")
	private WebElement inputBonificacao;

	@FindBy(id = "TL_CUSPROM_checkbox")
	private WebElement checkboxCustoPromocao;

	@FindBy(id = "TL_TRNSP")
	private WebElement inputTransportadora;

	@FindBy(id = "TL_DESPEMB")
	private WebElement selectDespEmbalagemTipo;

	@FindBy(id = "TL_EV")
	private WebElement selectDespEventuaisTipo;

	@FindBy(id = "TL_VDSPEMB")
	private WebElement inputDespEmbalegemValor;

	@FindBy(id = "TL_VLEV")
	private WebElement inputDespEventuaisValor;

	@FindBy(id = "TL_IPI")
	private WebElement selectIPITipo;

	@FindBy(id = "TL_VLIPI")
	private WebElement inputIPIValor;

	@FindBy(id = "TL_IPIE")
	private WebElement selectIPIEmbalaegemTipo;

	@FindBy(id = "TL_VLIPIE")
	private WebElement inputIPIEmbalagemValor;

	@FindBy(id = "TL_FRTCON")
	private WebElement selectFreteConecimTipo;

	@FindBy(id = "TL_VFRTCON")
	private WebElement inputFreteConecimValor;

	@FindBy(id = "TL_FRTNF")
	private WebElement selectFreteNotaFiscalTipo;

	@FindBy(id = "TL_VFRTNF")
	private WebElement inputFreteNotaFiscalValor;

	public CadPRPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getButtonConsultar() {
		return buttonConsultar;
	}

	public WebElement getButtonIncluir() {
		return buttonIncluir;
	}

	public WebElement getButtonAlterar() {
		return buttonAlterar;
	}

	public WebElement getButtonExcluir() {
		return buttonExcluir;
	}

	public WebElement getInputCodigoProduto() {
		return inputCodigoProduto;
	}

	public WebElement getInputEANProduto() {
		return inputEANProduto;
	}

	public WebElement getInputDescricao() {
		return inputDescricao;
	}

	public WebElement getInputCor() {
		return inputCor;
	}

	public WebElement getInputTamanho() {
		return inputTamanho;
	}

	public WebElement getSelectMarca() {
		return selectMarca;
	}

	public WebElement getInputSecao() {
		return inputSecao;
	}

	public WebElement getInputLinha() {
		return inputLinha;
	}

	public WebElement getInpuSubtLinha() {
		return inpuSubtLinha;
	}

	public WebElement getInpuItemSimilar() {
		return inpuItemSimilar;
	}

	public WebElement getSelectEmbCompra() {
		return selectEmbCompra;
	}

	public WebElement getInputQuant() {
		return inputQuant;
	}

	public WebElement getSelectEmbVenda() {
		return selectEmbVenda;
	}

	public WebElement getInputComprimento() {
		return inputComprimento;
	}

	public WebElement getInputLargura() {
		return inputLargura;
	}

	public WebElement getInputAltura() {
		return inputAltura;
	}

	public WebElement getInputPesoLiquidoUC() {
		return inputPesoLiquidoUC;
	}

	public WebElement getInputPesoUC() {
		return inputPesoUC;
	}

	public WebElement getInputPesoLiquidoUV() {
		return inputPesoLiquidoUV;
	}

	public WebElement getCheckboxPesoMedio() {
		return checkboxPesoMedio;
	}

	public WebElement getSelectTipoPeso() {
		return selectTipoPeso;
	}

	public WebElement getSelectTipoEANProduto() {
		return selectTipoEANProduto;
	}

	public WebElement getSelectTipoEANEmbalagem() {
		return selectTipoEANEmbalagem;
	}

	public WebElement getInputcodigoEAN() {
		return inputcodigoEAN;
	}

	public WebElement getInputcodigoEANDigito() {
		return inputcodigoEANDigito;
	}

	public WebElement getInputcodigoEANEmbalagem() {
		return inputcodigoEANEmbalagem;
	}

	public WebElement getCheckboxMultiploPack() {
		return checkboxMultiploPack;
	}

	public WebElement getCheckboxMultiploEAN() {
		return checkboxMultiploEAN;
	}

	public WebElement getInputUPCReal() {
		return inputUPCReal;
	}

	public WebElement getInputUPCRealDigito() {
		return inputUPCRealDigito;
	}

	public WebElement getSelectTipoProduto() {
		return selectTipoProduto;
	}

	public WebElement getSelectOrigemProduto() {
		return selectOrigemProduto;
	}

	public WebElement getSelectCategoria() {
		return selectCategoria;
	}

	public WebElement getSelectProdutoEDI() {
		return selectProdutoEDI;
	}

	public WebElement getCheckboxProdutoLinhaBranca() {
		return checkboxProdutoLinhaBranca;
	}

	public WebElement getCheckboxProdutocomissionado() {
		return checkboxProdutocomissionado;
	}

	public WebElement getCheckboxControleValidade() {
		return checkboxControleValidade;
	}

	public WebElement getCheckboxkitPromocional() {
		return checkboxkitPromocional;
	}

	public WebElement getCheckboxReabastecimentoAutomaticoRA() {
		return checkboxReabastecimentoAutomaticoRA;
	}

	public WebElement getCheckboxRestricaoVenda() {
		return checkboxRestricaoVenda;
	}

	public WebElement getValidadeProduto() {
		return validadeProduto;
	}

	public WebElement getCheckboxMedicamentoTarjaPreta() {
		return checkboxMedicamentoTarjaPreta;
	}

	public WebElement getInputIdentificador() {
		return inputIdentificador;
	}

	public WebElement getInputRefenciaBasica() {
		return inputRefenciaBasica;
	}

	public WebElement getInputClassificacaoFiscal() {
		return inputClassificacaoFiscal;
	}

	public WebElement getSelectTipoMedida() {
		return selectTipoMedida;
	}

	public WebElement getSelectTipoIdentificador() {
		return selectTipoIdentificador;
	}

	public WebElement getInputIdentificadorIPI() {
		return inputIdentificadorIPI;
	}

	public WebElement getInputMedidaProdutoTamanho() {
		return inputMedidaProdutoTamanho;
	}

	public WebElement getInputMedidaProdutoUnidade() {
		return inputMedidaProdutoUnidade;
	}

	public WebElement getInputMedidaProdutoQauntiPacote() {
		return inputMedidaProdutoQauntiPacote;
	}

	public WebElement getInputMedidaReferenciaTamanho() {
		return inputMedidaReferenciaTamanho;
	}

	public WebElement getInputMedidaReferenciaUnidade() {
		return inputMedidaReferenciaUnidade;
	}

	public WebElement getInputAcaoGrid_0() {
		return inputAcaoGrid_0;
	}

	public WebElement getSelectFilialGrid_0() {
		return selectFilialGrid_0;
	}

	public WebElement getInputMargemGrid_0() {
		return inputMargemGrid_0;
	}

	public WebElement getInputFornecGrid_0() {
		return inputFornecGrid_0;
	}

	public WebElement getInputEntregGrid_0() {
		return inputEntregGrid_0;
	}

	public WebElement getInputImportGrid_0() {
		return inputImportGrid_0;
	}

	public WebElement getInputFabriGrid_0() {
		return inputFabriGrid_0;
	}

	public WebElement getInputNatuzGrid_0() {
		return inputNatuzGrid_0;
	}

	public WebElement getInputSazGrid_0() {
		return inputSazGrid_0;
	}

	public WebElement getInputGrupoGrid_0() {
		return inputGrupoGrid_0;
	}

	public WebElement getInputSitGrid_0() {
		return inputSitGrid_0;
	}

	public WebElement getInputSuspGrid_0() {
		return inputSuspGrid_0;
	}

	public WebElement getInputLibGrid_0() {
		return inputLibGrid_0;
	}

	public WebElement getInputDistroGrid_0() {
		return inputDistroGrid_0;
	}

	public WebElement getInputCestaGrid_0() {
		return inputCestaGrid_0;
	}

	public WebElement getInputCompraUnicaGrid_0() {
		return inputCompraUnicaGrid_0;
	}

	public WebElement getInputReferenciaGrid_0() {
		return inputReferenciaGrid_0;
	}

	public WebElement getCheckboxVigorar() {
		return checkboxVigorar;
	}

	public WebElement getInputDataVigorar() {
		return inputDataVigorar;
	}

	public WebElement getInputPreco() {
		return inputPreco;
	}

	public WebElement getInputDesconto() {
		return inputDesconto;
	}

	public WebElement getInputBonificacao() {
		return inputBonificacao;
	}

	public WebElement getCheckboxCustoPromocao() {
		return checkboxCustoPromocao;
	}

	public WebElement getInputTransportadora() {
		return inputTransportadora;
	}

	public WebElement getSelectDespEmbalagemTipo() {
		return selectDespEmbalagemTipo;
	}

	public WebElement getSelectDespEventuaisTipo() {
		return selectDespEventuaisTipo;
	}

	public WebElement getInputDespEmbalegemValor() {
		return inputDespEmbalegemValor;
	}

	public WebElement getInputDespEventuaisValor() {
		return inputDespEventuaisValor;
	}

	public WebElement getSelectIPITipo() {
		return selectIPITipo;
	}

	public WebElement getInputIPIValor() {
		return inputIPIValor;
	}

	public WebElement getSelectIPIEmbalaegemTipo() {
		return selectIPIEmbalaegemTipo;
	}

	public WebElement getInputIPIEmbalagemValor() {
		return inputIPIEmbalagemValor;
	}

	public WebElement getSelectFreteConecimTipo() {
		return selectFreteConecimTipo;
	}

	public WebElement getInputFreteConecimValor() {
		return inputFreteConecimValor;
	}

	public WebElement getSelectFreteNotaFiscalTipo() {
		return selectFreteNotaFiscalTipo;
	}

	public WebElement getInputFreteNotaFiscalValor() {
		return inputFreteNotaFiscalValor;
	}

}
