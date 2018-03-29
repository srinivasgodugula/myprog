package myprog;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.qa.base.Test_Base;
import crm.qa.pages.Homepage;
import crm.qa.pages.LoginPage;
import junit.framework.Assert;

public class LoginPagrTest extends Test_Base{
LoginPage login;
Homepage  homepage;

public LoginPagrTest()  {
	super();
}
	
@BeforeMethod
	public void Setup() {
		initialization();
		login  =  new LoginPage();
	}

@SuppressWarnings("deprecation")
@Test(priority =1)
public void LoginPageVerificationTest() {
	String Title = login.validateloginpagetitle();
	Assert.assertEquals(Title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	
}
@Test(priority =2)
public void LoginTest() throws IOException, InterruptedException {
	
	homepage  = login.login(prop.getProperty("username"),prop.getProperty("password"));
}
@AfterMethod
public void teardown() {
	driver.quit();
}
}

