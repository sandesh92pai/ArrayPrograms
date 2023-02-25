package com.googly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.DriverInizilization;
import Utility.DriverManager;
import googlyautomation.HomePageObjects;

public class LoginPage extends baseTest
{
	
	@Test
	public void navigate_To_Mobilepage() {
		HomePageObjects hompage = new  HomePageObjects(DriverInizilization.getDriver());
		hompage.clickOnMobileLink();
		System.out.println(DriverInizilization.getDriver().getTitle());
		Assert.assertEquals(DriverInizilization.getDriver().getTitle(), "Mobile");
	}
	
	

	@Test
	public void navigate_To_TVpage() {
		HomePageObjects hompage = new  HomePageObjects(DriverInizilization.getDriver());
		hompage.clickOnTVLink();
		System.out.println(DriverInizilization.getDriver().getTitle());
		Assert.assertEquals(DriverInizilization.getDriver().getTitle(), "TV");
	}
	
	
}
