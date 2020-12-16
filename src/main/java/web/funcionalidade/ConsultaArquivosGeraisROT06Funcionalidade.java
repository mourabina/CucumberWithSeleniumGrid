package web.funcionalidade;

import org.openqa.selenium.support.ui.Select;

import commons.BaseTest;
import web.bean.enums.ConsultaArquivosGeraisROT06Enum;
import web.bean.interfaces.ConsultaArquivosGeraisROT06Interface;
import web.pages.ConsultaArquivosGeraisROT06Page;

public class ConsultaArquivosGeraisROT06Funcionalidade extends BaseTest {

	private ConsultaArquivosGeraisROT06Page rot06;

	public ConsultaArquivosGeraisROT06Funcionalidade() {
		this.rot06 = new ConsultaArquivosGeraisROT06Page(webDriver);

	}

	public void selecionarCampoComboCPC76(String campo, String valor) {
		ConsultaArquivosGeraisROT06Interface validarGuia = ConsultaArquivosGeraisROT06Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		Select combo = new Select(validarGuia.getElement(this.rot06));
		combo.selectByVisibleText(valor);

	}

	public void inserirInformacaoCampo(String campo, String valor) {
		this.limparCampos(campo);
		ConsultaArquivosGeraisROT06Interface validarGuia = ConsultaArquivosGeraisROT06Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		validarGuia.getElement(this.rot06).sendKeys(valor);

	}

	public void limparCampos(String campo) {
		ConsultaArquivosGeraisROT06Interface validarGuia = ConsultaArquivosGeraisROT06Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		validarGuia.getElement(this.rot06).clear();

	}

	public String retornaValorCampos(String campo) {
		ConsultaArquivosGeraisROT06Interface validarGuia = ConsultaArquivosGeraisROT06Enum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		return validarGuia.getElement(this.rot06).getAttribute("value");

	}
	
	public void clicarBotaoListar() {
		this.rot06.getBtnListar().click();;
	}
	
	public void marcarCheckBox() {
		this.rot06.getCheckboxNomee_0().click();
	}
	
	public void clicarBotaoVer() {
		this.rot06.getBtnVer_0().click();
	}

}
