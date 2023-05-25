/**
 * 
 */
package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.Home_Page;
import com.Pages.Login_Page;

/**
 * @author Jyoti
 *
 *
 * LoginTest releted All the test are saved here
 */
 
public class LoginTest extends BaseTest{
	
	WebDriver d;
	Home_Page h;
	Login_Page l;
	@Test
	public void test() {
		h.HomePge();
		l.TypePassword();
		l.TypeUsername();
		l.login_Btn();
	}
@BeforeTest
public void beforetest() {
	h=new Home_Page();
	l=new Login_Page();
}
}
