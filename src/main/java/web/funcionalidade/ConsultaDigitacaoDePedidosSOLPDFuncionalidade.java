package web.funcionalidade;

import commons.BaseTest;
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

}
