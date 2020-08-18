package web.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
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

	@Entao("^sistema deve abrir o turno$")
	public void verificarTurnoAberto() {
		assertFalse("Turno não está aberto", this.turnos.verificarTurno());
	}

	@Entao("^sistema deve fechar o turno$")
	public void verificarTurnofechado() {
		assertTrue("Turno está aberto", this.turnos.verificarTurno());
	}

	@Entao("^sistema não deve abrir o turno apresentando a mensagem \"(.*)\"$")
	public void verificaAlertaComTurnoFechado(String msg) {
		this.verificarTurnofechado();
		assertTrue("Alerta não condiz com o esperado", this.turnos.verificaMsg().contains(msg));
	}

	@Dado("^turno do CD está aberto$")
	public void turnoFechado() {
		this.verificarTurnoAberto();
	}

	@Entao("^sistema não deve fechar o turno apresentando a mensagem \"(.*)\"$")
	public void verificaAlertaComTurnoAberto(String msg) {
		this.verificarTurnoAberto();
		assertTrue("Alerta não condiz com o esperado", this.turnos.verificaMsg().contains(msg));
	}

	@Quando("^acionar o botão \"([^\"]*)\" na tela de expedição$")
	public void turnoRF(String opcao) throws Throwable {
		 this.turnos.acessarExpedicao();
		 this.turnos.abrirFecharTurnoRF(opcao);
	}

	@Entao("^sistema não deve apresentar erro$")
	public void verificaErro() {
		assertFalse("Alerta está presente", this.turnos.verificaAlertaPresente());
	}

	@Entao("^sistema deve apresentar o alerta \"([^\"]*)\"$")
	public void verificarAlertaRF(String msg) {
		assertTrue("Alerta não está presente", this.turnos.verificaAlertaPresente());
		assertTrue("Alerta não contem mensagem esperada",this.turnos.getTextoAlerta().contains(msg));
	}

	@Dado("^consulto o turno de hoje$")
	public void consultaTurnoHoje(){
		this.turnos.consultarTurnoFechado();
	}

	@Quando("^submeto o registro com os dados alterados$")
	public void alteroRegistroTurno(){
		this.turnos.alterarValoresTurno();
	}

	@Entao("^o registro deve ser alterado$")
	public void verificarTurnoAlterado() {
		assertTrue("Dados não foram alterados", this.turnos.verificarRegistroAlterado());
	}
}
