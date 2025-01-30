package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		  
		   driver.get("https://demoqa.com/buttons");
		   Actions act = new Actions(driver);
			  WebElement button = driver.findElement(By.xpath("//span[text()='Buttons']"));
			  act.click(button);
			  
				WebElement doubleclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/button"));
				act.doubleClick(doubleclick);
				act.build().perform();
			  
			  WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
			  act.contextClick(rightclick);
			  act.build().perform();
			  
			  WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
			  act.click(click);
			  act.build().perform(); 
			   
	}

}
