package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver d;
	
	@Test
	public void testLogin() {
		 System.setProperty("webdriver.chrome.driver","\\D:\\Jyoti\\chromedriver_win32\\chromedriver.exe");
     d= new ChromeDriver();
     d.get("https://demowebshop.tricentis.com/");
     d.findElement(By.linkText("Log in")).click();
	 d.findElement(By.id("Email")).sendKeys("jg.jyotigaikwad121@gmail.com");
	 d.findElement(By.id("Password")).sendKeys("Jyoti@123");
	 d.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
