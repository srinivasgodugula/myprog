package myprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNFG2 {
@Test
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google",null);
		System.out.println(driver.getTitle());
	}

}
