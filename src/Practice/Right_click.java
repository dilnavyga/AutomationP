package Practice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click 
{

	WebDriver driver;
	
	@Before
	public void right()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/context-menu");
	}
	
	@Test
	public void rightclick() throws InterruptedException
	{
	   Actions act = new Actions(driver);
	   WebElement right = driver.findElement(By.xpath("//div[@id='hot-spot']"));
	   act.contextClick(right);
	   act.build().perform();
	   driver.switchTo().alert().accept();
	   Thread.sleep(2000);
	}
}
