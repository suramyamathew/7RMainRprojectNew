package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {

WebDriver driver;
WaitUtility wait=new WaitUtility();
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='text']")
WebElement username;
@FindBy(xpath="//input[@type='password']")
WebElement password;
@FindBy(xpath="//button[@type='submit']")
WebElement SignIn;
@FindBy(xpath="//p[text()='Dashboard']")
WebElement dashboard;

public LoginPage enterUsernameAndPassword(String usernamefield,String passwordfield)
{
	username.sendKeys(usernamefield);
	password.sendKeys(passwordfield);
	return this;
}

public HomePage SignInButton()
{
	
wait.elementToBeClicked(driver, SignIn);
SignIn.click();	
return new HomePage(driver);
}
public boolean isHomePageisDisplayed()
{
	return dashboard.isDisplayed();
}
}

