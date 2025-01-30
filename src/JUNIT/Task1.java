package JUNIT;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 
{
  WebDriver driver;
  //https://magento.softwaretestingboard.com/
  //https://selectorshub.com/xpath-practice-page/
  
  @Before
  public void start()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("https://demoqa.com/elements");
	  	  
  }
  /*
  @Test
  public void text()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebElement text = driver.findElement(By.xpath("//span[text()='Text Box']"));
	  text.click();
	  WebElement fname = driver.findElement(By.xpath("//input[@id='userName']"));
	  fname.sendKeys("Vyga");
	  WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
	  email.sendKeys("vyga@gmail.com");
	  WebElement caddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	  caddress.sendKeys("Vatakara,Kozhikode");  
	  WebElement paddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	  paddress.sendKeys("Vatakara,Kozhikode");
	  WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div/button"));//button[text()='Submit']"
	  submit.click(); 
  }
  
  @Test
  public void Button()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  Actions act = new Actions(driver);
	  WebElement button = driver.findElement(By.xpath("//span[text()='Buttons']"));
	  button.click();
	  
	  WebElement doubleclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/button"));//button[starts-with(@id,'double')]
	  act.doubleClick(doubleclick);
	  act.build().perform();
	  
	  WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
	  act.contextClick(rightclick);
	  act.build().perform();
	  
	  WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
	  act.click(click);
	  act.build().perform();
	  
  }
 
  
  @Test
  public void upload()
  {
	 WebElement upload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
	 upload.click();
	 WebElement up = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	 up.sendKeys("C:\\Users\\Dilna\\Documents\\Software testing manual\\Test Plan Sample.pdf");
	  
  }
     */
  @Test
    public void alert()
    {
    	WebElement main = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div"));
    	main.click();
    	WebElement alert = driver.findElement(By.xpath("//span[text()='Alerts']"));
    	alert.click();
    	WebElement click = driver.findElement(By.xpath("//button[@id='alertButton']"));
    	click.click();
    	driver.switchTo().alert().accept();
        WebElement click1 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        click1.click();
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    	wait.until(ExpectedConditions.alertIsPresent());
    	driver.switchTo().alert().accept();
     	
    	
    	
    	 
    }
 
  
 
  
  

}
