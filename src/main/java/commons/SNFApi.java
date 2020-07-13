package commons;

import java.io.FileNotFoundException;

import commons.funcionalidade.FileReader;
import io.restassured.RestAssured;

public class SNFApi {
	
	PropertiesManager propertiesManager;
	String token;
	
	public SNFApi() {
		this.propertiesManager = new PropertiesManager();
	}
	
	public String getBaseUrl() {
		return propertiesManager.getApiProp("baseUrlSNF");
	}
	
	public void getToken() throws FileNotFoundException {
		token = RestAssured.given().headers("Content-Type", "application/json").body(FileReader.getJson("auth").toString()).when().log().all().post(this.getBaseUrl()+"sign-in").then().extract().path("token");
//		FileReader.filterData(FileReader.readNF("NF"));
		FileReader.fillJson(FileReader.filterData(FileReader.readNF("NF")),FileReader.getJson("schema"));
	}	
}
