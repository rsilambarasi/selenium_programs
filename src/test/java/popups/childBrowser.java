package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import generic_libaries.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class childBrowser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'SkillRary Essay')])[2]")).click();
		//Set<String> child = driver.getWindowHandles();
		//for(String b:child)
		//{
			//driver.switchTo().window(b);
	   // }
		WebDriverUtilies ref=new WebDriverUtilies();
		ref.child(driver);
		driver.findElement(By.id("mytext")).sendKeys("silambarasi");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	}

}
