package web.steps;


import org.junit.Assert;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.HomeFuncionalidade;
import web.funcionalidade.ResumoMensalFuncionalidade;

public class ResumoMensalStep {
	
	private ResumoMensalFuncionalidade remumo;
	private HomeFuncionalidade home;
	
	public ResumoMensalStep() {
		this.remumo = new ResumoMensalFuncionalidade();
		this.home = new HomeFuncionalidade();
	}
	
	@Quando("deleto uma movimentacao")
	public void deletarUmaMovimentacao() {
		this.home.acessarTelaResumoMensal();
	    this.remumo.deletarMovimentacao();
	}

	@Entao("sistem exibi a mensagen {string}  na tela de Resumo Mensal")
	public void validarMensagemTelaDeResumoMensal(String msg) {
	    Assert.assertEquals(msg, this.remumo.retornaMensagemExibida());
	}

}
