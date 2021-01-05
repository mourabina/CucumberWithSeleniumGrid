package web.funcionalidade;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import web.bean.enums.CadastrarUsuarioEnum;
import web.bean.interfaces.NovoUsuario;
import web.pages.CadastrarUsuarioPage;
import web.pages.LoginPage;

public class CadastraUsuarioFuncionaldiade extends BaseTest {

	private CadastrarUsuarioPage cadastrarUsuario;
	private LoginPage login;

	public CadastraUsuarioFuncionaldiade() {
		this.cadastrarUsuario = new CadastrarUsuarioPage(getwebDriver());
		this.login = new LoginPage(getwebDriver());

	}

	public void preencherCampoCriarUsuario(String campo, String valor) {
		WebElement elem = getwebDriver().findElement(By.xpath("//label[@for='" + campo + "']//parent::div/input"));
		elem.sendKeys(valor);
		addEvidenciaWeb("preenchendo o campo " + campo);
	}

	public void clicarBotaoCadastrar() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		this.cadastrarUsuario.getBtnCadastrar().click();
	}

	public String retornaMensagem() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		return this.login.getMsgSucesso().getText();
	}

	public String retornaMensagemTelaNovoUsuario() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		return this.cadastrarUsuario.getMsgExibida().getText();
	}

	public boolean validarMensagensExistententes(List<String> msg) {
		wait.until(ExpectedConditions.visibilityOfAllElements(this.cadastrarUsuario.getListaMsg()));
		List<WebElement> lista = this.cadastrarUsuario.getListaMsg();
		List<String> lista1 = new ArrayList<String>();

		for (int i = 0; i < lista.size(); i++) {
			lista1.add(lista.get(i).getText());
		}

		addEvidenciaWeb("Validando Mensagem Exibida");
		return lista1.equals(msg);
	}
	
	public void preencherCampoNovoUsuario(String campo, String valor) {
		NovoUsuario novoUsuario = CadastrarUsuarioEnum.valueOf(campo.replace(" ", "_").toUpperCase());
		novoUsuario.getElement(this.cadastrarUsuario).sendKeys(valor);
		addEvidenciaWeb("Preenchendo o campo " + campo + "com o valor " + valor);
	}

}
