package web.steps;

import org.junit.Assert;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.MonitoramentoReceiverCPC76Funcionalidade;

public class MonitoramentoReceiverCPC76Step {

	private MonitoramentoReceiverCPC76Funcionalidade cpc76;

	public MonitoramentoReceiverCPC76Step() {
		this.cpc76 = new MonitoramentoReceiverCPC76Funcionalidade();

	}

	@Quando("realizo a consulta do Receiver com o campo {string} contendo o valor {string}")
	public void efetuarConsultaPorCampoValorr(String campo, String valor) {
		this.cpc76.limparCampos(campo);
		this.cpc76.inserirInformacaoCampo(campo, valor);
		this.cpc76.clicarEnter();
	}

	@Entao("deve exibir a mensagem {string} no final da pagina")
	public void valdiarMensagemExibidaCPC76(String msg) {
		Assert.assertTrue(this.cpc76.retonaMensagem().contains(msg));

	}

	@Quando("^digito o valor \"([^\"]*)\" no campo \"([^\"]*)\" na consulta do receiver$")
	public void digitarValorCampoInput(String valor, String campo){
		this.cpc76.inserirInformacaoCampo(campo, valor);
		
	}

	@Quando("^deixo o campo \"([^\"]*)\" em branco e dou enter$")
	public void pesquisarComCampoEmBranco(String campo){
		this.cpc76.limparCampos(campo);
		this.cpc76.clicarEnter();
		
	}

}
