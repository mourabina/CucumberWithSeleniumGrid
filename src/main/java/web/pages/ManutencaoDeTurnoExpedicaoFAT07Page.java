package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BaseTest;

public class ManutencaoDeTurnoExpedicaoFAT07Page extends BaseTest {

	@FindBy(id = "TL_TEXTO1")
	private WebElement statusTurnoLabel;

	@FindBy(id = "TL_TURNO")
	private WebElement idTurnoLabel;

	@FindBy(id = "TL_DATA10")
	private WebElement dataAberturaTurno;

	@FindBy(id = "TL_HORA5")
	private WebElement horaAberturaTurno;

	@FindBy(id = "TL_USU")
	private WebElement idUsuarioAberturaTurno;

	@FindBy(id = "TL_NOMUSU")
	private WebElement descricaoUsuarioAberturaTurno;

	@FindBy(id = "alerta_sad")
	private WebElement msg;

	@FindBy(id = "TL_CONF")
	private WebElement inpputOpcaoTurno;

	public ManutencaoDeTurnoExpedicaoFAT07Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getStatusTurnoLabel() {
		return statusTurnoLabel;
	}

	public WebElement getIdTurnoLabel() {
		return idTurnoLabel;
	}

	public WebElement getDataAberturaTurno() {
		return dataAberturaTurno;
	}

	public WebElement getHoraAberturaTurno() {
		return horaAberturaTurno;
	}

	public WebElement getIdUsuarioAberturaTurno() {
		return idUsuarioAberturaTurno;
	}

	public WebElement getDescricaoUsuarioAberturaTurno() {
		return descricaoUsuarioAberturaTurno;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getInpputOpcaoTurno() {
		return inpputOpcaoTurno;
	}

}
