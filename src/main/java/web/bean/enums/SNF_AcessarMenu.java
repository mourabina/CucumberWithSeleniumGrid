package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_Menu;
import web.pages.SNF.SNFHomePage;

public enum SNF_AcessarMenu implements SNF_Menu{

	RECEBIMENTO("Recebimento"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuRecebimento();
		}
	},
	
	NOTA_FISCAL("Nota Fiscal"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuNotaFiscal();
		}
	},

	VISUALIZAR_RECEBIMENTO("Visualizar Recebimento"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuVisualizarRecebimento();
		}
	},

	ADICIONAR("Adicionar"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getButtonMais();
		}
	},
	
	VISUALIZAR_NF_REMESSA("Visualizar NF Remessa"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuVisualizarNFRemessa();
		}
	},
	
	PARAMETRIZACOES_FISCAIS("Parametrizacoes Fiscais"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuParametrizacaoFiscais();
		}
	},
	
	NATUREZA_DE_OPERACAO("Natureza de Operacao"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuNaturezaOperacao();
		}
	},
	
	INSCRICAO_SUBSTITUTO("Inscricao Substituto"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuInscricaoSubstituto();
		}
	},
	
	PARAMETROS_DE_COMPORTAMENTO_DO_ST_EM_OPERACOES_DE_DEVOLUCAO("Parametros de Comportamento do ST em Operacoes de Devolucao"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuParamSTOpDevolucao();
		}
	},
	
	MENSAGEM_LEGAL("Mensagem Legal"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuMensagemLegal();
		}
	},
	
	PARAMETROS_GERAIS("Parametros Gerais"){
		@Override
		public WebElement getElement(SNFHomePage homePage) {
			return homePage.getMenuParametrosGerais();
		}
	};

	SNF_AcessarMenu(String s){
		
	}
}
