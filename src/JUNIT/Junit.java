package JUNIT;

 import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Junit 
  {
     WebDriver driver;
 
   @Before
    public void start()
       {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	 
       }
 
    @Test
    public void Register()
       {
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	      WebElement register = driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/ul/li[3]/a"));
    	  register.click();
    	  WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
    	  fname.sendKeys("Vyga");
    	  WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
    	  lname.sendKeys("Sasi");
    	  WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
    	  user.sendKeys("dilnavyga333@gmail.com");
    	  WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
    	  pswd.sendKeys("vygadilna");
    	  WebElement register_ = driver.findElement(By.xpath("//input[@type='submit']"));
    	  register_.click();
    	   
    	  
	 
      }
    
    
    @Test
    public void Login()
        {
          WebElement login = driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/ul/li[2]/a"));
  	      login.click();
  	      WebElement usere = driver.findElement(By.xpath("//input[@id='email']"));
  	      usere.sendKeys("dilnavyga333@gmal.com");
  	      WebElement pswdu = driver.findElement(By.xpath("//input[@id='password']"));
  	      pswdu.sendKeys("vygadilna");
  	      WebElement login_ = driver.findElement(By.xpath("//input[@type='submit']"));
	      login_.click();
  	      
  	      
  	      
    }
    
    
	 
	
}
