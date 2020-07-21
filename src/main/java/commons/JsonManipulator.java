package commons;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonManipulator {
	
	public static JSONObject setValue(Object object, String field, String value) {
		JSONObject json = (JSONObject) object;
		
		Set<String> keys = json.keySet();
		
		for (String key: keys) {
			if(json.get(key) instanceof JSONObject) {
				
				setValue(json.get(key), field, value);
				
			} else if (json.get(key) instanceof JSONArray) {
				JSONArray array = json.getJSONArray(key);
				
				if(array.toString().contains(field)) {
					for (int i = 0; i < array.length(); i++) {
						JSONObject itemArray = (JSONObject) array.get(i);
						itemArray.put(field, value);						
					}
				}
			} else {
				if (key.equals(field)) {
					json.put(key, value);
				}
			}
		} 
		return json;
	}
}
