package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	public void sendKeysForFileUpload(WebElement element,String path)
	{
	element.sendKeys(path);	
	}

	public void robotClassFileUpload(WebElement element,String path) throws AWTException
	{
		element.click();
		StringSelection s=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//path copy to click board
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);//to paste the path//key event is class name and variable name is vk_control//vk-virtual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);//paste item release
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
