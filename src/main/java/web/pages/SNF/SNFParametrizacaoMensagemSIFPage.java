package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFParametrizacaoMensagemSIFPage {
	
	@FindBy(id = "govtInspectionName")
	private WebElement nome;
	
	@FindBy(id = "govtInspectioMsgDesc")
	private WebElement descricao;
	
	@FindBy(xpath = "//input[@formcontrolname=\"govtInspectionName\"]")
	private WebElement inputNome;
	
	@FindBy(xpath = "//input[@formcontrolname=\"govtInspectioMsgDesc\"]")
	private WebElement inputDescricao;
	
	@FindBy(xpath = "//Button[@class='btn btn-primary mr-2']/i")
	private WebElement btSalvar;
	
	@FindBy(xpath = "//Button[@class='btn btn-default mr-2']/i")
	private WebElement btRetornar;
	
	public SNFParametrizacaoMensagemSIFPage(WebDriver webElement) {
		PageFactory.initElements(webElement, this);
	}

	public WebElement getNome() {
		return nome;
	}

	public WebElement getDescricao() {
		return descricao;
	}

	public WebElement getInputNome() {
		return inputNome;
	}

	public WebElement getInputDescricao() {
		return inputDescricao;
	}
}
