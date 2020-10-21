package web.steps.SNF;


import io.cucumber.java.pt.Dado;
import web.funcionalidade.SNF.SNFLoginFuncionalidade;

public class SNFLoginStep {

	private SNFLoginFuncionalidade loginSNF;

	public SNFLoginStep() {
		this.loginSNF = new SNFLoginFuncionalidade();

	}

	@Dado("^que estou logado no SNF com usuario \"([^\"]*)\"$")
	public void login(String usuario) {
		this.loginSNF.loginSNF(usuario);
	}

	@Dado("^utilizando o tipo de unidade \"([^\"]*)\" com a unidade \"([^\"]*)\"$")
	public void utilizandoOTipoDeUnidadeComAUnidade(String TipoUnidade, String Unidade) throws Throwable {
		this.loginSNF.SelecionarPerfil(TipoUnidade, Unidade);
	}
}
