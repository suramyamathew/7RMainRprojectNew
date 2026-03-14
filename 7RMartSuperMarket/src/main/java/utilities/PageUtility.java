package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility
{
	WebDriver driver;
	public void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
public void selectByVisibleText(WebElement element,String text)
{
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
public void dragAndDropByAction(WebElement dragelement,WebElement dropelement)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(dragelement, dropelement);
	}
public void doubleClickByAction(WebElement element)
{
	Actions action=new Actions(driver);
	action.doubleClick(element).perform();
}
public void moveToElementByAction(WebElement element)
{
	Actions action=new Actions(driver);
	action.moveToElement(element).click();
}
public void selectByCalue(WebElement element,String value)
{
	Select select=new Select(element);
	select.selectByValue(value);
}
}


