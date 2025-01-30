package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copypaste 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("vyga207@gmail.com");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(pswd,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		
		act.build().perform();
		
	 
		 
		
			
	}

}
