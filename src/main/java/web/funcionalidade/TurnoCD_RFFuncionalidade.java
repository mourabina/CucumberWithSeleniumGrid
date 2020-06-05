package web.funcionalidade;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import web.pages.ManutencaoAtividadeExtraRFA03Page;
import web.pages.ManutencaoDeTurnoExpedicaoFAT07Page;
import web.pages.RF.ExpedicaoPage;
import web.pages.RF.Expedicao_AbreFechaTurnoPage;
import web.pages.RF.MenuPrincipalRFPage;

public class TurnoCD_RFFuncionalidade extends BaseTest {

	private ManutencaoDeTurnoExpedicaoFAT07Page fat07;
	private MenuPrincipalRFPage menuRF;
	private ExpedicaoPage ExpedicaoMenu;
	private Expedicao_AbreFechaTurnoPage AbreFechaExp;
	private ManutencaoAtividadeExtraRFA03Page ManuAtividade;
	private LoginFuncionalidade login;
	private static String dt;

	public TurnoCD_RFFuncionalidade() {
		this.fat07 = new ManutencaoDeTurnoExpedicaoFAT07Page(webDriver);
		this.menuRF = new MenuPrincipalRFPage(webDriver);
		this.ExpedicaoMenu = new ExpedicaoPage(webDriver);
		this.AbreFechaExp = new Expedicao_AbreFechaTurnoPage(webDriver);
		this.ManuAtividade = new ManutencaoAtividadeExtraRFA03Page(webDriver);
		this.login = new LoginFuncionalidade();
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
	
	public void consultarTurnoFechado() {
		this.ManuAtividade.getUsuario().sendKeys(VariaveisEstaticas.getUSUARIO());
		this.ManuAtividade.getDtTurno().sendKeys(GeracaoData.retornaDataAtualMaisDias(0));
		this.ManuAtividade.getTurno().sendKeys("1");
		this.ManuAtividade.getOpcao().sendKeys("INQ");
		this.ManuAtividade.getOpcao().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(this.ManuAtividade.getTurnoNormalHrInicial(), "value"));

	}
	
	public void alterarValoresTurno() {
		this.ManuAtividade.getTurnoNormalHrInicial().clear();
		this.ManuAtividade.getTurnoNormalHrInicial().sendKeys("1000");
		this.ManuAtividade.getTurnoNormalHrFim().clear();
		this.ManuAtividade.getTurnoNormalHrFim().sendKeys("1100");
		this.ManuAtividade.getTurnoNormalDtFim().clear();
		dt = GeracaoData.retornaDataAtualMaisDias(1);
		dt = dt.replace("/","");
		if(dt.substring(0,1).matches("0"))
			dt = dt.replaceFirst("0","");
		this.ManuAtividade.getTurnoNormalDtFim().sendKeys(dt);
		this.ManuAtividade.getConfirmacao().sendKeys("S");
		this.ManuAtividade.getTurnoNormalAcao().click();
		this.ManuAtividade.getOpcao().clear();
		this.ManuAtividade.getOpcao().sendKeys("CHG");
		this.ManuAtividade.getOpcao().sendKeys(Keys.ENTER);		
	}
	
	public boolean verificarRegistroAlterado() {
		this.login.voltarHomePage();
		this.login.acessarTela("RFA03");
		this.consultarTurnoFechado();
		return this.ManuAtividade.getTurnoNormalHrInicial().getAttribute("value").equals("1000")
				&& this.ManuAtividade.getTurnoNormalHrFim().getAttribute("value").equals("1100")
				&& this.ManuAtividade.getTurnoNormalDtFim().getAttribute("value").equals(dt);		
	}
}
