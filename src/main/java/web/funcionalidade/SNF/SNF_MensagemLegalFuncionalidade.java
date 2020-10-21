package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.GeracaoData;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.interfaces.SNF_MenagemLegalInterface;
import web.pages.SNF.SNFAdicionarNaturezaOperacaoPage;
import web.pages.SNF.SNFComponentesPage;
import web.pages.SNF.SNFNaturezaOperacaoXMensagensLegaisPage;

public class SNF_MensagemLegalFuncionalidade extends BaseTest {

	private SNFNaturezaOperacaoXMensagensLegaisPage mensa;
	private SNFComponentesPage comp;
	public boolean vr = true;
	private waitLoading load;
	private SNFAdicionarNaturezaOperacaoPage adn;

	public SNF_MensagemLegalFuncionalidade() {
		this.mensa = new SNFNaturezaOperacaoXMensagensLegaisPage(webDriver);
		this.comp = new SNFComponentesPage(webDriver);
		this.load = new waitLoading();
		this.adn = new SNFAdicionarNaturezaOperacaoPage(webDriver);

	}
	
	public void preencherOrdem(String ordem) {
		this.mensa.getOrdem().sendKeys(ordem);
	}

	public void selecionarValorCampoSelecao(String campo, String valor) {
		SNF_MenagemLegalInterface men = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		men.getElement(this.mensa).sendKeys(valor);
		addEvidenciaWeb("Selecionado o valor " + valor + " no campo " + campo);
	}

	public void clicarCampoSelecao(String campo) {		
			this.load.loading();
			SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
					.valueOf(campo.replace(" ", "_").toUpperCase());
			manu.getElement(this.mensa).click();
			addEvidenciaWeb("Clicando no campo " + campo);
	}

	public void clicarCampoSelecaoSemLoading(String campo) {
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Clicando no campo " + campo);
		manu.getElement(this.mensa).click();
		
	}

	public String retornaValorCampo(String campo) {
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Valor exibido no campo " + campo);
		return manu.getElement(this.mensa).getAttribute("value").toString();

	}

	public boolean validarCampoMensagemHabilitado(String campo) {
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Clicando no campo " + campo);
		return manu.getElement(this.mensa).isEnabled();

	}

	public boolean validarCamposVazios(String campo) {
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Validando o campo " + campo + " Vazio");
		return manu.getElement(this.mensa).getText().isEmpty();

	}

