package AutoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("silambarasi240299@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Silam@24");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	}

}
