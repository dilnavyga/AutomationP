package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATH 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&disableLoginPrepopulate=1&switch_account=signin&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	      
		 driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("vyga");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vygasasi207@gmail.com");
		 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("vygadilna@33");
		 driver.findElement(By.xpath("//input[@name='passwordCheck']")).sendKeys("vygadilna@33");
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	

} 
