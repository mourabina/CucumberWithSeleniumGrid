package web.funcionalidade;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import web.pages.ManutencaoDeTurnoExpedicaoFAT07Page;
import web.pages.RF.ExpedicaoPage;
import web.pages.RF.Expedicao_AbreFechaTurnoPage;
import web.pages.RF.MenuPrincipalRFPage;

public class TurnoCD_RFFuncionalidade extends BaseTest {

	private ManutencaoDeTurnoExpedicaoFAT07Page fat07;
	private MenuPrincipalRFPage menuRF;
	private ExpedicaoPage ExpedicaoMenu;
	private Expedicao_AbreFechaTurnoPage AbreFechaExp;

	public TurnoCD_RFFuncionalidade() {
		this.fat07 = new ManutencaoDeTurnoExpedicaoFAT07Page(webDriver);
		this.menuRF = new MenuPrincipalRFPage(webDriver);
		this.ExpedicaoMenu = new ExpedicaoPage(webDriver);
		this.AbreFechaExp = new Expedicao_AbreFechaTurnoPage(webDriver);
	}

	public void preencherCampo(String valor) {
		this.fat07.getInpputOpcaoTurno().clear();
		this.fat07.getInpputOpcaoTurno().sendKeys(valor);
	}

	public void pressionarEnter() {
		this.fat07.getInpputOpcaoTurno().sendKeys(Keys.ENTER);
	}

	public boolean verificarTurno() {
		return this.fat07.getDataAberturaTurno().getAttribute("value").isEmpty()
				&& this.fat07.getDescricaoUsuarioAberturaTurno().getAttribute("value").isEmpty()
				&& this.fat07.getHoraAberturaTurno().getAttribute("value").isEmpty()
				&& this.fat07.getIdUsuarioAberturaTurno().getAttribute("value").isEmpty();
	}

	public String verificaMsg() {
		wait.until(ExpectedConditions.visibilityOf(this.fat07.getMsg()));
		System.out.println(this.fat07.getMsg().getText());
		return this.fat07.getMsg().getText().trim();
	}

	public void acessarExpedicao() {
		wait.until(ExpectedConditions.elementToBeClickable(this.menuRF.getItemMenuExpedicao()));
		this.menuRF.getItemMenuExpedicao().click();
	}

	public void abrirFecharTurnoRF(String op) {
		wait.until(ExpectedConditions.elementToBeClickable(this.ExpedicaoMenu.getItemMenuExpdicaoAbreFechaTurno()));
		this.ExpedicaoMenu.getItemMenuExpdicaoAbreFechaTurno().click();
		wait.until(ExpectedConditions.visibilityOf(this.AbreFechaExp.getBtn_fechar()));
		if (op.equalsIgnoreCase("abrir")) {
			this.AbreFechaExp.getBtn_abrir().click();
		} else {
			this.AbreFechaExp.getBtn_fechar().click();
		}

	}

	public boolean verificaAlertaPresente() {
		Alert alert = ExpectedConditions.alertIsPresent().apply(webDriver);
		return (alert != null);
	}
	
	public String getTextoAlerta() {
		Alert alert = ExpectedConditions.alertIsPresent().apply(webDriver);
		return alert.getText();
	}
}
