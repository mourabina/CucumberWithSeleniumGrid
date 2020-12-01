package web.funcionalidade.SNF;

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
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_VisualizarNotaFiscal;
import web.bean.interfaces.SNF_VisualizarNF;
import web.pages.SNF.SNFVisualizarNotasFiscaisPage;

public class SNFVisualizarNFFuncionalidade extends BaseTest {

	private SNFVisualizarNotasFiscaisPage visualizar;
	private waitLoading load;

	public SNFVisualizarNFFuncionalidade() {
		this.visualizar = new SNFVisualizarNotasFiscaisPage(webDriver);
		this.load = new waitLoading();
	}

	public void selecionarCPF() {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.visualizar.getTipoDeDocumento()));
		this.visualizar.getTipoDeDocumento().click();
		Select opcao = new Select(this.visualizar.getTipoDeDocumento());
		opcao.selectByVisibleText("CPF");
	}

	public void preencherCampoNumericoQtde(String elem, int qtde) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys(GeradorNumeroRandomico.geraNumeroQtde(qtde));
	}

	public String obterValorNumericoRegex(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		return visualizar.getElement(this.visualizar).getAttribute("value").replaceAll("[/\\D/g]", "");
	}

	public void preencherCampoLetraVNF(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys("ABCD");
		addEvidenciaWeb("Digitando Letras");
	}

	public void preencherCampoLetraEspeciaisVNF(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys("ABCD~!@#$%^&*()-+=\\/");
		addEvidenciaWeb("Digitando Letras e Caracteres Especiasi");
	}

	public void preencherCampoCaracteresEspeciaisVNF(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys("~!@#$%^&*()-+=\\/");
		addEvidenciaWeb("Digitando Caracteres Especiais");
	}

	public void preencherCampoDataIncorreta(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys("35/15/2019");
		addEvidenciaWeb("Digitando Data Invalida");
		this.visualizar.getInputPortifolio().click();
	}

	public void preencherCampoDataCorreta(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys(GeracaoData.retornaDataAtual());
		addEvidenciaWeb("Digitando Data valida");
	}
	

	public void preencherCampoComNumeros(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys("1234567890");
		addEvidenciaWeb("Digitando Valores Numericos");
	}

	public boolean verificarCampoVazio(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		return visualizar.getElement(this.visualizar).getAttribute("value").isEmpty();
	}

	public boolean verificarCampoSelecione(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		return visualizar.getElement(this.visualizar).getAttribute("value").equals("0: undefined");
	}

	public boolean verificarCampoLetra(String elem) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		return visualizar.getElement(this.visualizar).getAttribute("value").equals("ABCD");
	}

	public void preencherTodosCamposVNFe() {
		wait.until(ExpectedConditions.elementToBeClickable(this.visualizar.getInputDataAgenda()));
		this.visualizar.getInputDataAgenda().sendKeys(GeracaoData.retornaDataAtual());
		this.visualizar.getSituacao().click();
		Select situacao = new Select(this.visualizar.getSituacao());
		situacao.selectByValue("2");
		this.visualizar.getInputCNPJ().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(14));
		this.visualizar.getInputNomeFornecedor().sendKeys("Teste Automação");
		this.visualizar.getInputNotaFiscal().sendKeys("123456789");
		this.visualizar.getInputSerieNotaFiscal().sendKeys("1");
		this.visualizar.getInputNumeroPedido().sendKeys("1234");
		this.visualizar.getInputIDNotaFiscal().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(2));
		this.visualizar.getInputNumeroLoja().sendKeys(GeradorNumeroRandomico.geraNumeroQtde(3));
		addEvidenciaWeb("Preenchendo todos os campos");
	}

	public String pegarMensagemCampoDataRejeicaoFim() {
		addEvidenciaWeb("Campo Data Rejeição Fim não aceita Data Invalida");
		return this.visualizar.getInputDataRejeicaoFim().getAttribute("value").toString();
	}

	public String pegarMensagemCampoDataEmissaoInicio() {
		addEvidenciaWeb("Campo Data Rejeição Fim não aceita Data Invalida");
		return this.visualizar.getInputDataEmissaoInicio().getAttribute("value").toString();
	}

	public String pegarMensagemCampoDataEmissaoFim() {
		addEvidenciaWeb("Campo Data Rejeição Fim não aceita Data Invalida");
		return this.visualizar.getInputDataEmissaoFim().getAttribute("value").toString();
	}

	public String pegarMensagemCampoDataRejeicaoInicio() {
		addEvidenciaWeb("Campo Data Rejeição Fim não aceita Data Invalida");
		return this.visualizar.getInputDataRejeicaoInicio().getAttribute("value").toString();
	}

	public void preencherCamposPesquisas(String elem, String valor) {
		SNF_VisualizarNF visualizar = SNF_VisualizarNotaFiscal.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(visualizar.getElement(this.visualizar));
		visualizar.getElement(this.visualizar).sendKeys(valor);
		this.visualizar.getButtonPesquisar().click();
		this.load.loading();
		addEvidenciaWeb("Preenchedo o campo  " + elem + " com o valor " + valor);
	}

	public boolean pegarValirGridResultado(String campo, String valor) {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.visualizar.getUnidadeDeNegocio()));
		List<WebElement> Values = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();
		for (int i = 0; i < Header.size(); i++) {
			grid.put(Header.get(i).getText(), Values.get(i).getText());
		}
		addEvidenciaWeb("Pesquisa efetuada com sucesso atraves dos campos Unidade de Negocio e  " + campo);
		return grid.get(campo).trim().equals(valor);
	}
	
	public void editarNF() {
		this.visualizar.getButtonEditar().click();
	}

}
