package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum;
import web.bean.interfaces.SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface;
import web.pages.SNF.SNFComponentesPage;
import web.pages.SNF.SNFParametrosComportamentoSTOperacoesDevolucao;

public class SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoFuncionalidade extends BaseTest {

	private SNFParametrosComportamentoSTOperacoesDevolucao devo;
	public boolean vr = true;
	private SNFComponentesPage comp;
	private waitLoading load;

	public SNFPesquisaParametrosComportamentoSTOperacoesDevolucaoFuncionalidade() {
		this.devo = new SNFParametrosComportamentoSTOperacoesDevolucao(webDriver);
		this.comp = new SNFComponentesPage(webDriver);
		this.load = new waitLoading();
	}

	public void clicarCampoEstiloSelecao(String campo) {
		this.load.loading();
		webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		wait.until(ExpectedConditions.elementToBeClickable(pesq.getElement(this.devo)));
		pesq.getElement(this.devo).click();
		addEvidenciaWeb("Clicando no campo : " + campo);
	}
	
	public void clicarCampoEstiloSelecaoSemLoad(String campo) {
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pesq.getElement(this.devo).click();
		addEvidenciaWeb("Clicando no campo : " + campo);
	}

	public boolean validarCampoEstiloSelecaoHabilitado(String campo) {
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Clicando no campo : " + campo);
		return pesq.getElement(this.devo).isEnabled();
	}

	public boolean validarCampoNaoExibidoNaTelaSelect(String campo) {
		addEvidenciaWeb("Validando Existência do campo : " + campo);
		return SeleniumRobot.existElementWeb("//label[contains(text(), '" + campo + "')]//parent::div//select");
	}

	public boolean validarCampoNaoExibidoNaTelaInput(String campo) {
		addEvidenciaWeb("Validando Existência do campo : " + campo);
		return SeleniumRobot.existElementWeb("//label[contains(text(), '" + campo + "')]//parent::div//input");
	}

	public String retornaMensagemExibida() {
		wait.until(ExpectedConditions.visibilityOf(this.devo.getMsg()));
		addEvidenciaWeb("Validando mensagem Exibida");
		return this.devo.getMsg().getText();
	}

	public void limparCodigoItem() {
		this.devo.getCodigoItem().clear();
		addEvidenciaWeb("Campo com valor vazio");
	}

	public boolean validarCampoEstiloSelecaoLeitura(String campo) {
		this.load.loading();
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Campo " + campo + "está somente para leitura");
		return pesq.getElement(this.devo).getAttribute("readonly").equals("true");
	}

	public void selecionaValorCampoEstiloSelecao(String campo, String valor) {
	this.load.loading();
	SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		shortWait.until(ExpectedConditions.or(ExpectedConditions.elementToBeClickable(pesq.getElement(this.devo)), ExpectedConditions.visibilityOf(pesq.getElement(this.devo))));
		Select campoSelecao = new Select(pesq.getElement(this.devo));
		campoSelecao.selectByVisibleText(valor);
		addEvidenciaWeb("Selecionando o valor " + valor + " no campo : " + campo);
	}
	
	public void selecionaValorCampoEstiloSelecaoSemLoad(String campo, String valor) {
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
					.valueOf(campo.replace(" ", "_").toUpperCase());
			pesq.getElement(this.devo).sendKeys(valor);
			addEvidenciaWeb("Selecionando o valor " + valor + " no campo : " + campo);
		}

	public boolean validaValorCamposEstiloSelecao(List<String> lista, String campo) {
		this.load.loading();
		webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		List<String> list = Arrays
				.asList(pesq.getElement(this.devo).getText().toString().replaceAll("\\s", "").split("(?=\\p{Lu})"));
		addEvidenciaWeb("Elementos pertencentes ao campo :" + campo + "são" + list);

		return lista.equals(list);
	}

	public List<String> retornaValorCamposEstiloSelecao(String campo) {
		List<String> list = new ArrayList<String>();
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(pesq.getElement(this.devo));
		webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Select opcoes = new Select(pesq.getElement(this.devo));
		opcoes.getOptions().forEach(opcao -> {
			String op = opcao.getText().trim();
			list.add(op);
		});
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);
		return list;
	}

	public String retornaValorSelecionadoSelecao(String campo) {
		SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoInterface pesq = SNF_PesquisaParametrosComportamentoSTOperacoesDevolucaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(pesq.getElement(this.devo));
		Select opcoes = new Select(pesq.getElement(this.devo));
		addEvidenciaWeb("Valor " + opcoes.getFirstSelectedOption().getText().trim() + " exibido no campo " + campo);
		return opcoes.getFirstSelectedOption().getText().trim();
	}

	public void clicarBotaoPesquisarPesquisaParametros() {
		addEvidenciaWeb("Clicando no botão Pesquisar");
		this.load.loading();
		this.devo.getButtonPesquisar().click();
	}

	public void clicarBotaoHistoricoPesquisaParametros() {
		addEvidenciaWeb("Clicando no botão Histórico");
		this.load.loading();
		this.comp.getBtnHistorico().click();
	}

	public void clicarBotaoLimparPesquisaParametros() {
		addEvidenciaWeb("Clicando no botão Limpar");
		this.comp.getBtnLimpar().click();
	}

	public void clicarBotaoMaisPesquisaParametros() {
		this.load.loading();
		addEvidenciaWeb("Clicando no botão Mais");
		this.comp.getBtnAdicionar().click();
	}

	public void clicarBotaoSalvarPesquisaParametros() {
		addEvidenciaWeb("Clicando no botão Salvar");
		this.comp.getBtnSalvar().click();
	}

	public void clicarBotaoRetornarPesquisaParametros() {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.devo.getButtonRetornar()));
		addEvidenciaWeb("Clicando no botão Retornar");
		this.devo.getButtonRetornar().click();
	}

	public boolean pegarValorGridResultadoPesquisaParametro(String campo, String valor) {
		this.load.loading();
		List<WebElement> Values = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		List<Map<String, String>> grid = new ArrayList<Map<String, String>>();
		int QtdeRegistro = Values.size() / Header.size();

		if (QtdeRegistro > 0) {

			for (int x = 0; x < QtdeRegistro; x++) {
				Map<String, String> map = new HashMap<String, String>();
				for (int i = 0; i < Header.size(); i++) {
					map.put(Header.get(i).getText(), Values.get(i).getText());
				}
				for (int i = Header.size() - 1; i >= 0; i--) {
					Values.remove(i);
				}
				grid.add(map);
			}

			grid.forEach(x -> {

				if (!x.get(campo).equalsIgnoreCase(valor)) {
					vr = false;
				}
			});

		} else {
			vr = false;
		}
		addEvidenciaWeb("Pesquisa efetuada com sucesso atraves do campos " + campo);

		return vr;
	}

	public void clicaBtnEditarGridResultadoPesquisa() {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.devo.getFormato()));
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//table[@class='table table-hover']//tbody[1]/tr[1]/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = Values.size() / Header.size();
		if (QtdeRegistro >= 0) {

			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Values.get(i).getText().equals("Editar")) {
					WebElement editar = webDriver.findElement(
							By.xpath("//table[@class='table table-hover']//tbody/tr/td[@class='text-right']"));
					addEvidenciaWeb("Clicando no Botão Editar do Grid de Resultado");
					editar.click();
					this.load.loading();
					break;
				}
				grid1.add(grid);

			}
		}

	}

	public void salvarValorCampoUsuario() {
		VariaveisEstaticas.setVALOR_USUARIO(this.devo.getUsuario().getAttribute("value").toString());
	}

}
