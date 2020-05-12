package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Separacao_XDockingPage {
	
	@FindBy(id = "BT_ABRVGM_FX")
	private WebElement btn_AberturaViagem; 

	@FindBy(id = "BT_SEPVGM_FX")
	private WebElement btn_SeparacaoViagem;
	
	@FindBy(id = "BT_FECHPLT_FX")
	private WebElement btn_FechamentoPallet;
	
	@FindBy(id = "BT_SORTPLT_FX")
	private WebElement btn_SortimentoPallet;
	
	@FindBy(id = "TL_CONS_FX")
	private WebElement btn_Consultas;
	
	@FindBy(id = "TL_SEPARADOR_LETRA")
	private WebElement btn_SeparadorLetra;
	
	@FindBy(id = "TL_SEPARADOR_COD")
	private WebElement btn_SepradorCodigo;
	
	public Separacao_XDockingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_AberturaViagem() {
		return btn_AberturaViagem;
	}

	public WebElement getBtn_SeparacaoViagem() {
		return btn_SeparacaoViagem;
	}

	public WebElement getBtn_FechamentoPallet() {
		return btn_FechamentoPallet;
	}

	public WebElement getBtn_SortimentoPallet() {
		return btn_SortimentoPallet;
	}

	public WebElement getBtn_Consultas() {
		return btn_Consultas;
	}

	public WebElement getBtn_SeparadorLetra() {
		return btn_SeparadorLetra;
	}

	public WebElement getBtn_SepradorCodigo() {
		return btn_SepradorCodigo;
	}	
}
