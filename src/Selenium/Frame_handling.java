package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_handling 
{
	//div[@class='nWQGrd zwllIb'][2]
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("vyga");
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("dilna");
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hai");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@width='650']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//div[@class='nWQGrd zwllIb'][2]")).click();
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("hello");
		driver.switchTo().defaultContent();
		
		
	}

}
