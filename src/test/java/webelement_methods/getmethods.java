package webelement_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getmethods {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		String attribute=email.getAttribute("type");
		System.out.println(attribute);
		Point coordinates = email.getLocation();
		int x=coordinates.getX();
		int y=coordinates.getY();
		System.out.println(x);
		System.out.println(y);
		//System.out.println(email.getLocation());

	}

}
