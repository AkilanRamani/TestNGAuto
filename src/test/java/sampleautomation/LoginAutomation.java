package sampleautomation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {
	
	
	
	     @Test(threadPoolSize = 3, invocationCount = 3)
		 public static void fluentWaitMethod(){
				System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
				driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
				
				
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

				WebElement element = wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						WebElement element = driver.findElement(By.xpath("//a[@id=\"myAnchor\"]"));
						if(element.isDisplayed()){
							return element;
						}else{
							System.out.println("FluentWait Failed");
							return null;
						}
					}
				});
				element.click();
				driver.quit();
			}

		
		}
	 
	     


