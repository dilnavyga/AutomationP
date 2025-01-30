package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Artof_testing 
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
	 driver.get("https://artoftesting.com/samplesiteforselenium#"); 
  }
  
  @Test
  public void test() throws InterruptedException
  {
	  Actions act = new Actions(driver);
	  WebElement automation = driver.findElement(By.xpath("//a[text()='Automation']//parent::li[1] "));
	  act.moveToElement(automation);
	  act.build().perform();
	  Thread.sleep(2000);
	  WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium Tutorial'][1] "));
	  selenium.click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
 	  String text = driver.findElement(By.xpath("//h1[starts-with(@class,'gb-headline')]")).getText();
	  Assert.assertEquals(text, "Sample Webpage for Automation Practice");
	   
  }
  
 
  @Test
  public void test1() throws InterruptedException
  {
	  
	  Actions act = new Actions(driver);
	  SoftAssert s = new SoftAssert();
	  boolean art = driver.findElement(By.xpath("//button[text()='Submit']")).isDisplayed();
	  s.assertTrue(art," not displayed");
	  s.assertAll();
	  WebElement link = driver.findElement(By.linkText("This is a link")); 	    
	  WebElement text = driver.findElement(By.xpath("//input[@id='fname']"));
	  text.sendKeys("Selenium");
	  //WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
	  //submit.click();
	  WebElement doubleclick = driver.findElement(By.xpath("//button[starts-with(@ondblclick,'generate')]"));
	  act.doubleClick(doubleclick);
	  act.build().perform();
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
	  WebElement radio = driver.findElement(By.xpath("//input[@id='female'] "));
	  radio.click();
	  WebElement automation = driver.findElement(By.xpath("//input[@class='Automation'] "));
	  automation.click();
	  WebElement performance = driver.findElement(By.xpath("//input[@class='Performance'] "));
	  performance.click();
	  Thread.sleep(2000);
	 	   
  }
   
  @Test
  public void test2() throws InterruptedException
  {
	  Actions act = new Actions(driver); 
	  WebElement dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown'] "));
	  Select drop = new Select(dropdown);
	  drop.selectByVisibleText("Manual Testing");
	  WebElement alert = driver.findElement(By.xpath("//button[text()='Generate Alert Box']"));
	  alert.click();
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  WebElement alert1 = driver.findElement(By.xpath("//div[@id='ConfirmBox']//child::button"));
	  alert.click();
	  driver.switchTo().alert().accept();
	  WebElement drag = driver.findElement(By.xpath("//img[@decoding='async']"));
	  WebElement drop_ = driver.findElement(By.xpath("//div[@id='targetDiv']"));
	  act.dragAndDrop(drag, drop_);
	  act.build().perform();
	  
	  
	  
  }
  
  
  
}
