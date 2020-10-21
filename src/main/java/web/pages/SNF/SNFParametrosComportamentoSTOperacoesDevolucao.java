package web.pages.SNF;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFParametrosComportamentoSTOperacoesDevolucao {

	// @FindBy(id = "busFormatTypeCd")
	@FindBy(xpath = "//select[@id='busFormatTypeCd']")
	private WebElement formato;

	@FindBy(id = "idCompany")
	private WebElement empresa;

	@FindBy(id = "stateCode")
	private WebElement estadoOrigem;

	@FindBy(xpath = "//select[@formcontrolname=\"natOperGroup\"]")
	private WebElement Agrupamento;

	@FindBy(xpath = "//select[@formcontrolname=\"idCompany\"]")
	private WebElement cadEmpresa;

	@FindBy(xpath = "//select[@formcontrolname=\"busFormatTypeCd\"]")
	private WebElement cadFormato;

	@FindBy(xpath = "//select[@formcontrolname=\"stateCode\"]")
	private WebElement Estado;

	@FindBy(xpath = "//select[@formcontrolname=\"indComplNf\"]")
	private WebElement NFRessarcimento;

	@FindBy(xpath = "//select[@formcontrolname=\"natureOperation\"]")
	private WebElement naturezaOperacao;

	@FindBy(xpath = "//input[@formcontrolname=\"printedNatOperNf\"]")
	private WebElement naturezaOperacaoImpressaNF;

	@FindBy(xpath = "//input[@formcontrolname=\"cfopIntraCode\"]")
	private WebElement CFOPOperacaoInterna;

	@FindBy(xpath = "//input[@formcontrolname=\"cfopInterCode\"]")
	private WebElement CFOPOperacaoExterna;

	@FindBy(xpath = "//input[@formcontrolname=\"itemNbr\"]")
	private WebElement codigoItem;

	@FindBy(xpath = "//input[@formcontrolname=\"itemDesc\"]")
	private WebElement descricaoItem;

	@FindBy(xpath = "//input[@formcontrolname=\"indGetCfop\"]")
	private WebElement obtemCFOP;

	@FindBy(xpath = "//select[@formcontrolname=\"cstNbr\"]")
	private WebElement cst;

	@FindBy(xpath = "//input[@formcontrolname=\"lastChangeUser\"]")
	private WebElement usuario;

	@FindBy(xpath = "//input[@formcontrolname=\"lastChangeTs\"]")
	private WebElement manutencao;

	@FindBy(xpath = "//select[@formcontrolname=\"indStFcpSt\"]")
	private WebElement destacaStFcpSt;

	@FindBy(xpath = "//select[@formcontrolname=\"stWithheldOption\"]")
	private WebElement opcaoDestaque;

	@FindBy(xpath = "//select[@formcontrolname=\"stRefundParam\"]")
	private WebElement parametrosRessarcimento;

	@FindBy(xpath = "//a[@class='btn btn-primary float-right']")
	private WebElement buttonPesquisar;

	@FindBy(xpath = "//p[@class='alert alert-info']")
	private WebElement msg;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement buttonRetornar;

	@FindBy(xpath = "//button[@class='btn btn-primary mr-2']")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//table[@class='table table-hover']/thead/tr/th")
	private List<WebElement> headGridResultado;

	@FindBy(xpath = "//table[@class='//table[@class='table table-hover']/tbody/tr/td")
	private List<WebElement> valueGridResultado;

	public SNFParametrosComportamentoSTOperacoesDevolucao(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public List<WebElement> getHeadGridResultado() {
		return headGridResultado;
	}

	public List<WebElement> getValueGridResultado() {
		return valueGridResultado;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public WebElement getFormato() {
		return formato;
	}

	public WebElement getEmpresa() {
		return empresa;
	}

	public WebElement getEstadoOrigem() {
		return estadoOrigem;
	}

	public WebElement getAgrupamento() {
		return Agrupamento;
	}

	public WebElement getCadEmpresa() {
		return cadEmpresa;
	}

	public WebElement getCadFormato() {
		return cadFormato;
	}

	public WebElement getEstado() {
		return Estado;
	}

	public WebElement getNFRessarcimento() {
		return NFRessarcimento;
	}

	public WebElement getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public WebElement getNaturezaOperacaoImpressaNF() {
		return naturezaOperacaoImpressaNF;
	}

	public WebElement getCFOPOperacaoInterna() {
		return CFOPOperacaoInterna;
	}

	public WebElement getCFOPOperacaoExterna() {
		return CFOPOperacaoExterna;
	}

	public WebElement getCodigoItem() {
		return codigoItem;
	}

	public WebElement getDescricaoItem() {
		return descricaoItem;
	}

	public WebElement getObtemCFOP() {
		return obtemCFOP;
	}

	public WebElement getCst() {
		return cst;
	}

	public WebElement getUsuario() {
		return usuario;
	}

	public WebElement getManutencao() {
		return manutencao;
	}

	public WebElement getDestacaStFcpSt() {
		return destacaStFcpSt;
	}

	public WebElement getOpcaoDestaque() {
		return opcaoDestaque;
	}

	public WebElement getParametrosRessarcimento() {
		return parametrosRessarcimento;
	}
}
