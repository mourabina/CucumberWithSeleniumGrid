package web.bean.enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import web.bean.interfaces.WebApplication;

import java.util.HashMap;
import java.util.Map;

public enum Web implements WebApplication{
	
	CHROME {

		@Override
		public WebDriver getDriver() {
			WebDriverManager.chromedriver().version("85.0").setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
//			options.setHeadless(true);
			options.setExperimentalOption("prefs", prefs);

			return new ChromeDriver(options);
		}
		
	},
	
	FIREFOX {

		@Override
		public WebDriver getDriver() {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
		
	}

}
