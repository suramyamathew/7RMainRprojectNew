package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class HomePageTest extends Base {
	HomePage homepage;
  @Test(description = "Verify valid username and password gets logged out")
  public void verifyValidUsernameAndPasswordGetsLoggedOut() throws IOException
  {
	  String username = ExcelUtilities.getStringData(2, 0,"LoginPageTest");
	  String password = ExcelUtilities.getStringData(2, 1,"LoginPageTest");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword(username, password);
	  homepage = login.SignInButton();
	  homepage.adminButton().logoutButton(); //Page chaining
	  String expected = "Login | 7rmart supermarket";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected,Constant.ERRORMESSAGEFORHOMEPAGE);
  }
  }

