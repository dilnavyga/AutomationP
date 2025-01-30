package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_class 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/button"));
		act.doubleClick(doubleclick);
		act.build().perform();
		//driver.switchTo().alert().accept();
	}

}
