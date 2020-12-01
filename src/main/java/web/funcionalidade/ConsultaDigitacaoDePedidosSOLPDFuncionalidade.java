package web.funcionalidade;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import commons.BaseTest;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.datatable.DataTable;
import web.bean.enums.ConsultarDigitacaoPedidosSOLPDEnum;
import web.bean.interfaces.ConsultarDigitacaoPedidosSOLPDInterface;
import web.pages.ConsultarDigitacaoPedidosSOLPDPage;

public class ConsultaDigitacaoDePedidosSOLPDFuncionalidade extends BaseTest {

	private ConsultarDigitacaoPedidosSOLPDPage solpd;

	public ConsultaDigitacaoDePedidosSOLPDFuncionalidade() {
		this.solpd = new ConsultarDigitacaoPedidosSOLPDPage(webDriver);
	}

	public void preencherCampoValor(String campo, String valor) {
		ConsultarDigitacaoPedidosSOLPDInterface pedido = ConsultarDigitacaoPedidosSOLPDEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		pedido.getElement(this.solpd).clear();
		pedido.getElement(this.solpd).sendKeys(valor);
		addEvidenciaWeb("Preechimeno do campo: " + campo + " com o valor: " + valor);
	}

	public String retornaValorCampo(String campo) {
		ConsultarDigitacaoPedidosSOLPDInterface pedido = ConsultarDigitacaoPedidosSOLPDEnum
				.valueOf(campo.replace(" ", "_").toUpperCase());
		addEvidenciaWeb("Retornando o valor do campo" + campo);
		return pedido.getElement(this.solpd).getAttribute("value");
	}

	public void pesquisar() {
		Actions action = new Actions(webDriver);
		action.sendKeys(Keys.ENTER).perform();
		addEvidenciaWeb("Consulta realizada");
	}

	public void pegarValoresParaExclusao() {
		VariaveisEstaticas.setCOD_PRODUTO(this.retornaValorCampo("Produto"));
		VariaveisEstaticas.setCOMPRADOR(this.retornaValorCampo("Compr"));
		VariaveisEstaticas.setFORNEC(this.retornaValorCampo("Fornecedor"));
	}

	public void getPedido(DataTable params) {
		this.preencherCampoValor("Forn", params.cell(1, 1));
		this.preencherCampoValor("Produto", params.cell(1, 2));
		this.pesquisar();
	}

	public void getDataProxPed() throws ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = format.parse(this.retornaValorCampo("Data"));
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		c.add(Calendar.DATE, 1);
		data = c.getTime();
		VariaveisEstaticas.setDATA_ENTRADA(format.format(data).toString());
	}

	public void validarPedido() throws ParseException {
		Assert.assertEquals(this.retornaValorCampo("Loja"), VariaveisEstaticas.getFILIAL());
		Assert.assertEquals(this.retornaValorCampo("Grid Local"), VariaveisEstaticas.getCOMPRADOR());
		Assert.assertEquals(this.retornaValorCampo("Produto"), VariaveisEstaticas.getCOD_PRODUTO());
		Assert.assertEquals(this.retornaValorCampo("Qtda"), VariaveisEstaticas.getQUANT());
		Assert.assertEquals(this.retornaValorCampo("Data"), VariaveisEstaticas.getDATA_ENTRADA());
	}

	public String getNumeroPedido() {
		return this.solpd.getSituacaoRegistro().getAttribute("value").split(": ")[1].trim();
	}
	
	public boolean verificaSitPedido(String sit) {
		return this.solpd.getSituacaoRegistro().getAttribute("value").contains(sit);
	}
}
