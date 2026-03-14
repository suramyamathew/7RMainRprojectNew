package testscript;

import java.awt.AWTException;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class ManageCategoryPageTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategorypage;
	FakerUtility faker=new FakerUtility();
  @Test
  public void verifyANewCategoryGotAdded() throws IOException,AWTException
  {
	LoginPage login=new LoginPage(driver);
	String username=ExcelUtilities.getStringData(2, 0,"LoginPageTest");
	String password=ExcelUtilities.getStringData(2, 1,"LoginPageTest");
	login.enterUsernameAndPassword(username, password);
	homepage = login.SignInButton();
	homepage.moreInfoButtonAdmin();
	managecategorypage.chooseFileButton();
	managecategorypage.scrollDownAction();
	managecategorypage.topMenuNoButton();
	managecategorypage.topMenuNoButton().saveButton();
	boolean IsAlertDisplayed=managecategorypage.isAlertDisplayed();
	Assert.assertTrue(IsAlertDisplayed,Constant.ERRORMESSAGEFORALERT);
	
	
	
	
  }
}
