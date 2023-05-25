package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static void getBrowser() {
		  System.setProperty("webdriver.chrome.driver","\\D:\\Jyoti\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mphasis.com/home.html");
	}
	

}
