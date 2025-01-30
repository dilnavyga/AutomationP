package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tile_verify 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver();
    driver.get("https://www.instagram.com");
    
    String actualtitle = driver.getTitle();
    System.out.println(actualtitle);
    String expectedtitle="Instagram";
    
    if (actualtitle.equals(expectedtitle))
    {
    	System.out.println("pass");
    }
    else 
    {
    	System.out.println("fail");
    }
	}
	 
	
	 
	//WebDriverManager.firefoxdriver().setup();
   // FirefoxDriver driver =new FirefoxDriver();
}
