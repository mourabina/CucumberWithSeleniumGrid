package web.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.TurnoCD_RFFuncionalidade;

public class TurnoCdRfStep {

	private TurnoCD_RFFuncionalidade turnos;

	public TurnoCdRfStep() {
		this.turnos = new TurnoCD_RFFuncionalidade();
	}

	@Quando("^pressiono enter após preencher o campo com \"([^\"]*)\"$")
	public void preencherCampoEConfirmar(String valor) {
		this.turnos.preencherCampo(valor);
		this.turnos.pressionarEnter();
	}

	@Então("^sistema deve abrir o turno$")
	public void verificarTurnoAberto() {
		assertFalse("Turno não está aberto", this.turnos.verificarTurno());
	}

	@Então("^sistema deve fechar o turno$")
	public void verificarTurnofechado() {
		assertTrue("Turno está aberto", this.turnos.verificarTurno());
	}

	@Então("^sistema não deve abrir o turno apresentando a mensagem \"(.*)\"$")
	public void verificaAlertaComTurnoFechado(String msg) {
		this.verificarTurnofechado();
		assertTrue("Alerta não condiz com o esperado", this.turnos.verificaMsg().contains(msg));
	}

	@Dado("^turno do CD está aberto$")
	public void turnoFechado() {
		this.verificarTurnoAberto();
	}

	@Então("^sistema não deve fechar o turno apresentando a mensagem \"(.*)\"$")
	public void verificaAlertaComTurnoAberto(String msg) {
		this.verificarTurnoAberto();
		assertTrue("Alerta não condiz com o esperado", this.turnos.verificaMsg().contains(msg));
	}

	@Quando("^acionar o botão \"([^\"]*)\" na tela de expedição$")
	public void turnoRF(String opcao) throws Throwable {
		 this.turnos.acessarExpedicao();
		 this.turnos.abrirFecharTurnoRF(opcao);
	}

	@Então("^sistema não deve apresentar erro$")
	public void verificaErro() {
		assertFalse("Alerta está presente", this.turnos.verificaAlertaPresente());
	}

	@Então("^sistema deve apresentar o alerta \"([^\"]*)\"$")
	public void verificarAlertaRF(String msg) {
		assertTrue("Alerta não está presente", this.turnos.verificaAlertaPresente());
		assertTrue("Alerta não contem mensagem esperada",this.turnos.getTextoAlerta().contains(msg));
	}
}
