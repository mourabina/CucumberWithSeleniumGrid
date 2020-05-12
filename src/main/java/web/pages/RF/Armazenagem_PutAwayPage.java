package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Armazenagem_PutAwayPage {

	@FindBy(id = "BT_AFTURNO_FX")
	private WebElement btn_AbreTurno;
	
	@FindBy(id = "BT_EXCTRB_FX")
	private WebElement btn_ExcecaoTrabalho;
	
	@FindBy(id = "BT_DOCA_FX")
	private WebElement btn_ColetaEnd;
	
	@FindBy(id = "BT_ARMAZENA_FX")
	private WebElement btn_Armazena;
	
	@FindBy(id = "Button1_FX")
	private WebElement btn_CancelaArmazenagem;
	
	@FindBy(id = "BT_ZONAV_FX")
	private WebElement btn_EnviaPallet;
	
	public Armazenagem_PutAwayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_AbreTurno() {
		return btn_AbreTurno;
	}

	public WebElement getBtn_ExcecaoTrabalho() {
		return btn_ExcecaoTrabalho;
	}

	public WebElement getBtn_ColetaEnd() {
		return btn_ColetaEnd;
	}

	public WebElement getBtn_Armazena() {
		return btn_Armazena;
	}

	public WebElement getBtn_CancelaArmazenagem() {
		return btn_CancelaArmazenagem;
	}

	public WebElement getBtn_EnviaPallet() {
		return btn_EnviaPallet;
	}
	
}
