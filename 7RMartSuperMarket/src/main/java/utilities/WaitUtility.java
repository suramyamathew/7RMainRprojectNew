package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	public void elementToBeClicked(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void elementToBeSelected(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void invisibilityOfElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void alertIsPresent(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void textToBePresentInElement(WebDriver driver,WebElement element,String text)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	public void attributeToBe(WebDriver driver,WebElement element,String attribute,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));	
	}
	
	public void visibilityOfElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}