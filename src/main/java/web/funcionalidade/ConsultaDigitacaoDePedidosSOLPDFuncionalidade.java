package web.funcionalidade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import web.bean.enums.ConsultarDigitacaoPedidosSOLPDEnum;
import web.bean.interfaces.ConsultarDigitacaoPedidosSOLPDInterface;
import web.pages.ConsultarDigitacaoPedidosSOLPDPage;

public class ConsultaDigitacaoDePedidosSOLPDFuncionalidade extends BaseTest {
	
	private ConsultarDigitacaoPedidosSOLPDPage solpd;
	
	
	public ConsultaDigitacaoDePedidosSOLPDFuncionalidade() {
		this.solpd = new ConsultarDigitacaoPedidosSOLPDPage(webDriver);
	}	
	
	public void preencherCampoValor(String campo, String valor) {
		ConsultarDigitacaoPedidosSOLPDInterface pedido = ConsultarDigitacaoPedidosSOLPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.solpd).clear();
		pedido.getElement(this.solpd).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}
	
	public String retornaValorCampo(String campo) {
		ConsultarDigitacaoPedidosSOLPDInterface pedido = ConsultarDigitacaoPedidosSOLPDEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.solpd).getAttribute("value");
	}
	
	public void pesquisar() {
		Actions action = new Actions(webDriver);
		action.sendKeys(Keys.ENTER).perform();
		addEvidenciaWeb("Consulta realizada");
	}
	
	public void pegarValoresParaExclusao() {
		VariaveisEstaticas.setCOD_PRODUTO(this.retornaValorCampo("Produto"));
		VariaveisEstaticas.setCOMPRADOR(this.retornaValorCampo("Compr"));
		VariaveisEstaticas.setFORNEC(this.retornaValorCampo("Fornecedor"));
		
	}
	
}
