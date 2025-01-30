package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8_frame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vyga");;
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(frame2);
		WebElement frame3 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		driver.switchTo().defaultContent();


 
		
		
		
	}

}
