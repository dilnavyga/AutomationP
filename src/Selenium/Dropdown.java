package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Dropdown 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 
		 WebElement days=driver.findElement(By.xpath("//option[@value='01']//parent::select"));
		 Select day =new Select(days);
		 day.selectByValue("24");
		 
		 WebElement months=driver.findElement(By.xpath("//td[@colspan='3']//select[2]"));
		 Select month=new Select(months);
		 month.selectByVisibleText("JAN");
		 
		 WebElement years=driver.findElement(By.xpath("//td[@colspan='3']//select[3]"));
		 Select year= new Select(years);
		 year.selectByValue("2007");
		 
		 WebElement country_=driver.findElement(By.xpath("//select[@id='country']"));
		 Select country=new Select(country_);
		 country.selectByVisibleText("India");
		 
		 WebElement city_=driver.findElement(By.xpath("//option[@label='Select']//parent::select"));
		 Select city=new Select(city_);
		 city.selectByVisibleText("Chennai");
		 
		 WebElement phone=driver.findElement(By.xpath("//span[@id='lbl_txt']//parent::div"));
		 phone.click();
		 
		 WebElement aus=driver.findElement(By.xpath("//li[text()='Australia (+61)']"));
		 aus.click();		 
		 
		 
		 
		 
			
	}

}
