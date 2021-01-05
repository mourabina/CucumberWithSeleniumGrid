package commons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumRobot extends BaseTest{

	public void implicitlyWait(Long timeOut) {
		getwebDriver().manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		
	}

	/**
	 * espera uma lista de elemento ser visivel
	 * 
	 * @param elements
	 */
	public static void explicityAllWait(List<WebElement> elements) {

		wait.until(ExpectedConditions.visibilityOfAllElements(elements));

	}

	/**
	 * espera o elemento ser clicavel
	 * 
	 * @param element
	 */
	public static void waitElementoTobeClick(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	/**
	 * valida se existe um elemento na parte web
	 * 
	 * @param xpath
	 * @return true or false
	 */
	public boolean existElementWeb(String xpath) {

		return getwebDriver().findElements(By.xpath(xpath)).size() != 0;

	}

	/**
	 * o metodo faz uma simulação de double click
	 * 
	 * @param element
	 */
	public void DoubleClickWeb(WebElement element) {
		Actions DoubleClick = new Actions(getwebDriver());
		DoubleClick.doubleClick(element).build().perform();
	}

	/**
	 * faz um foco no elemente que deseja e insere um texto
	 * 
	 * @param element
	 * @param texto
	 */
	public void escrever(WebElement element, String texto) {
		Actions actions = new Actions(getwebDriver());
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys(texto).build().perform();
	}

	/**
	 * move até o elemento esperado
	 * 
	 * @param element
	 */
	public void MoveToElementWeb(WebElement element) {
		Actions MoveToElement = new Actions(getwebDriver());
		MoveToElement.moveToElement(element).perform();
	}

	/**
	 * valida se existe os elementos
	 * 
	 * @param element
	 */
	public static void waitElementExists(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * retorna a quantidade de elementos
	 * 
	 * @param element
	 * @return quantidade
	 */
	public int countElements(String element) {
		return getwebDriver().findElements(By.xpath(element)).size();
	}

	/**
	 * espera o elemento ser visível
	 * 
	 * @param element
	 */
	public static void waitElementInvisibility(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void waitElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * espera o elemento invisivel ser clicavel
	 * 
	 * @param xpath
	 */
	public static void waitElementInvisible(String xpath) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}

	/**
	 * 
	 * @param rolagem
	 */
	public void scroll(int rolagem) {
		JavascriptExecutor jse = (JavascriptExecutor) getwebDriver() ;
		jse.executeScript("window.scrollBy(0," + rolagem + ")", "");
	}

	

}
