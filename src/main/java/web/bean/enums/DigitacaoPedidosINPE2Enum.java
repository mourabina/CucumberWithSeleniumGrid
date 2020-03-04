package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.DigitacaoPedidosINPE2Interface;
import web.pages.DigitacaoPedidosINPE2Page;

public enum DigitacaoPedidosINPE2Enum implements DigitacaoPedidosINPE2Interface {

	REGIONAL("Regional") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputRegional();
		}
	},
	PRODUTO("Produto") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputProduto();
		}
	},
	FORNEC("Fornec") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputFornecedor();
		}
	},
	QUANTI("Quanti") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputQuatidade();
		}
	},
	EVENTO("Evento") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputEvento();
		}
	},
	OBS("Obs") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputObservacao();
		}
	},
	COMPRADOR("Comprador") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputComprador();
		}
	},
	PRCOMPRA("PRCompra") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputPRCompras();
		}
	},
	GRATIS("Gratis") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputGratis();
		}
	},
	DT_ENTREGA("DT Entrega") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputDataEntrega();
		}
	},
	DESCONTO("Desconto") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputDesconto();
		}
	},
	OPCAO("OPCAO") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputOpcao();
		}
	},
	CONTR("Contr") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputContr();
		}
	},
	CLASSIF_PED("Classif Ped") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputClassif();
		}
	},
	ICM("icm") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputICMS();
		}
	},
	IPI("ipi") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputIPI();
		}
	},
	HR_EDI("Hr Edi") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputHREDI();
		}
	},
	CODIGO_FILIAL("Codigo Filial") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputHREDI();
		}
	},
	NOME_FILIAL("Nome Filial") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getInputHREDI();
		}
	},
	QUANTIDADE("Quantidade") {
		@Override
		public WebElement getElement(DigitacaoPedidosINPE2Page digitacaoPedidosINPE2) {
			return digitacaoPedidosINPE2.getGridQuantidade();
		}
	};

	DigitacaoPedidosINPE2Enum(String s) {

	}

}
