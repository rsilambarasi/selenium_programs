package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_traversing_groupid {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=samsung+mobile&crid=2M0MCSK2R308I&sprefix=sam%2Caps%2C1171&ref=nb_sb_ss_ts-doa-p_2_3");
		WebElement value=driver.findElement(By.xpath("//span[text()='Samsung Galaxy M13 (Stardust Brown, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(value.getText());

	}

}
