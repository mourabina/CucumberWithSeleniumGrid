package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_VisualizarNF;
import web.pages.SNF.SNFVisualizarNotasFiscaisPage;

public enum SNF_VisualizarNotaFiscal implements SNF_VisualizarNF {

	UNIDADE_NEGOCIO("Unidade Negócio") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getUnidadeDeNegocio();
		}
	},

	SITUACAO("Situação") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getSituacao();
		}
	},

	TIPO_DOCUMENTO("Tipo Documento") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getTipoDeDocumento();
		}
	},

	CNPJ("CNPJ") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputCNPJ();
		}
	},

	CPF("CPF") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputCPF();
		}
	},

	NOME_FORNECEDOR("Nome Fornecedor") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputNomeFornecedor();
		}
	},

	NOTA_FISCAL("Nota Fiscal") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputNotaFiscal();
		}
	},

	SERIE("Serie") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputSerieNotaFiscal();
		}
	},

	NUMERO_PEDIDO("Numero Pedido") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputNumeroPedido();
		}
	},

	DATA_AGENDA("Data Agenda") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputDataAgenda();
		}
	},

	ID_NOTA_FISCAL("ID Nota Fiscal") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputIDNotaFiscal();
		}
	},

	NUMERO_LOJA("Numero da Loja") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputNumeroLoja();
		}
	},
	
	PORTIFOLIO("Portifolio") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputPortifolio();
		}
	},
	
	DATA_EMISSAO_NF_INICIO("Data Emissisao NF Inicio") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputDataEmissaoInicio();
		}
	},
	
	DATA_EMISSAO_NF_FIM("Data Emissisao NF Fim") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputDataEmissaoFim();
		}
	},
	
	DATA_REJEICAO_FIM("Data Rejeicaoo Fim") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputDataRejeicaoFim();
		}
	},
	
	DATA_REJEICAO_INICIO("Data Rejeiicao Inio") {
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisPage visualizarNF) {
			return visualizarNF.getInputDataRejeicaoInicio();
		}
	};

	SNF_VisualizarNotaFiscal(String s) {

	}
}
