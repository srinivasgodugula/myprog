package myprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newcontactpage {
	public static WebDriver driver ;

	
	public void AdminLogin(String username , String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();// own xpath
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
}
	public void Newcontactlink() throws InterruptedException {
		Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.name("title")).sendKeys("title");
		driver.findElement(By.id("first_name")).sendKeys("firstname");
		driver.findElement(By.id("surname")).sendKeys("lastname");
		driver.findElement(By.name("client_lookup")).sendKeys("company");
		driver.findElement(By.xpath("//input[@type='submit'and @value='Save']")).click();
	}
}
