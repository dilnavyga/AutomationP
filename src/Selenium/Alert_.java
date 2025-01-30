package Selenium;

 
 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager; //button[@id='alertButton']

public class Alert_ 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		Actions act = new Actions(driver);
		
		WebElement seealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		act.click(seealert);
		act.build().perform();
		driver.switchTo().alert().accept();
		
   /*
		WebElement afterscnd = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		act.click(afterscnd);
		act.build().perform();
		driver.switchTo().alert().accept();
		
*/
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		act.click(confirm);
		act.build().perform();
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		act.click(prompt); 
		act.build().perform();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Vyga");
		a.accept();
		
  

		
		
		
	 
	
	}

}
