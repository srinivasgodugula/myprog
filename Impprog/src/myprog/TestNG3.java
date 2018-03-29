package myprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG3 {
	static WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		System.out.println("launch browser is passed");
		driver.close();
	}
	@AfterClass
	public void closebrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
	driver.close();
	System.out.println("close browser is passed");
}
	@Test(priority=3)
	public void yahooTitle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		String pagetitle= driver.getTitle();
		//Assert.assertEquals(pagetitle, "Yahoo",null);
		if(pagetitle.equals("Yahoo")) {
		System.out.println("yahoo title verification is passed");
		driver.close();
		}
	}
		@Test(priority=2)
		public void GoogleTitle() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();// it launches blank url
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			String pagetitle= driver.getTitle();
			//Assert.assertEquals(pagetitle, "Google",null);
			if(pagetitle.equals("Google")) {
			System.out.println("Google title verification is passed");
			driver.close();
			}
	}
		@Test(priority=4)
		public void SoftwareTesting() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();// it launches blank url
			driver.manage().window().maximize();
			driver.get("http://www.gcreddy.com/");
			String pagetitle= driver.getTitle();
			//Assert.assertEquals(pagetitle, "Google",null);
			if(pagetitle.equals("Software Testing")) {
			System.out.println("Software testing  verification is passed");
			driver.close();
			}
	}
		
}
