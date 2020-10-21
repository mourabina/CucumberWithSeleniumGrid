package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_PesquisaMensagemLegalInterface;
import web.pages.SNF.SNFPesquisaMensagemLegalPage;

public enum SNF_PesquisaMensagemLegalEnum implements SNF_PesquisaMensagemLegalInterface {
	
	CODIGO("Codigo"){
		@Override
		public WebElement getElement(SNFPesquisaMensagemLegalPage SNFPesquisaMensagemLegal) {
				return SNFPesquisaMensagemLegal.getInputCodigo();
		}
		
	},
	DESCRICAO("Descricao"){
		@Override
		public WebElement getElement(SNFPesquisaMensagemLegalPage SNFPesquisaMensagemLegal) {
			return SNFPesquisaMensagemLegal.getInputDescricao();
		}
		
	},
	INSERIR_CODIGO("Inserir Codigo"){
		@Override
		public WebElement getElement(SNFPesquisaMensagemLegalPage SNFPesquisaMensagemLegal) {
			return SNFPesquisaMensagemLegal.getInputEditCodigo();
		}
		
	},
	INSERIR_DESCRICAO("Inserir Descricao"){
		@Override
		public WebElement getElement(SNFPesquisaMensagemLegalPage SNFPesquisaMensagemLegal) {
			return SNFPesquisaMensagemLegal.getInputInsertDescricao();
		}
		
	},
	SALVAR("Salavar"){
		@Override
		public WebElement getElement(SNFPesquisaMensagemLegalPage SNFPesquisaMensagemLegal) {
			return SNFPesquisaMensagemLegal.getButtonSalvar();
		}
		
	};
	
	
	
	SNF_PesquisaMensagemLegalEnum(String s){
		
	}

}
