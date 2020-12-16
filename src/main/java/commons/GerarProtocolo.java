package commons;

import java.util.ArrayList;

public class GerarProtocolo {
	
	private MatrizUmProtoco matrizUm = new MatrizUmProtoco();
	private MatrizDoisProtoco matrizDois = new MatrizDoisProtoco();

	Integer resultadoTotalMatrizUm = 0;
	Integer modMatriz1 = 0;
	Integer resultadoTotalMatrizDois = 0;
	int result = 0;

	public ArrayList<Integer> converteStringEmArrayList(String valor) {

		ArrayList<String> valorConvertido = new ArrayList<>();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < valor.length(); i++) {
			valorConvertido.add(String.valueOf(valor.charAt(i)));

		}

		for (int i = 0; i < valorConvertido.size(); i++) {
			resultado.add(Integer.parseInt(valorConvertido.get(i)));
		}

		return resultado;
	}

	public int multiplicaArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {

		ArrayList<Integer> valorUM = array1;
		ArrayList<Integer> valorDois = array2;
		ArrayList<Integer> valorMultiplicado = new ArrayList<Integer>();
		Integer resultado = 0;

		for (int i = 0; i < valorUM.size(); i++) {
			valorMultiplicado.add(valorUM.get(i) * valorDois.get(i));

		}

		for (int i = 0; i < valorMultiplicado.size(); i++) {
			resultado += valorMultiplicado.get(i);
		}

		return resultado;
	}

	public int somaTotalMatriz1(int valor1, int valor2, int valor3, int valor4) {

		int valorFixo = 34;

		return valorFixo + valor1 + valor2 + valor3 + valor4;
	}

	public int somaTotalMatriz2(int valor1, int valor2, int valor3, int valor4, int valor5) {

		int valorFixo = 28;

		return valorFixo + valor1 + valor2 + valor3 + valor4 + valor5;
	}

	public int calculaMod(int mod) {

		int div = 0;

		if (mod <= 1) {
			div = 0;
		} else {
			div = 11 - mod;
		}

		return div;
	}

	public void geraValorMatrizUm(String dataEmissao, String cnpj, String numeroNF, String serie) {

		int dataEmissaoMatriz1 = this.multiplicaArrays(this.converteStringEmArrayList(dataEmissao),
				matrizUm.listaFixaDataEmissao());
		int cnpjMatriz1 = this.multiplicaArrays(this.converteStringEmArrayList(cnpj), matrizUm.listaFixaCNPJ());
		int numeroNFMatriz1 = this.multiplicaArrays(this.converteStringEmArrayList(numeroNF), matrizUm.listaFixa());
		int serieNFMatriz1 = this.multiplicaArrays(this.converteStringEmArrayList(serie), matrizUm.listaFixaSerieNF());

		resultadoTotalMatrizUm = this.somaTotalMatriz1(dataEmissaoMatriz1, cnpjMatriz1, numeroNFMatriz1,
				serieNFMatriz1);
		modMatriz1 = this.somaTotalMatriz1(dataEmissaoMatriz1, cnpjMatriz1, numeroNFMatriz1, serieNFMatriz1) % 11;
	}

	public void gerarValorMatrizDois(String dataEmissao, String cnpj, String numeroNF, String serie) {

		int dataEmissaoMatriz2 = this.multiplicaArrays(this.converteStringEmArrayList(dataEmissao),
				matrizDois.listaFixaMatrizDoisDataEmissao());
		int cnpjMatriz2 = this.multiplicaArrays(this.converteStringEmArrayList(cnpj),
				matrizDois.listaFixaMatrizDoisCNPJ());
		int numeroNFMatriz2 = this.multiplicaArrays(this.converteStringEmArrayList(numeroNF),
				matrizDois.listaFixaMatrizDois());
		int serieNFMatriz2 = this.multiplicaArrays(this.converteStringEmArrayList(serie),
				matrizDois.listaFixaMatrizDoisSerieNF());

		resultadoTotalMatrizDois = this.somaTotalMatriz2(dataEmissaoMatriz2, cnpjMatriz2, numeroNFMatriz2,
				serieNFMatriz2, this.calculaMod(modMatriz1) * 2);
		result = this.somaTotalMatriz2(dataEmissaoMatriz2, cnpjMatriz2, numeroNFMatriz2, serieNFMatriz2,
				this.calculaMod(modMatriz1) * 2) % 11;
	}

	public String completaNumeroNFComZero(Integer valor, String valorParaAlterar) {
		String novoValor = null;
		Integer valorEnviado = Integer.valueOf(valor);
		switch (valorEnviado) {
		case 8:
			novoValor = "0" + valorParaAlterar;
			break;
		case 7:
			novoValor = "00" + valorParaAlterar;
			break;
		case 9:
			novoValor = valorParaAlterar;
			break;	
		}
		return novoValor;

	}

	public String geradorProtoco(String dataEmissao, String cnpj, String numeroNF, String serie) {
		String valorFixo = "123";

		this.geraValorMatrizUm(dataEmissao, cnpj, numeroNF, serie);
		this.gerarValorMatrizDois(dataEmissao, cnpj, numeroNF, serie);

		String protocolo = valorFixo + (this.calculaMod(modMatriz1)) + this.calculaMod(this.result);

		return protocolo;
	}

}
