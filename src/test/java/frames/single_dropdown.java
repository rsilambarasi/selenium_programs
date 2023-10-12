package frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class single_dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement DD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling dropdown
		
		Select s=new Select(DD);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		s.selectByVisibleText("Electronics");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		List<WebElement> value = s.getOptions();
		System.out.println(value.size());
		for(WebElement b:value)
		{
			System.out.println(b.getText());
		}
		

	}

}
