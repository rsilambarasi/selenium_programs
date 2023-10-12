package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertion {
	WebDriver driver;
	@Test
	
	public void Facebook()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		//hard Assert
		//Assert.assertEquals(title, "silambarasi");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "silambarasi");
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test
	public void Method() {
		//Thread.sleep(3000);
		driver.close();
	}
	
	

}
