package com.MyPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class MphasisWebsite {

	public WebDriver driver;
	public ExtentReports extent;
	
@Test
public void test() {
	
	}
@BeforeTest
public void openBrowser() {
	extent= new ExtentReports("",true);
	String baseurl="";
	test=extent.sta
}
}
