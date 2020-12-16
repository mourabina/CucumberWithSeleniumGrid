package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_MenagemLegalInterface;
import web.pages.SNF.SNFNaturezaOperacaoXMensagensLegaisPage;

public enum SNF_MensagemLegalEnum implements SNF_MenagemLegalInterface {

	LOCAL_MENSAGEM_NACIONAL("Local Mensagem Nacional") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectLocalMensagemNacional();
		}

	},

	LOCAL_MENSAGEM_ESTADUAL("Local Mensagem Estadual") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectLocalMensagemEstadual();
		}

	},
	LOCAL_MENSAGEM_FILIAL("Local Mensagem Filial") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectLocalMenagemFilial();
		}

	},
	ESTADO("Estado") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectEstado();
		}

	},
	TIPO_DE_NEGOCIO("Tipo de Negocio") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectTipoNegocio();
		}

	},
	FILIAL("Filial") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectFilial();
		}

	},
	ADICIONAR_REGISTRO_LOCAL("Adicionar Registro Local") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectLocal();
		}

	},
	ADICIONAR_REGISTRO_TIPO("Adicionar Registro Tipo") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectTipo();
		}

	},
	ADICIONAR_REGISTRO_TIPO_DE_NEGOCIO("Adicionar Registro Tipo de Negocio") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectTipoNegocioAdionarRegistro();
		}

	},
	ADICIONAR_REGISTRO_ESTADO("Adicionar Registro Estado") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectEstadoAdicionarRegistro();
		}

	},
	ADICIONAR_REGISTRO_FILIAL("Adicionar Registro Filial") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getSelectFilialAdicionarRegistro();
		}

	},
	ABA_NACIONAL("Aba Nacional") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getAbaNacional();
		}

	},
	ABA_ESTADUAL("Aba Estadual") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getAbaEstadual();
		}

	},
	ABA_FILIAL("Aba Filial") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getAbaFilial();
		}

	},
	HISTORICO_ESTADUAL("Historico Estadual") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getButtonHistoricoEstadual();
		}

	},
	HISTORICO_NACIONAL("Historico Nacional") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getButtonHistoricoNacional();
		}

	},
	VISUALIZAR_POR_LOCAL_DE_REFERENCIA("Visualizar Por Local de Referencia") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getDataVisualizacaoPorLocalReferenciaNacional();
		}

	},
	NATUREZA_DE_OPERACAO("Natureza de Operacao") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputNaturezaOperacao();
		}

	},
	USUARIO("Usuario") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputUsuario();
		}

	},
	INICIO_DA_VIGENCIA("Inicio da Vigencia") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputInicioVigencia();
		}

	},
	FIM_DA_VIGENCIA("Fim da Vigencia") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputFimVigencia();
		}

	},
	CODIGO("Codigo") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputCodigo();
		}

	},
	DESCRICAO("Descricao") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputDescricao();
		}

	},
	MENSAGEM_LEGAL("Mensagem Legal") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputMensagemLegal();
		}

	},
	DATA("Data") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputData();
		}

	},
	BOTAO_PESQUISAR("Botao Pesquisar") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getBtnPesquisarSelecionarMensagem();
		}

	},
	BOTAO_CANCELAR("Botao Cancelar") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getButtonCancelar();
		}

	},
	MENSAGEM_LEGAL_DINAMICA("Mensagem Legal Dinamica") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputMenagemLegalDinamica();
		}

	},
	VISUALIZAR_POR_LOCAL_DE_REFERENCIA_FILIAL("Visualizar Por Local de Referencia Filial") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getDataVisualizacaoPorLocalReferenciaFilial();
		}

	},
	VISUALIZAR_POR_LOCAL_DE_REFERENCIA_TEXTO("Visualizar Por Local de Referencia Texto") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getExibicaoMensagensLegasisSelecionadaFilial();
		}

	},
	TITULO("Titulo") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getInputTipo();
		}

	},
	ORDEM("Ordem") {
		@Override
		public WebElement getElement(SNFNaturezaOperacaoXMensagensLegaisPage mensagensLegais) {
			return mensagensLegais.getOrdem();
		}

	};

	SNF_MensagemLegalEnum(String s) {

	}

}
