package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement upload=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		upload.sendKeys("C:\\Users\\Dilna\\Documents\\Software testing manual\\Test Plan Sample.pdf");
		 		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
	}
	

}
