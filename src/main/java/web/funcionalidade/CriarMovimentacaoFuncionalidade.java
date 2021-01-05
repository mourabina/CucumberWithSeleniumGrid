package web.funcionalidade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import web.pages.CriarMovimentacaoPage;
import web.pages.HomePage;

public class CriarMovimentacaoFuncionalidade extends BaseTest {

	private CriarMovimentacaoPage movi;
	private HomePage home;

	public CriarMovimentacaoFuncionalidade() {
		this.movi = new CriarMovimentacaoPage(getwebDriver());
		this.home = new HomePage(getwebDriver());
	}

	public void clicarBotaoSalvar() {
		this.movi.getBtnSalvar().click();
	}

	public String retornaMensagemExibida() {
		wait.until(ExpectedConditions.visibilityOf(this.movi.getMengExibida()));
		return this.movi.getMengExibida().getText();
	}

	public void selecionarReceita(String receita) {
		Select tipo = new Select(this.movi.getSelectTipo());
		tipo.selectByVisibleText(receita);

	}

	public void selecionarConta() {
		getwebDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select conta = new Select(this.movi.getSelectConta());
		conta.selectByVisibleText(VariaveisEstaticas.getNOME());
	}

	public void criarMovimentacao(String tipo) {
		this.home.getMenuCriarMovimentacao().click();
		this.selecionarReceita(tipo);
		this.movi.getInputDataMovimentacao().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDataPagamento().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDescricao().sendKeys("Teste de Criação de Movimentação");
		this.movi.getInputInteressado().sendKeys("Automação ");
		this.movi.getInputValor().sendKeys("250");
		VariaveisEstaticas.setVALOR("250");
		this.selecionarConta();
		this.movi.getRadioButtonPago().click();
		this.movi.getBtnSalvar().click();
	}
	
	public void criarMovimentacaoValor(String tipo) {
		this.home.getMenuCriarMovimentacao().click();
		this.selecionarReceita(tipo);
		this.movi.getInputDataMovimentacao().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDataPagamento().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDescricao().sendKeys("Teste de Criação de Movimentação");
		this.movi.getInputInteressado().sendKeys("Automação ");
		this.selecionarConta();
		this.movi.getRadioButtonPago().click();
		this.movi.getBtnSalvar().click();
	}
	public void criarMovimentacaoSemDataPagamento(String tipo) {
		this.home.getMenuCriarMovimentacao().click();
		this.selecionarReceita(tipo);
		this.movi.getInputDataMovimentacao().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDescricao().sendKeys("Teste de Criação de Movimentação");
		this.movi.getInputInteressado().sendKeys("Automação ");
		this.movi.getInputValor().sendKeys("250");
		VariaveisEstaticas.setVALOR("250");
		this.selecionarConta();
		this.movi.getRadioButtonPago().click();
		this.movi.getBtnSalvar().click();
	}
	
	public void criarMovimentacaoSemDataMovimentacao(String tipo) {
		this.home.getMenuCriarMovimentacao().click();
		this.selecionarReceita(tipo);
		this.movi.getInputDataPagamento().sendKeys(GeracaoData.retornaDataAtual());
		this.movi.getInputDescricao().sendKeys("Teste de Criação de Movimentação");
		this.movi.getInputInteressado().sendKeys("Automação ");
		this.movi.getInputValor().sendKeys("250");
		VariaveisEstaticas.setVALOR("250");
		this.selecionarConta();
		this.movi.getRadioButtonPago().click();
		this.movi.getBtnSalvar().click();
	}

}
