package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1_automationdemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'First')]")).sendKeys("Vyga");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]")).sendKeys("sasi");
		driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adr')]")).sendKeys("Vyga(ho),Vatakara,Calicut");
		driver.findElement(By.xpath("//input[contains(@class,'email')]")).sendKeys("Vygasasi207@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8848399090");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Vygadilna");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Vygadilna");
		 






	}

}
