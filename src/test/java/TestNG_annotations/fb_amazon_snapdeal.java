package TestNG_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fb_amazon_snapdeal {
	WebDriver driver;
	@BeforeMethod
	public void opening() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void closing()
	{
		driver.close();
	}
	
	@Test
	public void facebook()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void amazon()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void snapdeal()
	{
		driver.get("https://www.snapdeal.com/");
	}
}
