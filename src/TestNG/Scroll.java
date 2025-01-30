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

public class Scroll 
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
		 driver.get("https://www.selenium.dev/selenium/web/alerts.html#"); 
		 driver.manage().window().maximize();
	  }
	  
/*	  @Test
	  public void test()
	  {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1000)");
		   
	  }
	  
	  @Test
	  public void test1()
	  {
		  WebElement element = driver.findElement(By.xpath("//a[contains(@id,'onunload')] "));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(false);", element);
	  }
	  */
	  @Test
	  public void test2()
	  {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  }
	  
	  
}
