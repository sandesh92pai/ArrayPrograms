package com.googly.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.DriverInizilization;
import Utility.DriverManager;

public class baseTest {
	
	
	@BeforeMethod
	public void openApp()
	{
		DriverManager.initDriver();
	}

	
	@AfterMethod
	public void closeApp()
	{
		System.out.println(" Insisde after method ");
		DriverManager.quitDriver(DriverInizilization.getDriver());
	}

}
