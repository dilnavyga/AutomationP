package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Typesof_xpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
		
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']//following::input")).sendKeys("vyga");
		//driver.findElement(By.xpath("//h1[@class='a-spacing-small']//ancestor::div[1]"));
	}
	
}
 