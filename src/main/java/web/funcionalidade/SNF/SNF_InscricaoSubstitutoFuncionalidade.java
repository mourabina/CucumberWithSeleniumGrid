package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.GeradorNumeroRandomico;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_InscricaoSubstitutoEnum;
import web.bean.interfaces.SNF_IncricaoSubstitutoInterface;
import web.pages.SNF.SNFInscricaoSubstitutoPage;

public class SNF_InscricaoSubstitutoFuncionalidade extends BaseTest {

	private SNFInscricaoSubstitutoPage insc;
	private waitLoading load;
	public boolean vr = true;
	public boolean grid = true;
	public String s = null;

	public SNF_InscricaoSubstitutoFuncionalidade() {
		this.insc = new SNFInscricaoSubstitutoPage(webDriver);
		this.load = new waitLoading();

	}

	public void selecionarValorCamposPesquisaSelecao(String elem, String valor) {
		wait.until(ExpectedConditions.visibilityOf(this.insc.getFilialEmitente()));
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		Select opcao = new Select(manu.getElement(this.insc));
		opcao.selectByVisibleText(valor);
		addEvidenciaWeb("Valor selecionado é : " + valor);

	}

	public void clicarCamposPesquisaSelecao(String elem) {
		wait.until(ExpectedConditions.visibilityOf(this.insc.getFilialEmitente()));
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		manu.getElement(this.insc).click();
		addEvidenciaWeb("Clicando no campo de Seleção : " + elem);

	}

	public String retornoValorCamposPesquisaInput(String elem) {
		wait.until(ExpectedConditions.elementToBeClickable(this.insc.getEstadoOrigem()));
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Valor Exibidono campo: " + elem);
		return manu.getElement(this.insc).getAttribute("value").toString();
	}

	public String retornoValorCamposPesquisaSelect(String elem) {
		wait.until(ExpectedConditions.elementToBeClickable(this.insc.getEstadoOrigem()));
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Valor Exibido no campo: " + elem);
		Select opcao = new Select(manu.getElement(this.insc));
		return opcao.getFirstSelectedOption().getText().trim();

	}

