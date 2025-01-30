package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login.php/");
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("vyga@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
		pswd.sendKeys("vygadilna");
		WebElement login = driver.findElement(By.xpath("//button[ text()='Log in']"));
		login.click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
	}

}
