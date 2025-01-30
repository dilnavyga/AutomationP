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

public class Aassertnew 
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
  public void test()
  {
	 SoftAssert s = new SoftAssert() ;
	 boolean logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	 s.assertTrue(logo);
	 s.assertAll();
  }
  
  @Test
  public void title()
  {
	  SoftAssert s = new SoftAssert();
	  String expectedtitle = "instagram";
	  String actualtitle = driver.getTitle();
	  s.assertEquals(expectedtitle, actualtitle, "title does not match");
	  s.assertAll();
	  
  }
  @Test
  public void nulll()
  {
	  SoftAssert s = new SoftAssert();
	  WebElement nulll = driver.findElement(By.xpath("//input[@name='pass']"));
	  s.assertNull(nulll ,"field is not null");
	  s.assertAll();
	  
  }
  
}
