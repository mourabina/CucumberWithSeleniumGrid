package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.ConsultaArquivosGeraisROT06Interface;
import web.pages.ConsultaArquivosGeraisROT06Page;

public enum ConsultaArquivosGeraisROT06Enum implements ConsultaArquivosGeraisROT06Interface {

	FILTRO_POR_NOME("Filtro por Nome") {
		@Override
		public WebElement getElement(ConsultaArquivosGeraisROT06Page consultaArquivosGeraisROT06Page) {
			return consultaArquivosGeraisROT06Page.getInuputFiltroPorNome();
		}
	},
	TIPO("Tipo") {
		@Override
		public WebElement getElement(ConsultaArquivosGeraisROT06Page consultaArquivosGeraisROT06Page) {
			return consultaArquivosGeraisROT06Page.getSelectTipo();
		}
	};

	ConsultaArquivosGeraisROT06Enum(String s) {

	}

}
