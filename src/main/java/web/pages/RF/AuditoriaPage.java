package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuditoriaPage {
	
	@FindBy(id = "BT_AUDIT_TRF_FX")
	private WebElement Tarefa;
	
	@FindBy(id = "BT_AU_SEP_FX")
	private WebElement Separacao;
	
	@FindBy(id = "BT_AU_CTREXPED_FX")
	private WebElement ContraExpedicao;
	
	@FindBy(id = "TL_LTAREFA")
	private WebElement lTarefa;
	
	@FindBy(id = "TL_LOJA_WM")
	private WebElement loja;
	
	@FindBy(id = "TL_DTTRF")
	private WebElement data;
	
	@FindBy(id = "TL_TAREFA")
	private WebElement tarefa;
	
	@FindBy(id = "TL_LOCAL")
	private WebElement local;
	
	@FindBy(id = "TL_CTREXPED")
	private WebElement numControleExp;	
	
	public AuditoriaPage(WebDriver webDriver) {
		
	}

	public WebElement getTarefa() {
		return Tarefa;
	}

	public WebElement getSeparacao() {
		return Separacao;
	}

	public WebElement getContraExpedicao() {
		return ContraExpedicao;
	}

	public WebElement getlTarefa() {
		return lTarefa;
	}

	public WebElement getLoja() {
		return loja;
	}

	public WebElement getData() { 
		return data;
	}

	public WebElement getLocal() {
		return local;
	}

	public WebElement getNumControleExp() {
		return numControleExp;
	}	
}
