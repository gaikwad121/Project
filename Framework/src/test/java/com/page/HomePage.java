package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.TestBase;

public class HomePage extends TestBase{
@FindBy(xpath="//a[text()='Our Approach']")

static WebElement Our_Approach;

@FindBy(xpath="//a[text()='Industries']")
static WebElement Industries;
public HomePage() {
	getBrowser();
	PageFactory.initElements(driver, this);
}
public void Our_Approach() {
	Our_Approach.click();
	System.out.println(Our_Approach.getText());
	Industries.click();
	System.out.println(Industries.getText());
}
}
