/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Test.BaseTest;

/**
 * @author Jyoti
 * 
 *  Home_Page releted All the locatores and the Methods are saved here
 *
 */
public class Home_Page extends BaseTest {
	@FindBy(linkText="Log in")
	 static WebElement Log_in;
	
	public Home_Page() {
		getBrowser();

	
		PageFactory.initElements(driver, this);
	}
	public void HomePge() {
		Log_in.click();
		
	}

}
