package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notofication_popup {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		System.setProperty("webdriver.chrome.driver","D:\\eclipse new\\launching_browser\\src\\main\\resources\\chromedriver.exe");
        //WebDriverManager.edgedriver().setup();
		
		//open chrome browser
		WebDriver driver=new ChromeDriver(options);
		 
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");

	}

}
