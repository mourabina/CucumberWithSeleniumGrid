package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_VisualizarNotaFiscalRemessaInterface;
import web.pages.SNF.SNFVisualizarNotasFiscaisRemessaPage;

public enum SNF_VisualizarNotaFiscalRemessa implements SNF_VisualizarNotaFiscalRemessaInterface {
	
	NOME_FORNECEDOR("Nome Fornecedor"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputNomeFornecedor();
		}
		
	},
	
	SERIE("Serie"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputSerieNF();
		}
		
	},
		
	NOTA_FISCAL("Nota Fiscal"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputNotaFiscal();
		}
		
	},

	SECAO("Seção"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputSecao();
		}
		
	},
	DATA_INICIO("Data Inicio"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputDataEmissaoNFInicio();
		}
		
	},
	
	CNPJ("CNPJ"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputCNPJ();
		}
		
	},
	
	DATA_FIM("Data Fim"){
		@Override
		public WebElement getElement(SNFVisualizarNotasFiscaisRemessaPage visualizarRemessa) {
			return visualizarRemessa.getInputDataEmissaoNFFim();
		}
		
	};

	SNF_VisualizarNotaFiscalRemessa(String s) {
		
	}

}
