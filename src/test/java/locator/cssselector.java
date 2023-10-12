package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssselector {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("silambarasi");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("silam");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();


	}

}
