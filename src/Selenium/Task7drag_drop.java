package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7drag_drop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
	    Actions act = new Actions(driver);
	    WebElement drag1 = driver.findElement(By.xpath("//img[@width='96']"));
	    WebElement drop1 = driver.findElement(By.xpath("//div[@id='trash']"));
	    act.dragAndDrop(drag1, drop1);
	    act.build().perform();
	     
	}

}
