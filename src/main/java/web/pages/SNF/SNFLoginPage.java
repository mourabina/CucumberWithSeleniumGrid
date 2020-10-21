package web.pages.SNF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFLoginPage {
	

	@FindBy( id = "username")
	private WebElement inputUser;
	
	@FindBy( id = "password")
	private WebElement inputPass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement buttonLogin;
	
	public SNFLoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	

	// **********************getter and setters**********************//

	public WebElement getInputUser() {
		return inputUser;
	}

	public void setInputUser(WebElement inputUser) {
		this.inputUser = inputUser;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public void setInputPass(WebElement inputPass) {
		this.inputPass = inputPass;
	}


	public WebElement getBtnLogin() {
		return buttonLogin;
	}

}
