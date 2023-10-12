package Data_driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		String browser = p.getProperty("browser");
		WebDriver driver;
		if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","D:\\eclipse new\\launching_browser\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

}
