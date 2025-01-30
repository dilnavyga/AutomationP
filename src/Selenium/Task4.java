package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 
 

public class Task4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		 
		 WebElement f_name=driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']"));
		 f_name.sendKeys("Vyga");
		 WebElement l_name=driver.findElement(By.xpath("//label[@id='q3_label']//following-sibling::input"));
		 l_name.sendKeys("Sasi");
		 WebElement phone =driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']"));
	     phone.sendKeys("8848399090");
	     WebElement country =driver.findElement(By.xpath("//div[@id='q4']//following::input"));
	     country.sendKeys("india");
	     WebElement city =driver.findElement(By.xpath("//div[@id='q6']//child::input"));
	     city.sendKeys("Calicut");
	     WebElement email=driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']"));
	     email.sendKeys("vygasasi207@gmail.com");
	     driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']")).click();
	     driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']")).click();
	     
	    /* WebElement upload=driver.findElement(By.xpath("//input[@name='RESULT_FileUpload-10']"));
	     upload.sendKeys("C:\\Users\\Dilna\\Documents\\Software testing manual\\Test plan sample.pdf");
	     driver.findElement(By.xpath("//input[@name='Submit']"));
	     */
	     
	     driver.findElement(By.linkText("Software Testing Tutorials")).click();
	     
	      	     
	     
	     

	     

		 
	}

}
