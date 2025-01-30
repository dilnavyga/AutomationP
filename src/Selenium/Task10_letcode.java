package Selenium;

import java.awt.Window;
import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task10_letcode 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		Actions act = new Actions(driver);
		
	/*	WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signup.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Dilna");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("dilnavyga333@gmail.com");
		
		WebElement paswd = driver.findElement(By.xpath("//input[@name='password']"));
		paswd.sendKeys("dilnavyga");
		
		WebElement agree = driver.findElement(By.xpath("//a[text()='terms and conditions']"));
		agree.click();
		
		WebElement signupbtn = driver.findElement(By.xpath("//button[text()='SIGN UP']"));
		signupbtn.click();
	*/	
	/*	WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click(); 
		
		WebElement email_ = driver.findElement(By.xpath("//input[@name='email']"));
		email_.sendKeys("dilnavyga333@gmail.com");
		
		WebElement pswd_ = driver.findElement(By.xpath("//input[@name='password']"));
		pswd_.sendKeys("dilnavyga");
		
		WebElement login_ = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login_.click();
		
		WebElement work = driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[1]/a[1]"));
		work.click();
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses']"));
		act.moveToElement(courses);
		act.build().perform();
		
		WebElement Selenium = driver.findElement(By.xpath("//a[contains(@class,'item')][4]"));
		Selenium.click();
		
	*/	
		
		
		Thread.sleep(2000);
		WebElement select =  driver.findElement(By.xpath("//a[text()='Drop-Down']"));
		select.click();
        Thread.sleep(3000);
        
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select fruit = new Select(fruits);
		fruit.selectByVisibleText("Mango");
	 	Thread.sleep(3000);
		
		WebElement java_ = driver.findElement(By.xpath("//select[@id='lang']"));
		Select java = new Select(java_);
		java.selectByVisibleText("Java");
	 	Thread.sleep(2000);
		
		WebElement country_ = driver.findElement(By.xpath("//select[@id='country']"));
		Select country = new Select(country_); 
		country.selectByVisibleText("India");
	 	Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement alert = driver.findElement(By.xpath("//a[text()='Dialog']"));
		alert.click();
	 	Thread.sleep(2000);
		
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		act.click(simple);
		act.build().perform();
	 	Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		act.click(confirm);
		act.build().perform();
	 	Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		act.click(prompt);
		act.build().perform();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		a.sendKeys("Vyga");
		a.accept();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//a[text()='Inner HTML']"));
		frame.click();
	 	Thread.sleep(3000);
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"firstFr\"]"));
		driver.switchTo().frame(frame1);
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Vyga");
		WebElement lname = driver.findElement(By.xpath("//input[@name='lname']"));
		lname.sendKeys("Sasi");
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(iframe);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("dilnavyga333@gmail.com");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		 
		
		
		
		
		
		
		
	}

}
