package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse new\\launching_browser\\src\\main\\resources\\chromedriver.exe");
        //WebDriverManager.edgedriver().setup();
		
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		 
	}

}
