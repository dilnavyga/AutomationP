package JUNIT;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown
{
   WebDriver driver;
   
   @Before
   public void start()
   {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("");
   }
   
   @Test
   public void dropdown()
   {
	 WebElement a = driver.findElement(By.xpath(""));
	 Select days = new Select(a);
	 days.selectByVisibleText("");
	 
   }
}
