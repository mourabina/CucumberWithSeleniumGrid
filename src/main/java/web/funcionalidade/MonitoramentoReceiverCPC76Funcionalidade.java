package web.funcionalidade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import web.bean.enums.MonitoramentoReceiverCPC76Enum;
import web.bean.interfaces.MonitoramentoReceiverCPC76Interface;
import web.pages.MonitoramentoReceiverCPC76Page;

public class MonitoramentoReceiverCPC76Funcionalidade extends BaseTest {

	private MonitoramentoReceiverCPC76Page cpc76;

	public MonitoramentoReceiverCPC76Funcionalidade() {
		this.cpc76 = new MonitoramentoReceiverCPC76Page(webDriver);
	}

	public void selecionarCampoComboCPC76(String campo, String valor) {
		MonitoramentoReceiverCPC76Interface guia = MonitoramentoReceiverCPC76Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(guia.getElement(this.cpc76));
		combo.selectByVisibleText(valor);

	}

	public void inserirInformacaoCampo(String campo, String valor) {
		this.limparCampos(campo);
		MonitoramentoReceiverCPC76Interface guia = MonitoramentoReceiverCPC76Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		guia.getElement(this.cpc76).sendKeys(valor);

	}

	public void limparCampos(String campo) {
		MonitoramentoReceiverCPC76Interface guia = MonitoramentoReceiverCPC76Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		guia.getElement(this.cpc76).clear();

	}

	public String retornaValorCampos(String campo) {
		MonitoramentoReceiverCPC76Interface guia = MonitoramentoReceiverCPC76Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		return guia.getElement(this.cpc76).getAttribute("value");

	}

	public void clicarEnter() {
		Actions action = new Actions(webDriver);
		action.sendKeys(Keys.ENTER).perform();
		addEvidenciaWeb("Consulta realizada");
	}
	
	public String retonaMensagem() {
		addEvidenciaWeb("Mensagem Exibida");
		return this.cpc76.getMsg().getText();
	}

}
