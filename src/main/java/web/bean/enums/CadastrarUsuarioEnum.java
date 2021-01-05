package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.NovoUsuario;
import web.pages.CadastrarUsuarioPage;

public enum CadastrarUsuarioEnum implements NovoUsuario {
	
	NOME("Nome"){
		@Override
		public WebElement getElement(CadastrarUsuarioPage cadastrarUsuarioPage) {
			return cadastrarUsuarioPage.getNomeUsuario();
		}
		
	},
	SENHA("Senha"){
		@Override
		public WebElement getElement(CadastrarUsuarioPage cadastrarUsuarioPage) {
			return cadastrarUsuarioPage.getSenhaUsuario();
		}
		
	},
	EMAIL("Email"){
		@Override
		public WebElement getElement(CadastrarUsuarioPage cadastrarUsuarioPage) {
			return cadastrarUsuarioPage.getEmailUsuario();
		}
		
	};
	
	private CadastrarUsuarioEnum(String s) {
		
	}
	

}
