package myprog;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import crm.qa.base.Test_Base;
import crm.qa.pages.ContactsPage;
import crm.qa.pages.Homepage;
import crm.qa.pages.LoginPage;
import crm.qa.utilities.TestUtils;

public class Contactspagetest extends Test_Base {
	
	LoginPage login;
	Homepage  homepage;
	TestUtils testutils;
	ContactsPage contactpage;
	String Sheetname="testingdata";
	
	
	public Contactspagetest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws IOException, InterruptedException {
		initialization();
		testutils = new TestUtils();
		contactpage= new ContactsPage();
		login  =  new LoginPage();
		homepage=	login.login(prop.getProperty("username"),prop.getProperty("password"));
		//dealspage=	new  Deals();
		//tasksapge= new Tasks();
		testutils.SwitchtoFrame();
		homepage.clickoncontactslink();
	
	
	}
	@Test(priority =1)
	public void VerifycontactspagelabelTest() {
		Assert.assertTrue(contactpage.VerifycontactLabel(),"contacts page label is missing");
	}
	@Test(priority =2)
	public void SelectcontactsTest() throws InterruptedException {
		Thread.sleep(4000);
		contactpage.Selectcontactsbyname("51569030");
		contactpage.Selectcontactsbyname("51569239");
		contactpage.Selectcontactsbyname("51686741");
		contactpage.Selectcontactsbyname("51556043");
		
	
	}
	
	
	@Test(priority =3)
	public void ValidatenewcontactTest() throws InterruptedException {
		homepage.clickonnewcontactlink();
		Thread.sleep(3000);
		contactpage.CreateNewContact("Mr.","vasu","godugula","google");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
