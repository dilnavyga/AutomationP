package Selenium;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement phone = driver.findElement(By.xpath("//a[text()='Phones']"));
		phone.click();
		
		WebElement samsung = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
		samsung.click();
		
		WebElement addcart = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
		addcart.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.navigate().back();
		driver.navigate().back();
		
		 
		WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
		laptop.click();
		
 	    WebElement lap = driver.findElement(By.xpath("//a[text()='MacBook Pro']"));
		lap.click();
		
		WebElement addlap = driver.findElement(By.xpath("//a[@onclick='addToCart(15)']"));
		addlap.click();		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.navigate().back();
		driver.navigate().back();
		
		WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors']"));
		monitors.click();
		
		WebElement monitor = driver.findElement(By.xpath("//a[text()='Apple monitor 24']"));
		monitor.click();
		
		WebElement addmon = driver.findElement(By.xpath("//a[@onclick='addToCart(10)']"));
		addmon.click();
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.navigate().back();
		driver.navigate().back();
		
        
		
		
 	}

}
