package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fb_signup_page;
import io.github.bonigarcia.wdm.WebDriverManager;
  

public class Fb_signup_test  
{
	 WebDriver driver;
	 @BeforeTest
	   public void url()
	   {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/r.php?entry_point=login");
	   }

	  
	  @Test
	  public void test()
	  {
		   Fb_signup_page obj = new Fb_signup_page(driver);
		   obj.values();
		   obj.select();
		   obj.click();
	  }
	  
}

