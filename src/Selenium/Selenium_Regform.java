package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Regform 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.id("name")).sendKeys("Dilna Sasi");
		driver.findElement(By.id("email")).sendKeys("dilnavyga33@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("8848399090");
		driver.findElement(By.id("subjects")).sendKeys("Selenium");
		driver.findElement(By.name("picture")).sendKeys("Vyga(Ho),Meppayil,Vatakara");
		 

		
	}

}