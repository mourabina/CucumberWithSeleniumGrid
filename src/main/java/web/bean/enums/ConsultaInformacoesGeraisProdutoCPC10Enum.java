package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.ConsultaInformacoesGeraisProdutoCPC10Interface;
import web.pages.ConsultaInformacoesGeraisProdutoCPC10Page;

public enum ConsultaInformacoesGeraisProdutoCPC10Enum implements ConsultaInformacoesGeraisProdutoCPC10Interface {

	PDV("PDV") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getInputPDV();
		}
	},
	FORN("Forn") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getInputForn();
		}
	},
	EMBALAGEM_NO_DEPARTAMENTO("Embalagem no Departamento") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextEmbDep();
		}
	},
	UPC_REAL("Upc Real") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextUPCReal();
		}
	},
	LINHA("Linha") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextCodLinha();
		}
	},
	SUBL("Subl") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextCodSubl();
		}
	},
	T_EAN("T Ean") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextTipoEAN();
		}
	},
	COD_EAN("Cod Ean") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextCodEAN();
		}
	},
	COD_COMP("Cod Comp") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextIDComprElement();
		}
	},
	NOME_COMP("Nome Comp") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextNomeCompr();
		}
	},
	SITUAC("Situac") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextSituacao();
		}
	},
	ITEM_A("Item A") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextItemA();
		}
	},
	CESTA("Cesta") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextCesta();
		}
	},
	COD_EMBAL("Cod Embal") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextTipoEmb();
		}
	},
	QUAT_EMBAL("Quat Embal") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextQuantEmb();
		}
	},
	COD_FORN("Cod Forn") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextCodForncedor();
		}
	},
	NOME_FORN("Nome Forn") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextNomeForcedor();
		}
	},
	NOME_PDV("Nome PDV") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextPDV();
		}
	},
	PDL("PDL") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextPDL();
		}
	},
	OBS("Obs") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getTextOBS1();
		}
	},
	MULT_EAN("Multi Ean") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getMultiEan();
		}
	},
	REST_VDA("Rest VDA") {
		@Override
		public WebElement getElement(ConsultaInformacoesGeraisProdutoCPC10Page consultaInformacoesGeraisProdutoCPC10) {
			return consultaInformacoesGeraisProdutoCPC10.getRestVDA();
		}
	};

	ConsultaInformacoesGeraisProdutoCPC10Enum(String s) {

	}

}
