package myprog;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.qa.base.Test_Base;

public class LoginPage extends Test_Base{
	
		
	
	// page factory or object Repository
	//driver.findElement(By.name("username")).sendKeys("naveenk");
	//driver.findElement(By.name("password")).sendKeys("test@123");
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
//	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	//WebElement Signupbutton;
	// initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions 1
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	//Actions 2

	public Homepage login(String un,String pwd) throws IOException, InterruptedException  {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		loginbutton.click();
		return new Homepage();
	}

}