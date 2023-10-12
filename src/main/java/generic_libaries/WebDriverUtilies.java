package generic_libaries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilies {
	//explicit wait
	public void EXplicitwait(WebDriver driver,int num)
	{
		
	}

	//implicit wait
	
    public void Implicitwait(WebDriver driver,int num)
    {
    	driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);
    }
	//1.Mouse hovering
	
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
   //2.double click
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//3.right click
	
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//4.drag and drop
	
	public void DragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	//5.handing alter popup ok
	
	public void alterpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	//6.//5.handing alter popup cancel
	
	public void altercancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	//7.switch to parent to child
	
	public void child(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//8.switch to child to parent
	
	public void parent(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
		
	}
	
	//9.scroll bar
	
	public void scroll(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	
	
	
}	
	
	
	
		
	

