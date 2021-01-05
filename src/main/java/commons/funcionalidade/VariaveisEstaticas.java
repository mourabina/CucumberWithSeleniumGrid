package commons.funcionalidade;

public class VariaveisEstaticas {

	private static String NOME;
	private static String VALOR;

	public static String getVALOR() {
		return VALOR;
	}

	public static void setVALOR(String vALOR) {
		VALOR = vALOR;
	}

	public static String getNOME() {
		return NOME;
	}

	public static void setNOME(String nOME) {
		NOME = nOME;
	}

}
