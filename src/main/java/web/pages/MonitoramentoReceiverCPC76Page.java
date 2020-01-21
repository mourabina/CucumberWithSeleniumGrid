package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class MonitoramentoReceiverCPC76Page extends BaseTest {
	
	
	@FindBy(id = "idLABEL14")
	private WebElement labelTituloPagina;
	
	@FindBy(id = "idTL_FILIAL_WM")
	private WebElement inputDeparta;
	
	@FindBy(id = "idTL_DTAGENDA_PESQ")
	private WebElement inputDataAgenda;
	
	@FindBy(id = "idTL_STATUS_PESQ")
	private WebElement inputStatus;
	
	@FindBy(id = "idTL_PEDIDO_PESQ")
	private WebElement inputPedido;
	
	@FindBy(id = "idXTL_CITENS1")
	private WebElement inputItens1;
	
	@FindBy(id = "idXTL_GGUIA1")
	private WebElement inputGuia1;
	
	@FindBy(id = "idXTL_RECEIVER1")
	private WebElement inputReceiver1;
	
	@FindBy(id = "idXTL_CONSOLIDADO1")
	private WebElement inputRecConsolidado1;
	
	@FindBy(id = "idXTL_DOCA1")
	private WebElement inputDoca1;
	
	@FindBy(id = "idXTL_AGENDA1")
	private WebElement inputAgenda1;
	
	@FindBy(id = "idXTL_PEDIDO1")
	private WebElement inputPedido1;
	
	@FindBy(id = "idXTL_QTD_VOL1")
	private WebElement inputQuantVolu1;
	
	@FindBy(id = "idXTL_STATUS1")
	private WebElement inputStatus1;
	
	@FindBy(id = "idXTL_FRACAO1")
	private WebElement inputFracao1;
	
	@FindBy(id = "idXTL_DTAGENDA1")
	private WebElement inputDataAgenda1;
	
	@FindBy(id = "idXTL_FORNEC1")
	private WebElement inputFornecedor1;

	MonitoramentoReceiverCPC76Page(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getLabelTituloPagina() {
		return labelTituloPagina;
	}

	public WebElement getInputDeparta() {
		return inputDeparta;
	}

	public WebElement getInputDataAgenda() {
		return inputDataAgenda;
	}

	public WebElement getInputStatus() {
		return inputStatus;
	}

	public WebElement getInputPedido() {
		return inputPedido;
	}

	public WebElement getInputItens1() {
		return inputItens1;
	}

	public WebElement getInputGuia1() {
		return inputGuia1;
	}

	public WebElement getInputReceiver1() {
		return inputReceiver1;
	}

	public WebElement getInputRecConsolidado1() {
		return inputRecConsolidado1;
	}

	public WebElement getInputDoca1() {
		return inputDoca1;
	}

	public WebElement getInputAgenda1() {
		return inputAgenda1;
	}

	public WebElement getInputPedido1() {
		return inputPedido1;
	}

	public WebElement getInputQuantVolu1() {
		return inputQuantVolu1;
	}

	public WebElement getInputStatus1() {
		return inputStatus1;
	}

	public WebElement getInputFracao1() {
		return inputFracao1;
	}

	public WebElement getInputDataAgenda1() {
		return inputDataAgenda1;
	}

	public WebElement getInputFornecedor1() {
		return inputFornecedor1;
	}

}
