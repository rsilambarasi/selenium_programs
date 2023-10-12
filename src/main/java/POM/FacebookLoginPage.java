package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	//Declaration
	//address of email text feild
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password text feild
	@FindBy(name="pass")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//initialization
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilaization
	
    //getter for all private webelements
		
	
	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	//business libarary
	
	public void Emailtextfeild(String data)
	{
		emailTf.sendKeys(data);
	}
	
	public void Passwordtextfeild(String data)
	{
		passwordTf.sendKeys(data);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
	
	
	
	
	
	
	

	

}