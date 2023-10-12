package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_propertiesfile {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String urlapp= p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(urlapp);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
