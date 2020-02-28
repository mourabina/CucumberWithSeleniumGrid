package web.bean.enums;

import org.openqa.selenium.WebElement;

import web.bean.interfaces.GeracaoPedidosGERPDInterface;
import web.pages.GeracaoPedidosGERPDPage;

public enum GeracaoPedidosGERPDEnum implements GeracaoPedidosGERPDInterface {

	COMPRADOR("Comprador") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputComp();
		}
	},
	FORNEC("Fornec") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputForn();
		}
	},
	HR_EDI("HR Edi") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputHREDI();
		}
	},
	MOV("Mov") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputMov();
		}
	},
	OPCAO("Opcao") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputOpcao();
		}
	},
	PESQUISA("Pesquisa") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInpuPesqui();
		}
	},
	FILIAL("Filial") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputFlial();
		}
	},
	DIST("Dist") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputDist();
		}
	},
	REDESP("RedeSP") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputRedesp();
		}
	},
	FRT("Frt") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputFrete();
		}
	},
	TRANSP("Transp") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputCodTranspo();
		}
	},
	DATA_1("Data 1") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputDatas1();
		}
	},
	DATA_2("Data 2") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputDatas2();
		}
	},
	DATA_3("Data 3") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputDatas3();
		}
	},
	GRATIS("Gratis") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputGratis();
		}
	},
	CLASSIF_PED("Classif Ped") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputClassif();
		}
	},
	COD_PRZ("Cod Prz") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputIDPRZ();
		}
	},
	NOME_PRZ("Nome Prz") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputTextPRZ();
		}
	},
	CONTATO("Contato") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputCont();
		}
	},
	EVENTO("Evento") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputEVE();
		}
	},
	EMP("Emp") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputEmpre();
		}
	},
	ESTOC("Estoc") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputEstoc();
		}
	},
	OBS("Obs") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getInputObs();
		}
	},
	CODIGO_DO_PRODUTO("Codigo do Produto") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getCodItem();
		}
	},
	DESCRICAO_DO_PRODUTO("Descricao do Produto") {
		@Override
		public WebElement getElement(GeracaoPedidosGERPDPage geracaoPedidosGERPD) {
			return geracaoPedidosGERPD.getDescricaoItem();
		}
	};
	

	GeracaoPedidosGERPDEnum(String s) {

	}

}
