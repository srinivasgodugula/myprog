package myprog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xml1 {
	@BeforeTest
	public void login() {
		System.out.println("admin login is succsessful- paseed");
	}
	@Test(priority=1)
	public void AddVendor() {
		System.out.println("Addvendor is succsessful- paseed");
	}
	@Test(priority=2)
	public void AddProducts() {
		System.out.println("AddProducts is succsessful- paseed");
	}
	@Test(priority=3)
	public void AddCurrency() {
		System.out.println("Addcurrency is succsessful- paseed");
	}
	/*@AfterTest
	public void logout() {
		System.out.println(" logout is succsessful -- paseed");
	}
*/
}
