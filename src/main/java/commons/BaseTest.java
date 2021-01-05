package commons;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.AccountCredentialsUsers;
import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import reports.evidence.Evidence;
import reports.evidence.SeleniumEvidence;
import web.bean.enums.Propriedade;
import web.bean.enums.Propriedade.TipoExecucao;

public class BaseTest {

	protected static List<SeleniumEvidence> evidenceList = new ArrayList<SeleniumEvidence>();
	protected static WebDriverWait wait;
	protected static WebDriverWait shortWait;
	protected static AccountCredentialsUsers credentialsUsers;
	protected static boolean initialized;

	public static Evidence evidence;

	public void setCtName(String ctName) {
		evidence.setCtName(ctName);
	}

	public void setCiclo(String cycle) {
		evidence.setCiclo(cycle);

	}

	public void setTester(String tester) {
		evidence.setTester(tester);
	}

	public void setCtNumber(String ctNumber) {
		evidence.setCtNumber(ctNumber);
	}

	public void initializeEvidence() {
		BaseTest.evidence = new Evidence(evidenceList);
	}

	private static ThreadLocal<WebDriver> threadwebDriver = new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			return initwebDriver();
		}
	};

	public BaseTest() {

	}

	public static WebDriver initwebDriver() {
		WebDriver driver = null;

		if (Propriedade.TIPO_EXECUCAO == TipoExecucao.LOCAL) {
			WebDriverManager.chromedriver().version("87").setup();
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 80);

		}
		if (Propriedade.TIPO_EXECUCAO == TipoExecucao.GRID) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
				System.out.println("Passou por aqui");
				wait = new WebDriverWait(driver, 100);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		return driver;
	}

	/**
	 * Define o usuário da aplicação pelo Gherkin.
	 * 
	 * @param credentialsUsers
	 */
	protected void setUserApplicationUsers(AccountCredentialsUsers credentialsUsers) {

		BaseTest.credentialsUsers = credentialsUsers;
	}

	/**
	 * Método para adicionar na evidência web
	 * 
	 * @param mensagem
	 */
	protected void addEvidenciaWeb(String mensagem) {
		try {
			evidenceList
					.add(new SeleniumEvidence("RESULTADO OBTIDO: " + mensagem + "", takeScreenshot(getwebDriver())));
		} catch (Exception e) {
			System.out.println("Erro ao adicionar na evidência: " + e.getMessage());
			e.printStackTrace();
		}

	}

	protected void clearEvidenceList() {
		for (Iterator<SeleniumEvidence> itr = evidenceList.iterator(); itr.hasNext();) {
			SeleniumEvidence nf = itr.next();
			evidenceList.remove(nf);
		}
		// evidenceList.clear();
	}

	/**
	 * Gera evidência
	 */
	protected void generateEvidence(Scenario scenario) {
		
		try {
			evidence.generateEvidence(scenario);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adiciona o erro.
	 * 
	 * @param e
	 */
	protected void setError(Throwable e) {
		evidence.setError(e, getwebDriver());
	}

	/**
	 * tira prints
	 * 
	 * @param driver
	 * @return
	 */
	private String takeScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

	public void waitForPageToLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		Wait<WebDriver> wait = new WebDriverWait(driver, 60);
		try {
			wait.until(pageLoad);
		} catch (Throwable pageLoadWaitError) {
			assertFalse("Timeout during page load", true);
		}
	}

	public static WebDriver getwebDriver() {
		return threadwebDriver.get();
	}

	public static void killwebDriver() {
		WebDriver webDriver = getwebDriver();
		if (webDriver != null) {
			webDriver.quit();
			webDriver = null;
		}
		if (threadwebDriver != null) {
			threadwebDriver.remove();
		}
	}

}
