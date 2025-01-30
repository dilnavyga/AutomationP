package JUNIT; //https://demoqa.com/alerts

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert 
{
  WebDriver driver;
  
  @Before
  public void start()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/alerts");
  }
  
  @Test
  public void alert()
  {
	 Actions act = new Actions(driver);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebElement click = driver.findElement(By.xpath(""));
	 act.click(click);
	 act.build().perform();
	 driver.switchTo().alert().accept();
	 
	 WebElement click1 = driver.findElement(By.xpath(""));
	 act.click(click1);
	 act.build().perform();
	 driver.switchTo().alert().accept();
	 
	 WebElement prompt = driver.findElement(By.xpath(""));
	 act.click(prompt);
	 act.build().perform();
	 org.openqa.selenium.Alert a = driver.switchTo().alert();
	 String text = a.getText();
	 System.out.println(text);
	 a.sendKeys("vyga");
	 a.accept();
	 
	 
	 
  }
}
