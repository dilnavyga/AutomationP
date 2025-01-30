package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_verify_fire 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "instagram";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
				
				
				
	}

}
