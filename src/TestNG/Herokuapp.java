package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Herokuapp 
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
	 driver.get("https://the-internet.herokuapp.com/"); 
  }
  
  @Test
  public void checkbox() throws InterruptedException
  {
	  WebElement ckeckclick = driver.findElement(By.xpath("//a[text()='Checkboxes']"));
	  ckeckclick.click();
	  WebElement ckeck = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
	  ckeck.click();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void context() throws InterruptedException
  {
	  Actions act = new Actions(driver); 
	  WebElement context = driver.findElement(By.xpath("//a[text()='Context Menu']"));
	  context.click(); 
	  WebElement click = driver.findElement(By.xpath("//div[@id='hot-spot']"));
	  act.contextClick(click);
	  act.build().perform();
	  driver.switchTo().alert().accept();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void dragdrop() throws InterruptedException
  {
	  Actions act = new Actions(driver); 
	  WebElement dragdrop = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
	  dragdrop.click();//div[@id='column-a']
	  WebElement drag  = driver.findElement(By.xpath("//div[@id='column-a']"));
	  WebElement drop  = driver.findElement(By.xpath("//div[@id='column-b']"));
	  act.dragAndDrop(drag,drop);
	  act.build().perform();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  
  @Test
  public void dropdown() throws InterruptedException
  {
	  WebElement dropdwon = driver.findElement(By.xpath("//a[text()='Dropdown']"));
	  dropdwon.click();
	  WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown']"));
	  Select drop_ = new Select(drop);
	  drop_.selectByVisibleText("Option 1");
	  Thread.sleep(2000);
	  
  }
  
   @AfterTest
   public void quit()
   {
	 driver.quit();  
   }
  
  
  
  
}
