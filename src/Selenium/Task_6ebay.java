package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_6ebay 
{ 
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		search.sendKeys("phones");
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbutton.click();
		
		WebElement brand = driver.findElement(By.xpath("//input[@aria-label='Samsung']"));
		brand.click();
		
		WebElement condition = driver.findElement(By.xpath("//span[text()='Condition']//parent::span[1]"));
		condition.click();
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\"s0-61-0-13-8-4-1-0-5[0]-68[1]-23-content-menu\"]/li[2]/a/span/span/span"));
		check.click();
		
		WebElement shipping = driver.findElement(By.xpath("//span[text()='Shipping and pickup']"));
		shipping.click();
		
		WebElement shipcheck = driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[1]/div/div[2]/div[2]/div[2]/span[2]/span/ul/li[1]/a/span/span/span"));
		shipcheck.click();
		
		File screenshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshort,new File(".//Vyga//screenshort_.png"));
		
		
		
	}

}
