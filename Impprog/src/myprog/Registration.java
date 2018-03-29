package myprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=s3om5ur88nsdf206de87o5jp14");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("vasuhr");
		driver.findElement(By.name("lastname")).sendKeys("karanam");
		driver.findElement(By.id("dob")).sendKeys("10/14/1990");
		driver.findElement(By.name("email_address")).sendKeys("vasuhr@gmail.com");
		driver.findElement(By.name("company")).sendKeys("jobshub");
		driver.findElement(By.name("street_address")).sendKeys("dayalnagar");
		driver.findElement(By.name("postcode")).sendKeys("530044");
		driver.findElement(By.name("city")).sendKeys("vizag");
		driver.findElement(By.name("state")).sendKeys("Andhra pradesh");
		Select dropdown = new Select (driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		driver.findElement(By.name("telephone")).sendKeys("9160360091");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		driver.findElement(By.name("confirmation")).sendKeys("abcd@123");
		driver.findElement(By.id("tdb4")).click();
		if(driver.findElement(By.id("tdb5")).isDisplayed()==true)
				{
			System.out.println("log is successfully - passed");
				}
		else {
			System.out.println("log is unsuccesfull - failed");
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
				}
		

		

	}

