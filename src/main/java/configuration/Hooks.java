
package configuration;

import commons.BaseTest;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
	
	@Before
	public void SetUp() {
		//inicializarDriver();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		//generateEvidence(scenario);
		//clearEvidenceList();
		killwebDriver();
	}

	

}