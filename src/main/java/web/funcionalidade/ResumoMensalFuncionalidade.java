package web.funcionalidade;

import commons.BaseTest;
import web.pages.ResumoMensal;

public class ResumoMensalFuncionalidade extends BaseTest {
	
	private ResumoMensal resumo;
	
	
	public ResumoMensalFuncionalidade() {
		this.resumo = new ResumoMensal(getwebDriver());
	}
	
	
	public void deletarMovimentacao() {
		this.resumo.getBtnDeletarMovimentacao().click();
	}
	
	public String retornaMensagemExibida() {
		return this.resumo.getMengExibida().getText();
	}

}
