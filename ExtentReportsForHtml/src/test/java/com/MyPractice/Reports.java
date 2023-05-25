package com.MyPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

@Test
public class Reports {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void verifyPage() {
		
	}
	@BeforeTest
	 public void openBrowser() {
		
		extent = new ExtentReports("",true);
	}

}
