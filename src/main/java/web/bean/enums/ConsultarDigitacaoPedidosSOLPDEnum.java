package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.ConsultarDigitacaoPedidosSOLPDInterface;
import web.pages.ConsultarDigitacaoPedidosSOLPDPage;

public enum ConsultarDigitacaoPedidosSOLPDEnum implements ConsultarDigitacaoPedidosSOLPDInterface {

	LOCAL("Local") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputLocal();
		}
	},
	FORN("Forn") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputFornecedor();
		}
	},
	FILIAL("Filial") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputFilial();
		}
	},
	COMPR("Compr") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputCompr();
		}
	},
	PRODUTO("Produto") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputProduto();
		}
	},
	DATA("Data") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputData();
		}
	},
	HORA("Hora") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputHora();
		}
	},
	SITUACAO("Situacao") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getInputSituacao();
		}
	};

	ConsultarDigitacaoPedidosSOLPDEnum(String s) {

	}

}
