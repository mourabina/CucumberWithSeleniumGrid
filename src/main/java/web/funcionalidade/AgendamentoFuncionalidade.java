package web.funcionalidade;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import io.cucumber.datatable.DataTable;
import web.bean.enums.AgendamentoCPT85Enum;
import web.bean.interfaces.AgendamentoCPT85Interface;
import web.pages.AgendamentoCPT85Page;

public class AgendamentoFuncionalidade extends BaseTest {
	
	private AgendamentoCPT85Page agenda;
	
	public AgendamentoFuncionalidade() {
		this.agenda = new AgendamentoCPT85Page(webDriver);
	}
	
	public void preencherCampos(DataTable params) {
		params.asMaps().forEach(line -> {
			Set<String> headers = line.keySet();
			headers.forEach(header -> {
				this.preencherCampoValor(header, line.get(header));
			});
		});
	}
	
	public void preencherCampoValor(String campo, String valor) {
		AgendamentoCPT85Interface intAgend = AgendamentoCPT85Enum.valueOf(campo.replace(" ","_").toUpperCase());
		intAgend.getElement(this.agenda).clear();
		intAgend.getElement(this.agenda).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}
	
	public String retornaValorCampo(String campo) {
		AgendamentoCPT85Interface intAgend = AgendamentoCPT85Enum.valueOf(campo.replace(" ","_").toUpperCase());
		return intAgend.getElement(this.agenda).getAttribute("value");
		
	}
	
	public boolean validaCampoVazio(String campo) {
		AgendamentoCPT85Interface intAgend = AgendamentoCPT85Enum.valueOf(campo.replace(" ","_").toUpperCase());
		addEvidenciaWeb("O valor do campo" + campo);
		return intAgend.getElement(this.agenda).getAttribute("value").isEmpty();
		
	}
	
	public void clicarBotaoIncluir() {
		this.agenda.getButtonIncluir().click();
	}
	public void clicarBotaoConsultar() {
		this.agenda.getButtonConsultar().click();
		addEvidenciaWeb("Consulta realizada, dados retornados");
	}
	
	public void incluirAguardar() {
		this.clicarBotaoIncluir();
		wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(this.agenda.getInputAgenda(), "value", "0")));
		addEvidenciaWeb("Criação da agenda");
	}

}
