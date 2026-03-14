package testscript;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewPageTest extends Base{
	HomePage homepage;
	ManageNewsPage newspage;
	
  @Test
  public void verifyANewsMessageGotAdded() throws IOException 
  {
      LoginPage login = new LoginPage(driver);
      String username = ExcelUtilities.getStringData(2, 0, "LoginPageTest");
      String password = ExcelUtilities.getStringData(2, 1, "LoginPageTest");

      login.enterUsernameAndPassword(username, password);
      homepage = login.SignInButton();
      newspage = homepage.moreInfoButtonNews();
      newspage.newButton().enterNews("Hi.").saveButton();
  }
}