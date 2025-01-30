package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.findElement(By.id("email")).sendKeys("vygasasi207@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vygamol@207");
		driver.findElement(By.id("login")).click();
		
 		 
		
		
		
		
	}

}
