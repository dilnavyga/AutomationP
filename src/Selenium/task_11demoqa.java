package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task_11demoqa 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='userName']"));
		fname.sendKeys("Vyga");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("dilna3@gmail.com");
		
		WebElement adds = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		adds.sendKeys("Vatakara,Kozhikode");
		
		WebElement padds = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		padds.sendKeys("Vatakara,Kozhikode");
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));//explisit
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div/button[1]")));
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));////button[text()='Submit']
		submit.click();
	}

}
