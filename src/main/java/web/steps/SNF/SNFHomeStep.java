package web.steps.SNF;

import commons.funcionalidade.waitLoading;
import io.cucumber.java.pt.Dado;
import web.funcionalidade.SNF.SNFHomeFuncionalidade;

public class SNFHomeStep {
	private SNFHomeFuncionalidade Home;
	private waitLoading wl;

	public SNFHomeStep() {
		this.Home = new SNFHomeFuncionalidade();
		this.wl = new waitLoading();
	}

	@Dado("^Acesso a tela Fornecedor NF$")
	public void acessoATelaFornecedorNF() throws Throwable {
		this.Home.acessarFornecedorNF();
	}

	@Dado("^Acesso a tela \"([^\"]*)\" > \"([^\"]*)\"$")
	public void acessoATela(String menu, String subMenu) throws InterruptedException {
		this.Home.AcessaMenu(menu);
		this.Home.AcessaMenu(subMenu);
	}


	@Dado("^Acesso a tela \"([^\"]*)\" > \"([^\"]*)\" > \"([^\"]*)\"$")
	public void acessoATela(String 	menu, String subMenu, String subMenu2) throws Throwable {
		this.Home.AcessaMenu(menu);
		this.Home.AcessaMenu(subMenu);
		this.Home.AcessaMenu(subMenu2);
	}

	@Dado("^Acesso a tela \"([^\"]*)\" > \"([^\"]*)\" > \"([^\"]*)\" > \"([^\"]*)\"$")
	public void acessoATela(String 	menu, String subMenu, String subMenu2, String action) throws Throwable {
		this.Home.AcessaMenu(menu);
		this.Home.AcessaMenu(subMenu);
		this.Home.AcessaMenu(subMenu2);
		this.Home.AcessaMenu(action);
		this.wl.loading();
	}
}
