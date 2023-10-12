package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class wait_class {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("silambu");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
		
		
	}

}
