package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isdisplayed_method {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		if(email.isDisplayed())
		{
			email.sendKeys("silambu");
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
