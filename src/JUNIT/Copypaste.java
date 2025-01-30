package JUNIT;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copypaste 
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
   public void copypaste()
   {
	  Actions act = new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebElement email = driver.findElement(By.xpath(""));
	  email.sendKeys("");
	  WebElement pswd = driver.findElement(By.xpath(""));
	  act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(email,Keys.CONTROL);
	  act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(email,Keys.CONTROL);
	  act.keyDown(pswd,Keys.CONTROL).sendKeys("v").keyUp(pswd,Keys.CONTROL);
	  act.build().perform();
	  
   }
}
