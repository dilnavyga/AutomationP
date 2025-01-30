package JUNIT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Letcode_junit 
{
	WebDriver driver;
	
	@Before
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
	}
	 
	@Test 
	 public void screenshot() throws IOException
	 {
		
		File Screenshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshort, new File(".//Vyga//Screen.png"));
	 }
	
	@Test
	public void Dropdown()
	{
 	 WebElement dropdown = driver.findElement(By.xpath("//a[text()='Drop-Down']"));
	 dropdown.click();
	 WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
	 Select fruit = new Select(fruits);
	 fruit.selectByVisibleText("Mango");
	 
	 WebElement javas = driver.findElement(By.xpath("//select[@id='lang']"));
	 Select java = new Select(javas);
	 java.selectByVisibleText("Java");
 		
	 WebElement countrys = driver.findElement(By.xpath("//select[@id='country']"));
	 Select country = new Select(countrys); 
	 country.selectByVisibleText("India");
	   	}
	
	@Test
	public void frame()
	{
		WebElement frame = driver.findElement(By.xpath("//a[text()='Inner HTML']"));
		frame.click();
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"firstFr\"]"));
		driver.switchTo().frame(frame1);
		WebElement name = driver.findElement(By.xpath("//input[@name ='fname']"));
		name.sendKeys("Vyga"); 
		WebElement lname = driver.findElement(By.xpath("//input[@name ='lname']"));
		lname.sendKeys("Dilna");
		WebElement iframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(iframe);
		WebElement email = driver.findElement(By.xpath("//input[@name ='email']"));
		email.sendKeys("vygadilna@gmal.com");
		driver.switchTo().defaultContent();
		
	}
	
	
	@Test 
	public void alert()
	{
		Actions act = new Actions(driver); 
		WebElement alert = driver.findElement(By.xpath("//a[text()='Dialog']"));
		alert.click();
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		simple.click();
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirm.click();
		driver.switchTo().alert().accept();//button[@id='prompt']
		

        WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
        act.click(prompt);
        act.build().perform();
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        a.sendKeys("Vyga");
        a.accept();
	}
	 
	@Test
	public void button() throws InterruptedException
	{
		WebElement button =  driver.findElement(By.xpath("//a[text()='Click'] "));
		button.click();
		WebElement go = driver.findElement(By.xpath("//button[text()='Goto Home'] "));
		go.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		
	}
 	 
	
}
