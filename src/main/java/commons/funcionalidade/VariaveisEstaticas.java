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
