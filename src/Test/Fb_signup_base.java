package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_signup_base 
{
	 WebDriver driver;
	   
	   @BeforeTest
	   public void url()
	   {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/r.php?entry_point=login");
	   }
}
