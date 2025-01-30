package TestNG;

 
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo 
{

	WebDriver driver;
	
	@BeforeTest
	public void a()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void b()
	{
		System.out.println("Site open");
	}
	
    @Test
    public void c()
    {
    	System.out.println("test1");
    }
    
    @Test
    public void d() 
    {
    	System.out.println("test2");
    }
    
	
	@AfterMethod
	public void e()
	{
		System.out.println("Report");
	}
	
	 
	
	@AfterTest
	public void g()
	{
		
	}
}
