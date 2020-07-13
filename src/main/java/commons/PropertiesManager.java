package commons;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {
	
	public String getApiProp(String valor) {
		Properties prop = new Properties();
		File file = new File("");
		try {
			prop.load(new FileInputStream(file.getAbsolutePath()+"/api.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(valor);
	}
}
