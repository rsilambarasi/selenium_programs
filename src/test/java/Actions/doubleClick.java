package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import generic_libaries.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		//address of plus icon
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		//Actions a=new Actions(driver);
		//a.doubleClick(plus).perform();
		WebDriverUtilies ref=new WebDriverUtilies();
		ref.doubleClick(driver, plus);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
	

	}

}
