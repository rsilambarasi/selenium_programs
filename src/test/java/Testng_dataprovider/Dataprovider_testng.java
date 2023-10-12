package Testng_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider_testng {
@DataProvider
public Object[][] getData()
{
Object[][] a=new Object[3][2];
a[0][0]="silambarasi";
a[0][1]="rajasekaran";

a[1][0]="java";
a[1][1]="selenium";

a[2][0]="qspiders";
a[2][1]="chrompet";

return a;
}

@Test(dataProvider="getData")
public void demo(String data,String data1)
{
	WebDriverManager.edgedriver().setup();
	//opens the empty browser in edge
	WebDriver driver=new EdgeDriver();
	//for maximize
	driver.manage().window().maximize();
	//open facebook
	driver.get("https://www.facebook.com/");
	//address of email text feild
	driver.findElement(By.id("email")).sendKeys(data);
	driver.findElement(By.id("pass")).sendKeys(data1);
}
}
