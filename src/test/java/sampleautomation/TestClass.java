package sampleautomation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	WebDriver driver;

	  
	  
	  @Test
	  public void testSetUp() {
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	    driver.get("https://where-am-i.org/");
	    WebElement a = driver.findElement(By.xpath("//div[@class=\"subtitle\"]//preceding-sibling::div[@id=\"address\" and @class=\"datavalue\"]"));
	  String a1 =  a.getText();
	  System.out.print(a1);
	    driver.quit();
	  
}
}