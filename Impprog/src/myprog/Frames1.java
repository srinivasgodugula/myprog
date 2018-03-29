package myprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();// own xpath
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(0);
		//driver.findElement(By.linkText("Alerts")).click();
		driver.navigate().to("https://www.snapdeal.com/");
		Actions action = new Actions(driver);
		//driver.switchTo().frame("TOP CATEGORIES");
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.className("sd-icon sd-icon-user"))).build().perform();
		driver.findElement(By.linkText("Your Account")).click();
	}
}
