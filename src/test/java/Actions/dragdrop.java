package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import generic_libaries.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdrop {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(3000);
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		//Actions a=new Actions(driver);
		//a.dragAndDrop(block1, block4).perform();
		WebDriverUtilies ref=new WebDriverUtilies();
		ref.DragAndDrop(driver, block1, block4);

}
}

