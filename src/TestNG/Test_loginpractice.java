package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_loginpractice 
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
	 driver.get("https://practicetestautomation.com/practice-test-login/"); 
  }  
  
  @Test
  public void test()
  {
	  WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
	  user.sendKeys("student");
	  
	  WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
	  pswd.sendKeys("Password123");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	  submit.click();
	 
	  
	  String url = driver.getPageSource();
	  if(url.contains("https://practicetestautomation.com/logged-in-successfully/"))
	  {
		  System.out.println("True");
	  }
	  else
	  {
		  System.out.println("false"); 
	  }
	  
	  
	  String page = driver.getPageSource();
	  if(page.contains("Congratulations' or 'successfully logged in"))
	  {
	  System.out.println("Contains the text");
	  }
	  else
	  {
		 System.out.println("Does not contain the test"); 
	  }
	  
	  SoftAssert s = new SoftAssert();
	  boolean button = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
	  s.assertTrue(button, "Button is present");
	  s.assertAll();
	  driver.navigate().back();
		  
  }
  
  @Test
  public void test1()
  {
	  WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
	  user.sendKeys(" incorrectUser");
	  
	  WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
	  pswd.sendKeys("Password123");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	  submit.click();
	  
	  String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
	  Assert.assertEquals(text, "Your username is invalid!") ;
	   
	  driver.navigate().back();
  }
  
  @Test
  public void test2()
  {
	  WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
	  user.sendKeys("student");
	  
	  WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
	  pswd.sendKeys("Password");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	  submit.click();
	  
	  String text = driver.findElement(By.xpath("//div[@id='error']")).getText(); 
	  Assert.assertEquals(text, "Your password is invalid!");
}
}
