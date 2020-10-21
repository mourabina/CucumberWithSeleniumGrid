package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_IncricaoSubstitutoInterface;
import web.pages.SNF.SNFInscricaoSubstitutoPage;

public enum SNF_InscricaoSubstitutoEnum implements SNF_IncricaoSubstitutoInterface {

	FILIAL_EMITENTE("Filial Emitente"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getFilialEmitente();
		}
	},

	ESTADO_DE_ORIGEM("Estado de Origem"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getEstadoOrigem();
		}
	},
	
	SITUACAO("Situacao"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getSituacao();
		}
	},
	
	ESTADO_DE_DESTINO("Estado de Destino"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getEstadoDestino();
		}
	},
	CNPJ("CNPJ"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getCnpj();
		}
	},
	INSCRICAO_DO_SUBSTITUTO("Inscricao do Substituto"){
		@Override
		public WebElement getElement(SNFInscricaoSubstitutoPage inscricaoSubstitutoPage) {
			return inscricaoSubstitutoPage.getInscricaoSubstituto();
		}
	};
	
		
	

	SNF_InscricaoSubstitutoEnum(String s){
		
	}

}
	