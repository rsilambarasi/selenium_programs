package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_link {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty browser in edge
		WebDriver driver=new EdgeDriver();
		//for maximize
		driver.manage().window().maximize();
		//open facebook
		driver.get("https://www.facebook.com/");
		//address of email text feild
		driver.findElement(By.id("email")).sendKeys("silambarasi");
		//address of password text feild
		driver.findElement(By.name("pass")).sendKeys("silam");
		//address of login button
		driver.findElement(By.name("login")).click();
		//address of forget password link
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("?")).click();

	}

}
