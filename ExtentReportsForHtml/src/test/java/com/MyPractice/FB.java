package com.MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FB {
	
	
	@Test
	
	public void loginTest() {
		
	
  System.setProperty("webdriver.chrome.driver","\\D:\\Jyoti\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/login/");
  driver.findElement(By.id("email")).sendKeys("8087172015");
  driver.findElement(By.id("pass")).sendKeys("Nanda@123");
driver.findElement(By.name("login")).click();

	}

}
