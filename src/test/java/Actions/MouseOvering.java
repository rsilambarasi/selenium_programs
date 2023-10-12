package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import generic_libaries.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOvering {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
	    WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    //creating an object for action class
	    //Actions a=new Actions(driver);
	    //a.moveToElement(signin).perform();
	    WebDriverUtilies ref=new WebDriverUtilies();
	    ref.mousehover(driver, signin);
	    Thread.sleep(3000);
	    //address of register
	    driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	    

	}

}
