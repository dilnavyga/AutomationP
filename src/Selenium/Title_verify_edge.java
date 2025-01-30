package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_verify_edge 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
driver.get("https://www.facebook.com");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Facebook";
		
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
