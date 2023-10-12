package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
	    WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    //creating an object for action class
	    Actions a=new Actions(driver);
	    a.moveToElement(signin).perform();
	    Thread.sleep(3000);
	    //address of register
	    driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	    //handing frame
	    driver.switchTo().frame("loginIframe");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("silambarasi");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='close-pop']")).click();
	    //shifting control to normal web page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("bag");

	}

}
