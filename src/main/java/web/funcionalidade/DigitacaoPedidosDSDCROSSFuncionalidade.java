package web.funcionalidade;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import io.cucumber.datatable.DataTable;
import web.bean.enums.DigitacaoPedidosINPE2Enum;
import web.bean.interfaces.DigitacaoPedidosINPE2Interface;
import web.pages.DigitacaoPedidosINPE2Page;

public class DigitacaoPedidosDSDCROSSFuncionalidade extends BaseTest {

	private DigitacaoPedidosINPE2Page inpe2;

	public DigitacaoPedidosDSDCROSSFuncionalidade() {
		this.inpe2 = new DigitacaoPedidosINPE2Page(webDriver);
	}

	public void preencherCampoValor(String campo, String valor) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.inpe2).clear();
		pedido.getElement(this.inpe2).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public void selecionarValorComboBox(String campo, String valor) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(pedido.getElement(this.inpe2));
		combo.selectByValue(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}
	
	public void selecionarValorCampoClassificacao() {
		Select combo = new Select(this.inpe2.getInputClassif());
		int i = GeracaoData.retornaHoraAtual();
		if(i <= 1530) {
			combo.selectByValue("T");
			addEvidenciaWeb("Preechimeno do campo: Classificação com o valor :  " + "T");
		}else {
			combo.selectByValue("A");
			addEvidenciaWeb("Preechimeno do campo: Classificação com o valor :  " + "A");
		}
		
	}

	public void limparCampos(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.inpe2).clear();
		addEvidenciaWeb("Campo: " + campo + " está vazio");
	}

	public String retornaValorCampo(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.inpe2).getAttribute("value");

	}

	public boolean validaCampoVazio(String campo) {
		DigitacaoPedidosINPE2Interface pedido = DigitacaoPedidosINPE2Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
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

	public void ClicarBotaConsultarLojas() {
		addEvidenciaWeb("Clicando no Botão Consultar Lojas");
		this.inpe2.getBt_ConsultarLoja().click();

	}

	public void selecionarLoja() {
		this.inpe2.getCheckboxOpcaoLoja().click();

	}

	public void clicarBotaoIncluir() {
		this.inpe2.getBt_incluir().click();

	}

}
