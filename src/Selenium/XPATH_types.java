package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATH_types 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
		
	   driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
       driver.findElement(By.xpath("//input[@id='name' and @name='name']")).sendKeys("Dilna");
       driver.findElement(By.xpath("//input[@id='email' or name='email']")).sendKeys("dilnavyga33@gmail.com");
       driver.findElement(By.xpath("//input[@id='mobile'or name='mobile']")).sendKeys("8848399090");
       driver.findElement(By.xpath("//input[starts-with(@id,'sub')]")).sendKeys("selenium");
       driver.findElement(By.xpath("//textarea[contains(@id,'picture')]")).sendKeys("vyga,vatakara,kozhikode");
       driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

}
