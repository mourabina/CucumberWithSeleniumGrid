
package configuration;

import commons.BaseTest;
import commons.CredentialsUsers;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import web.bean.enums.Web;

public class Hooks extends BaseTest {

	@Before(value = "@web")
	public void beforeScenarioWebWindows() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
	}

	@Before(value = "@webSNF")
	public void beforeScenarioWebSNF() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
		setUserApplicationUsers(CredentialsUsers.USER_WEB_SNF_QA);
	}

	@After(value = "@web")
	public void closeDriver(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}

	@After(value = "@webSNF")
	public void closeDriverSNF(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}

}