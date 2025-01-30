package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boolean_methods 
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
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
   }
   
   @Test
   public void test()
   {
	   boolean img = driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	   System.out.println("The image is displayed="+img);
	   
	   boolean radio = driver.findElement(By.xpath("//input[@value='m']")).isSelected();
	   System.out.println("The radio button is selected ="+radio);
	   
	   boolean enable = driver.findElement(By.xpath("//input[@id='newpasswd']")).isEnabled();
	   System.out.println(" The element is enabled ="+enable);
	   
   }
   
}