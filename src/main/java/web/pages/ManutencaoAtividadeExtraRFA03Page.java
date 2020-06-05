package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManutencaoAtividadeExtraRFA03Page {

	@FindBy(id = "TL_USUDP")
	private WebElement usuario;
	
	@FindBy(id = "TL_DTTURNO")
	private WebElement dtTurno;
	
	@FindBy(id = "TL_TURNO")
	private WebElement turno;
	
	@FindBy(id = "TL_OPCAO")
	private WebElement opcao;
	
	@FindBy(id = "CHK_ACAO_checkbox")
	private WebElement turnoNormalAcao;
	
	@FindBy(id = "TL_DTINI")
	private WebElement turnoNormalDtInicial;
	
	@FindBy(id = "TL_HRINI")
	private WebElement turnoNormalHrInicial;
	
	@FindBy(id = "TL_DTFIM")
	private WebElement turnoNormalDtFim;
	
	@FindBy(id = "TL_HRFIM")
	private WebElement turnoNormalHrFim;
	
	@FindBy(id = "TL_SITUACAO")
	private WebElement sitTurno;
	
	@FindBy(id = "TL_CONF")
	private WebElement confirmacao;
	
	public ManutencaoAtividadeExtraRFA03Page(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getUsuario() {
		return usuario;
	}

	public WebElement getDtTurno() {
		return dtTurno;
	}

	public WebElement getTurno() {
		return turno;
	}

	public WebElement getOpcao() {
		return opcao;
	}

	public WebElement getTurnoNormalAcao() {
		return turnoNormalAcao;
	}

	public WebElement getTurnoNormalDtInicial() {
		return turnoNormalDtInicial;
	}

	public WebElement getTurnoNormalHrInicial() {
		return turnoNormalHrInicial;
	}

	public WebElement getTurnoNormalDtFim() {
		return turnoNormalDtFim;
	}

	public WebElement getTurnoNormalHrFim() {
		return turnoNormalHrFim;
	}

	public WebElement getSitTurno() {
		return sitTurno;
	}

	public WebElement getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(WebElement confirmacao) {
		this.confirmacao = confirmacao;
	}

	public void setUsuario(WebElement usuario) {
		this.usuario = usuario;
	}

	public void setDtTurno(WebElement dtTurno) {
		this.dtTurno = dtTurno;
	}

	public void setTurno(WebElement turno) {
		this.turno = turno;
	}

	public void setOpcao(WebElement opcao) {
		this.opcao = opcao;
	}

	public void setTurnoNormalAcao(WebElement turnoNormalAcao) {
		this.turnoNormalAcao = turnoNormalAcao;
	}

	public void setTurnoNormalDtInicial(WebElement turnoNormalDtInicial) {
		this.turnoNormalDtInicial = turnoNormalDtInicial;
	}

	public void setTurnoNormalHrInicial(WebElement turnoNormalHrInicial) {
		this.turnoNormalHrInicial = turnoNormalHrInicial;
	}

	public void setTurnoNormalDtFim(WebElement turnoNormalDtFim) {
		this.turnoNormalDtFim = turnoNormalDtFim;
	}

	public void setTurnoNormalHrFim(WebElement turnoNormalHrFim) {
		this.turnoNormalHrFim = turnoNormalHrFim;
	}

	public void setSitTurno(WebElement sitTurno) {
		this.sitTurno = sitTurno;
	}	
}
