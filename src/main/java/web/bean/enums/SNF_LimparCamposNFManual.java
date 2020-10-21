package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_NFManual;
import web.pages.SNF.SNFFornecedorNFPage;

public enum SNF_LimparCamposNFManual implements SNF_NFManual {

	NUMERO_DE_SERIE("Numero de Serie") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getSerieNotaFiscal();
		}
	},

	NUMERO_NOTA_FISCAL("Numero Nota Fiscal") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getNumeroNotaFiscal();
		}
	},

	DATA_DE_EMISSAO_NF("Data de Emissao NF") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getDataEmissaoNotaFiscal();
		}
	},

	CNPJ("CNPJ") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getCPF_CNPJ();
		}
	},
	INSCRICAO_ESTADUAL("Inscrição Estadual") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getInscricaoEstadual();
		}
	},

	CFOP("CFOP") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getCFOP();
		}
	},
	
	BASE_ICMS("Base ICMS") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getBaseICMS();
		}
	},
	
	VALOR_ICMS("Valor ICMS") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getValorICMS();
		}
	},
	
	BASE_FCP("Base FCP") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getBaseFCP();
		}
	},
	
	VALOR_FCP("Valor FCP") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getValorFCP();
		}
	},
	
	BASE_ICMS_ST("Base ICMS ST") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getBaseICMSST();
		}
	},
	
	VALOR_ICMS_ST("Valor ICMS ST") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getValorICMSST();
		}
	},
	
	VALOR_TOTAL_PRODUTOS("Valor Total Produtos") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getValorTotalProdutos();
		}
	},
	
	BASE_FCP_ST("Base FCP ST") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getBaseFCPST();
		}
	},
	
	VALOR_FCP_ST("Valor FCP ST") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getValorFCPST();
		}
	},
	
	FRETE("Frete") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getFrete();
		}
	},
	
	SEGURO("Seguro") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getSeguro();
		}
	},
	
	DESCONTO("Desconto") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getDesconto();
		}
	},
	
	DESPESAS_ACESSORIAS("Despesas Acessórias") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getDespesasAcessorias();
		}
	},
	
	IPI("IPI") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getIPI();
		}
	},
	
	VALOR_TOTAL_NOTA("Valor Total Nota") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getTotalValorNota();
		}
	},
	
	DATA_VENCIMENTO("Data Vencimento") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getDataVencimentoNotaFiscal();
		}
	},
	
	CODIGO_DE_BARRA_NFE("Código de Barras NF-e") {
		@Override
		public WebElement getElement(SNFFornecedorNFPage forncedorNF) {
			return forncedorNF.getCodigoBarraNFe();
		}
	}

	;

	SNF_LimparCamposNFManual(String s) {

	}

}
