package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_pageclass 
{

	 WebDriver driver;
	   
	   By fb_email = By.id("email");
	   By fb_pswd = By.id("pass");
	   By fb_login = By.id("loginbutton");
	   
	   public Pom_pageclass(WebDriver driver)
	   {
		   this.driver = driver;
	   }
	  public void values()
	  {
		  driver.findElement(fb_email).sendKeys("vygadilna@gmail.com");
		  driver.findElement(fb_pswd).sendKeys("vygadilna");
	  }
	  
	  public void click()
	  {
		  driver.findElement(fb_login).click();
	  }
	

}
