package Practice;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copypaste 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vyga207@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
		Actions act = new Actions(driver);
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(email,Keys.CONTROL);
		act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(email,Keys.CONTROL);
		act.keyDown(pswd,Keys.CONTROL).sendKeys("v").keyUp(pswd,Keys.CONTROL);
		act.build().perform();
	}

}//https://selectorshub.com/xpath-practice-page/
  //https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
//https://www.qafox.com/selenium/selenium-practice/