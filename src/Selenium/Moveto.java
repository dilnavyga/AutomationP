package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Moveto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Actions act = new Actions(driver);
		WebElement inter = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		act.moveToElement(inter);
		act.build().perform();
		
		WebElement dragdrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		act.moveToElement(dragdrop);
		act.build().perform();
		
		WebElement static_ = driver.findElement(By.xpath("//a[text()='Static ']"));
		static_.click();
		
		WebElement dra = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement dro = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(dra,dro);
		act.build().perform();		
		
		}

}
