package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.PlanejamentoConversaoLojasLJATIInterface;
import web.pages.PlanejamentoConversaoLojasLJATIPage;

public enum PlanejamentoConversaoLojasLJATIEnum implements PlanejamentoConversaoLojasLJATIInterface {

	LOJA("Loja") {
		@Override
		public WebElement getElement(PlanejamentoConversaoLojasLJATIPage planejamentoConversaoLojasLJATI) {
			return planejamentoConversaoLojasLJATI.getInputLoja();
		}
	},
	LOJA_WM("Loja WM") {
		@Override
		public WebElement getElement(PlanejamentoConversaoLojasLJATIPage planejamentoConversaoLojasLJATI) {
			return planejamentoConversaoLojasLJATI.getInputLojaWM();
		}
	},
	SITUACAO("Situacao") {
		@Override
		public WebElement getElement(PlanejamentoConversaoLojasLJATIPage planejamentoConversaoLojasLJATI) {
			return planejamentoConversaoLojasLJATI.getInputDescSituacao();
		}
	},
	CONVERSAO("Conversao") {
		@Override
		public WebElement getElement(PlanejamentoConversaoLojasLJATIPage planejamentoConversaoLojasLJATI) {
			return planejamentoConversaoLojasLJATI.getInputConversao();
		}
	},
	DATA_CORTE_HNF("Data Corte HNF") {
		@Override
		public WebElement getElement(PlanejamentoConversaoLojasLJATIPage planejamentoConversaoLojasLJATI) {
			return planejamentoConversaoLojasLJATI.getDataCorteHNF();
		}
	};

	PlanejamentoConversaoLojasLJATIEnum(String s) {

	}

}
