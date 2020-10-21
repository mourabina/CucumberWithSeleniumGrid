package commons.funcionalidade;

import java.util.List;
import java.util.Map;

public class VariaveisEstaticas {

	private static String USUARIO;
	private static String AGENDA;
	private static String COMPRADOR;
	private static String FORNEC;
	private static String COD_PRODUTO;
	private static String CLASSIF_PED;
	private static String QUANT;
	private static String DATA_ENTRADA;
	private static String FILIAL;
	private static String DESCRICAO;
	private static String HORA;
	private static List<Map<String, String>> map;
	private static Map<String, String> LISTA;
	private static String VALOR_GRID;
	private static String CODIGO;

	public static Map<String, String> getLISTA() {
		return LISTA;
	}

	public static void setLISTA(Map<String, String> lISTA) {
		LISTA = lISTA;
	}

	public static String getVALOR_GRID() {
		return VALOR_GRID;
	}

	public static void setVALOR_GRID(String vALOR_GRID) {
		VALOR_GRID = vALOR_GRID;
	}

	public static String getCODIGO() {
		return CODIGO;
	}

	public static void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}

	public static String getINSCRICAO_SUBSTITUTO() {
		return INSCRICAO_SUBSTITUTO;
	}

	public static void setINSCRICAO_SUBSTITUTO(String iNSCRICAO_SUBSTITUTO) {
		INSCRICAO_SUBSTITUTO = iNSCRICAO_SUBSTITUTO;
	}

	public static String getHORA_CRIACAO_INSCRICAO() {
		return HORA_CRIACAO_INSCRICAO;
	}

	public static void setHORA_CRIACAO_INSCRICAO(String hORA_CRIACAO_INSCRICAO) {
		HORA_CRIACAO_INSCRICAO = hORA_CRIACAO_INSCRICAO;
	}

	public static String getINSCRICAO_SUBSTITUTO_ALTERADA() {
		return INSCRICAO_SUBSTITUTO_ALTERADA;
	}

	public static void setINSCRICAO_SUBSTITUTO_ALTERADA(String iNSCRICAO_SUBSTITUTO_ALTERADA) {
		INSCRICAO_SUBSTITUTO_ALTERADA = iNSCRICAO_SUBSTITUTO_ALTERADA;
	}

	public static String getVALOR_USUARIO() {
		return VALOR_USUARIO;
	}

	public static void setVALOR_USUARIO(String vALOR_USUARIO) {
		VALOR_USUARIO = vALOR_USUARIO;
	}

	public static String getDESCRICAO_MENSAGEM_LEGAL() {
		return DESCRICAO_MENSAGEM_LEGAL;
	}

	public static void setDESCRICAO_MENSAGEM_LEGAL(String dESCRICAO_MENSAGEM_LEGAL) {
		DESCRICAO_MENSAGEM_LEGAL = dESCRICAO_MENSAGEM_LEGAL;
	}

	public static String getDESCRICAO_NOVA_MENSAGEM_LEGAL() {
		return DESCRICAO_NOVA_MENSAGEM_LEGAL;
	}

	public static void setDESCRICAO_NOVA_MENSAGEM_LEGAL(String dESCRICAO_NOVA_MENSAGEM_LEGAL) {
		DESCRICAO_NOVA_MENSAGEM_LEGAL = dESCRICAO_NOVA_MENSAGEM_LEGAL;
	}

	private static String INSCRICAO_SUBSTITUTO;
	private static String HORA_CRIACAO_INSCRICAO;
	private static String INSCRICAO_SUBSTITUTO_ALTERADA;
	private static String VALOR_USUARIO;
	private static String DESCRICAO_MENSAGEM_LEGAL;
	private static String DESCRICAO_NOVA_MENSAGEM_LEGAL;

	public static void setFILIAL(String fILIAL) {
		FILIAL = fILIAL;
	}

	public static String getFILIAL() {
		return FILIAL;
	}

	public static String getCOMPRADOR() {
		return COMPRADOR;
	}

	public static void setCOMPRADOR(String cOMPRADOR) {
		COMPRADOR = cOMPRADOR;
	}

	public static String getFORNEC() {
		return FORNEC;
	}

	public static void setFORNEC(String fORNEC) {
		FORNEC = fORNEC;
	}

	public static String getCOD_PRODUTO() {
		return COD_PRODUTO;
	}

	public static void setCOD_PRODUTO(String cOD_PRODUTO) {
		COD_PRODUTO = cOD_PRODUTO;
	}

	public static String getQUANT() {
		return QUANT;
	}

	public static void setQUANT(String qUANT) {
		QUANT = qUANT;
	}

	public static String getDATA_ENTRADA() {
		return DATA_ENTRADA;
	}

	public static void setDATA_ENTRADA(String dATA_ENTRADA) {
		DATA_ENTRADA = dATA_ENTRADA;
	}

	public static String getAGENDA() {
		return AGENDA;
	}

	public static void setAGENDA(String aGENDA) {
		AGENDA = aGENDA;
	}

	public static String getDESCRICAO() {
		return DESCRICAO;
	}

	public static void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}

	public static String getHORA() {
		return HORA;
	}

	public static void setHORA(String hORA) {
		HORA = hORA;
	}

	public static List<Map<String, String>> getMap() {
		return map;
	}

	public static void setMap(List<Map<String, String>> map) {
		VariaveisEstaticas.map = map;
	}

	public static String getCLASSIF_PED() {
		return CLASSIF_PED;
	}

	public static void setCLASSIF_PED(String cLASSIF_PED) {
		CLASSIF_PED = cLASSIF_PED;
	}

	public static void guardarValores(String campo, String valor) {
		switch (campo.toUpperCase()) {
		case "FORNEC":
			VariaveisEstaticas.setFORNEC(valor);
			break;
		case "COMPRADOR":
			VariaveisEstaticas.setCOMPRADOR(valor);
			break;
		case "PESQUISA":
			VariaveisEstaticas.setCOD_PRODUTO(valor);
			break;
		case "PRODUTO":
			VariaveisEstaticas.setCOD_PRODUTO(valor);
			break;
		case "CLASSIF PED":
			VariaveisEstaticas.setCLASSIF_PED(valor);
			break;
		default:
			break;
		}
	}

	public static String getUSUARIO() {
		return USUARIO;
	}

	public static void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
}
