package JUNIT;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdrop 
{
 WebDriver driver;
 
 @Before
 public void start()
 {
	 WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/droppable/");
 }
 
 @Test
 public void dragdrop()
 {
	 Actions act = new Actions(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));     
    WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    act.dragAndDrop(drag, drop);
    act.build().perform();
    
     
    
  
    
    
 }
}
