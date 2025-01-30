package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_path 
{
	 WebDriver driver;
	  
	  @BeforeTest
	  public void browser()
	  {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
	  }
	  
	  @BeforeMethod
	  public void url()
	  {
		 driver.get("https://www.facebook.com/"); 
	  }
	  
	  @Test
	  public void input()
	  {
		  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("document.querySelector(\"#email\")", email);
		  email.sendKeys("Vyga");
		  
		  WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
		  js.executeScript("document.querySelector(\"#pass\")", pswd);
		  pswd.sendKeys("vygadilna");
		  
		  WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		  js.executeScript("document.querySelector(\"#u_0_5_C4\")", submit);
		  submit.click();

		  
		  		  
		  
		  
	  }

}
