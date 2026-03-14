package testscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.LoginPage;

public class LoginPageTest extends Base{
  @Test
  @Parameters({"username","password"})
  public void  verifyValidCorrectUsernameAndPassword(String username,String password)
  {
	  LoginPage page = new LoginPage(driver);
	  page.enterUsernameAndPassword(username,password);
	  page.SignInButton();  
	  boolean homepageisdisplayed=page.isHomePageisDisplayed();
	  Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);
  }

@Test(groups="smoke")
public void verifyValidCorrectUsernameAndIncorrectPassword()
{
	LoginPage page = new LoginPage(driver);
	  page.enterUsernameAndPassword("admin", "carol");
	  page.SignInButton();
	  boolean homepageisdisplayed=page.isHomePageisDisplayed();
	  Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);
}

@Test(groups="smoke")
public void verifyValidInCorrectUsernameAndPassword()
{
	LoginPage page = new LoginPage(driver);
	  page.enterUsernameAndPassword("admin", "admin");
	  page.SignInButton();
	  boolean homepageisdisplayed=page.isHomePageisDisplayed();
	  Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);
}
//using data provider
@Test(dataProvider = "credentials")
public void verifyValidInCorrectUsernameAndIncorrectPassword(String username,String password) 
{
	LoginPage page = new LoginPage(driver);
	  page.enterUsernameAndPassword(username, password);
	  page.SignInButton();
	  boolean homepageisdisplayed=page.isHomePageisDisplayed();
	  Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);
	  
}
@DataProvider(name="credentials")
public Object testdata()
{
	  Object data[][]= {{"admin","admin"},{"ann","admin"},{"admin","1q2r5e4r"}};
	  return data;
}
}


