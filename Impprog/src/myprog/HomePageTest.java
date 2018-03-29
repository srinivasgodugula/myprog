package myprog;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.qa.base.Test_Base;
import crm.qa.pages.ContactsPage;
import crm.qa.pages.Deals;
import crm.qa.pages.Homepage;
import crm.qa.pages.LoginPage;
import crm.qa.pages.Tasks;
import crm.qa.utilities.TestUtils;
import junit.framework.Assert;

public class HomePageTest extends Test_Base {
	LoginPage login;
	Homepage  homepage;
	TestUtils testutils;
	ContactsPage contactpage;
	Deals dealspage;
	Tasks tasksapge;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void Setup() throws IOException, InterruptedException {
		initialization();
		testutils = new TestUtils();
		contactpage= new ContactsPage();
		login  =  new LoginPage();
		dealspage=	new  Deals();
		tasksapge= new Tasks();
	homepage=	login.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@SuppressWarnings("deprecation")
	@Test(priority =1)
	public void HomePageVerificationTest() throws InterruptedException {
		String Title = homepage.verifyhomepagetitle();
		Thread.sleep(5000);
		Assert.assertEquals(Title, "CRMPRO");
	}
	@Test(priority =2)
	public void VerifycuurentuserTest() throws InterruptedException {
		testutils.SwitchtoFrame();
		Assert.assertTrue(homepage.verifycurrentusername());	
		}
	@Test(priority =3)
	public void VerifycontactslinkTest() throws InterruptedException, IOException {
		testutils.SwitchtoFrame();
		contactpage =	homepage.clickoncontactslink();	
		}
	@Test(priority =4)
	public void VerifyDealslinkTest() throws InterruptedException, IOException {
		testutils.SwitchtoFrame();
		dealspage =	homepage.clickonDealslink();
		}
	@Test(priority =5)
	public void VerifyTaskslinkTest() throws InterruptedException, IOException {
		testutils.SwitchtoFrame();
		tasksapge =	homepage.clickonTaskslink();
		}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}

