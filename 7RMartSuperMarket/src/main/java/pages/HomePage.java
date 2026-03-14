package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	WebElement logout;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfoadmin;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement moreinfocategory;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfonews;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	WebElement moreinfofooter;

	public HomePage adminButton() {
		admin.click();
		return this;
	}

	public HomePage logoutButton() {
		logout.click();
		return this;
	}

	public UserAdminPage moreInfoButtonAdmin() {
		moreinfoadmin.click();
		return new UserAdminPage(driver);
	}

	public ManageCategoryPage moreInfoButtonCategory() {
		wait.visibilityOfElement(driver, moreinfocategory);
		moreinfocategory.click();
		return new ManageCategoryPage(driver);
	}
public ManageNewsPage moreInfoButtonNews()
{
	moreinfonews.click();
	return new ManageNewsPage(driver);
	}

	public HomePage scrollDownActionToMoreInfoCategoryButton() {
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].scrollIntoView(true);", moreinfocategory);
		wait.elementToBeClicked(driver, moreinfocategory);
		return this;
	}

}


