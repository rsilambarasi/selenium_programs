package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ancestor {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=tv+smart+tv&sid=ckf%2Cczl&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=RECENT&suggestionId=tv+smart+tv%7CTelevisions&requestId=41414c7a-1a6d-499e-a307-028d0a907b55&as-searchtext=tv%20smart%20tv");
	   WebElement price=driver.findElement(By.xpath("//div[contains(text(),'Compaq 108 cm (43 inch) Full HD LED Smart Android TV with HDR10')]/ancestor::div[4]//div[@class='_30jeq3 _1_WHN1']"));
	    System.out.println(price.getText());

	}

}
