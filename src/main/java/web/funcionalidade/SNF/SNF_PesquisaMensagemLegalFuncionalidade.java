package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_PesquisaMensagemLegalEnum;
import web.bean.interfaces.SNF_PesquisaMensagemLegalInterface;
import web.pages.SNF.SNFComponentesPage;
import web.pages.SNF.SNFPesquisaMensagemLegalPage;

public class SNF_PesquisaMensagemLegalFuncionalidade extends BaseTest {

	private SNFPesquisaMensagemLegalPage pesMen;
	public boolean vr = true;
	public String s = null;
	private SNFComponentesPage comp;
	private waitLoading load;

	public SNF_PesquisaMensagemLegalFuncionalidade() {
		this.pesMen = new SNFPesquisaMensagemLegalPage(webDriver);
		this.comp = new SNFComponentesPage(webDriver);
		this.load = new waitLoading();

	}

	public void selecionarValorCampoPesquisaMemnsagemLegal(String campo, String valor) {
		SNF_PesquisaMensagemLegalInterface pesquisa = SNF_PesquisaMensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pesquisa.getElement(this.pesMen).sendKeys(valor);
		addEvidenciaWeb("Selecionado o valor " + valor + "no campo :" + campo);
	}

	public boolean validarCampoReadonlyParaEdicaoMensagem(String campo) {
		SNF_PesquisaMensagemLegalInterface pesquisa = SNF_PesquisaMensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Validando o campo: " + campo + " está Habilitado ou Não ");
		return pesquisa.getElement(this.pesMen).getAttribute("readonly").equals("True");
	}

	public boolean validarCampoHabilitadoParaEdicaoMensagem(String campo) {
		SNF_PesquisaMensagemLegalInterface pesquisa = SNF_PesquisaMensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Validando o campo: " + campo + " está Habilitado ou Não ");
		return pesquisa.getElement(this.pesMen).isEnabled();
	}

	public boolean pegarValirGridResultadoPesquisaMensagem(String campo, String valor) {
		wait.until(ExpectedConditions.elementToBeClickable(this.pesMen.getInputCodigo()));
		List<WebElement> Values = this.comp.getListaValueGriResultado();
		List<WebElement> Header = this.comp.getListaHerderGridResultado();
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
		addEvidenciaWeb("Pesquisa efetuada com sucesso atraves do campo: " + campo);

		return vr;
	}

	public void clicarBotaoPesquisar() {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.comp.getBtnPesquisar()));
		this.comp.getBtnPesquisar().click();
	}
	
	public void clicarBotaoSalvar() {
		addEvidenciaWeb("Clicando no botão Salvar");
		this.comp.getBtnSalvar().click();
	}

	public void clicarBotaoNovo() {
		this.load.loading();
		addEvidenciaWeb("Clicando no botão Novo");
		this.comp.getBtnAdicionar().click();
	}

	public boolean validarPesquisaParcialDescricao(String campo, String valor) {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.pesMen.getInputCodigo()));
		List<WebElement> Values = this.comp.getListaValueGriResultado();
		List<WebElement> Header = this.comp.getListaHerderGridResultado();
		Map<String, String> grid = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = Values.size() / Header.size();
		if (QtdeRegistro > 0) {
			for (int x = 0; x < QtdeRegistro; x++) {
				for (int i = 0; i < Header.size(); i++) {
					grid.put(Header.get(i).getText(), Values.get(i).getText());
				}
				for (int i = Header.size() - 1; i >= 0; i--) {
					Values.remove(i);
				}
				grid1.add(grid);
			}

		}

		addEvidenciaWeb("validandoPesquisaParcial");
		return grid.get(campo).contains(valor);
	}

	public void clicaBotaEditarGridResultadoPesquisaMesagem() {
		wait.until(ExpectedConditions.elementToBeClickable(this.pesMen.getInputCodigo()));
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr[1]/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = Values.size() / Header.size();

		if (QtdeRegistro > 0) {
			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Values.get(i).getText().equals("Editar")) {
					WebElement editar = webDriver.findElement(
							By.xpath("//table[@class='table table-hover']//tbody/tr/td[@class='text-right']/a"));
					editar.click();
					this.load.loading();
					break;
				}

			}
			grid1.add(grid);

		}

	}

	public boolean gridResultadoNaoVazioPesquisaMensagem() {
		wait.until(ExpectedConditions.elementToBeClickable(this.pesMen.getInputCodigo()));
		List<WebElement> Values = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = Values.size() / Header.size();
		if (QtdeRegistro > 0) {
			for (int x = 0; x < QtdeRegistro; x++) {
				for (int i = 0; i < Header.size(); i++) {
					grid.put(Header.get(i).getText(), Values.get(i).getText());
				}
				for (int i = Header.size() - 1; i >= 0; i--) {
					Values.remove(i);
				}
				grid1.add(grid);
			}

		}

		addEvidenciaWeb("Pesquisa sem preencher nenhum campo, Grid com retorno de Pesquisa de Natureza de Operação");

		return grid1.isEmpty();
	}
	
	public String retornaMensagemSucesso() {
//		this.load.loading();
		wait.until(ExpectedConditions.visibilityOf( this.pesMen.getMsgSucesso()));
		addEvidenciaWeb("Mensagem Adicionada com sucesso");
		return this.pesMen.getMsgSucesso().getText();
	}

}
