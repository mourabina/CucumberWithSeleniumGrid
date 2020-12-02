package web.steps;

import java.io.FileNotFoundException;

import commons.SNFApi;
import commons.funcionalidade.VariaveisEstaticas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.FluxoRecebimentoFuncionalidade;
import web.funcionalidade.SNF.SNFLoginFuncionalidade;

public class RecebimentoStep {
	
	private FluxoRecebimentoFuncionalidade fluxo;
	private SNFApi api;
	private SNFLoginFuncionalidade login;

	public RecebimentoStep() {
		this.fluxo = new FluxoRecebimentoFuncionalidade();
		this.api = new SNFApi();
		this.login = new SNFLoginFuncionalidade();
	}

	@Dado("^que tenho um pedido \"([^\"]*)\" do modelo \"([^\"]*)\" com agendamento criado$")
	public void geracaoMassaSad(String tipoPed, String modelo) throws Throwable {
		VariaveisEstaticas.setNOTA_FISCAL(modelo);
		VariaveisEstaticas.setMODELO(tipoPed);
		this.fluxo.geracaoPedido(tipoPed, modelo);
	}

	@Dado("^esteja vinculado com uma Nota Fiscal$")
	public void vinculoPedidoNF() throws FileNotFoundException, InterruptedException {
		this.api.gerarNFModelo(VariaveisEstaticas.getMODELO(), VariaveisEstaticas.getNOTA_FISCAL());
		this.login.LoginPerfil("SVCautqea", "Centro de Distribuição", VariaveisEstaticas.getFILIAL());
		this.fluxo.acessarNotaFiscal();
		this.fluxo.vincularPedido();
	}

	@Quando("^envio para o SAD confirmando o recebimento$")
	public void envioSad() throws InterruptedException {
		this.fluxo.acessarVisualizarRecebimento();
		this.fluxo.acessarAgenda();
		this.fluxo.atualizarPlaca();
	}

	@Então("^deve ser gerado a guia cega$")
	public void validarGuia() {
	}

}
