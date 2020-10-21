package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFEditarRecebimentoPage {
	
	@FindBy(xpath = "//input[@formcontrolname= 'businessUnitName']")
	private WebElement inputUnidadeNegocio;
	
	@FindBy(xpath = "//input[@formcontrolname= 'poNbr']")
	private WebElement inputNumeroPedido;
	
	@FindBy(xpath = "//input[@formcontrolname= 'vendorName']")
	private WebElement inputNomeFornecedor;
	
	@FindBy(xpath = "//input[@formcontrolname= 'appointmentNbr']")
	private WebElement inputNumeroAgenda;
	
	@FindBy(xpath = "//input[@formcontrolname= 'vendorNbr']")
	private WebElement inputNumeroFornecedor;
	
	@FindBy(xpath = "//input[@formcontrolname= 'receiverNbr']")
	private WebElement inputNumeroRecebimento;
	
	@FindBy(xpath = "//input[@formcontrolname= 'statusName']")
	private WebElement inputSituacao;
	
	@FindBy(xpath = "//input[@formcontrolname= 'plate']")
	private WebElement inputPlaca;
	
	@FindBy(xpath = "//button[contains(text(), 'Atualizar')]")
	private WebElement buttonAtualizar;
	
	@FindBy(xpath = "//button[contains(text(), 'Validar Protocolo e Fronteira')]")
	private WebElement buttonValidarProtocoloFrontera;
	
	@FindBy(xpath = "//button[contains(text(), 'Solicitar Protocolo')]")
	private WebElement buttonSolicitarProtocolo;
	
	@FindBy(xpath = "//button[contains(text(), 'Enviar Para o SAD')]")
	private WebElement buttonEnviarParaSad;
	
	@FindBy(xpath = "//button[contains(text(), 'Salvar Vinculados')]")
	private WebElement buttonSavarVinculados;
	
	@FindBy(xpath = "//button[@class= 'btn btn-default float-right ml-2']")
	private WebElement buttonVoltar;
	
	public SNFEditarRecebimentoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getInputUnidadeNegocio() {
		return inputUnidadeNegocio;
	}

	public WebElement getInputNumeroPedido() {
		return inputNumeroPedido;
	}

	public WebElement getInputNomeFornecedor() {
		return inputNomeFornecedor;
	}

	public WebElement getInputNumeroAgenda() {
		return inputNumeroAgenda;
	}

	public WebElement getInputNumeroFornecedor() {
		return inputNumeroFornecedor;
	}

	public WebElement getInputNumeroRecebimento() {
		return inputNumeroRecebimento;
	}

	public WebElement getInputSituacao() {
		return inputSituacao;
	}

	public WebElement getInputPlaca() {
		return inputPlaca;
	}

	public WebElement getButtonAtualizar() {
		return buttonAtualizar;
	}

	public WebElement getButtonValidarProtocoloFrontera() {
		return buttonValidarProtocoloFrontera;
	}

	public WebElement getButtonSolicitarProtocolo() {
		return buttonSolicitarProtocolo;
	}

	public WebElement getButtonEnviarParaSad() {
		return buttonEnviarParaSad;
	}

	public WebElement getButtonSavarVinculados() {
		return buttonSavarVinculados;
	}

	public WebElement getButtonVoltar() {
		return buttonVoltar;
	}
	
}
