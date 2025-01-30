package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//  WebElement name = driver.findElement(By.xpath(""));  name.sendKeys("");
    
public class Task10_login 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://automationexercise.com/login");
		
		WebElement email_ = driver.findElement(By.xpath("//input[@data-qa='login-email']"));  
		email_.sendKeys("dilnavyga333@gmail.com");
		
		WebElement paswd_ = driver.findElement(By.xpath("//input[@data-qa='login-password']"));  
		paswd_.sendKeys("vygadilna3");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		login.click();
		
		
		
		/*	WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Dilna");
		
		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));   
		email.sendKeys("dilnavyga333@gmail.com");
		 
		WebElement signup = driver.findElement(By.xpath("//button[@data-qa='signup-button']")); 
		signup.click();
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']")); 
		gender.click();
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));  
		pswd.sendKeys("vygadilna3");
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select day = new Select(days);
		day.selectByValue("24");
		
		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select month = new Select(months);
		month.selectByVisibleText("January");
		
		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select year = new Select(years);
		year.selectByValue("2007");
		
		WebElement check = driver.findElement(By.xpath("//input[@name='newsletter']")); 
		check.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));  
		fname.sendKeys("Vyga");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));  
		lname.sendKeys("Sasi");
		
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));  
		company.sendKeys("Techmindz");
		
		WebElement adds1 = driver.findElement(By.xpath("//input[@name='address1']"));  
		adds1.sendKeys("Vyga(Ho)");
		
		WebElement adds2 = driver.findElement(By.xpath("//input[@name='address2']"));  
		adds2.sendKeys("Kozhikode");
		
		WebElement country_ = driver.findElement(By.xpath("//select[@name='country']"));
		Select country = new Select(country_);
		country.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));  
		state.sendKeys("Kerala");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));  
		city.sendKeys("Kozhikode");
		
		WebElement zipcode = driver.findElement(By.xpath("//input[@name='zipcode']"));  
		zipcode.sendKeys("673104");
		
		WebElement number = driver.findElement(By.xpath("//input[@name='mobile_number']"));  
		number.sendKeys("8848399090");
		
		WebElement createaccnt = driver.findElement(By.xpath("//button[text()='Create Account']"));
		createaccnt.click();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
