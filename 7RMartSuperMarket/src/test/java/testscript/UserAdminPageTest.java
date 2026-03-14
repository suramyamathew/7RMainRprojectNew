package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.UserAdminPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class UserAdminPageTest extends Base{
	HomePage homePage;
	UserAdminPage adminpage;
	FakerUtility faker=new FakerUtility();
	
  @Test
  public void verifyAdminInfo() throws IOException
  {
	  LoginPage login=new  LoginPage(driver);
	  String username = ExcelUtilities.getStringData(1, 0, "AdminUserPageTest");
      String password = ExcelUtilities.getStringData(1, 1, "AdminUserPageTest");
	  login.enterUsernameAndPassword(username,password);
	  homePage= login.SignInButton();
	  adminpage = homePage.moreInfoButtonAdmin();
	  String adminname=faker.getFakeFirstName();
	  String adminpassword=faker.getPassword();
	  adminpage.newbutton().enterUsernameAndPasswordForNewUser(adminname, adminpassword).userTypeDropdown().newbutton();
	 /* login.SignInButton();
	  AdminUserPageSuperMarket new admin info=new AdminUserPageSuperMarket(driver);
	  newadmininfo.moreinfobutton();
	  newadmininfo.newbutton();
	  newadmininfo.addNewUser();
	  newadmininfo.savebutton();*/
	  
	  boolean IsAlertDisplayed = adminpage.alert();
      Assert.assertTrue(IsAlertDisplayed, Constant.ERRORMESSAGEFORALERT);
      //adminpage.alertClose();
  }
}
