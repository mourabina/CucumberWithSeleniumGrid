package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEditarNotaFiscalPage {

		@FindBy(xpath = "//*[@formcontrolname=\"poNbr\"]")
		private WebElement  inputNumeroPedido;
		
		@FindBy(xpath = "//*[@formcontrolname=\"statusName\"]")
		private WebElement  inputSituacaoPedido;
		
		@FindBy(xpath = "//*[@formcontrolname=\"shipDate\"]")
		private WebElement  inputDataEmbarque;
		
		@FindBy(xpath = "//*[@formcontrolname=\"cancelDate\"]")
		private WebElement  inputDataCancelamento;
		
		@FindBy(xpath = "//*[@formcontrolname=\"poDate\"]")
		private WebElement  inputDataPedido;
		
		@FindBy(xpath = "//*[@formcontrolname=\"taxEffective\"]")
		private WebElement  inputHoraImpostosPedido;
		
		@FindBy(xpath = "//*[@formcontrolname=\"poNbr\"]/parent::div//button")
		private WebElement  btnPesquisarPedido;
		
		@FindBy(xpath = "//button[contains(text(),\"Vincular\")]")
		private WebElement  btnVincularPedido;
	
		@FindBy(xpath = "//button[contains(text(),\"Desvincular\")]")
		private WebElement  btnDesvincularPedido;
		
		@FindBy(xpath = "//*[contains(@class,\"fa-arrow-left\")]/parent::button")
		private WebElement  btnRetornar;
		
		@FindBy(xpath = "//div[ancestor::div[contains(@class,\"alert\")] and parent::div[@class = \"row\"]]")
		private WebElement alert;
		
		public SNFEditarNotaFiscalPage(WebDriver driver) {
			PageFactory.initElements(driver, this);		
		}

		public WebElement getBtnRetornar() {
			return btnRetornar;
		}

		public WebElement getInputNumeroPedido() {
			return inputNumeroPedido;
		}

		public WebElement getInputSituacaoPedido() {
			return inputSituacaoPedido;
		}

		public WebElement getAlert() {
			return alert;
		}

		public WebElement getInputDataEmbarque() {
			return inputDataEmbarque;
		}

		public WebElement getInputDataCancelamento() {
			return inputDataCancelamento;
		}

		public WebElement getInputDataPedido() {
			return inputDataPedido;
		}

		public WebElement getInputHoraImpostosPedido() {
			return inputHoraImpostosPedido;
		}

		public WebElement getBtnPesquisarPedido() {
			return btnPesquisarPedido;
		}

		public WebElement getBtnVincularPedido() {
			return btnVincularPedido;
		}

		public WebElement getBtnDesvincularPedido() {
			return btnDesvincularPedido;
		}
		
		
}
