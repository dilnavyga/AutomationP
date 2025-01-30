package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_signup_page 
{

	WebDriver driver;
	
	By fb_fname = By.name("firstname"); 
	By fb_lname = By.name("lastname");
	By fb_day = By.id("day");
	By fb_month = By.id("month");
	By fb_year = By.id("year");
	By fb_gender = By.id("sex");
	By fb_email = By.name("reg_email__"); 
	By fb_npswd = By.name("reg_passwd__");
	By fb_signup = By.name("websubmit");
	
	public Fb_signup_page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void values()
	{
		driver.findElement(fb_fname).sendKeys("dilna");
		driver.findElement(fb_lname).sendKeys("dil");
		driver.findElement(fb_email).sendKeys("dilna@gmail.com");
		driver.findElement(fb_npswd).sendKeys("dilvava");
	}
	
	public void select()
	{
		Select days = new Select(driver.findElement(fb_day));
		days.selectByVisibleText("24");
		
		Select months = new Select(driver.findElement(fb_month));
		months.selectByVisibleText("Jan");
		
		Select years = new Select(driver.findElement(fb_year));
		years.selectByVisibleText("2007");
		
	}	
	
	public void click()
	{
		driver.findElement(fb_gender).click();
		driver.findElement(fb_signup).click();
	}
		
		
		
		
		
		
	
}
