package pages;

import java.awt.AWTException;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;

public class ManageCategoryPage {
	  WebDriver driver;
	 FileUploadUtility file=new FileUploadUtility();

	    public ManageCategoryPage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }


	    @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	    WebElement newbutton;

	    @FindBy(xpath = "//input[@id='category']")
	    WebElement category;

	    @FindBy(id = "134-selectable")
	    WebElement discount;

	    @FindBy(id = "main_img")
	    WebElement choosefile;


	    @FindBy(xpath = "//input[@value='no'])[1]")
	    WebElement topmenu_no;

	    @FindBy(xpath = "//button[@class='btn btn-danger']")
	    WebElement save;
	    
	    public ManageCategoryPage newButton() {
	        newbutton.click();
	        return this;
	    }

	    public ManageCategoryPage categoryBox(String field) {
	        category.sendKeys(field);
	        return this;
	    }

	    public ManageCategoryPage discountButton() {
	        discount.click();
	        return this;
	    }
	    

	    public ManageCategoryPage chooseFileButton() {
	    	file.sendKeysForFileUpload(choosefile,Constant.TESTIMAGE);
	        //choosefile.sendKeys(Constant.TESTIMAGE);
	        return this;
	    }

	    public ManageCategoryPage topMenuNoButton() {
	        topmenu_no.click();
	        return this;
	    }

	    public ManageCategoryPage saveButton() {
	        save.click();
	        return this;
	    }
	    public ManageCategoryPage scrollDownAction() {
	        JavascriptExecutor script = (JavascriptExecutor) driver;
	        script.executeScript("window.scrollBy(0,5000)", "");
	        return this;
	    }
	    public ManageCategoryPage delayByRobotClass() throws AWTException {
	        Robot robot = new Robot();
	        robot.delay(5000);
	        return this;
	    }

		public boolean isAlertDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}
}
