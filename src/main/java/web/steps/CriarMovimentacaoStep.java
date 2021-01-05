package web.steps;

import org.junit.Assert;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.CriarMovimentacaoFuncionalidade;

public class CriarMovimentacaoStep {

	private CriarMovimentacaoFuncionalidade movi;

	public CriarMovimentacaoStep() {
		this.movi = new CriarMovimentacaoFuncionalidade();
	}

	@Quando("crio uma Movimentacao")
	public void crioUmaMovimentacao() {
		this.movi.criarMovimentacao("Receita");
	}

	@Quando("crio uma Movimentacao sem o campo Data Movimentacao")
	public void movimentacaoSemCampoDataMovimentacao() {
		this.movi.criarMovimentacaoSemDataMovimentacao("Receita");
	}

	@Quando("crio uma Movimentacao sem o campo Data do Pagamento")
	public void movimentacaoSemCampoDataDoPagamento() {
		this.movi.criarMovimentacaoSemDataPagamento("Receita");
	}
	
	@Quando("crio uma Movimentacao sem o campo Valor")
	public void movimentacaoSemCampoValor() {
	   this.movi.criarMovimentacaoValor("Receita");
	 
	}

	@Entao("sistem exibi a mensagen {string}  na tela de Criar Movimentacao")
	public void sistemExibiAMensagenNaTelaDeCriarMovimentacao(String msg) {
		Assert.assertEquals(msg, this.movi.retornaMensagemExibida());
	}
	@Entao("sistema exibi as mensagens {string} e {string}")
	public void sistemaExibiAsMensagensE(String msg1, String msg2) {
		
		Assert.assertTrue(this.movi.retornaMensagemExibida().contains(msg1));
		Assert.assertTrue(this.movi.retornaMensagemExibida().contains(msg2));
	    
	}


}
