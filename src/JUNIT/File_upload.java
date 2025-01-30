package JUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload 
{
	 WebDriver driver;
	 
	 @Before
	 public void start()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tus.io/demo");
		 
	 }
	 
	 @Test
	 public void upload()
	 {
		WebElement a = driver.findElement(By.xpath("//input[@id='P0-0']"));
		
		a.sendKeys("C:\\Users\\Dilna\\Documents\\Software testing manual\\Test Plan Sample.pdf");
		
		 
	 }
	 
	 @After
	 public void end()
	 {
		 driver.quit();
	 }
 }
