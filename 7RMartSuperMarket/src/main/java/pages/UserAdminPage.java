package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.PageUtility;

public class UserAdminPage {
	WebDriver driver;
	PageUtility utility=new PageUtility();
	
public  UserAdminPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
WebElement moreinfobutton;
@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
WebElement newbutton;
@FindBy(xpath = "//input[@id='username']")
WebElement username;
@FindBy(xpath = "//input[@type='password']")
WebElement password;
@FindBy(xpath = "(//select[@class='form-control'])[2]")
WebElement usertype;
@FindBy(xpath = "//button[@name='Create']")
WebElement save;
@FindBy(xpath = "//h5[text()='Alert']")
WebElement alert;
@FindBy(xpath = "//button[@class='close']")
WebElement alertclose;


public void moreinfobutton() 
{
	  moreinfobutton.click();
}
public UserAdminPage newbutton()
{
	  newbutton.click();
	  return this;
}


public UserAdminPage enterUsernameAndPasswordForNewUser(String usernamefield,String passwordfield) 
{
    username.sendKeys(usernamefield);
    password.sendKeys(passwordfield);
    return this;
}
public UserAdminPage userTypeDropdown()
{
	
   utility.selectByIndex(usertype,2);
   return this;
}

public UserAdminPage savebutton()
{
	  save.click();
	  return this;
}
public boolean alert()
{
	return alert.isDisplayed();
	
}
public void alertClose()
{
	alertclose.click();
}
}