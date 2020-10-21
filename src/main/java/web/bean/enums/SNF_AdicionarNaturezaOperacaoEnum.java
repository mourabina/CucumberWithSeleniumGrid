package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_AdicionarNaturezaOperacaoInterface;
import web.pages.SNF.SNFAdicionarNaturezaOperacaoPage;

public enum SNF_AdicionarNaturezaOperacaoEnum implements SNF_AdicionarNaturezaOperacaoInterface {
	
	OBTEM_DO_CFOP("Obtem do CFOP"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectObtemCFOP();
		}	
	},
	SITUACAO_DA_NATUREZA("Situacao da natureza"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectSituacaoNatureza();
		}	
	},
	SITUACAO_DA_NATUREZA_FORMULARIO("Situacao da natureza Formulario"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectSituacaoNatureza();
		}	
	},
	TIPO_DE_OPERACAO("Tipo de Operacao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectTipoOperacao();
		}	
	},
	TIPO_DE_OPERACAO_FORMULARIO("Tipo de Operacao Formulario"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectTipoOperacao();
		}	
	},
	DESCRICAO_DA_NATUREZA_DE_OPERACAO_NF("Descricao da Natuerza de Operacao NF"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputDescricaoNaturezaOPeracaoNF();
		}	
	},
	DESCRICAO_DE_NATUREZA_DE_OPERACAO("Descricao de Natureza de Operacao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputDescricaoNaturezaOperacao();
		}	
	},
	TIPO_DE_SELECAO("Tipo de Selecao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectTipoSelecao();
		}	
	},
	CFOP("CFOP"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOP();
		}	
	},
	CFOP_NF("CFOP NF"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNF();
		}	
	},
	DENTRO_DA_UF("Dentro da UF"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectDentroUF();
		}	
	},
	FORA_DA_UF("fora da UF"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectForaUF();
		}	
	},
	EXPORTACAO("Exportacao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectExportacao();
		}	
	},
	UN_ORIGEM("UN Origem"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectUnOrigem();
		}	
	},
	UN_DESTINO("UN Destino"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectUnDestino();
		}	
	},
	TIPO_DE_NOTA("Tipo de Nota"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectTipoNota();
		}	
	},
	ATUALIZAR_ESTOQUE("Atualizar Estoque"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectAtualizarEstoque();
		}	
	},
	CONTROLE_DE_ASSISTENCIA_TECNICA("Controle de Assistencia Tecnica"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectControleAssitenciaTecnica();
		}	
	},
	RECUPERA_ICMS_ST("Recupera ICMS ST"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectRecuperaICMSST();
		}	
	},
	CODIGO_DE_NATUREZA_DE_OPERACAO("Codigo de Natureza de Operacao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputCodigoNaturezaOperacao();
		}	
	},
	AGRUPAMENTO("Agrupamento"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectAgrupamento();
		}	
	},
	AGRUPAMENTO_FORMULARIO("Agrupamento Formulario"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectAgrupamento();
		}	
	},
	CODIGO_ID("Codigo ID"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputCodigoID();
		}	
	},
	INDICA_LANCAMENTO_CONTABIL("Indica Lancamento Contabil"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputIndicaNaturezaContabil();
		}	
	},
	DESTACA_INSC_DE_SUBSTITUTO("Destaca Insc de Substituto"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputDestInscSubstituto();
		}	
	},
	PERMITE_OPERACAO_COLIGADAS("Permite Operacao Coligadas"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputPermiteOperacaoColigadas();
		}	
	},
	DESTINO_EMISSAO("Destino Emissao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputDestinoEmissao();
		}	
	},
	TIPO_DE_NF_REFERENTE("Tipo de NF Referente"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputTipoNFReferente();
		}	
	},
	EXIGE_CONTA_CONTABIL("Exige Conta Contabil"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputExigeContaContabil();
		}	
	},
	PERMITE_DESTINO_FORNECEDOR("Permite Destino Fonecedor"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputPermiteDestinoFornecedor();
		}	
	},
	TIPO_DE_GERACAO_DE_NOTA_FISCAL("Tipo de Geracao de Nota Fiscal"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputTipoGeracaoNotaFiscal();
		}	
	},
	PERMITE_PRODUTOS_MANIPULADOS("Permite Produtos Manipulados"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputPermiteProdutosManipulados();
		}	
	},
	TIPO_DE_SELECAO_DE_DESTINO("Tipo de Selecao de Destino"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputTipoSelecaoDestino();
		}	
	},
	EXIGE_PARAM_REC_REMESSA("Exige Param Rec Remessa"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getInputExigeParamRecRemessa();
		}	
	},
	TIPO_DE_NAT_OPERACAO_REFERENTE("Tipo de Nat Operacao Referente"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectTipoNaturezaOPeracaoReferente();
		}	
	},
	CFOP_0("CFOP 0"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST0();
		}	
	},
	CFOP_10("CFOP 10"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST10();
		}	
	},
	CFOP_20("CFOP 20"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST20();
		}	
	},
	CFOP_30("CFOP 30"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST30();
		}	
	},
	CFOP_40("CFOP 40"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST40();
		}	
	},
	CFOP_41("CFOP 41"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST41();
		}	
	},
	CFOP_50("CFOP 50"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST50();
		}	
	},
	CFOP_51("CFOP 51"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST51();
		}	
	},
	CFOP_60("CFOP 60"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST60();
		}	
	},
	CFOP_70("CFOP 70"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST70();
		}	
	},
	
	CFOP_90("CFOP 90"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectCFOPNotaFiscalCST90();
		}	
	},
	
	OBRIGA_NOTA_FISCAL_REFERENTE("Obriga nota fiscal referete"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectObrigaNotaFiscalReferente();
		}	
	},
	
	PERMITE_RECEBIMENTO_PARCIAL("Permite recebimento parcial"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectPermiteRecebimentoParcial();
		}	
	},
	
	NATUREZA_DE_OPERACAO("Natureza de Operacao"){
		@Override
		public WebElement getElement(SNFAdicionarNaturezaOperacaoPage adicionarNaturezaOperacao) {
			return adicionarNaturezaOperacao.getSelectNaturezaOperacao();
		}	
	};
	
	
	
	
	

	
	SNF_AdicionarNaturezaOperacaoEnum(String s) {
		
	}
}
