package myprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlinggmailaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		  Actions action = new Actions(driver);
		// driver.findElements(By.xpath(".//*[@id='BirthMonth']/div[1]")))).SendKeys("Feb");
		    action.moveToElement(driver.findElement(By.xpath("//*[@id='BirthMonth']/div[5]"))).click().sendKeys(Keys.UP).sendKeys(Keys.ENTER).build().perform();
		    Actions action1 = new Actions(driver);
		    action1.moveToElement(driver.findElement(By.xpath("//div[@title='Location']//id[n]"))).click().sendKeys(Keys.UP).sendKeys(Keys.ENTER).build().perform();
		/*System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}*/
		
		//div[@class='goog-inline-block goog-flat-menu-button jfk-select'and @title='Location'and@role='listbox']
		//class="goog-menuseparator"r"
		//div[@title='Location']
		//*[@id=\"CountryCodeLabel\"]
	}

}
