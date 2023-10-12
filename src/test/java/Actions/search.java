package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import generic_libaries.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class search {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    //Actions a=new Actions(driver);
	   // a.contextClick(search).perform();
	    WebDriverUtilies ref=new WebDriverUtilies();
	    ref.rightClick(driver, search);

	}

}
