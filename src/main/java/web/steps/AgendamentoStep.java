package web.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.AgendamentoFuncionalidade;

public class AgendamentoStep {
	
	private AgendamentoFuncionalidade agenda;
	
	public AgendamentoStep() {
		this.agenda = new AgendamentoFuncionalidade();
	}
	
	@Quando("^preencho os campos$")
	public void preenchoOsCampos(DataTable params){
		this.agenda.preencherCampos(params);
	}
}