	public boolean validarCampoSomenteLeitura(String campo) {
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.mensa));
		SeleniumRobot.scroll(200);
		addEvidenciaWeb("Clicando no campo " + campo);
		return manu.getElement(this.mensa).getAttribute("readonly").equals("true");

	}
	
	public boolean validarCampoSomenteLeituraComLoad(String campo) {
		this.load.loading();
		SNF_MenagemLegalInterface manu = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.mensa));
		SeleniumRobot.scroll(200);
		addEvidenciaWeb("Clicando no campo " + campo);
		return manu.getElement(this.mensa).getAttribute("readonly").equals("true");

	}

	public List<String> retorlistaCamposSelecao(String campo) {
		List<String> list = new ArrayList<String>();
		SNF_MenagemLegalInterface lista = web.bean.enums.SNF_MensagemLegalEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(lista.getElement(this.mensa));
		Select opcoes = new Select(lista.getElement(this.mensa));
		opcoes.getOptions().forEach(opcao -> {
			String op = opcao.getText().trim();
			list.add(op);
		});
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);

		return list;
	}

	public void clicarBotaoPesquisar() {
		addEvidenciaWeb("Clicando no Botão Pesquisar");
		this.mensa.getBtnPesquisar().click();
	}

	public boolean validarCampoNaturezaOperacao() {
		addEvidenciaWeb("Validando Campo Natureza de Operação Não Habilitado para Edição");
		return this.mensa.getInputNaturezaOperacao().getAttribute("readonly").equals("true");
	}

	public void clicarBotaoMais() {
		addEvidenciaWeb("Clicando no Botão Pesquisar");
		this.comp.getBtnAdicionar().click();
	}

	public void clicarBotaoSalvar() {
		addEvidenciaWeb("Clicando no Botão Salvar");
		SeleniumRobot.MoveToElementWeb(this.comp.getBtnSalvar());
		Actions js = new Actions(webDriver);
		js.doubleClick(this.adn.getSelectAtualizarEstoque()).build().perform();
		this.comp.getBtnSalvar().click();
	}

	public void clicarHistoricoNacional() {
		this.selecionarValorCampoSelecao("Local Mensagem Nacional", "Dados Adicionais");
		SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
		this.mensa.getButtonPesquisarNacional().click();
		this.load.loading();
		if (!this.gridResultadoNaoVazioMensagemLegal("Nacional")) {
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getButtonHistoricoNacional()));
			addEvidenciaWeb("Clicando no Botão HIstorico");
			this.mensa.getButtonHistoricoNacional().click();
		} else {
			this.mensa.getButtonAdicionarNacional().click();
			this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
			this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padão");
			addEvidenciaWeb("Selecionado valores para os campos seleção");
			this.mensa.getBtnPesquisar().click();
			this.mensa.getInputCodigo().sendKeys("1");
			this.mensa.getBtnPesquisarSelecionarMensagem().click();
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getRadioButton()));
			this.mensa.getRadioButton().click();
			addEvidenciaWeb("Selecionado Mensagem Legal");
			this.comp.getBtnConfirmar().click();
			this.mensa.getInputInicioVigencia().sendKeys(GeracaoData.retornaDataAtual());
			this.mensa.getInputFimVigencia().sendKeys(GeracaoData.retornaDataAtualMaisMeses(1));
			this.comp.getBtnSalvar().click();
			this.mensa.getInputFimVigencia().click();
			addEvidenciaWeb("Preenchido todos os dados para Adicionar Novo Registro");
			SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
			//this.load.loading();
			String s = this.mensa.getInputUsuario().getAttribute("value").toString();
			VariaveisEstaticas.setVALOR_USUARIO(s);
			this.mensa.getButtonHistoricoNacional().click();
			addEvidenciaWeb("Novo Registro Adicionado");
		}
	}

	public void clicarHistoricoEstadual() {
		this.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Estado", "Acre");
		this.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		this.mensa.getButtonPesquisarEstadual().click();
		this.load.loading();
		if (!this.gridResultadoNaoVazioMensagemLegal("Estadual")) {
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getButtonHistoricoEstadual()));
			addEvidenciaWeb("Clicando no Botão HIstorico");
			this.mensa.getButtonHistoricoEstadual().click();
		} else {
			this.mensa.getButtonAdicionarEstadual().click();
			this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
			this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padão");
			this.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distribuição");
			this.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
			addEvidenciaWeb("Selecionado valores para os campos seleção");
			this.mensa.getBtnPesquisar().click();
			this.mensa.getInputCodigo().sendKeys("1");
			this.mensa.getBtnPesquisarSelecionarMensagem().click();
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getRadioButton()));
			this.mensa.getRadioButton().click();
			addEvidenciaWeb("Selecionado Mensagem Legal");
			this.comp.getBtnConfirmar().click();
			this.mensa.getInputInicioVigencia().sendKeys(GeracaoData.retornaDataAtual());
			this.mensa.getInputFimVigencia().sendKeys(GeracaoData.retornaDataAtualMaisMeses(1));
			this.mensa.getInputInicioVigencia().click();
			wait.until(ExpectedConditions.elementToBeClickable(this.comp.getBtnSalvar()));
			this.comp.getBtnSalvar().click();
			addEvidenciaWeb("Preenchido todos os dados para Adicionar Novo Registro");
			this.mensa.getButtonHistoricoNacional().click();
			addEvidenciaWeb("Novo Registro Adicionado");
		}
	}

	public void selecionandoMensagemLegalAbaFilial() {
		this.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		this.mensa.getButtonPesquisarFilial().click();
		this.load.loading();
		if (!this.gridResultadoNaoVazioMensagemLegal("Filial")) {
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getButtonHistoricoFilial()));
			addEvidenciaWeb("Clicando no Botão HIstorico");
			SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
			this.mensa.getButtonHistoricoFilial().click();
		} else {
			this.mensa.getButtonAdicionarFilial().click();
			this.mensa.getOrdem().sendKeys("1");
			this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
			this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padão");
			this.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
			addEvidenciaWeb("Selecionado valores para os campos seleção");
			this.mensa.getBtnPesquisar().click();
			this.mensa.getInputCodigo().sendKeys("1");
			this.mensa.getBtnPesquisarSelecionarMensagem().click();
			wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getRadioButton()));
			this.mensa.getRadioButton().click();
			addEvidenciaWeb("Selecionado Mensagem Legal");
			this.comp.getBtnConfirmar().click();
			this.mensa.getInputInicioVigencia().sendKeys(GeracaoData.retornaDataAtual());
			this.mensa.getInputFimVigencia().sendKeys(GeracaoData.retornaDataAtualMaisMeses(1));
			this.comp.getBtnSalvar().click();
			this.mensa.getInputInicioVigencia().click();
			addEvidenciaWeb("Preenchido todos os dados para Adicionar Novo Registro");
			this.comp.getBtnSalvar().click();
			addEvidenciaWeb("Preenchido todos os dados para Adicionar Novo Registro");
			this.mensa.getButtonHistoricoFilial().click();
			addEvidenciaWeb("Novo Registro Adicionado");
		}
	}

	public void selecionarMensagemNacional(String codigo) {
		this.mensa.getOrdem().sendKeys(codigo);
		this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padrão");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getBtnPesquisar().click();
		this.mensa.getInputCodigo().sendKeys(Keys.BACK_SPACE);
		this.mensa.getInputCodigo().sendKeys(codigo);
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
		this.load.loading();
		Actions action = new Actions(webDriver);
		action.doubleClick(this.mensa.getRadioButton()).build().perform(); 
		addEvidenciaWeb("Selecionado Mensagem Legal");
		this.comp.getBtnConfirmar().click();

	}

	public void selecionarMensagemEstadual(String codigo) {
		this.selecionarValorCampoSelecao("Local Mensagem Estadual", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Estado", "Acre");
		this.selecionarValorCampoSelecao("Tipo de Negocio", "Centro de distribuição");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getButtonPesquisarEstadual().click();
		this.load.loading();
		this.mensa.getButtonAdicionarEstadual().click();
		this.mensa.getOrdem().sendKeys(codigo);
		this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padão");
		this.selecionarValorCampoSelecao("Adicionar Registro Tipo de Negocio", "Centro de distribuição");
		this.selecionarValorCampoSelecao("Adicionar Registro Estado", "Acre");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getBtnPesquisar().click();
		this.mensa.getInputCodigo().sendKeys(Keys.BACK_SPACE);
		this.mensa.getInputCodigo().sendKeys(codigo);
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
		this.load.loading();
		Actions action = new Actions(webDriver);
		action.doubleClick(this.mensa.getRadioButton()).build().perform(); 
		addEvidenciaWeb("Selecionado Mensagem Legal");
		this.comp.getBtnConfirmar().click();
		if(VariaveisEstaticas.getDESCRICAO_MENSAGEM_LEGAL() == null) {
			VariaveisEstaticas.setDESCRICAO_MENSAGEM_LEGAL(this.mensa.getInputMensagemLegal().getAttribute("value").toString());
		} else {
			VariaveisEstaticas
			.setDESCRICAO_NOVA_MENSAGEM_LEGAL(this.mensa.getInputMensagemLegal().getAttribute("value").toString());
		}
		this.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		Actions js = new Actions(webDriver);
		js.doubleClick(this.mensa.getSelectLocal()).build().perform();
		this.comp.getBtnSalvar().click();

	}

	public void selecionarMensagemAbaNacional() {
		this.load.loading();
		this.selecionarValorCampoSelecao("Local Mensagem Nacional", "Dados Adicionais");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getButtonPesquisarNacional().click();
		this.load.loading();
		this.mensa.getButtonAdicionarNacional().click();
		this.selecionarMensagemNacional("1");
		wait.until(ExpectedConditions.visibilityOf(this.mensa.getInputFimVigencia()));
		VariaveisEstaticas
				.setDESCRICAO_MENSAGEM_LEGAL(this.mensa.getInputMensagemLegal().getAttribute("value").toString());
		this.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		Actions js = new Actions(webDriver);
		js.doubleClick(this.mensa.getSelectLocal()).build().perform();
		this.comp.getBtnSalvar().click();
	}

	public void adicionarMensagemAbaEstadual() {
		wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getInputCodigo()));
		this.mensa.getOrdem().sendKeys("1");
		this.mensa.getInputCodigo().sendKeys("1");
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
		this.load.loading();
		wait.until(ExpectedConditions.visibilityOf(this.mensa.getRadioButton()));
		wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getRadioButton()));
		this.mensa.getRadioButton().click();
		addEvidenciaWeb("Selecionado Mensagem Legal");
		this.comp.getBtnConfirmar().click();
	}

	public void selecionarNovaMensagemAbaNacional() {
		this.load.loading();
		this.selecionarValorCampoSelecao("Local Mensagem Nacional", "Dados Adicionais");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getButtonPesquisarNacional().click();
		this.load.loading();
		this.mensa.getButtonAdicionarNacional().click();
		this.selecionarMensagemNacional("2");
		VariaveisEstaticas
				.setDESCRICAO_NOVA_MENSAGEM_LEGAL(this.mensa.getInputMensagemLegal().getAttribute("value").toString());
		this.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(2));
		Actions js = new Actions(webDriver);
		js.doubleClick(this.mensa.getSelectLocal()).build().perform();
		this.comp.getBtnSalvar().click();

	}

	public void selecionarMensagemFilial(String valor) {
		this.clicarCampoSelecao("Aba Filial");
		this.selecionarValorCampoSelecao("Local Mensagem Filial", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Filial", "1 - BOMPRECO CASA AMARELA");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getButtonPesquisarFilial().click();
		this.clicarBotaAdicionarAbas("Filial");
		this.selecionarValorCampoSelecao("Adicionar Registro Local", "Dados Adicionais");
		this.selecionarValorCampoSelecao("Adicionar Registro Tipo", "Padão");
		this.selecionarValorCampoSelecao("Adicionar Registro Filial", "1 - BOMPRECO CASA AMARELA");
		addEvidenciaWeb("Selecionado valores para os campos seleção");
		this.mensa.getBtnPesquisar().click();
		this.mensa.getInputCodigo().sendKeys(valor);
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
		this.load.loading();
		Actions action = new Actions(webDriver);
		action.doubleClick(this.mensa.getRadioButton()).build().perform(); 
		addEvidenciaWeb("Selecionado Mensagem Legal");
		this.comp.getBtnConfirmar().click();
		this.selecionarValorCampoSelecao("Inicio da Vigencia", GeracaoData.retornaDataAtual());
		this.selecionarValorCampoSelecao("Fim da Vigencia", GeracaoData.retornaDataAtualMaisMeses(1));
		this.mensa.getOrdem().sendKeys(valor);
		String s = this.mensa.getInputMensagemLegal().getAttribute("value").toString();
		VariaveisEstaticas.setDESCRICAO_MENSAGEM_LEGAL(s);
		Actions js = new Actions(webDriver);
		js.doubleClick(this.mensa.getSelectLocal()).build().perform();
		this.comp.getBtnSalvar().click();

	}

	public void clicarBotaoPesquisarTelaAdicionar() {
		addEvidenciaWeb("Clicando no Botão Pesquisar");
		this.mensa.getBtnPesquisar().click();
	}

	public void selecionarMensagemLegal() {
		this.mensa.getInputCodigo().sendKeys("1");
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
		this.mensa.getRadioButton().click();
		addEvidenciaWeb("Mensagem Selecionada, clicando no botão Pesquisar");
		this.comp.getBtnConfirmar().click();
	}

	public String retornaMensagemAdicionarRegistro() {
		addEvidenciaWeb("Mensagem Exibida");
		return this.mensa.getMsg().getText();
	}

	public void salvarValorCampoUsuarioNaturezaOperacao() {
		VariaveisEstaticas.setVALOR_USUARIO(this.adn.getInputUsuaio().getAttribute("value").toString());
	}

	public boolean gridResultadoNaoVazioMensagemLegal(String aba) {

		List<WebElement> Values = webDriver.findElements(By.xpath("//tab[@heading='" + aba + "']//tbody/tr/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//tab[@heading='" + aba + "']//tr/th"));
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

		addEvidenciaWeb("Pesquisa de Mensagem Legal");
		return grid1.isEmpty();
	}

	public void clicarBotaoPesquisaAbas(String campo) {
		WebElement pesquisar = webDriver.findElement(By.xpath("//tab[@heading='" + campo
				+ "']//label[contains(text(),'Local da Mensagem')]/ancestor::div[@class= 'card card-block card-header mb-3 mt-3']//i[@class='fas fa-search']"));
		addEvidenciaWeb("Clicando no botão Pesquisar");
		pesquisar.click();
	}

	public void clicarBotaAdicionarAbas(String campo) {
		this.load.loading();
		WebElement adicionar = webDriver.findElement(
				By.xpath("//tab[@heading='" + campo + "']//button[@class = 'btn btn-primary float-left mb-3']/i"));
		addEvidenciaWeb("Clicando no botão Adicionar");
		adicionar.click();
	}

	public void selecionarMensagemLegal(String aba, String valor) {
		switch (aba) {
		case "Nacional":
			this.selecionarMensagemNacional(valor);
			break;
		case "Estadual":
			this.selecionarMensagemEstadual(valor);
			break;
		case "Filial":
			this.selecionarMensagemFilial(valor);
			break;
		default:
			break;
		}
	}

	public String retornaValorGridSelecionaMensagemLegal(String campo) {
		this.load.loading();
		String s = null;
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//tab[@heading='Nacional']//table[@class='table table-striped']//tbody//td"));
		List<WebElement> Header = webDriver
				.findElements(By.xpath("//tab[@heading='Nacional']//table[@class='table table-striped']//thead//th"));
		Map<String, String> grid = new HashMap<String, String>();

		for (int i = 0; i < Values.size(); i++) {
			grid.put(Header.get(i).getText(), Values.get(i).getText());
			if (Header.get(i).getText().equals(campo)) {
				s = Values.get(i).getText();
				break;
			}
		}
		addEvidenciaWeb("Validando Mensagem legal selecionada na coluna " + campo);
		return s;
	}
	
	public String pegarValorUnicoTelaHistoricoMensagemLegal(String campo) {

		String s = null;
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//tab[@heading='Filial']//table[@class='table table-striped']//tbody//td"));
		List<WebElement> Header = webDriver
				.findElements(By.xpath("//tab[@heading='Filial']//table[@class='table table-striped']//thead//th"));
		Map<String, String> grid = new HashMap<String, String>();

			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Header.get(i).getText().equals(campo)) {
					s = Values.get(i).getText();
					break;
				}

			}
           addEvidenciaWeb("Tela Histórico Exibido na Tela");
		
		return s;

	}
	
	public String pegarValorUnicoTelaHistoricol(String campo) {
		String s = null;
		List<WebElement> Values = this.mensa.getValueGridResultadoTelaHistorico();
		List<WebElement> Header = this.mensa.getHeaderGridResultadoTelaHistoricoElements();
		Map<String, String> grid = new HashMap<String, String>();
		wait.until(ExpectedConditions.visibilityOf(this.mensa.getItemHeaderMenuTelaHistorico()));
			for (int i = 0; i < Values.size(); i++) {
				grid.put(Header.get(i).getText(), Values.get(i).getText());
				if (Header.get(i).getText().equals(campo)) {
					s = Values.get(i).getText();
					break;
				}

			}
           addEvidenciaWeb("Tela Histórico Exibido na Tela");
		
		return s;

	}

	public boolean retonarTextoVisualizarLocalReferencia(String campo, String valor) {
		this.load.loading();
		SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
		List<WebElement> Header = webDriver.findElements(By.xpath("//div[contains(text(),\"Mensagens Legais\")]/parent::div//tab[contains(@class,\"active\")]//thead//th"));
		List<WebElement> Values = webDriver.findElements(By.xpath("//div[contains(text(),\"Mensagens Legais\")]/parent::div//tab[contains(@class,\"active\")]//tbody//td"));
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
				System.out.println(x.get(campo));
				if (!x.get(campo).contains(valor)) {
					vr = false;
				}else {
					vr=true;
					return;
				}
			});

		} else {
			vr = false;
		}
		addEvidenciaWeb("Validando Mensagem Legal selecionada");
		return vr;
	}

	public void HistoricoAba(String aba) {
		switch (aba.toUpperCase()) {
		case "ABA NACIONAL":
			this.clicarHistoricoNacional();
			break;
		case "ABA ESTADUAL":
			this.clicarHistoricoEstadual();
			break;
		case "ABA FILIAL":
			this.selecionandoMensagemLegalAbaFilial();
			break;
		default:
			break;
		}
	}

	public void clicarBotaoEditarGridResultado() {
		addEvidenciaWeb("Clicando no botão Editar do Grid de Resultado de Mensagem Legal");
		this.load.loading();
		this.mensa.getButtonEditarGridResultado().click();
	}

	public String retornaTituloPaginaEditarRegistro() {
		wait.until(ExpectedConditions.visibilityOf(this.mensa.getTituloEditaRegistro()));
		addEvidenciaWeb("Tela de Editar Resgitro");
		return this.mensa.getTituloEditaRegistro().getText();
	}

	public void clicarBotaoSalvarAdicionarRegistro() {
		addEvidenciaWeb("Clicando botão Salvar Tela Adicionar Registro");
		SeleniumRobot.DoubleClickWeb(this.comp.getBtnSalvar());
		
	}

	public void salvarValorCampoUsuario() {
		SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
		VariaveisEstaticas.setVALOR_USUARIO(this.mensa.getInputUsuario().getAttribute("value").toString());
	}

	public void moverParaBtnRetornar() {
		SeleniumRobot.MoveToElementWeb(this.mensa.getButtonRetornar());
	}

	public String retornaValorGridSelecionaSelecionarMensagem(String campo) {
		this.load.loading();
		String s = null;
		List<WebElement> Values = this.comp.getValuesGridSelecionarMensagensDinamicas();
		List<WebElement> Header = this.comp.getHeaderGridSelecionarMensagensDinamicas();
		Map<String, String> grid = new HashMap<String, String>();

		for (int i = 0; i < Values.size(); i++) {
			grid.put(Header.get(i).getText(), Values.get(i).getText());
			if (Header.get(i).getText().equals(campo)) {
				s = Values.get(i).getText();
				break;
			}

		}
		addEvidenciaWeb("Validando Mensagem legal selecionada na coluna " + campo);
		return s;
	}

	public boolean gridResultadoNaoVazioSelecionarMensagem() {
		this.load.loading();
		List<WebElement> Values = this.comp.getValuesGridSelecionarMensagensDinamicas();
		List<WebElement> Header = this.comp.getHeaderGridSelecionarMensagensDinamicas();
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

		addEvidenciaWeb("Pesquisa de Mensagem Legal");
		return grid1.isEmpty();
	}

	public String restornaMensagemSucessoAbaFilial() {
		this.load.loading();
		wait.until(ExpectedConditions.visibilityOf(this.mensa.getLabelMensagemSucessoFilial()));
		addEvidenciaWeb("Mensagem Adicionada com Sucesso");
		return this.mensa.getLabelMensagemSucessoFilial().getText();
	}
	
	public void clicarBotaoPesquisarSelecionarMensagem() {
		addEvidenciaWeb("Clicando no botão Pesquisar");
		this.mensa.getBtnPesquisarSelecionarMensagem().click();
	}
	
	public void clicarBotaoBotaoHistoricoFilial() {
		addEvidenciaWeb("Clicando no botão Histórico");
		wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getButtonHistoricoFilial()));
		this.mensa.getButtonHistoricoFilial().click();
	}
	
	public void clicarBotaoBotaoHistoricoEstadual() {
		addEvidenciaWeb("Clicando no botão Histórico");
		wait.until(ExpectedConditions.elementToBeClickable(this.mensa.getButtonHistoricoEstadual()));
		this.mensa.getButtonHistoricoEstadual().click();
	}	

}
