package commons;

import java.io.FileNotFoundException;

import commons.funcionalidade.BodyManipulator;
import io.restassured.RestAssured;

public class SNFApi {

	PropertiesManager propertiesManager;
	public static String token;

	public SNFApi() {
		this.propertiesManager = new PropertiesManager();
	}

	public String getBaseUrl() {
		return propertiesManager.getApiProp("baseUrlSNF");
	}

	public void generateToken() throws FileNotFoundException {
		setToken(RestAssured.given().headers("Content-Type", "application/json")
				.body(BodyManipulator.getJson("auth").toString()).when().log().all().post(this.getBaseUrl() + "sign-in")
				.then().assertThat().statusCode(200).extract().path("token"));
	}

	public void prepareBody(String NF) {
		BodyManipulator.fillJson(BodyManipulator.getData(NF));
		BodyManipulator.generateBody();
	}

	public void sendNF() throws FileNotFoundException {
		RestAssured.given().headers("Content-Type", "application/json").headers("Authorization", "Bearer " + getToken())
				.body(BodyManipulator.getBodyStr()).when().post(this.getBaseUrl() + "inbound/receiver-invoice").then().log().all().assertThat().statusCode(200);
	}

	public static String getToken() {
		return token;
	}

	public static void setToken(String token) {
		SNFApi.token = token;
	}

}
