package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//tagname[@AN='AV']
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("silambarasi");
       //tagmname[contains(@AN,'AV')]
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("rahul");
		//driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("silam");
      // driver.findElement(By.xpath("//button[@value='1']")).click();
       //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Forgotten' )]")).click();
	}

}
