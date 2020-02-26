package web.funcionalidade;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import io.cucumber.datatable.DataTable;
import web.bean.enums.DigitacaoPedidosINPE2Enum;
import web.bean.interfaces.DigitacaoPedidosINPE2Interface;
import web.pages.DigitacaoPedidosINPE2Page;

public class Inpe2Funcionalidade extends BaseTest {
	
	private DigitacaoPedidosINPE2Page inpe2;
	
	public Inpe2Funcionalidade() {
		this.inpe2 = new DigitacaoPedidosINPE2Page(webDriver);
	}
	
	
	
	public void preencherCampoValor(String campo, String valor) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.inpe2).clear();
		pedido.getElement(this.inpe2).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void selecionarValorComboBox(String campo, String valor) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.inpe2));
		combo.selectByValue(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void limparCampos(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.inpe2).clear();
		addEvidenciaWeb("Campo: " + campo + " está vazio");
	}

	public String retornaValorCampo(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.inpe2).getAttribute("value");

	}

	public boolean validaCampoVazio(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Campo " + campo);
		return pedido.getElement(this.inpe2).getAttribute("value").isEmpty();

	}

	public void preencherCampos(DataTable params) {
		params.asMaps().forEach(line -> {
			Set<String> headers = line.keySet();
			headers.forEach(header -> {
				this.preencherCampoValor(header, line.get(header));
			});
		});
	}

}
