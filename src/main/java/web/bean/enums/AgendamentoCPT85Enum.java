package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.AgendamentoCPT85Interface;
import web.pages.AgendamentoCPT85Page;

public enum AgendamentoCPT85Enum implements AgendamentoCPT85Interface {

	AGENDA("Agenda") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputAgenda();
		}
	},
	DATA_AGENDA("Data Agenda") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputDataAgenda();
		}
	},
	DATA_PREV_ENTRADA("Data Prev Entrada") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputDataEntrada();
		}
	},
	HORA_PREV_ENTRADA("Hora Prev Entrega") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputHoraEntrada();
		}
	},
	MINUTO_PREV_ENTRADA("Minuto Prev Entrega") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputMinutoEntrada();
		}
	},
	FILIAL("Filial") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputFilial();
		}
	},
	FILIAL_ORIGEM("Filial Origem") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputFilialOrigem();
		}
	},
	NUMERO_NOTA("Numero Nota") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputNummeroNota();
		}
	},
	SERIE_NOTA("Serie Nota") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputSerieNota();
		}
	},
	TRANSPORTADORA("Transportadora") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputTransportadora();
		}
	},
	VEICULO_NO_CD("Veiculo no CD") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputVeicuNoCD();
		}
	},
	TIPO_VEICULO("Tipo Veiculo") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getSelectTipoVeiculo();
		}
	},
	TIPO_CARGA("Tipo Carga") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getSelectTipoCarga();
		}
	},
	TIPO_ENTREGA("Tipo Entrega") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getSelectTipoEntrega();
		}
	},
	TIPO_AGENDA("Tipo Agenda") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getSelectTipoAgendaElement();
		}
	},
	CONTATO("Contato") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputContato();
		}
	},
	FONE("Fone") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputTelefone();
		}
	},
	PERECIVEL("Perecivel") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputPerecivel();
		}
	},
	OBS("Obs") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputOBS();
		}
	},
	ALTO_RISCO("Alto Risco") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputAltoRisco();
		}
	},
	PEDIDO("Pedido") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputPedido();
		}
	},
	ENTREGA_PREVISTA("Entrega Prevista") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getEntradaPrevista();
		}
	},
	DATA_CANCEAMENTO("Data Cancelamento") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputDataCancelamento();
		}
	},
	SALDO("Saldo") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputSaldo();
		}
	},
	A_AGENDAR("A Agendar") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputAAgendar();
		}
	},
	VOLUMES("Volumes") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputVolumes();
		}
	},
	TIPO_PEDIDO("Tipo Pedido") {
		@Override
		public WebElement getElement(AgendamentoCPT85Page agendamentoCPT85page) {
			return agendamentoCPT85page.getInputTipoPedido();
		}
	};

	AgendamentoCPT85Enum(String s) {

	}

}
