package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/demo-site/");
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='vfb-5']"));
		fname.sendKeys("Vyga");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='vfb-7']"));
		lname.sendKeys("Sasi");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='vfb-31-2']"));
		gender.click();
		
		WebElement address = driver.findElement(By.xpath("//span[@class='vfb-full'][1]//child::input"));
		address.sendKeys("Vyga(ho)");
		
		WebElement streetads = driver.findElement(By.xpath("//span[@class='vfb-full'][2]//child::input"));
		streetads.sendKeys("Vatakara");
		
		WebElement place = driver.findElement(By.xpath("//span[@class='vfb-left']//child::input"));
		place.sendKeys("Kozhikode");
		
		WebElement place_ = driver.findElement(By.xpath("//input[@name='vfb-13[state]']"));
		place_.sendKeys("Kerala");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='vfb-13-zip']"));
		city.sendKeys("673104");
		
		WebElement country = driver.findElement(By.xpath("//span[@class='selection']//span[2]"));
		country.click();
		
		WebElement India = driver.findElement(By.xpath("//input[@type='search']"));
		India.sendKeys("India");
		//driver.findElement(By.xpath("//span[text()='India']")).click();
		 		
		WebElement email = driver.findElement(By.xpath("//li[@id='item-vfb-14']//child::input"));
		email.sendKeys("vygasasi203@gmail.com");
		
		WebElement date = driver.findElement(By.xpath("//input[@name='vfb-18']"));
		date.sendKeys("01/24/2025");
		driver.findElement(By.xpath("//a[text()='24']")).click();	
		
		driver.findElement(By.xpath("//input[@id='vfb-19']//preceding::span[9]")).click();
		WebElement timeh = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		timeh.sendKeys("10");
		//driver.findElement(By.xpath("//span[text()='10']")).click();
		
		driver.findElement(By.xpath("//input[@id='vfb-19']//preceding::span[2]")).click();
		WebElement timem = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		timem.sendKeys("00");
		//driver.findElement(By.xpath("//span[text()='00']")).click();
		
		WebElement number = driver.findElement(By.xpath("//input[@name='vfb-19']"));
		number.sendKeys("8848399099");
		
		driver.findElement(By.xpath("//input[@value='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		driver.findElement(By.xpath("//input[@value='Functional Testing']")).click();
		
		WebElement query = driver.findElement(By.xpath("//textarea[@id='vfb-23']"));
		query.sendKeys("vinothqaacademy,learn with clarity");
		
		WebElement verification = driver.findElement(By.xpath("//input[@id='vfb-3']"));
		verification.sendKeys("44");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='vfb-submit']"));
		submit.click();
		
		
	} 

}
