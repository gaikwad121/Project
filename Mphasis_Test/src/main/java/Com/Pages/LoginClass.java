package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	WebDriver d;
	
	// in this class we save all the locators and methods of login page
	By Username=By.xpath("//input[@id=\"email\"]");
	By Password= By.xpath("//input[@id=\"pass\"]");
	By Login=By.name("login");
	
	public LoginClass(WebDriver d) {
		this.d=d;
		
	}
	public void typeUsername() {
		d.findElement(Username).sendKeys("Jyoti");

}
	
	public void typePassword() {
		d.findElement(Password).sendKeys("Jyoti@123");

		
	}
	public void Clicklogin() {
		d.findElement(Login).click();
		
		
	}
	}
