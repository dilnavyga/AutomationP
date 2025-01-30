package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Task3_typesofxpathrediff 
{
   public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement name=driver.findElement(By.xpath("//table[@class='f14']//following::input"));
		name.sendKeys("vyga");
		
		WebElement email=driver.findElement(By.xpath("//td[@valign='bottom']//child::input"));
		email.sendKeys("vygasasi");
		
		WebElement button=driver.findElement(By.xpath("//table[@class='f14']//child::input[2]"));
		button.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='newpasswd']"));
		password.sendKeys("Vygadilna@3");
		
		WebElement retypepswd=driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]"));
		retypepswd.sendKeys("Vygadilna@3");
		
		WebElement alteremail=driver.findElement(By.xpath("//td[@width='185']//child::input"));
		alteremail.sendKeys("dilnavyga333@gmail.com");
		
		WebElement mobile=driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]"));
		mobile.sendKeys("8848399090");
		
		
	}

}
