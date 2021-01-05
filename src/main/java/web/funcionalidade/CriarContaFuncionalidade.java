package web.funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import web.pages.AdicionarContasPage;

public class CriarContaFuncionalidade extends BaseTest {

	private AdicionarContasPage adicionarConta;

	public CriarContaFuncionalidade() {
		this.adicionarConta = new AdicionarContasPage(getwebDriver());

	}

	public void preencherCampoNome() {
		Faker faker = new Faker();
		String nome = faker.name().firstName();
		VariaveisEstaticas.setNOME(nome);
		this.adicionarConta.getInputNome().sendKeys(nome);
		addEvidenciaWeb("Preenchendo Campo Nome com o valor :");
	}

	public void preencherCampoNome(String nome) {
		this.adicionarConta.getInputNome().sendKeys(nome);
		addEvidenciaWeb("Preenchendo Campo Nome com o valor :");
	}

	public void clicaBotaoSalvar() {
		this.adicionarConta.getBtnSalvar().click();
	}

	public String retonaMensagemExibida() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		wait.until(ExpectedConditions.visibilityOf(this.adicionarConta.getMsgExibida()));
		return this.adicionarConta.getMsgExibida().getText();
	}

	public void deletarConta() {
		WebElement conta = getwebDriver().findElement(By.xpath("//table[@id='tabelaContas']//tbody/tr//td[text()='"
				+ VariaveisEstaticas.getNOME() + "']//../td[2]//a[2]"));
		conta.click();
	}

}
