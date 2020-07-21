package commons.funcionalidade;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

import commons.SNFFields;

public class BodyManipulator {

	public static JSONObject body;
	public static String bodyStr = "{\"context\":\"";

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

	public static String[] getData(String value) {
		String[] data = readNF(value).split("\\|");
		return data;
	}

	public static void fillJson(String[] data) {
		JSONObject json = getJson("schema");
		for (int i = 0; i < data.length; i++) {
			switch (data[i]) {
			case "201":
				json.put("201", "Y");
				for (int j = 0; j < SNFFields.getNfe().length; j++) {
					i += 1;
					json.getJSONObject("NFE").put(SNFFields.getNfe()[j], data[i]);
				}
				break;
			case "203":
				json.put("203", "Y");
				for (int j = 0; j < SNFFields.getNfeRefeNotaFisc().length; j++) {
					i += 1;
					json.getJSONObject("NFE_REFE_NOTA_FISC").put(SNFFields.getNfeRefeNotaFisc()[j], data[i]);
				}
				break;
			case "204":
				json.put("204", "Y");
				for (int j = 0; j < SNFFields.getNfeProd().length; j++) {
					i += 1;
					json.getJSONObject("NFE_PROD").put(SNFFields.getNfeProd()[j], data[i]);
				}
				break;
			case "205":
				json.put("205", "Y");
				for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
					i += 1;
					json.getJSONObject("NFE_DI").put(SNFFields.getNfeDi()[j], data[i]);
				}
				break;
			case "206":
				json.put("206", "Y");
				for (int j = 0; j < SNFFields.getNfeAdi().length; j++) {
					i += 1;
					json.getJSONObject("NFE_ADI").put(SNFFields.getNfeAdi()[j], data[i]);
				}
				break;
			case "207":
				json.put("207", "Y");
				for (int j = 0; j < SNFFields.getNfeVeic().length; j++) {
					i += 1;
					json.getJSONObject("NFE_VEIC").put(SNFFields.getNfeVeic()[j], data[i]);
				}
				break;
			case "208":
				json.put("208", "Y");
				for (int j = 0; j < SNFFields.getNfeMedc().length; j++) {
					i += 1;
					json.getJSONObject("NFE_MEDC").put(SNFFields.getNfeMedc()[j], data[i]);
				}
				break;
			case "209":
				json.put("209", "Y");
				for (int j = 0; j < SNFFields.getNfeArma().length; j++) {
					i += 1;
					json.getJSONObject("NFE_ARMA").put(SNFFields.getNfeArma()[j], data[i]);
				}
				break;
			case "210":
				json.put("210", "Y");
				for (int j = 0; j < SNFFields.getNfeRebq().length; j++) {
					i += 1;
					json.getJSONObject("NFE_REBQ").put(SNFFields.getNfeRebq()[j], data[i]);
				}
				break;
			case "211":
				json.put("211", "Y");
				for (int j = 0; j < SNFFields.getNfeVolu().length; j++) {
					i += 1;
					json.getJSONObject("NFE_VOLU").put(SNFFields.getNfeVolu()[j], data[i]);
				}
				break;
			case "212":
				json.put("212", "Y");
				for (int j = 0; j < SNFFields.getNfeLacr().length; j++) {
					i += 1;
					json.getJSONObject("NFE_LACR").put(SNFFields.getNfeLacr()[j], data[i]);
				}
				break;
			case "213":
				json.put("213", "Y");
				for (int j = 0; j < SNFFields.getNfeDupl().length; j++) {
					i += 1;
					json.getJSONObject("NFE_DUPL").put(SNFFields.getNfeDupl()[j], data[i]);
				}
				break;
			case "214":
				json.put("214", "Y");
				for (int j = 0; j < SNFFields.getNfeComb().length; j++) {
					i += 1;
					json.getJSONObject("NFE_COMB").put(SNFFields.getNfeComb()[j], data[i]);
				}
				break;
			case "215":
				json.put("215", "Y");
				for (int j = 0; j < SNFFields.getNfeObsvCtbt().length; j++) {
					i += 1;
					json.getJSONObject("NFE_OBSV_CTBT").put(SNFFields.getNfeObsvCtbt()[j], data[i]);
				}
				break;
			case "216":
				json.put("216", "Y");
				for (int j = 0; j < SNFFields.getNfeObsvFisc().length; j++) {
					i += 1;
					json.getJSONObject("NFE_OBSV_FISC").put(SNFFields.getNfeObsvFisc()[j], data[i]);
				}
				break;
			case "217":
				json.put("217", "Y");
				for (int j = 0; j < SNFFields.getNfeProcRefe().length; j++) {
					i += 1;
					json.getJSONObject("NFE_PROC_REFE").put(SNFFields.getNfeProcRefe()[j], data[i]);
				}
				break;
			case "220":
				json.put("220", "Y");
				for (int j = 0; j < SNFFields.getNfeCanc().length; j++) {
					i += 1;
					json.getJSONObject("NFE_CANC").put(SNFFields.getNfeCanc()[j], data[i]);
				}
				break;
			case "221":
				json.put("221", "Y");
				for (int j = 0; j < SNFFields.getNfeCce().length; j++) {
					i += 1;
					json.getJSONObject("NFE_CCE").put(SNFFields.getNfeCce()[j], data[i]);
				}
				break;
			case "222":
				json.put("222", "Y");
				for (int j = 0; j < SNFFields.getNfeSoltEvet().length; j++) {
					i += 1;
					json.getJSONObject("NFE_SOLT_EVET").put(SNFFields.getNfeSoltEvet()[j], data[i]);
				}
				break;
			case "225":
				json.put("225", "Y");
				for (int j = 0; j < SNFFields.getNfeAutrDown().length; j++) {
					i += 1;
					json.getJSONObject("NFE_AUTR_DOWN").put(SNFFields.getNfeAutrDown()[j], data[i]);
				}
				break;
			case "226":
				json.put("226", "Y");
				for (int j = 0; j < SNFFields.getNfeExpt().length; j++) {
					i += 1;
					json.getJSONObject("NFE_EXPT").put(SNFFields.getNfeExpt()[j], data[i]);
				}
				break;
			case "227":
				json.put("227", "Y");
				for (int j = 0; j < SNFFields.getNfeFrmaPgto().length; j++) {
					i += 1;
					json.getJSONObject("NFE_FRMA_PAGTO").put(SNFFields.getNfeFrmaPgto()[j], data[i]);
				}
				break;
			case "228":
				json.put("228", "Y");
				for (int j = 0; j < SNFFields.getNfeNve().length; j++) {
					i += 1;
					json.getJSONObject("NFE_NVE").put(SNFFields.getNfeNve()[j], data[i]);
				}
				break;
			case "237":
				json.put("237", "Y");
				for (int j = 0; j < SNFFields.getNfeSoltPediPror().length; j++) {
					i += 1;
					json.getJSONObject("NFE_SOLT_PEDI_PROR").put(SNFFields.getNfeSoltPediPror()[j], data[i]);
				}
				break;
			case "238":
				json.put("238", "Y");
				for (int j = 0; j < SNFFields.getNfeSoltPediItem().length; j++) {
					i += 1;
					json.getJSONObject("NFE_SOLT_PEDI_ITEM").put(SNFFields.getNfeSoltPediItem()[j], data[i]);
				}
				break;
			case "239":
				json.put("239", "Y");
				for (int j = 0; j < SNFFields.getNfeRstr().length; j++) {
					i += 1;
					json.getJSONObject("NFE_RSTR").put(SNFFields.getNfeRstr()[j], data[i]);
				}
				break;
			default:
				break;
			}
			setBody(json);
		}
	}

	public static void generateBody() {
		JSONObject json = body;
		for (int i = 0; i < SNFFields.getLayouts().length; i++) {
			switch (SNFFields.getLayouts()[i]) {
			case "201":
				if (json.get("201").toString().equals("Y")) {
					bodyStr = bodyStr.concat("201|");
					for (int j = 0; j < SNFFields.getNfe().length; j++) {
						bodyStr = bodyStr.concat(json.getJSONObject("NFE").get(SNFFields.getNfe()[j]).toString());
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "203":
				if (json.get("203").toString().equals("Y")) {
					bodyStr = bodyStr.concat("203|");
					for (int j = 0; j < SNFFields.getNfeRefeNotaFisc().length; j++) {
						bodyStr = bodyStr.concat((String) json.getJSONObject("NFE_REFE_NOTA_FISC")
								.get(SNFFields.getNfeRefeNotaFisc()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "204":
				if (json.get("204").toString().equals("Y")) {
					bodyStr = bodyStr.concat("204|");
					for (int j = 0; j < SNFFields.getNfeProd().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_PROD").get(SNFFields.getNfeProd()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "205":
				if (json.get("205").toString().equals("Y")) {
					bodyStr = bodyStr.concat("205|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr.concat((String) json.getJSONObject("NFE_DI").get(SNFFields.getNfeDi()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "206":
				if (json.get("206").toString().equals("Y")) {
					bodyStr = bodyStr.concat("206|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr.concat((String) json.getJSONObject("NFE_ADI").get(SNFFields.getNfeAdi()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "207":
				if (json.get("207").toString().equals("Y")) {
					bodyStr = bodyStr.concat("207|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_VEIC").get(SNFFields.getNfeVeic()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "208":
				if (json.get("208").toString().equals("Y")) {
					bodyStr = bodyStr.concat("208|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_MEDC").get(SNFFields.getNfeMedc()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "209":
				if (json.get("209").toString().equals("Y")) {
					bodyStr = bodyStr.concat("209|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_ARMA").get(SNFFields.getNfeArma()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "210":
				if (json.get("210").toString().equals("Y")) {
					bodyStr = bodyStr.concat("210|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_REBQ").get(SNFFields.getNfeRebq()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "211":
				if (json.get("211").toString().equals("Y")) {
					bodyStr = bodyStr.concat("211|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_VOLU").get(SNFFields.getNfeVolu()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}				
				break;
			case "212":
				if (json.get("212").toString().equals("Y")) {
					bodyStr = bodyStr.concat("212|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_LACR").get(SNFFields.getNfeLacr()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}			
				break;
			case "213":
				if (json.get("213").toString().equals("Y")) {
					bodyStr = bodyStr.concat("213|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_DUPL").get(SNFFields.getNfeDupl()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "214":
				if (json.get("214").toString().equals("Y")) {
					bodyStr = bodyStr.concat("214|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_COMB").get(SNFFields.getNfeComb()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "215":
				if (json.get("215").toString().equals("Y")) {
					bodyStr = bodyStr.concat("215|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_OBSV_CTBT").get(SNFFields.getNfeObsvCtbt()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "216":
				if (json.get("216").toString().equals("Y")) {
					bodyStr = bodyStr.concat("216|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_OBSV_FISC").get(SNFFields.getNfeObsvFisc()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "217":
				if (json.get("217").toString().equals("Y")) {
					bodyStr = bodyStr.concat("217|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_PROC_REFE").get(SNFFields.getNfeProcRefe()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "220":
				if (json.get("220").toString().equals("Y")) {
					bodyStr = bodyStr.concat("220|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_CANC").get(SNFFields.getNfeCanc()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "221":
				if (json.get("221").toString().equals("Y")) {
					bodyStr = bodyStr.concat("221|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_CCE").get(SNFFields.getNfeCce()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "222":
				if (json.get("222").toString().equals("Y")) {
					bodyStr = bodyStr.concat("222|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_SOLT_EVET").get(SNFFields.getNfeSoltEvet()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "225":
				if (json.get("225").toString().equals("Y")) {
					bodyStr = bodyStr.concat("225|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_AUTR_DOWN").get(SNFFields.getNfeAutrDown()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "226":
				if (json.get("226").toString().equals("Y")) {
					bodyStr = bodyStr.concat("226|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_EXPT").get(SNFFields.getNfeExpt()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "227":
				if (json.get("227").toString().equals("Y")) {
					bodyStr = bodyStr.concat("227|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_FRMA_PAGTO").get(SNFFields.getNfeFrmaPgto()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "228":
				if (json.get("228").toString().equals("Y")) {
					bodyStr = bodyStr.concat("228|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_NVE").get(SNFFields.getNfeNve()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "237":
				if (json.get("237").toString().equals("Y")) {
					bodyStr = bodyStr.concat("237|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_SOLT_PEDI_PROR").get(SNFFields.getNfeSoltPediPror()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "238":
				if (json.get("238").toString().equals("Y")) {
					bodyStr = bodyStr.concat("238|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_SOLT_PEDI_ITEM").get(SNFFields.getNfeSoltPediItem()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			case "239":
				if (json.get("238").toString().equals("Y")) {
					bodyStr = bodyStr.concat("238|");
					for (int j = 0; j < SNFFields.getNfeDi().length; j++) {
						bodyStr = bodyStr
								.concat((String) json.getJSONObject("NFE_RSTR").get(SNFFields.getNfeRstr()[j]));
						bodyStr = bodyStr.concat("|");
					}
					bodyStr = bodyStr.concat("#");
				}
				break;
			default:
				break;
			}	
		}
		bodyStr = bodyStr.concat("\"}");
	}

	public static JSONObject getBody() {
		return body;
	}

	public static void setBody(JSONObject body) {
		BodyManipulator.body = body;
	}

	public static String getBodyStr() {
		return bodyStr;
	}

	public static void setBodyStr(String bodyStr) {
		BodyManipulator.bodyStr = bodyStr;
	}

}
