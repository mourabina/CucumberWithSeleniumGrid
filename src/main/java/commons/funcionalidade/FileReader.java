package commons.funcionalidade;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

import commons.SNFFields;

public class FileReader {	

	public static String readJson(String fileName) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/body/" + fileName + ".json"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(encoded, StandardCharsets.UTF_8);
	}

	public static String readNF(String nf) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/body/" + nf + ".txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(encoded, StandardCharsets.UTF_8);
	}

	public static JSONObject getJson(String fileName) {
		return new JSONObject(readJson(fileName));
	}

	public static String[] filterData(String value) {
		String[] data = value.split("\\|");
		return data;
	}

	public static void fillJson(String[] data, JSONObject json) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			switch (data[i]) {
			case "201":
				json.put("201", "Y");
				for (int j = 0; j < SNFFields.getNfe().length; j++) {
					i += 1;
					json.getJSONObject("NFE").put(SNFFields.getNfe()[j], data[i]);					
				}	
				System.out.println(json.getJSONObject("NFE"));
				System.out.println("Campos restantes: " + (data.length - i) + " - Posição do I: " + i);				
				break;
			case "203":
				json.put("203", "Y");
				for (int j = 0; j < SNFFields.getNfeRefeNotaFisc().length; j++) {
					i += 1;
					json.getJSONObject("NFE_REFE_NOTA_FISC").put(SNFFields.getNfeRefeNotaFisc()[j], data[i]);					
				}	
				System.out.println(json.getJSONObject("NFE_REFE_NOTA_FISC"));
				System.out.println("Campos restantes: " + (data.length - i) + " - Posição do I: " + i);		
				break;
			case "204":
				json.put("204", "Y");
				for (int j = 0; j < SNFFields.getNfeProd().length; j++) {
					i += 1;
					json.getJSONObject("NFE_PROD").put(SNFFields.getNfeProd()[j], data[i]);					
				}	
				System.out.println(json.getJSONObject("NFE_PROD"));
				System.out.println("Campos restantes: " + (data.length - i) + " - Posição do I: " + i);				
				break;
			case "205":
				System.out.println("Entrou no laço 205");
				break;
			case "206":
				System.out.println("Entrou no laço 206");
				break;
			case "207":
				System.out.println("Entrou no laço 207");
				break;
			case "208":
				System.out.println("Entrou no laço 208");
				break;
			case "209":
				System.out.println("Entrou no laço 209");
				break;
			case "210":
				System.out.println("Entrou no laço 210");
				break;
			case "211":
				System.out.println("Entrou no laço 211");
				break;
			case "212":
				System.out.println("Entrou no laço 212");
				break;
			case "213":
				System.out.println("Entrou no laço 213");
				break;
			case "214":
				System.out.println("Entrou no laço 214");
				break;
			case "215":
				System.out.println("Entrou no laço 215");
				break;
			case "216":
				System.out.println("Entrou no laço 216");
				break;
			case "217":
				System.out.println("Entrou no laço 217");
				break;
			case "220":
				System.out.println("Entrou no laço 220");
				break;
			case "221":
				System.out.println("Entrou no laço 221");
				break;
			case "222":
				System.out.println("Entrou no laço 222");
				break;
			case "225":
				System.out.println("Entrou no laço 225");
				break;
			case "226":
				System.out.println("Entrou no laço 226");
				break;
			case "227":
				System.out.println("Entrou no laço 227");
				break;
			case "228":
				System.out.println("Entrou no laço 228");
				break;
			case "237":
				System.out.println("Entrou no laço 237");
				break;
			case "238":
				System.out.println("Entrou no laço 238");
				break;
			case "239":
				System.out.println("Entrou no laço 239");
				break;
			default:
				break;
			}
		}
	}

}
