package TestNG_failing_purpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_sanpdeal {
	
	@Test
	public void snapdeal()
	{
		WebDriverManager.edgedriver().setup();
		//opens the empty browser in edge
		WebDriver driver=new EdgeDriver();
		//for maximize
		driver.manage().window().maximize();
	
		driver.get("https://www.snapdeal.com/");
	}

}
