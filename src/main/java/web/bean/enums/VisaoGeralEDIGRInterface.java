package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.pages.VisaoGeralEDIGRPage;

public enum VisaoGeralEDIGRInterface implements web.bean.interfaces.VisaoGeralEDIGRInterface {

	CODIGO_DO_FORNECEDOR("Codigo do Fornecedor") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getInputCodFornecedor();
		}
	},
	REGIONAL("Regional") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getInputReginonal();
		}
	},
	FILIAL("Filial") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getInputFilial();
		}
	},
	HORARIO_LIMITE("Horario Limite") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getInputHorarioLimte();
		}
	},
	PEDIDO("Pedido") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectPedido();
		}
	},
	NOTA_FISCAL("Nota Fiscal") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectNotaFiscal();
		}
	},
	PEDIDO_COM_GRADE("Pedido com Grade") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getCheckBoxPedidoComGrade();
		}
	},
	RECEBIMENTO_EM_KG("Recebimento em HG") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getCheckBoxRecebimentoEmKilo();
		}
	},
	POSICAO_ESTOQUE("Posicao Estoque") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectPosicaoEstoque();
		}
	},
	RETORNO_NOTA_FISCAL("Retorno Nota Fiscal") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectRetornoNotaFiscal();
		}
	},
	SITUACAO("Situacao") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectSituacao();
		}
	},
	TIPO("Tipo") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getSelectTipo();
		}
	},
	FORN_EAN("Forn Ean") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getInputEANFornecedor();
		}
	},
	EDI_AUTOMATICO("Edi Automatico") {
		@Override
		public WebElement getElement(VisaoGeralEDIGRPage visaoGeralEDIGR) {
			return visaoGeralEDIGR.getCheckBoxEDIAutomatico();
		}
	};

	VisaoGeralEDIGRInterface(String s) {

	}

}