	public boolean validaValorCamposSelecao(List<String> Lista, String campo) {
		List<String> list = new ArrayList<String>();
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.insc));
		Select opcoes = new Select(manu.getElement(this.insc));
		opcoes.getOptions().forEach(opcao -> {
			String op = opcao.getText().trim();
			list.add(op);
		});
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);

		return list.equals(Lista);
	}

	public List<String> retorValorCamposSelecao(String campo) {
		List<String> list = new ArrayList<String>();
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.insc));
		Select opcoes = new Select(manu.getElement(this.insc));
		opcoes.getOptions().forEach(opcao -> {
			String op = opcao.getText().trim();
			list.add(op);
		});
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);

		return list;
	}

	public List<String> listaEstadosFederativos() {
		List<String> estados = new ArrayList<String>();
		estados.add("Selecione...");
		estados.add("Acre");
		estados.add("Alagoas");
		estados.add("Amapá");
		estados.add("Amazonas");
		estados.add("Bahia");
		estados.add("Ceará");
		estados.add("Distrito Federal");
		estados.add("Espírito Santo");
		estados.add("Goiás");
		estados.add("Maranhão");
		estados.add("Mato Grosso");
		estados.add("Mato Grosso do Sul");
		estados.add("Minas Gerais");
		estados.add("Paraná");
		estados.add("Paraíba");
		estados.add("Pará");
		estados.add("Pernambuco");
		estados.add("Piauí");
		estados.add("Rio Grande do Norte");
		estados.add("Rio Grande do Sul");
		estados.add("Rio de Janeiro");
		estados.add("Rondônia");
		estados.add("Roraima");
		estados.add("Santa Catarina");
		estados.add("Sergipe");
		estados.add("São Paulo");
		estados.add("Tocantins");

		return estados;

	}

	public void clicarBotaoInscricaoSubstituto() {
		// this.load.loading();
		this.insc.getButtonPesquisar().click();
	}

	public boolean pegarValorGridResultadoInscricao(String campo, String valor) {
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
		addEvidenciaWeb("Pesquisa efetuada com sucesso atraves dos campos Unidade de Negocio e  " + campo);

		return vr;
	}

	public void clicaBotaEditarGridResultadoSemLoad() {
		wait.until(ExpectedConditions.elementToBeClickable(this.insc.getSelecEstadoDestino()));
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
					editar.click();
					this.load.loading();
					break;
				}
				grid1.add(grid);

			}
		}

	}

	public void clicaBotaEditarGridResultado() {
		wait.until(ExpectedConditions.elementToBeClickable(this.insc.getSelecEstadoDestino()));
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
					// this.load.loading();
					WebElement editar = webDriver.findElement(
							By.xpath("//table[@class='table table-hover']//tbody/tr/td[@class='text-right']"));
					editar.click();
					this.load.loading();
					break;
				}
				grid1.add(grid);

			}
		}

	}

	public String retornaTituloPagina() {
		addEvidenciaWeb("Tela Editar Inscrição Substituto");
		return this.insc.getLabelTituloPagina().getText();
	}

	public void pegarValorUnicoGridResultado(String campo) {
		wait.until(ExpectedConditions.elementToBeClickable(this.insc.getSelecEstadoDestino()));
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr[1]/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();

		int QtdeRegistro = Values.size() / Header.size();

		if (QtdeRegistro > 0) {

			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Header.get(i).getText().equals(campo)) {
					s = Values.get(i).getText();
					break;
				}

			}
			VariaveisEstaticas.setINSCRICAO_SUBSTITUTO(s);

		}
	}

	public boolean retornaStatusCampo(String campo) {
		SNF_IncricaoSubstitutoInterface manu = SNF_InscricaoSubstitutoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		return manu.getElement(this.insc).isEnabled();
	}

	public String retornaTituloPaginaHistoricoInscricao() {
		addEvidenciaWeb("Tela Editar Inscrição Substituto");
		return this.insc.getLabelTituloHistoricoInscricao().getText();
	}

	public String pegarValorUnicoTelaHistoricoInscricao(String campo) {
		this.load.loading();
		wait.until(
				ExpectedConditions.or(ExpectedConditions.visibilityOf(this.insc.getLabelTituloHistoricoInscricao())));
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr[1]/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		wait.until(ExpectedConditions.or(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='table table-hover']//tr/th"))));
		Map<String, String> grid = new HashMap<String, String>();
		int QtdeRegistro = Values.size() / Header.size();
		if (QtdeRegistro >= 0) {
			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Header.get(i).getText().equals(campo)) {
					s = Values.get(i).getText();
					break;
				}

			}

		}
		addEvidenciaWeb("Tela Histórico Exibido na Tela");

		return s;

	}

	public void preencherCamposObrigatorios() {
		this.load.loading();
		VariaveisEstaticas.setHORA_CRIACAO_INSCRICAO(GeracaoData.retornaDataHoraAtual());
		Select opcao = new Select(this.insc.getSelecaoFilialEmitente());
		opcao.selectByVisibleText("7467 - CENTRO DIST MURIBECA");

		Select opcao1 = new Select(this.insc.getSelecEstadoDestino());
		opcao1.selectByVisibleText("São Paulo");

		this.insc.getInscricaoSubstituto().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(14));
		VariaveisEstaticas.setINSCRICAO_SUBSTITUTO(this.insc.getInscricaoSubstituto().getAttribute("value").toString());
		addEvidenciaWeb("Preenchedo campos Obrigatórios");
		this.insc.getButtonSalvar().click();
		this.load.loading();

	}

	public void preencherCamposObrigatoriosSemLoad() {
		this.load.loading();
		VariaveisEstaticas.setHORA_CRIACAO_INSCRICAO(GeracaoData.retornaDataHoraAtual());
		Select opcao = new Select(this.insc.getSelecaoFilialEmitente());
		opcao.selectByVisibleText("7467 - CENTRO DIST MURIBECA");

		Select opcao1 = new Select(this.insc.getSelecEstadoDestino());
		opcao1.selectByVisibleText("São Paulo");

		this.insc.getInscricaoSubstituto().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(14) + 1);
		VariaveisEstaticas.setINSCRICAO_SUBSTITUTO(this.insc.getInscricaoSubstituto().getAttribute("value").toString());
		addEvidenciaWeb("Preenchedo campos Obrigatórios");
		this.insc.getButtonSalvar().click();

	}

	public boolean botaoSalvarHabilitadoDesabilitado() {
		return this.insc.getButtonSalvar().isEnabled();
	}

	public String retornaMensagemAddInscricSubstituto() {
	    this.load.loading();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='alert alert-success sticky-top']")));
		addEvidenciaWeb("Mensagem Exibida");
		return this.insc.getMsg().getText();

	}

	public void alterarValorCampoInscricaoSubstituto() {
		this.insc.getInscricaoSubstituto().clear();
		this.insc.getInscricaoSubstituto().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(11));
		this.insc.getButtonSalvar().click();
	}
}
