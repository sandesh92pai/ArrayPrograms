package com.googly.tests;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo{
	
	
	@Test
	public void loginTest()
	{
//		String actual = driver.findElement(By.id("username")).getAttribute("placeholder");
//		System.out.println();
//		Assert.assertEquals(actual, "username");
//		System.out.println(driver.findElement(By.name("pwd")).getAttribute("placeholder"));	
		System.out.println(" Class A ");
		
	}
	
	
	@Test
	public void classB() {
		System.out.println(" Class A +");
	}

	
	
	@Test
	public void arraySorted() {
		
		int [] arr = {10,20,14,12,11};
		
	for (int i = 0; i < arr.length-1 ;i ++) {
	
		for (int j = 1; j < arr.length-1; j++) {
			if(arr[i]>arr[j]) {
				arr[i+1]=arr[j]+arr[i];
				arr[i]=arr[i+1]-arr[j];
				arr[i+1] = arr[i+1]-arr[i];
			}
		
		}
		
		
	}
	
	System.out.println(" length of arr " + arr.length );
	
	for (int j = 0; j < arr.length-1; j++) {
		System.out.println(arr[j]);
	}
		
	}
	
	

	
}
