package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Armazenagem_LetDownPage {

	@FindBy(id = "BT_TURNO_FX")
	private WebElement btn_abreFechaTurno;
	
	@FindBy(id = "BT_EXCECAO_FX")
	private WebElement btn_excecaoTrabalho;
	
	@FindBy(id = "BT_SUGERIDA_FX")
	private WebElement btn_sugerido;
	
	@FindBy(id = "BT_ESCOLHIDA_FX")
	private WebElement btn_escolhido;
	
	@FindBy(id = "BT_LDC_FX")
	private WebElement btn_cancelar;
		
	public Armazenagem_LetDownPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getBtn_abreFechaTurno() {
		return btn_abreFechaTurno;
	}

	public WebElement getBtn_excecaoTrabalho() {
		return btn_excecaoTrabalho;
	}

	public WebElement getBtn_sugerido() {
		return btn_sugerido;
	}

	public WebElement getBtn_escolhido() {
		return btn_escolhido;
	}

	public WebElement getBtn_cancelar() {
		return btn_cancelar;
	}
	
}
