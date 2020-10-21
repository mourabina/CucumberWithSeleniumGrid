package web.pages.SNF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFAdicionarManutencaoRecebimentoParcialPage {

	@FindBy(xpath = "//div[@class='col-12 text-left']")
	private WebElement msgErroUnidadeNegocioNaoEncontrada;

	@FindBy(xpath = "//h4[text()='Adicionar Manutenção de Recebimento Parcial']")
	private WebElement tituloPagina;

	@FindBy(id = "businessUnit")
	private WebElement inputUnidadeNegocio;

	@FindBy(id = "busFuncCode")
	private WebElement selectFuncaoNegocio;

	@FindBy(id = "activeInd")
	private WebElement selectEstadoFuncao;

	@FindBy(id = "lastModifiedBy")
	private WebElement inputUsuarioManutencao;

	@FindBy(id = "lastModified")
	private WebElement inputDataManutebcao;

	@FindBy(xpath = "//button[@class = 'btn btn-primary']")
	private WebElement buttonSalvar;

	@FindBy(xpath = "//button[@class = 'btn btn-default mr-2']")
	private WebElement buttonRetornar;

	public SNFAdicionarManutencaoRecebimentoParcialPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsgErroUnidadeNegocioNaoEncontrada() {
		return msgErroUnidadeNegocioNaoEncontrada;
	}

	public WebElement getTituloPagina() {
		return tituloPagina;
	}

	public WebElement getInputUnidadeNegocio() {
		return inputUnidadeNegocio;
	}

	public WebElement getSelectFuncaoNegocio() {
		return selectFuncaoNegocio;
	}

	public WebElement getSelectEstadoFuncao() {
		return selectEstadoFuncao;
	}

	public WebElement getInputUsuarioManutencao() {
		return inputUsuarioManutencao;
	}

	public WebElement getInputDataManutebcao() {
		return inputDataManutebcao;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public WebElement getButtonRetornar() {
		return buttonRetornar;
	}

}
