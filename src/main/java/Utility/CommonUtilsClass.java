package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilsClass {
	
	
	
	public void clickOnElement(WebElement element) {
//	waitForElementClickable(element);
		element.click();
	}
	
	
	public void waitForElementClickable(WebElement element) {
		new WebDriverWait(DriverInizilization.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	

}
