package Assesment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java_selenium {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement path = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",path);
		Thread.sleep(3000);
		path.click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
	    }
		WebElement MRP = driver.findElement(By.xpath("(//span[@class='a-size-large product-title-word-break']/ancestor::div[@id='centerCol']//span[@aria-hidden='true'])[2]"));
		System.out.println(MRP.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.switchTo().window(parent);
		WebElement home = driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		js.executeScript("arguments[0].click();",home);
			
	}

}
