package myprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificatio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=enkflfv42aqo2eat0s1b13uaq0");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("admin login is sucussfully - passed");
		}
		else
		{
			System.out.println("admin log in is unsuccessfully - failed");
			
		}
	}

}
