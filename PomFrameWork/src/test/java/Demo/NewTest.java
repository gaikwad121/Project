package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class NewTest {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver","\\D:\\Jyoti\\chromedriver_win32\\chromedriver.exe");

	  final WebDriver driver = new ChromeDriver();

		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");

		WebElement ele= driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button"));
		ele.click();

		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement div=wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				WebElement e=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				if(e.getText().equals("Software Testing Material - DEMO PAGE"))
				{
					System.out.println(e.getText());
					return e;
				}
				else
				{
					System.out.println("Not found");
					return null;
				}
			}
		});
	}


  }

