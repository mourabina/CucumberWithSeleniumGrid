package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.pages.SNF.SNFVisualizarRecebimentoPage;

public enum SNF_VisualizarRecebimentoEnum implements web.bean.interfaces.SNF_VisualizarRecebimento{
	
	NUMERO_RECEBIMENTO("Numero Recebimento"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getinputNumeroRecebimento();
		}
	},
	
	NUMERO_AGENDAMENTO("Numero Agendamento"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputNumeroAgendamento();
		}
	},
	
	NUMERO_FORNECEDOR("Numero Fornecedor"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputNumeroFornecedor();
		}
	},
	
	NOME_FORNECEDOR("Nome Fornecedor"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputNomeFornecedor();
		}
	},
	
	NUMERO_PEDIDO("Numero Pedido"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInpuNumeroPedido();
		}
	},
	
	NOTA_FISCAL("Nota Fiscal"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputNotaFiscal();
		}
	},
	DATA_AGENDA("Data Agenda"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputDataAgenda();
		}
	},
	SITUACAO("Situacao"){
		@Override
		public WebElement getElement(SNFVisualizarRecebimentoPage snfvisualiarRecebimentoPage) {
			return snfvisualiarRecebimentoPage.getInputSituacao();
		}
	};

	
	
	SNF_VisualizarRecebimentoEnum(String s) {

	}

}
