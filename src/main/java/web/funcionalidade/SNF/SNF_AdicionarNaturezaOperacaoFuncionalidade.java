package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.enums.SNF_AdicionarNaturezaOperacaoEnum;
import web.bean.interfaces.SNF_AdicionarNaturezaOperacaoInterface;
import web.pages.SNF.SNFAdicionarNaturezaOperacaoPage;
import web.pages.SNF.SNFComponentesPage;
import web.pages.SNF.SNFNaturezaOperacaoPage;
import web.pages.SNF.SNFNaturezaOperacaoXMensagensLegaisPage;

public class SNF_AdicionarNaturezaOperacaoFuncionalidade extends BaseTest {

	private SNFAdicionarNaturezaOperacaoPage adn;
	private waitLoading load;
	public boolean aux = true;
	private SNFComponentesPage comp;
	private SNFNaturezaOperacaoXMensagensLegaisPage mensa;
	public String s = null;
	private SNFNaturezaOperacaoPage nat;
	

	public SNF_AdicionarNaturezaOperacaoFuncionalidade() {
		this.adn = new SNFAdicionarNaturezaOperacaoPage(webDriver);
		this.load = new waitLoading();
		this.comp = new SNFComponentesPage(webDriver);
		this.mensa = new SNFNaturezaOperacaoXMensagensLegaisPage(webDriver);
		this.nat = new SNFNaturezaOperacaoPage(webDriver);		
	}

	public void preencherCampoCodNaturezaOperacao(String valor) {
		this.adn.getInputCodigoNaturezaOperacao().sendKeys(valor);
		VariaveisEstaticas.setCODIGO(this.adn.getInputCodigoNaturezaOperacao().getAttribute("value").toString());
	}
	
	public void limpaCampoCodNaturezaOperacao() {
		this.adn.getInputCodigoNaturezaOperacao().clear();
	}

