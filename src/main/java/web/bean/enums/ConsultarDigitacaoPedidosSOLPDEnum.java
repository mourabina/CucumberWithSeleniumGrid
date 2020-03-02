package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.ConsultarDigitacaoPedidosSOLPDInterface;
import web.pages.ConsultarDigitacaoPedidosSOLPDPage;

public enum ConsultarDigitacaoPedidosSOLPDEnum implements ConsultarDigitacaoPedidosSOLPDInterface {

	LOCAL("Local") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextLocal();
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
			return consultarDigitacaoPedidosSOLPD.getTextLoja();
		}
	},
	COMPR("Compr") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextCPR();
		}
	},
	PRODUTO("Produto") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextProduto();
		}
	},
	DATA("Data") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextDataEntrada();
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
	},
	QTDA("Qtda") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextQuanti();
		}
	},
	FORNECEDOR("Fornecedor") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextFornecedor();
		}
	},
	GRID_LOCAL("Grid Local") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextLocal();
		}
	},
	LOJA("Loja") {
		@Override
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextLoja();
		}
	},
	NOME_FORNECEDOR("Nome Fornecedor"){
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getTextNomeFornecedor();
		}
	},
	SITUACAO_REGISTRO("Nome Fornecedor"){
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getSituacaoRegistro();
		}
	},
	HORA_REGISTRO("Nome Fornecedor"){
		public WebElement getElement(ConsultarDigitacaoPedidosSOLPDPage consultarDigitacaoPedidosSOLPD) {
			return consultarDigitacaoPedidosSOLPD.getHoraRegistro();
		}
	};
	
	

	ConsultarDigitacaoPedidosSOLPDEnum(String s) {

	}

}
