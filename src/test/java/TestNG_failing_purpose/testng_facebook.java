package TestNG_failing_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_facebook {
	
	@Test
	public void facebook()
	{
		WebDriverManager.edgedriver().setup();
		//opens the empty browser in edge
		WebDriver driver=new EdgeDriver();
		//for maximize
		driver.manage().window().maximize();
		//open facebook
		driver.get("https://www.facebook.com/");
		//address of email text feild
		driver.findElement(By.id("email")).sendKeys("silambarasi");
	}

}
