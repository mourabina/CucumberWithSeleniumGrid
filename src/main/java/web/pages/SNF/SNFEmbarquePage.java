package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEmbarquePage {

	@FindBy(id = "buId")
	private WebElement filial;

	@FindBy(id = "loadStatus")
	private WebElement situacao;

	@FindBy(xpath = "//label[@for =\"createTs\"]/following-sibling::div//input")
	private WebElement dataInicio;

	@FindBy(xpath = "//label[@for =\"createTsFinal\"]/following-sibling::div//input")
	private WebElement dataFim;

	@FindBy(xpath = "//label[@for =\"loadId\"]/following-sibling::div//input")
	private WebElement carga;

	@FindBy(xpath = "//label[@for =\"shipmentId\"]/following-sibling::div//input")
	private WebElement numeroEmbarque;

	@FindBy(xpath = "//label[@for =\"notaFiscalNbr\"]/following-sibling::div//input")
	private WebElement numeroNotaFiscal;

	@FindBy(id = "ordStoreNbr")
	private WebElement numeroLoja;

	@FindBy(xpath = "//label[@for =\"vehclLicensePlateNbr\"]/following-sibling::div//input")
	private WebElement placaVeiculo;

	@FindBy(xpath = "//label[@for =\"carrierId\"]/following-sibling::div//input")
	private WebElement numeroTrasposrtadora;

	@FindBy(xpath = "//label[@for =\"trailer\"]/following-sibling::div//input")
	private WebElement idCarreta;

	@FindBy(xpath = "//label[@for =\"carrierName\"]/following-sibling::div//input")
	private WebElement nomeTrasportadora;

	@FindBy(xpath = "//tabset[@class =\"tab-container\"]/ul//span[text()='Histórico da Carga']")
	private WebElement subMenuHistoricoCarga;

	@FindBy(xpath = "//tabset[@class =\"tab-container\"]/ul//span[text()='Detalhes da Carga']")
	private WebElement subMenuDetalheCarga;

	// ==================================Detalhe do
	// Embarque=================================================

	@FindBy(xpath = "//label[@for =\"buId\"]/following-sibling::div//input")
	private WebElement unidadeNegocio;

	@FindBy(xpath = "//label[@for =\"invoiceNbr\"]/following-sibling::div//input")
	private WebElement numeroFatura;

	@FindBy(xpath = "//label[@for =\"sealNbr\"]/following-sibling::div//input")
	private WebElement numeroLacre;

	public SNFEmbarquePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getNumeroTrasposrtadora() {
		return numeroTrasposrtadora;
	}

	public WebElement getIdCarreta() {
		return idCarreta;
	}

	public WebElement getNomeTrasportadora() {
		return nomeTrasportadora;
	}

	public WebElement getSubMenuHistoricoCarga() {
		return subMenuHistoricoCarga;
	}

	public WebElement getSubMenuDetalheCarga() {
		return subMenuDetalheCarga;
	}

	public WebElement getUnidadeNegocio() {
		return unidadeNegocio;
	}

	public WebElement getNumeroFatura() {
		return numeroFatura;
	}

	public WebElement getNumeroLacre() {
		return numeroLacre;
	}

	public WebElement getFilial() {
		return filial;
	}

	public WebElement getSituacao() {
		return situacao;
	}

	public WebElement getDataInicio() {
		return dataInicio;
	}

	public WebElement getDataFim() {
		return dataFim;
	}

	public WebElement getCarga() {
		return carga;
	}

	public WebElement getNumeroEmbarque() {
		return numeroEmbarque;
	}

	public WebElement getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public WebElement getNumeroLoja() {
		return numeroLoja;
	}

	public WebElement getPlacaVeiculo() {
		return placaVeiculo;
	}
}
