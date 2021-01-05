package web.steps;

import org.junit.Assert;

import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.HomeFuncionalidade;

public class HomeStep {
	
	private HomeFuncionalidade home;
	
	public HomeStep() {
		this.home = new HomeFuncionalidade();
		
	}
	
	@Quando("acesso a tela Home da Aplicacao")
	public void acessarTelaHome() {
	    this.home.acessarTelaHome();
	}

	@Entao("sistema exibi o valor do Saldo igual ao utilizado na criacao da Movimentacao")
	public void validarValorSaldoTelaHome() {
	    Assert.assertTrue(this.home.retonarValorSaldo().contains(VariaveisEstaticas.getVALOR()));
	}

}
