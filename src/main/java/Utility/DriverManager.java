package Utility;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	
	
public static  void initDriver() {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			 DriverInizilization.setDriver(driver);
			 DriverInizilization.getDriver().get(Config.TestUrl);
			System.out.println(DriverInizilization.getDriver());
		
		
	}
	
	
	public  static void quitDriver(WebDriver driver) {
		
		if(Objects.nonNull(driver)) {
			driver.quit();
		}
	}
	

	}

