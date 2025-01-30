package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam 
{
  WebDriver driver;
  
  @BeforeTest
  public void browser()
  {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
  }
  
  @BeforeMethod
  public void url()
  {
	 driver.get("https://demo.automationtesting.in/Index.html"); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test
  public void test() throws InterruptedException
  {
	 Actions act = new Actions(driver);
	 WebElement click = driver.findElement(By.xpath("//img[@id='enterimg']"));
	 click.click();
	 WebElement switch_ = driver.findElement(By.xpath("//a[text()='SwitchTo']")); 
	 act.moveToElement(switch_);
	 act.build().perform();
	 
	 WebElement frame = driver.findElement(By.xpath("//a[text()='Frames']"));
	 frame.click();
	 WebElement sframe = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
	 sframe.click();
	 WebElement iframe = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
	 driver.switchTo().frame(iframe); 
	 WebElement text = driver.findElement(By.xpath("//input[@type='text'][1]"));
	 text.sendKeys("Vyga");	
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
	 WebElement mframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	 mframe.click();
	 WebElement iframe1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	 driver.switchTo().frame(iframe1); 
	 WebElement iframe2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	 driver.switchTo().frame(iframe2);
	 WebElement text1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
	 text1.sendKeys("Vygasasi");
	 driver.switchTo().defaultContent();
	 
	  
	  
	 
	
  }
}
