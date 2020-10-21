package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.pages.SNF.SNFNaturezaOperacaoPage;

public enum SNF_NaturezaOperacaoDadosComplementares implements web.bean.interfaces.SNF_NaturezaOperacaoDadosComplementares {
		
	SITUACAO_DA_NATUREZA("Situacao da Natureza"){
		@Override
		public WebElement getElement(SNFNaturezaOperacaoPage naturezaOperacao) {
			return naturezaOperacao.getSelectSituacaoNatureza();
		}
	},
	TIPO_DE_OPERACAO("Tipo de Operacao"){
		@Override
		public WebElement getElement(SNFNaturezaOperacaoPage naturezaOperacao) {
			return naturezaOperacao.getSelectTipoOperacao();
		}
	},
	AGRUPAMENTO("Agrupamento"){
		@Override
		public WebElement getElement(SNFNaturezaOperacaoPage naturezaOperacao) {
			return naturezaOperacao.getSelectAgrupamento();
		}
	},
	NATUREZA_DE_OPERACAO("Natureza de Operacao"){
		@Override
		public WebElement getElement(SNFNaturezaOperacaoPage naturezaOperacao) {
			return naturezaOperacao.getSelectNaturezaOperacao();
		}
	},
	CODIGO_DE_NATUREZA("Codigo de Natureza"){
		@Override
		public WebElement getElement(SNFNaturezaOperacaoPage naturezaOperacao) {
			return naturezaOperacao.getInputCodigoNatureza();
		}
	};
	
	
	
	SNF_NaturezaOperacaoDadosComplementares(String s) {
		
	}

}
