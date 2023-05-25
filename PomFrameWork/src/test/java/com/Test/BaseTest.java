/**
 * 
 */
package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Jyoti
 *
 */
public class BaseTest {

	public static WebDriver driver=null;
	public static void getBrowser() {
		  System.setProperty("webdriver.chrome.driver","\\D:\\Jyoti\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
