package com.test;

import org.testng.annotations.Test;

import com.page.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver d;
	HomePage h;
  @Test
  public void f() {
h.Our_Approach();

}
  @BeforeTest
  public void beforeTest() {
	  h=new HomePage();
  }

}
