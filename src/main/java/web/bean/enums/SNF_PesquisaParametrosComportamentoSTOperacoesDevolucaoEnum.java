package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface;
import web.pages.SNF.SNFParametrosComportamentoSTOperacoesDevolucao;

public enum SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum implements SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface{
	
	FORMATO("Formato"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getFormato();
		}
	},
	ESTADO_DE_ORIGEM("Estado de Origem"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getEstadoOrigem();
		}
	},
	EMPRESA("Empresa"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getEmpresa();
		}
	},
	CAD_FORMATO("Cad Formato"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCadFormato();
		}
	},
	AGRUPAMENTO("Agrupamento"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getAgrupamento();
		}
	},
	CAD_EMPRESA("Cad Empresa"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCadEmpresa();
		}
	},
	ESTADO("Estado"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getEstado();
		}
	},
	NF_DE_RESSARCIMENTO("NF de Ressarcimento"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getNFRessarcimento();
		}
	},
	USUARIO("Usuario"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getUsuario();
		}
	},
	MANUTENCAO("Manutencao"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getManutencao();
		}
	},
	DESTACA_ST_E_FCP_ST("Destaca ST e FCP ST"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getDestacaStFcpSt();
		}
	},
	OBTEM_DO_CFOP("Ortem do CFOP"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getObtemCFOP();
		}
	},
	NATUREZA_DE_OPERACAO("Natureza de Operacao"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getNaturezaOperacao();
		}
	},
	CFOP_OPERACAO_INTERNA("CFOP Operacao Interna"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCFOPOperacaoInterna();
		}
	},
	CODIGO_DO_ITEM("Codigo do Item"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCodigoItem();
		}
	},
	NATUREZA_OPERACAO_IMPRESSA_NA_NF("Natureza Operacao Impressa na NF"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getNaturezaOperacaoImpressaNF();
		}
	},
	CFOP_OPERACAO_EXTERNA("CFOP operacao Externa"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCFOPOperacaoExterna();
		}
	},
	DESCRICAO_DO_ITEM("Descricao do Item"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getDescricaoItem();
		}
	},
	CST("CST"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getCst();
		}
	},
	OPCAO_DE_DESTAQUE("Opcao de Destaque"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getOpcaoDestaque();
		}
	},
	PARAMETROS_DE_RESSARCIMENTO("Parametros de Ressarcimento"){
		@Override
		public WebElement getElement(
				SNFParametrosComportamentoSTOperacoesDevolucao ParametrosComportamentoSTOperacoesDevolucao) {
				return ParametrosComportamentoSTOperacoesDevolucao.getParametrosRessarcimento();
		}
	};
	
	
	
	SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum(String s){
		
	}
	
	
}
