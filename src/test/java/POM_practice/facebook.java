package POM_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FacebookLoginPage fb=new FacebookLoginPage(driver);
		fb.Emailtextfeild("silambarasi");
		fb.Passwordtextfeild("silam@24");
		fb.loginbutton();
		
	}

}
