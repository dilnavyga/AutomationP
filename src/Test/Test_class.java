package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Pom_pageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_class 
{
  WebDriver driver;
  
  @BeforeTest
  public void url()
  {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/login.php/");
  }
  
  @Test
  public void test()
  {
	  Pom_pageclass obj = new Pom_pageclass(driver);
	  obj.values();
	  obj.click();
  }
}
