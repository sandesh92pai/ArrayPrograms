package googlyautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.CommonUtilsClass;
import Utility.Config;
import Utility.DriverInizilization;

public class HomePageObjects extends CommonUtilsClass{
	
	WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//nav[@id='nav']//li[1]")
	private WebElement mobileLink;
	
	@FindBy(xpath = "//nav[@id='nav']//li[2]")
	private WebElement tvLink;
	
	
	public void clickOnMobileLink() {
		clickOnElement(mobileLink);
	}
	
	public void navigate_To_url() {
		DriverInizilization.getDriver().get(Config.TestUrl);
	}
	
	public void clickOnTVLink() {
		clickOnElement(tvLink);
	}

}
