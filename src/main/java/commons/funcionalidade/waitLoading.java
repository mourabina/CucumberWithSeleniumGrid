package commons.funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.BaseTest;
import commons.SeleniumRobot;
import web.pages.SNF.SNFComponentesPage;

public class waitLoading extends BaseTest {
	private SNFComponentesPage componentes;

	public waitLoading() {
		this.componentes = new SNFComponentesPage(webDriver);
	}

	public void loading() {
		shortWait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(this.componentes.getLoadingIcon()),
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[contains(@class,\"fa-spin\")]"))));
		if (SeleniumRobot.existElementWeb("//i[contains(@class,\"fa-spin\")]")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[contains(@class,\"fa-spin\")]")));
		}

	}

}
