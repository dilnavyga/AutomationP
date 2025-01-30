package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_detect 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/");
		 
		 String element = driver.getPageSource();
		 
		 if(element.contains("Instagram"))
			{
			 System.out.println("pass");
			 
		    }
		 else
		 {
			 System.out.println("fail");

		 }
		 
	}

}
