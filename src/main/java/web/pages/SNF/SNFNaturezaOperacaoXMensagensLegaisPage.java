package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFNaturezaOperacaoXMensagensLegaisPage {

	@FindBy(xpath = "//h4[text()='Natureza de Operação x Mensagens Legais']")
	private WebElement tituloPagina;

	@FindBy(xpath = "//h4[@class='modal-title']")
	private WebElement tituloEditaRegistro;

	@FindBy(xpath = "//label[contains(text(),'Natureza de Operação')]/parent::div//input")
	private WebElement inputNaturezaOperacao;

	@FindBy(xpath = "//span[text() = 'Nacional']")
	private WebElement abaNacional;

	@FindBy(xpath = "//span[text() = 'Estadual']")
	private WebElement abaEstadual;

	@FindBy(xpath = "//span[text() = 'Filial']")
	private WebElement abaFilial;

	@FindBy(xpath = "//tab[@heading='Nacional']//label[contains(text(),\"Local da Mensagem\")]/parent::div//select")
	private WebElement selectLocalMensagemNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//label[contains(text(),\"Local da Mensagem\")]/parent::div//select")
	private WebElement selectLocalMensagemEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//label[contains(text(),\"Local da Mensagem\")]/parent::div//select")
	private WebElement selectLocalMenagemFilial;

	@FindBy(xpath = "//label[contains(text(),'Estado')]/parent::div//select")
	private WebElement selectEstado;

	@FindBy(xpath = "//label[contains(text(),'Tipo de Negócio')]/parent::div//select")
	private WebElement selectTipoNegocio;

	@FindBy(xpath = "//label[contains(text(),'Filial')]/parent::div//select")
	private WebElement selectFilial;

	@FindBy(xpath = "//tab[@heading='Nacional']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']/following-sibling::div//span//i")
	private WebElement buttonGerarExcelNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']/following-sibling::div//span//i")
	private WebElement buttonGerarExcelEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']/following-sibling::div//span//i")
	private WebElement buttonGerarExcelFilial;

	@FindBy(xpath = "//tab[@heading='Nacional']//table[@class = 'table table-striped']//td")
	private WebElement gridResultadoAbaNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//table[@class = 'table table-striped']//td")
	private WebElement gridResultadoAbaEstadual;

	@FindBy(xpath = "//tab[@heading='Nacional']//button[@class = 'btn btn-primary float-right']")
	private WebElement buttonHistoricoNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//button[@class = 'btn btn-primary float-right']")
	private WebElement buttonHistoricoEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//button[@class = 'btn btn-primary float-right']")
	private WebElement buttonHistoricoFilial;

	@FindBy(xpath = "//tab[@heading='Filial']//input[@class = 'form-control ng-untouched ng-pristine ng-valid']")
	private WebElement dataVisualizacaoPorLocalReferenciaFilial;

	@FindBy(xpath = "//tab[@heading='Estadual']//input[@class = 'form-control ng-untouched ng-pristine ng-valid']")
	private WebElement dataVisualizacaoPorLocalReferenciaEstadual;

	@FindBy(xpath = "//tab[@heading='Nacional']//input[@class = 'form-control ng-untouched ng-pristine ng-valid']")
	private WebElement dataVisualizacaoPorLocalReferenciaNacional;

	@FindBy(xpath = "//table[@id=\"tabela\"]//tbody//td")
	private List<WebElement> exibicaoMensagensLegaisSelecionadaNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//parent::div[@class='card pt-3 pb-3']")
	private WebElement exibicaoMensagensLegasisSelecionadaEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//parent::div[@class='card pt-3 pb-3']")
	private WebElement exibicaoMensagensLegasisSelecionadaFilial;

	@FindBy(xpath = "//label[contains(text(),'Usuário')]/parent::div//input")
	private WebElement inputUsuario;

	@FindBy(xpath = "//div[contains(text(),'Última Atualização')]/ancestor::div[@class='card mb-2']//label[contains(text(),'Data')]/parent::div//input")
	private WebElement inputData;

	@FindBy(xpath = "//tab[@heading='Nacional']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-eraser']")
	private WebElement buttonLimparNacional;

	@FindBy(xpath = "//tab[@heading='Nacional']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-search']")
	private WebElement buttonPesquisarNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-eraser']")
	private WebElement buttonLimparEstadual;

	@FindBy(xpath = "//tab[@heading='Estadual']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-search']")
	private WebElement buttonPesquisarEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-eraser']")
	private WebElement buttonLimparFilial;

	@FindBy(xpath = "//tab[@heading='Filial']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-search']")
	private WebElement buttonPesquisarFilial;

	@FindBy(xpath = "//tab[@heading='Nacional']//button[@class = 'btn btn-primary float-left mb-3']")
	private WebElement buttonAdicionarNacional;

	@FindBy(xpath = "//tab[@heading='Estadual']//button[@class = 'btn btn-primary float-left mb-3']")
	private WebElement buttonAdicionarEstadual;

	@FindBy(xpath = "//tab[@heading='Filial']//button[@class = 'btn btn-primary float-left mb-3']")
	private WebElement buttonAdicionarFilial;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//tab[@heading='Nacional']//p")
	private WebElement labelMensagemNacional;

	@FindBy(xpath = "//tab[@heading='Filial']//p")
	private WebElement labelMensagemSucessoFilial;

	@FindBy(xpath = "//tab[@heading='Estadual']//p")
	private WebElement labelMensagemSucessoEstadual;

	@FindBy(xpath = "//i[@class='fa fa-edit']")
	private WebElement buttonEditarGridResultado;

	@FindBy(xpath = "//div[contains(text(),\"Mensagens Legais\")]/parent::div//tab[contains(@class,\"active\")]//thead//th[1]")
	private WebElement itemHeaderMenuTelaHistorico;

	@FindBy(xpath = "//table[@class='table table-hover']//tbody//tr/td")
	private List<WebElement> valueGridResultadoTelaHistorico;

	@FindBy(xpath = "//table[@class='table table-hover']//thead//tr/th")
	private List<WebElement> headerGridResultadoTelaHistoricoElements;

	// ===============================================Adicionar Registro
	// =============================================================================================================
	@FindBy(id = "sequencyNbr")
	private WebElement ordem;

	public WebElement getOrdem() {
		return ordem;
	}

	@FindBy(xpath = "//div[@class='col-12 text-left']")
	private WebElement msg;

	@FindBy(id = "localMsg")
	private WebElement selectLocal;

	@FindBy(id = "localMsgType")
	private WebElement selectTipo;

	@FindBy(xpath = "//input[@formcontrolname='legalMessageDescription']")
	private WebElement inputMensagemLegal;

	@FindBy(xpath = "//input[@formcontrolname='legalMessageDynamicDescription']")
	private WebElement inputMenagemLegalDinamica;

	@FindBy(id = "effectiveDate")
	private WebElement inputInicioVigencia;

	@FindBy(id = "expireDate")
	private WebElement inputFimVigencia;

	@FindBy(xpath = "//button[@class='btn btn-primary ml-3 rounded']/i")
	private WebElement btnPesquisar;

	@FindBy(id = "businessType")
	private WebElement selectTipoNegocioAdionarRegistro;

	@FindBy(id = "stateCode")
	private WebElement selectEstadoAdicionarRegistro;

	@FindBy(id = "buId")
	private WebElement selectFilialAdicionarRegistro;

	@FindBy(xpath = "//button[@class='btn btn-primary mr-2']")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-default']")
	private WebElement buttonFechar;

	// =================================================Selecionar Menagem
	// Legal=======================================================================================================

	@FindBy(xpath = "//label[contains(text(),'Código')]//parent::div//div[@class='input-group']/input")
	private WebElement inputCodigo;

	@FindBy(xpath = "//label[contains(text(),'Descrição')]//parent::div//div[@class='input-group']/input")
	private WebElement inputDescricao;

	@FindBy(xpath = "//label[contains(text(),'Título')]//parent::div//div[@class='input-group']/input")
	private WebElement inputTipo;

	@FindBy(xpath = "//div[@id='print-section']//button[@class='btn btn-primary ml-3 rounded']/i")
	private WebElement btnPesquisarSelecionarMensagem;

	@FindBy(xpath = "//input[@name='radio-item']/parent::div")
	private WebElement radioButton;

	@FindBy(xpath = "//button[contains(text(),'Cancelar')]")
	private WebElement buttonCancelar;

	@FindBy(xpath = "//div[@class='col-sm-12 p-0']//button[contains(text(),'Confirmar')]")
	private WebElement buttonConfirmar;

	// ===============================================================================================================================================================================

	public SNFNaturezaOperacaoXMensagensLegaisPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonFechar() {
		return buttonFechar;
	}

	public WebElement getButtonConfirmar() {
		return buttonConfirmar;
	}

	public WebElement getInputTipo() {
		return inputTipo;
	}

	public WebElement getItemHeaderMenuTelaHistorico() {
		return itemHeaderMenuTelaHistorico;
	}

	public List<WebElement> getValueGridResultadoTelaHistorico() {
		return valueGridResultadoTelaHistorico;
	}

	public List<WebElement> getHeaderGridResultadoTelaHistoricoElements() {
		return headerGridResultadoTelaHistoricoElements;
	}

	public WebElement getInputMenagemLegalDinamica() {
		return inputMenagemLegalDinamica;
	}

	public WebElement getButtonCancelar() {
		return buttonCancelar;
	}

	public WebElement getTituloEditaRegistro() {
		return tituloEditaRegistro;
	}

	public WebElement getButtonEditarGridResultado() {
		return buttonEditarGridResultado;
	}

	public WebElement getButtonAdicionarFilial() {
		return buttonAdicionarFilial;
	}

	public WebElement getButtonAdicionarEstadual() {
		return buttonAdicionarEstadual;
	}

	public WebElement getButtonAdicionarNacional() {
		return buttonAdicionarNacional;
	}

	public WebElement getLabelMensagemSucessoFilial() {
		return labelMensagemSucessoFilial;
	}

	public WebElement getLabelMensagemSucessoEstadual() {
		return labelMensagemSucessoEstadual;
	}

	public WebElement getLabelMensagemNacional() {
		return labelMensagemNacional;
	}

	public WebElement getSelectTipoNegocioAdionarRegistro() {
		return selectTipoNegocioAdionarRegistro;
	}

	public WebElement getSelectEstadoAdicionarRegistro() {
		return selectEstadoAdicionarRegistro;
	}

	public WebElement getSelectFilialAdicionarRegistro() {
		return selectFilialAdicionarRegistro;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getSelectLocal() {
		return selectLocal;
	}

	public WebElement getSelectTipo() {
		return selectTipo;
	}

	public WebElement getInputMensagemLegal() {
		return inputMensagemLegal;
	}

	public WebElement getInputInicioVigencia() {
		return inputInicioVigencia;
	}

	public WebElement getInputFimVigencia() {
		return inputFimVigencia;
	}

	public WebElement getBtnPesquisar() {
		return btnPesquisar;
	}

	public WebElement getInputCodigo() {
		return inputCodigo;
	}

	public WebElement getInputDescricao() {
		return inputDescricao;
	}

	public WebElement getBtnPesquisarSelecionarMensagem() {
		return btnPesquisarSelecionarMensagem;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputNaturezaOperacao() {
		return inputNaturezaOperacao;
	}

	public WebElement getAbaNacional() {
		return abaNacional;
	}

	public WebElement getAbaEstadual() {
		return abaEstadual;
	}

	public WebElement getAbaFilial() {
		return abaFilial;
	}

	public WebElement getSelectLocalMensagemNacional() {
		return selectLocalMensagemNacional;
	}

	public WebElement getSelectLocalMensagemEstadual() {
		return selectLocalMensagemEstadual;
	}

	public WebElement getSelectLocalMenagemFilial() {
		return selectLocalMenagemFilial;
	}

	public WebElement getSelectEstado() {
		return selectEstado;
	}

	public WebElement getSelectTipoNegocio() {
		return selectTipoNegocio;
	}

	public WebElement getSelectFilial() {
		return selectFilial;
	}

	public WebElement getButtonGerarExcelNacional() {
		return buttonGerarExcelNacional;
	}

	public WebElement getButtonGerarExcelEstadual() {
		return buttonGerarExcelEstadual;
	}

	public WebElement getButtonGerarExcelFilial() {
		return buttonGerarExcelFilial;
	}

	public WebElement getGridResultadoAbaNacional() {
		return gridResultadoAbaNacional;
	}

	public WebElement getGridResultadoAbaEstadual() {
		return gridResultadoAbaEstadual;
	}

	public WebElement getButtonHistoricoNacional() {
		return buttonHistoricoNacional;
	}

	public WebElement getButtonHistoricoEstadual() {
		return buttonHistoricoEstadual;
	}

	public WebElement getButtonHistoricoFilial() {
		return buttonHistoricoFilial;
	}

	public WebElement getDataVisualizacaoPorLocalReferenciaFilial() {
		return dataVisualizacaoPorLocalReferenciaFilial;
	}

	public WebElement getDataVisualizacaoPorLocalReferenciaEstadual() {
		return dataVisualizacaoPorLocalReferenciaEstadual;
	}

	public WebElement getDataVisualizacaoPorLocalReferenciaNacional() {
		return dataVisualizacaoPorLocalReferenciaNacional;
	}

	public List<WebElement> getExibicaoMensagensLegaisSelecionadaNacional() {
		return exibicaoMensagensLegaisSelecionadaNacional;
	}

	public WebElement getExibicaoMensagensLegasisSelecionadaEstadual() {
		return exibicaoMensagensLegasisSelecionadaEstadual;
	}

	public WebElement getExibicaoMensagensLegasisSelecionadaFilial() {
		return exibicaoMensagensLegasisSelecionadaFilial;
	}

	public WebElement getInputUsuario() {
		return inputUsuario;
	}

	public WebElement getInputData() {
		return inputData;
	}

	public WebElement getButtonLimparNacional() {
		return buttonLimparNacional;
	}

	public WebElement getButtonPesquisarNacional() {
		return buttonPesquisarNacional;
	}

	public WebElement getButtonLimparEstadual() {
		return buttonLimparEstadual;
	}

	public WebElement getButtonPesquisarEstadual() {
		return buttonPesquisarEstadual;
	}

	public WebElement getButtonLimparFilial() {
		return buttonLimparFilial;
	}

	public WebElement getButtonPesquisarFilial() {
		return buttonPesquisarFilial;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

}
