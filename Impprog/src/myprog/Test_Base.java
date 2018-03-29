package myprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import crm.qa.utilities.TestUtils;
import crm.qa.utilities.WebEventListner;

public class Test_Base {
public	static WebDriver driver;
public	static Properties prop;
public	static EventFiringWebDriver edriver;
public	static WebEventListner eventlistner;
	public Test_Base() {
		try {
			 prop= new Properties();
			FileInputStream fip = new FileInputStream("C:\\Users\\personal\\eclipse-workspace\\test_001\\src\\main\\java\\crm\\qa\\config\\Config.properties");
			
				prop.load(fip);	
			//	System.out.println(prop.getProperty("browser"));
				
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
			
		}
	
public static void initialization () {
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.IMPLICT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
	}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();// it launches blank url
			driver.manage().window().maximize();
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.IMPLICT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}

	edriver= new EventFiringWebDriver(driver);
	eventlistner = new WebEventListner();
	edriver.register(eventlistner);
	driver=edriver;
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtils.IMPLICT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}