	public void preencherTodoCamposMenosCodNatOperacao() {
		Select campo1 = new Select(this.adn.getSelectTipoOperacao());
		campo1.selectByVisibleText("Entrada");
		Select campo2 = new Select(this.adn.getSelectSituacaoNatureza());
		campo2.selectByVisibleText("Ativo");
		this.adn.getInputDescricaoNaturezaOperacao().sendKeys("Teste Requisito 17.3");
		Select campo3 = new Select(this.adn.getSelectAgrupamento());
		campo3.selectByVisibleText("Remessa de Mercadoria");
		campo1 = new Select(this.adn.getSelectPermiteDigitarPreco());
		campo1.selectByVisibleText("SIM");
		Select campo4 = new Select(this.adn.getSelectObtemCFOP());
		campo4.selectByVisibleText("Sim");
		Select campo5 = new Select(this.adn.getSelectTipoSelecao());
		campo5.selectByVisibleText("Converter CFOP");
		addEvidenciaWeb("Campos obrigatórios Preenchidos parte 1");
		Select campo6 = new Select(this.adn.getSelectCFOPNF());
		campo6.selectByVisibleText("Converter CFOP");
		this.preencherSomenteFormulario();
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonSalvar());
		Select campo7 = new Select(this.adn.getSelectAtualizarEstoque());
		campo7.selectByVisibleText("SIM");
		Select campo8 = new Select(this.adn.getSelectControleAssitenciaTecnica());
		campo8.selectByVisibleText("SIM");
		Select campo9 = new Select(this.adn.getSelectRecuperaICMSST());
		campo9.selectByVisibleText("SIM");
		this.adn.getButtonMaisCFOPPermitidos().click();
		Select campo10 = new Select(this.adn.getSelectCFOPPermitido());
		campo10.selectByVisibleText("2911 - ENTRADA DE AMOSTRA GRATIS");
		addEvidenciaWeb("Selecionado CFOP Permitido");
		this.adn.getButtonAdicionarCFOPPermitidos().click();
	}

	public void clicarBotaoSalvar() {
		addEvidenciaWeb("Clicando no botão Salvar");
		Actions js = new Actions(webDriver);
		js.doubleClick(this.adn.getSelectAtualizarEstoque()).perform();
		SeleniumRobot.MoveToElementWeb(this.comp.getBtnSalvar());
		this.comp.getBtnSalvar().click();
		this.load.loading();
	}

	public String mensagemErro() {
		SeleniumRobot.MoveToElementWeb(this.adn.getInputCodigoNaturezaOperacao());
		wait.until(ExpectedConditions.visibilityOf(this.adn.getMsgError()));
		addEvidenciaWeb("Mensagem Apresentada");
		return this.adn.getMsgError().getText();
	}

	public boolean verificaValoresTipoOperacao(List<String> lista) {
		List<String> list = Arrays.asList(
				this.adn.getSelectTipoOperacao().getText().toString().replaceAll("\\s", "").split("(?=\\p{Lu})"));
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);
		return lista.equals(list);
	}

	public boolean verificaValoresSitucaoNatureza(List<String> lista) {
		List<String> list = Arrays.asList(
				this.adn.getSelectSituacaoNatureza().getText().toString().replaceAll("\\s", "").split("(?=\\p{Lu})"));
		addEvidenciaWeb("Elementos pertencentes ao campo: " + list);
		return lista.equals(list);
	}

	public boolean verificaValoresListaCampo(List<String> lista, String campo) {
		List<String> list = new ArrayList<String>();
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		Select opcoes = new Select(manu.getElement(this.adn));
		opcoes.getOptions().forEach(opcao -> {
			String op = opcao.getText().trim();
			list.add(op);
		});
		addEvidenciaWeb("Elementos pertencentes ao campo: " + list);
		return lista.equals(list);
	}

	public void preencherDescricaoNatOperAlfanumerico(String valor) {
		this.load.loading();
		this.adn.getInputDescricaoNaturezaOperacao().sendKeys(valor);
		addEvidenciaWeb("Digitando caracteres Alfanumericos: " + valor);
		this.adn.getInputCodigoNaturezaOperacao().click();
	}

	public String getValorDescNaturezaOperacao() {
		addEvidenciaWeb("Campo aceita digitar Valores Alfanumericos");
		return this.adn.getInputDescricaoNaturezaOperacao().getAttribute("value").toString();
	}

	public boolean getCodNaturezaOperazaVazio() {
		addEvidenciaWeb("Campo Código de natureza de Operção Vazio");
		return this.adn.getInputCodigoNaturezaOperacao().getAttribute("value").isEmpty();
	}

	public boolean verificaValoresObtemCFOP(List<String> lista) {
		List<String> list = Arrays
				.asList(this.adn.getSelectObtemCFOP().getText().toString().replaceAll("\\s", "").split("(?=\\p{Lu})"));
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);
		return lista.equals(list);
	}

	public boolean campoDescricaoNatureza() {
		addEvidenciaWeb("Validando o campo Descrição da natureza de operação da NF");
		return this.adn.getInputDescricaoNaturezaOPeracaoNF().isEnabled();
	}

	public boolean validarCamposDesabilitadoHabilitados(String elem) {
		
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		return manu.getElement(this.adn).isEnabled();
	}

	public void preencherCampoSelecao(String elem, String valor) {
		this.load.loading();
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		manu.getElement(this.adn).sendKeys(valor);
	}
	
	public void preencherCampoSelecaoTelaPesquisa(String elem, String valor) {
		this.load.loading();
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		Select pesqui = new Select(manu.getElement(this.adn));
		pesqui.selectByVisibleText(valor);
		
	}
	
	public boolean validaHablitadoDesabilitadoCampoSuperio(String elem) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		addEvidenciaWeb("Validando o campo : " + elem);
		return manu.getElement(this.adn).isEnabled();
	}

	public boolean retornarCampoNaoVazio(String elem) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		addEvidenciaWeb("Validando o campo : " + elem);
		return manu.getElement(this.adn).getText().isEmpty();
	}

	public void clicarCamposSelecao(String elem) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(elem.replace(" ", "_").toUpperCase());
		SeleniumRobot.MoveToElementWeb(manu.getElement(this.adn));
		manu.getElement(this.adn).click();
		addEvidenciaWeb("Clicando no campo : " + elem);
	}

	public void preencherFormularioDadosCadastrados() {
		String s = "Não há resutados...";
		WebElement Values = webDriver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelParemetrosAdicionais());
		if (Values.getText().equals(s)) {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestino(valoresMap);
			this.preencherFormularioDadosCadastrados();
		} else {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			SeleniumRobot.MoveToElementWeb(this.adn.getButtonMaisRemessaRetorno());
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestino(valoresMap);
		}
	}

	public void preencherFormularioCadastradosTipoNota() {
		String s = "Não há resutados...";
		WebElement Values = webDriver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelParemetrosAdicionais());
		if (Values.getText().equals(s)) {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestinoTipoNota(valoresMap);
			this.load.loading();
			Actions js = new Actions(webDriver);
			js.doubleClick(this.adn.getSelectCFOPNotaFiscalCST0()).perform();
			this.preencherFormularioCadastradosTipoNota();
		} else {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestinoTipoNota(valoresMap);
		}
	}

	public List<Map<String, String>> retornaListaMaps() {
		WebElement Values = webDriver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelParemetrosAdicionais());
		Map<String, String> valoresMap = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = this.comp.getListaValuesFormatoOrigem().size()
				/ this.comp.getListaHerderFormatoOrigem().size();

		if (QtdeRegistro > 0) {
			for (int x = 0; x < QtdeRegistro; x++) {
				for (int i = 0; i < this.comp.getListaHerderFormatoOrigem().size(); i++) {
					valoresMap.put(this.comp.getListaHerderFormatoOrigem().get(i).getText(),
							this.comp.getListaValuesFormatoOrigem().get(i).getText());
				}
			}
			grid1.add(valoresMap);
		} else {
			valoresMap.put(" ", Values.getText());
			grid1.add(valoresMap);
		}

		return grid1;
	}

	public Map<String, String> retornaListaFormatoOrigemDestino() {

		Map<String, String> listaElem = new HashMap<String, String>();
		Map<String, String> valores = new HashMap<String, String>();
		Map<String, String> grid = new HashMap<String, String>();
		List<Map<String, String>> grid1 = new ArrayList<Map<String, String>>();
		int QtdeRegistro = this.comp.getListaValuesFormatoOrigem().size()
				/ this.comp.getListaHerderFormatoOrigem().size();
		listaElem.put("Origem", "CD");
		listaElem.put("Destino", "CD");
		listaElem.put("Tipo de Nota", "RS - Saída de Remessa");
		listaElem.put("", "Remover");

		if (QtdeRegistro > 0) {
			this.deletarRegistro();
			for (int x = 0; x < QtdeRegistro; x++) {
				for (int i = 0; i < this.comp.getListaHerderFormatoOrigem().size(); i++) {
					grid.put(this.comp.getListaHerderFormatoOrigem().get(i).getText(),
							this.comp.getListaValuesFormatoOrigem().get(i).getText());
				}
				for (int i = this.comp.getListaHerderFormatoOrigem().size() - 1; i >= 0; i--) {
					this.comp.getListaValuesFormatoOrigem().remove(i);
				}
				grid1.add(grid);
			}
			valores.putAll(this.obtemPrimeiraLinha(grid1));
		} else {
			valores.putAll(listaElem);
		}
		addEvidenciaWeb("Informações Formato de Origem e Destino X Tipo de Nota Fiscal");
		return valores;
	}

	public void formularioOrigemDestino(Map<String, String> valoresMap) {
		Select opcao2 = new Select(this.adn.getSelectTipoNota());
		preencherUniOrigem(valoresMap.get("Origem"));
		preencherUniDestino(valoresMap.get("Destino"));
		opcao2.selectByVisibleText(valoresMap.get("Tipo de Nota"));
		addEvidenciaWeb("formulário Preenchido com sucesso");
		this.adn.getButtonAdicionar().click();

	}

	public void formularioOrigemDestinoTipoNota(Map<String, String> valoresMap) {
		Select opcao2 = new Select(this.adn.getSelectTipoNota());
		String origem = valoresMap.get("Destino").equals("CD") ? "LJ" : "CD";
		preencherUniOrigem(origem);
		String destino = valoresMap.get("Origem").equals("CD") ? "CD" : "LJ";
		preencherUniDestino(destino);
		opcao2.selectByVisibleText(valoresMap.get("Tipo de Nota"));
		addEvidenciaWeb("formulário Preenchido com sucesso");
		VariaveisEstaticas.setLISTA(this.retornaValoresSelecionados());
		this.adn.getButtonAdicionar().click();

	}

	public Map<String, String> obtemPrimeiraLinha(List<Map<String, String>> atual) {
		Map<String, String> grid = new HashMap<String, String>();
		atual.forEach(linha -> {
			grid.putAll(linha);
			return;
		});
		return grid;
	}

	public boolean validaRegistrosCadastrados(List<Map<String, String>> atual, Map<String, String> criado) {

		Set<String> nome = criado.keySet();
		atual.forEach(linha -> {
			nome.forEach(opcao -> {
				if (!linha.get(opcao).equals(criado.get(opcao))) {
					aux = false;
				}
			});
			aux = false;
		});
		addEvidenciaWeb("Registro criado com o campo Tipo de nota repetido");
		return true;
	}

	public void preencherUniOrigem(String valor) {
		Select opcao = new Select(this.adn.getSelectUnOrigem());
		switch (valor) {
		case "CD":
			opcao.selectByVisibleText("Centro de Distribuição");
			break;
		case "LJ":
			opcao.selectByVisibleText("Lojas");
			break;

		default:
			break;
		}
	}

	public void preencherUniDestino(String valor) {
		Select opcao = new Select(this.adn.getSelectUnDestino());
		switch (valor) {
		case "CD":
			opcao.selectByVisibleText("Centro de Distribuição");
			break;
		case "LJ":
			opcao.selectByVisibleText("Lojas");
			break;
		case "FN":
			opcao.selectByVisibleText("Fornecedor");
			break;
		case "CL":
			opcao.selectByVisibleText("Clubes");
			break;	 	

		default:
			break;
		}
	}

	public String retornaMensagem() {
		addEvidenciaWeb("Mensgem Exibida");
		return this.adn.getMsgOrigem().getText();
	}

	public Map<String, String> retornaValoresSelecionados() {
		Map<String, String> list = new HashMap<String, String>();
		Select origem = new Select(this.adn.getSelectUnOrigem());
		String or = (origem.getFirstSelectedOption().getText().equals("Loja")) ? "LJ" : "CD";
		list.put("Origem", or);
		Select destino = new Select(this.adn.getSelectUnOrigem());
		String des = (destino.getFirstSelectedOption().getText().equals("Loja")) ? "LJ" : "CD";
		list.put("Destino", des);
		Select tipoNota = new Select(this.adn.getSelectTipoNota());
		list.put("Tipo de Nota", tipoNota.getFirstSelectedOption().getText());
		return list;
	}

	public void deletarRegistro() {
		int quantRes = this.comp.getListaValuesFormatoOrigem().size() / this.comp.getListaHerderFormatoOrigem().size();
		Map<String, String> grid = this.obtemPrimeiraLinha(this.retornaListaMaps());
		if (quantRes > 1) {
			Set<String> nome = grid.keySet();
			nome.forEach(nomes -> {
				if (grid.get(nomes).equals("Remover")) {
					WebElement remove = webDriver.findElement(
							By.xpath("//table[@class='table table-striped']/tbody/tr/td[@class='text-right']/a"));
					remove.click();

				}
			});
			this.adn.getButtonRemover().click();
		}

	}

	public void deletarRegistro(Map<String, String> grid) {
		Set<String> nome = grid.keySet();
		nome.forEach(nomes -> {
			if (grid.get(nomes).equals("Remover")) {
				WebElement remove = webDriver.findElement(
						By.xpath("//table[@class='table table-striped']/tbody/tr/td[@class='text-right']/a"));
				remove.click();
				addEvidenciaWeb("Clicando no botão Remover");

			}
		});

		this.adn.getButtonRemover().click();
		addEvidenciaWeb("Clicando no opção Remover");

	}

	public void excluirRegistro() {
		String s = "Não há resutados...";
		WebElement Values = webDriver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelParemetrosAdicionais());
		if (Values.getText().equals(s)) {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestinoTipoNota(valoresMap);
			VariaveisEstaticas.setLISTA(valoresMap);
			this.load.loading();
			Actions js = new Actions(webDriver);
			js.doubleClick(this.adn.getSelectCFOPNotaFiscalCST0()).perform();
			this.deletarRegistro(valoresMap);
		} else {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.deletarRegistro(valoresMap);

		}
	}

	public String retornaValorCampoSelecao(String campo) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando valor do campo Seleção " + campo);
		Select list = new Select(manu.getElement(this.adn));

		return list.getFirstSelectedOption().getText().trim();
	}

	public boolean retornaValorCampoSelecaoNaoVazio(String campo) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando valor do campo Seleção " + campo);
		Select list = new Select(manu.getElement(this.adn));

		return list.getFirstSelectedOption().getText().isEmpty();
	}

	public String retornaValorCampoInput(String campo) {
		SNF_AdicionarNaturezaOperacaoInterface manu = SNF_AdicionarNaturezaOperacaoEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando valor do campo Seleção " + campo);
		return manu.getElement(this.adn).getAttribute("value").toString();
	}

	public String retornaUsuario() {
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelUser());
		String s = this.adn.getLabelUser().getText().split(" ")[1];
		return s;
	}

	public String retornaDataUltimaAtualizacao() {
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelUser());
		WebElement elem = webDriver.findElement(By.xpath("//div[@class='col-sm-7 text-left align-middle']"));

		String s = elem.getText().split(" ")[7];
		return s;
	}

	public void clicarButtonRetornar() {
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonRetornar());
		this.adn.getButtonRetornar().click();
	}

	public boolean buttonSalvarDesabilitado() {
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonSalvar());
		addEvidenciaWeb("Botão Salvar Desabilitado");
		return this.adn.getButtonSalvar().isEnabled();
	}

	public void clicarBotaoHistorico() {
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonHistorico());
		addEvidenciaWeb("Clicando no Botão Histórico");
		this.adn.getButtonHistorico().click();
	}

	public String telaHistorico() {
		wait.until(ExpectedConditions.visibilityOf(this.adn.getLabelTituloPaginaHistorico()));
		addEvidenciaWeb("Tela Histórico");
		return this.adn.getLabelTituloPaginaHistorico().getText();
	}
 
	public void clicarBotaoRetornar() {
		this.load.loading();
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonRetornar());
		wait.until(ExpectedConditions.visibilityOf(this.adn.getButtonRetornar()));
		wait.until(ExpectedConditions.elementToBeClickable(this.adn.getButtonRetornar()));
		SeleniumRobot.scroll(300);
		this.adn.getButtonRetornar().click();
	}

	public boolean buttonPesquisarAtivado() {
		addEvidenciaWeb("Botão Pesquisar da Tela de Natureza de Operação");
		this.load.loading();
		return this.comp.getBtnPesquisar().isEnabled();
	}

	public boolean buttonMaisAtivado() {
		return this.comp.getBtnAdicionar().isEnabled();
	}

	public void clicarBotaoMensagemLegal() {
		this.load.loading();
		SeleniumRobot.MoveToElementWeb(this.adn.getButtonRetornar());
		SeleniumRobot.scroll(150);
		addEvidenciaWeb("Clicando no botão Mensagem Legal");
		this.adn.getButtonMensagemLegal().click();
	}
	
	public void clicarBotaoMensagemLegalSemLoad() {
		if(SeleniumRobot.existElementWeb("//i[contains(@class,\"fa-spin\")]")) {
			this.load.loading();
			SeleniumRobot.MoveToElementWeb(this.adn.getButtonRetornar());
			SeleniumRobot.scroll(150);
			addEvidenciaWeb("Clicando no botão Mensagem Legal");
			this.adn.getButtonMensagemLegal().click();
		}else {
			SeleniumRobot.MoveToElementWeb(this.adn.getButtonRetornar());
			SeleniumRobot.scroll(150);
			addEvidenciaWeb("Clicando no botão Mensagem Legal");
			this.adn.getButtonMensagemLegal().click();
		}
		
	}
	
	public String retornaTituloPaginaMensagemLegal() {
		addEvidenciaWeb("Pagina Natureza de operação x Mensagens legais");
		return this.mensa.getTituloPagina().getText();
	}

	public String pegarValorUnicoGridResultado(String campo) {
		WebElement elem = webDriver.findElement(By.xpath("//h4[@class='modal-title']"));
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

		}
		addEvidenciaWeb("Registro criado sendo exibido na tela de Histórico");
		SeleniumRobot.MoveToElementWeb(elem);
		addEvidenciaWeb("Registro criado sendo exibido na tela de Histórico");
		return s;

	}

	public void limparCampoCodNaturezaPesquisa() {
		this.nat.getInputCodigoNatureza().clear();	
	}
	
	public void preencherSomenteFormulario() {
		SeleniumRobot.MoveToElementWeb(this.adn.getLabelParemetrosAdicionais());
		if (!SeleniumRobot.existElementWeb("//table[@class='table table-striped']/tbody/tr/td")) {
			Map<String, String> valoresMap = this.retornaListaFormatoOrigemDestino();
			this.adn.getButtonMaisRemessaRetorno().click();
			this.formularioOrigemDestinoTipoNota(valoresMap);
			addEvidenciaWeb("Selecionado CFOP permitido");		
		}
	}

}
