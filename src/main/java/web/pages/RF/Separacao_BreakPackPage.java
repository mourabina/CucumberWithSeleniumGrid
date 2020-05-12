package web.pages.RF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Separacao_BreakPackPage {

	@FindBy(id = "BT_BXIND_FX")
	private WebElement btn_BaixaEstoque;
	
	@FindBy(id = "BT_ABFECHSORT_FX")
	private WebElement btn_AbreSortimento;
	
	@FindBy(id = "BT_SEPIND_FX")
	private WebElement btn_SeparacaoCaixa;
	
	@FindBy(id = "BT_AVARSUP_FX")
	private WebElement btn_AvancaAvaria;
	
	@FindBy(id = "BT_CONSORT_FX")
	private WebElement btn_ConsultaCancelaSortimento;
	
	@FindBy(id = "BT_SORTBOX_FX")
	private WebElement btn_associaSortimento;
	
	@FindBy(id  = "TL_GRP_INI")
	private WebElement btn_GrupoInicial;
	
	@FindBy(id  = "TL_GRP_FIM")
	private WebElement btn_GrupoFinal;
	
	public Separacao_BreakPackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_BaixaEstoque() {
		return btn_BaixaEstoque;
	}

	public WebElement getBtn_AbreSortimento() {
		return btn_AbreSortimento;
	}

	public WebElement getBtn_SeparacaoCaixa() {
		return btn_SeparacaoCaixa;
	}

	public WebElement getBtn_AvancaAvaria() {
		return btn_AvancaAvaria;
	}

	public WebElement getBtn_ConsultaCancelaSortimento() {
		return btn_ConsultaCancelaSortimento;
	}

	public WebElement getBtn_associaSortimento() {
		return btn_associaSortimento;
	}

	public WebElement getBtn_GrupoInicial() {
		return btn_GrupoInicial;
	}

	public WebElement getBtn_GrupoFinal() {
		return btn_GrupoFinal;
	}
	
}
