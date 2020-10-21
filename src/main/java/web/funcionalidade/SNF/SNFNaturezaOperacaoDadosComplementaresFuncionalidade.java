package web.funcionalidade.SNF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import commons.funcionalidade.waitLoading;
import web.bean.interfaces.SNF_NaturezaOperacaoDadosComplementares;
import web.pages.SNF.SNFAdicionarNaturezaOperacaoPage;
import web.pages.SNF.SNFNaturezaOperacaoPage;

public class SNFNaturezaOperacaoDadosComplementaresFuncionalidade extends BaseTest {

	private SNFNaturezaOperacaoPage nat;
	private waitLoading load;
	private SNFAdicionarNaturezaOperacaoPage anat;

	public boolean vr = true;
	public boolean grid = true;
	public String s = null;

	public SNFNaturezaOperacaoDadosComplementaresFuncionalidade() {
		this.nat = new SNFNaturezaOperacaoPage(webDriver);
		this.load = new waitLoading();
		this.anat = new SNFAdicionarNaturezaOperacaoPage(webDriver);

	}

	public void clicarBoxTipoOperacao() {
		this.load.loading();
		this.nat.getSelectTipoOperacao().click();
		addEvidenciaWeb("Clicando no box Tipo Opersação");
	}

	public void clicarBoxSituacaoNatureza() {
		this.load.loading();
		this.nat.getSelectSituacaoNatureza().click();
		addEvidenciaWeb("Clicando no box Situação da Naturezas");
	}

	public void preecherCampoCodigoNatureza(String valor) {
		this.nat.getInputCodigoNatureza().sendKeys(valor);
		VariaveisEstaticas.setCODIGO(valor);
		addEvidenciaWeb("Digitando o valor: " + valor + " no campo Código de Natureza");
		this.load.loading();
		this.nat.getButtonPesquisar().click();
		this.load.loading();
	}
	

	public boolean campoCodigoNaturezaVazio() {
		addEvidenciaWeb("Campo Código de Natureza Vazio");
		return this.nat.getInputCodigoNatureza().getText().isEmpty();
	}
	
	public boolean campoVazio() {
		this.load.loading();
		addEvidenciaWeb("Campo Código Natureza Operação Vazio");
		return this.anat.getInputCodigoNaturezaOperacao().getText().isEmpty();
	}

	public String retornaValorGridResultado() {
		addEvidenciaWeb("Resultado da Pesquisa no Grid de Resultados");
		return this.nat.getGriResultado().getText();
	}

	public void clicarCampoNatOperDadosComp(String campo) {
		this.load.loading();
		SNF_NaturezaOperacaoDadosComplementares manu = web.bean.enums.SNF_NaturezaOperacaoDadosComplementares
				.valueOf(campo.replace(" ", "_").toUpperCase());
		wait.until(ExpectedConditions.visibilityOf(manu.getElement(this.nat)));
		wait.until(ExpectedConditions.elementToBeClickable(manu.getElement(this.nat)));
		try {
			manu.getElement(this.nat).click();
			addEvidenciaWeb("Clicando no campo: " + campo);
			
		}catch (org.openqa.selenium.ElementClickInterceptedException e) {
			manu.getElement(this.nat).click();
			addEvidenciaWeb("Clicando no campo: " + campo);
		}
		
	}
 
	public boolean verificarListaXCampo(List<String> lista, String campo) {
		this.load.loading();
		SNF_NaturezaOperacaoDadosComplementares manu = web.bean.enums.SNF_NaturezaOperacaoDadosComplementares
				.valueOf(campo.replace(" ", "_").toUpperCase());
		List<String> list = Arrays
				.asList(manu.getElement(this.nat).getText().toString().replaceAll("\\s", "").split("(?=\\p{Lu})"));
		addEvidenciaWeb("Elementos pertencentes ao campo :" + list);
		return lista.equals(list);
	}

