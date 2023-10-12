package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddenpopup {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		//address of date
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sept']/../../../..//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']")).click();

	}

}
