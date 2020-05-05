package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ConsultaInformacoesBoxAbertoRFA07Page extends BaseTest {

	@FindBy(id = "Label14")
	private WebElement labelTituloPaginaAberturaDeBox;

	@FindBy(id = "TL_DEP_WM")
	private WebElement labelDepositoWM;

	@FindBy(id = "TL_BOX")
	private WebElement inputBox;

	@FindBy(id = "TL_MSG_DOCA")
	private WebElement labelViagem;

	@FindBy(id = "panel_TL_LOJA_WM_0")
	private WebElement labelGradeLoja_0;

	@FindBy(id = "panel_TL_DTTRF_0")
	private WebElement labelGradeGradeTRF_0;

	@FindBy(id = "panel_TL_TAREFA_0")
	private WebElement labelGradeTarefa_0;

	@FindBy(id = "panel_TL_LOCARM_0")
	private WebElement labelGradeArea_0;

	@FindBy(id = "panel_TL_TIPO_0")
	private WebElement labelGradeTipo_0;

	@FindBy(id = "panel_TL_VOLUME_0")
	private WebElement labelGradeVolume_0;

	@FindBy(id = "panel_TL_SIT_0")
	private WebElement labelGradeSituacao_0;

	public ConsultaInformacoesBoxAbertoRFA07Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLabelTituloPaginaAberturaDeBox() {
		return labelTituloPaginaAberturaDeBox;
	}

	public WebElement getLabelDepositoWM() {
		return labelDepositoWM;
	}

	public WebElement getInputBox() {
		return inputBox;
	}

	public WebElement getLabelViagem() {
		return labelViagem;
	}

	public WebElement getLabelGradeLoja_0() {
		return labelGradeLoja_0;
	}

	public WebElement getLabelGradeGradeTRF_0() {
		return labelGradeGradeTRF_0;
	}

	public WebElement getLabelGradeTarefa_0() {
		return labelGradeTarefa_0;
	}

	public WebElement getLabelGradeArea_0() {
		return labelGradeArea_0;
	}

	public WebElement getLabelGradeTipo_0() {
		return labelGradeTipo_0;
	}

	public WebElement getLabelGradeVolume_0() {
		return labelGradeVolume_0;
	}

	public WebElement getLabelGradeSituacao_0() {
		return labelGradeSituacao_0;
	}

}
