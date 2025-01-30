package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("places in calicut",Keys.ENTER);
		
		//search.submit();
		 
		//driver.findElement(By.name("btnK")).click();
		}

}