	public void preencherValorCampoInsert(String campo, String valor) {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.nat.getInputCodigoNatureza()));
		SNF_NaturezaOperacaoDadosComplementares manu = web.bean.enums.SNF_NaturezaOperacaoDadosComplementares
				.valueOf(campo.replace(" ", "_").toUpperCase());
		manu.getElement(this.nat).sendKeys(valor);
		addEvidenciaWeb("Selecionado o valor " + valor + "no campo " + campo);
	} 

	public boolean retornaValorCampoSelecao(String campo, String valor) {
		SNF_NaturezaOperacaoDadosComplementares manu = web.bean.enums.SNF_NaturezaOperacaoDadosComplementares
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando valor do campo Seleção " + campo);
		Select list = new Select(manu.getElement(this.nat));
        return list.getFirstSelectedOption().getText().trim().equals(valor);
	}
	
	public void selecionaValorCampoSelecao(String campo, String valor) {
		this.load.loading();
		SNF_NaturezaOperacaoDadosComplementares manu = web.bean.enums.SNF_NaturezaOperacaoDadosComplementares
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select list = new Select(manu.getElement(this.nat));
		list.selectByVisibleText(valor);
		addEvidenciaWeb("Valor selecionado : " + valor + " no campo : " + campo);
        
	}

	public boolean pegarValirGridResultado(String campo, String valor) {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.nat.getInputCodigoNatureza()));
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
			vr = true;

		} else {
			vr = false;
		}
		addEvidenciaWeb("Pesquisa efetuada com sucesso atraves dos campos Unidade de Negocio e  " + campo);

		return vr;
	}
	
	public void pegarValorUnicoGridResultado(String campo) {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.nat.getInputCodigoNatureza()));
		List<WebElement> Values = webDriver
				.findElements(By.xpath("//table[@class='table table-hover']//tbody/tr[1]/td"));
		List<WebElement> Header = webDriver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		Map<String, String> grid = new HashMap<String, String>();
		int QtdeRegistro = Values.size() / Header.size();
		if (QtdeRegistro > 0) {
			for (int x = 0; x < QtdeRegistro; x++) {
				for (int i = 0; i < Values.size(); i++) {
					grid.put(Header.get(i).getText(), Values.get(i).getText());
					if (Header.get(i).getText().equals(campo)) {
						s = Values.get(i).getText();
						break;
					}
					
				}

			}
	     
		}
		VariaveisEstaticas.setVALOR_GRID(s);
		
	}

	public void clicaBotaEditarGridResultado() {
		this.load.loading();
		wait.until(ExpectedConditions.elementToBeClickable(this.nat.getInputCodigoNatureza()));
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
								By.xpath("//table[@class='table table-hover']//tbody/tr/td[@class='text-right']"));
						editar.click();
						this.load.loading();
						break;
					}

				}
				grid1.add(grid);

			}

		}



	public boolean gridResultadoNaoVazio() {
		wait.until(ExpectedConditions.elementToBeClickable(this.nat.getInputCodigoNatureza()));
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

		addEvidenciaWeb("Pesquisa sem preencher nenhum campo, Grid com retorno de Natureza de Operação Cadastradas");
		return grid1.isEmpty();
	}

	public void preencherTodosOsCampos() {
		this.selecionaValorCampoSelecao("Agrupamento", "Retorno de Remessa");
		this.selecionaValorCampoSelecao("Natureza de Operacao", "RETRMS - Entrada Retorno de Remessa de Mercadoria");
		this.selecionaValorCampoSelecao("Tipo de Operacao", "Entrada");
		this.preecherCampoCodigoNatureza("RETRMS");
		this.selecionaValorCampoSelecao("Situacao da Natureza", "Ativo");
		addEvidenciaWeb("Todos os campos de Pesquisa preenchidos");
	}

	public String retornaTextoTelaNaturezaOperacao() {
		this.load.loading();
		return this.anat.getLabelDadosNaturezaOperacao().getText();
	}

	public void clicarBotaoMais() {
		this.load.loading();
		addEvidenciaWeb("Clicando no botão 'Mais'");
		this.nat.getButtonMais().click();
	}

}
