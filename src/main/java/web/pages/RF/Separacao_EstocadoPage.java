package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Separacao_EstocadoPage {

	@FindBy(id = "BT_ENTTAREF_FX")
	private WebElement btn_EntregaTarefas; 
	
	@FindBy(id = "BT_CANTAREF_FX")
	private WebElement btn_CancelaEntregas; 
	
	@FindBy(id = "BT_INISEPAR_FX")
	private WebElement btn_InicioSeparacao; 
	
	@FindBy(id = "BT_CANSEPAR_FX")
	private WebElement btn_CancelaSeparacao; 
	
	@FindBy(id = "TL_ENTRDOCA_FX")
	private WebElement btn_EntregaTarefaDoca; 

	public Separacao_EstocadoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_EntregaTarefas() {
		return btn_EntregaTarefas;
	}

	public WebElement getBtn_CancelaEntregas() {
		return btn_CancelaEntregas;
	}

	public WebElement getBtn_InicioSeparacao() {
		return btn_InicioSeparacao;
	}

	public WebElement getBtn_CancelaSeparacao() {
		return btn_CancelaSeparacao;
	}

	public WebElement getBtn_EntregaTarefaDoca() {
		return btn_EntregaTarefaDoca;
	}
	
}
