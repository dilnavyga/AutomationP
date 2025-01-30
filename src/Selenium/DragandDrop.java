package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Actions act = new Actions(driver);
		WebElement dra = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement dro = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(dra, dro);
		act.build().perform();
		
		
	}

}
