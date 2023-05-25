/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Test.BaseTest;

/**
 * @author jyoti
 * 
 *  releted to login page All the methods AND xpath are stored here
 *
 */
public class Login_Page extends BaseTest{
	
	@FindBy(xpath="//input[@id='Email']")
	static WebElement Username;
	
	@FindBy(xpath="//input[@id='Password']")
	static WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	static WebElement login;
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
public void TypeUsername() {
	Username.sendKeys("jyotigaikwad");
}
public void TypePassword() {
	Password.sendKeys("Jyoti@123");
}
public void login_Btn() {
	login.click();
}
}
