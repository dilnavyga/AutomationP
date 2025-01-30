package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert 
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
	    public void title()
	    {
	    	String expectedTitle = "instagram" ; 
	    	String actualTitle = driver.getTitle();
	    	org.testng.Assert.assertEquals(actualTitle, expectedTitle,"Page title doesn't match");
	    	
	    }
	   
	  @Test
	   public void dispaly()
	   {
		   Boolean logo = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div/div/div[1]/div/img")).isDisplayed();
		   org.testng.Assert.assertTrue(logo, "logo is not displayed"); 
	   }
	    
	   
	   @Test
	   public void null_()
	   {
		   WebElement nulll = driver.findElement(By.xpath("//input[@id='email']"));
		   org.testng.Assert.assertNull(nulll, "Element is not null");
	   }
	   
 }

