package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soft_assertion
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
		    SoftAssert s = new SoftAssert(); 
	    	String expectedTitle = "instagram" ;
	    	String actualTitle = driver.getTitle();
	    	s.assertEquals(actualTitle, expectedTitle, "Page title doesn't match");
	    	s.assertAll();
	    	
	    }
	   
	   @Test
	   public void logo()
	   {
		   SoftAssert s = new SoftAssert(); 
		   boolean logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		   s.assertTrue(logo, "logo is not displayed");
		   s.assertAll();
		   
	   }
	   
	   @Test
	   public void null_()
	   {
		   SoftAssert s = new SoftAssert(); 
		   WebElement nulll = driver.findElement(By.xpath("//input[@id='email']"));
		   s.assertNull(nulll, "Element is not null");
		   s.assertAll();
	   }
	   
	   
}
