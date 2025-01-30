package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_9 
{

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("laptop");
		WebElement searchb = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchb.click();
		WebElement searchcheck = driver.findElement(By.xpath("//input[@name='description']"));
		searchcheck.click();
		WebElement catagory = driver.findElement(By.xpath("//select[@class='form-control']"));
		catagory.click();
		WebElement catagorys = driver.findElement(By.xpath("//option[text()='Desktops']"));
		catagorys.click();
		
		Actions act = new Actions(driver);
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		act.moveToElement(desktop);
		act.build().perform();
		WebElement pc = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
		pc.click();
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/i"));
		cart.click();
		WebElement shoping = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i"));
		shoping.click();
		WebElement check = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
		check.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
 
		//https://letcode.in/test
		//https://www.demoblaze.com/  this one
		//https://automationexercise.com/login
		//https://demoqa.com/selectable
		//https://demoqa.com/automation-practice-form
		//https://www.saucedemo.com/v1/

		
		
		
		
		
		
        
	}

}
