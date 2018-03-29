package myprog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xml2 {
	/*@BeforeTest
	public void login() {
		System.out.println("admin login is succsessful");
	}*/
	@Test(priority=4)
	public void DeleteVendor() {
		System.out.println("Deletevendor is succsessful - paseed");
	}
	@Test(priority=5)
	public void DeleteProducts() {
		System.out.println("DeleteProducts is succsessful- paseed");
	}
	@Test(priority=6)
	public void DeleteCurrency() {
		System.out.println("Deletecurrency is succsessful- paseed");
	}
	@AfterTest
	public void logout() {
		System.out.println(" logout is succsessful- paseed");
	}
}
