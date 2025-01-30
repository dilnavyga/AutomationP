package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(right);
		act.build().perform();
		
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		driver.switchTo().alert().accept();
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		
	}

}
