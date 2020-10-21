
package web.steps.SNF;

import org.junit.Assert;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import web.funcionalidade.SNF.SNFVisualizarNFFuncionalidade;

public class SNFVisualizarNFStep {

	private SNFVisualizarNFFuncionalidade visualizarNF;

	public SNFVisualizarNFStep() {
		this.visualizarNF = new SNFVisualizarNFFuncionalidade();
	}

	@Quando("^preencher o campo \"([^\"]*)\" com (\\d+) numeros \\(Visualizar NF\\)$")
	public void preencherCampoNumericoQtdeVNF(String campo, int qtde) {
		this.visualizarNF.preencherCampoNumericoQtde(campo, qtde);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com letras \\(Visualizar NF\\)$")
	public void preenchoCampoComLetrasVNF(String campo) {
		this.visualizarNF.preencherCampoLetraVNF(campo);
	}

	@Quando("^seleciono o valor cpf no campo tipo documento$")
	public void selecionarCPF()  {
		this.visualizarNF.selecionarCPF();
	}

	@Quando("^preencho o campo \"([^\"]*)\" com letras e especiais\\(Visualizar NF\\)$")
	public void preencherCampoLetrasEspeciais(String campo) {
		this.visualizarNF.preencherCampoLetraEspeciaisVNF(campo);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Numeros \\(Visualizar NF\\)$")
	public void preenchimentoCampoNumeroVNF(String elem)  {
		this.visualizarNF.preencherCampoComNumeros(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com Caracteres Especiais \\(Visualizar NF\\)$")
	public void preenchimentoCampoCaracteresEspeciaisVNF(String elem)  {
		this.visualizarNF.preencherCampoCaracteresEspeciaisVNF(elem);
	}

	@Quando("^preencho o campo \"([^\"]*)\" com a Data Invalida \\(Visualizar NF\\)$")
	public void preenchimentoCampoDataInvalidaVNF(String elem)  {
		this.visualizarNF.preencherCampoDataIncorreta(elem);		
	}

	@Quando("^preencho o campo \"([^\"]*)\" Letras \\(Visualizar NF\\)$")
	public void preenchimentoCampoLetrasVNF(String elem)  {
		this.visualizarNF.preencherCampoLetraVNF(elem);
	}
	
	@Quando("^preencho o campo \"([^\"]*)\" com a Data Valida \\(Visualizar NF\\)$")
	public void preenchimentoCampoDataValidaVNF(String campo)  {
		this.visualizarNF.preencherCampoDataCorreta(campo);
	}
	
	@Quando("^efetuo uma pesquisa atraves do campo Unidade de Negocio e \"([^\"]*)\" com o valor \"([^\"]*)\" \\(Visualizar NF\\)$")
	public void pesquisaItensTelaVNF(String campo, String valor){
		this.visualizarNF.preencherCamposPesquisas(campo, valor);
	}

	@Entao("^o campo \"([^\"]*)\" nao deve estar vazio \\(ObterNfe\\)$")
	public void verificarCampoVazioObterNFE(String campo) throws Throwable {
		Assert.assertFalse("Campo esta vazio", this.visualizarNF.verificarCampoVazio(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve apresentar (\\d+) digitos \\(Visualizar NF\\)$")
	public void verificarQtdeCampo(String campo, int qtde) {
		Assert.assertEquals("Valor esperado não está igual ao atual", qtde,
				this.visualizarNF.obterValorNumericoRegex(campo).length());
	}

	@Entao("^o campo \"([^\"]*)\" deve estar vazio \\(Visualizar NF\\)$")
	public void verificarCampoVazioVNF(String campo) {
		Assert.assertTrue("Campo não está vazio", this.visualizarNF.verificarCampoVazio(campo));
	}

	@Entao("^o campo \"([^\"]*)\" deve estar com letras \\(Visualizar NF\\)$")
	public void verificarCampoLetras(String campo) {
		Assert.assertTrue("Campo não está com as letras", this.visualizarNF.verificarCampoLetra(campo));
	}

	@Quando("^preencho todos os campos da tela \\(Visualizar NF\\)$")
	public void preencherCamposVisualizar() {
		this.visualizarNF.preencherTodosCamposVNFe();
	}

	@Entao("^os campos devem estar vazios \\(Visualizar NF\\)$")
	public void validarCamposVaziosVNF() {
		Assert.assertTrue("Campo CNPJ não está vazio", this.visualizarNF.verificarCampoVazio("CNPJ"));
		Assert.assertTrue("Campo Nome do Fornecedor não está vazio", this.visualizarNF.verificarCampoVazio("Nome Fornecedor"));
		Assert.assertTrue("Campo Nota Fiscal não está vazio", this.visualizarNF.verificarCampoVazio("Nota Fiscal"));
		Assert.assertTrue("Campo Série não está vazio", this.visualizarNF.verificarCampoVazio("Serie"));
		Assert.assertTrue("Campo Numero Pedido não está vazio", this.visualizarNF.verificarCampoVazio("Numero Pedido"));
		Assert.assertTrue("Campo ID Nota Fiscal não está vazio", this.visualizarNF.verificarCampoVazio("ID Nota Fiscal"));
		Assert.assertTrue("Campo Número Loja não está vazio", this.visualizarNF.verificarCampoVazio("Numero Loja"));
		Assert.assertTrue("Campo Número Pedido não está vazio", this.visualizarNF.verificarCampoVazio("Numero Pedido"));
		Assert.assertTrue("Campo Data Agenda não está vazio", this.visualizarNF.verificarCampoVazio("Data Agenda"));	
	}
	
	@Entao("^deve ser apresentado o valor \"([^\"]*)\" no campo Data Rejeicao Inicio\\(Visualizar NF\\)$")
	public void verificarValorDataRejeicaoInicio(String elem)  {
		Assert.assertEquals(this.visualizarNF.pegarMensagemCampoDataRejeicaoInicio(), elem);
	}

	@Entao("^deve ser apresentado o valor \"([^\"]*)\" no campo Data Rejeicao fim\\(Visualizar NF\\)$")
	public void verificarValorDataRejeicaoFim(String elem)  {
		Assert.assertEquals(this.visualizarNF.pegarMensagemCampoDataRejeicaoFim(), elem);
	}

	@Entao("^deve ser apresentado o valor \"([^\"]*)\" no campo Data Emissao Fim\\(Visualizar NF\\)$")
	public void verificarValorDataEmissaoFim(String elem)  {
		Assert.assertEquals(this.visualizarNF.pegarMensagemCampoDataEmissaoFim(), elem);
	}

	@Entao("^o campo \"([^\"]*)\" nao deve estar vazio \\(Visualizar NF\\)$")
	public void verificarCampoVazio(String campo)  {
		Assert.assertFalse("Campo esta vazio", this.visualizarNF.verificarCampoVazio(campo));
	}

	@Entao("^deve ser apresentado o valor \"([^\"]*)\" no campo Data Emissao NF Inicio\\(Visualizar NF\\)$")
	public void validarCampoDataEmissao(String elem) throws Throwable {
		Assert.assertEquals(this.visualizarNF.pegarMensagemCampoDataEmissaoInicio(), elem);
	}

	@Entao("^o campo \"([^\"]*)\" deve conter o valor \"([^\"]*)\" no Grid de Resultado$")
	public void verificarCampoXValorGrid(String campo, String valor) {
		Assert.assertTrue(this.visualizarNF.pegarValirGridResultado(campo, valor));
		
	}

}
