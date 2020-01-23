package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.MonitoramentoReceiverCPC76Interface;
import web.pages.MonitoramentoReceiverCPC76Page;

public enum MonitoramentoReceiverCPC76Enum implements MonitoramentoReceiverCPC76Interface {

	DEP("Dep") {
		@Override
		public WebElement getElement(MonitoramentoReceiverCPC76Page monitoramentoReceiverCPC76) {
			return monitoramentoReceiverCPC76.getInputDeparta();
		}
	},
	DATA_AGENDA("Data Agenda") {
		@Override
		public WebElement getElement(MonitoramentoReceiverCPC76Page monitoramentoReceiverCPC76) {
			return monitoramentoReceiverCPC76.getInputDataAgenda();
		}
	},
	STATUS("Status") {
		@Override
		public WebElement getElement(MonitoramentoReceiverCPC76Page monitoramentoReceiverCPC76) {
			return monitoramentoReceiverCPC76.getInputStatus();
		}
	},
	PEDIDO("Pedido") {
		@Override
		public WebElement getElement(MonitoramentoReceiverCPC76Page monitoramentoReceiverCPC76) {
			return monitoramentoReceiverCPC76.getInputPedido();
		}
	},
	COD_CESTA("Cod Cesta") {
		@Override
		public WebElement getElement(MonitoramentoReceiverCPC76Page monitoramentoReceiverCPC76) {
			return monitoramentoReceiverCPC76.getCodCesta();
		}
	};

	MonitoramentoReceiverCPC76Enum(String s) {

	}

}
