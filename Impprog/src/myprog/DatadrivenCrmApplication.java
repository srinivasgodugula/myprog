package myprog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DatadrivenCrmApplication {
	public static WebDriver driver ;

@Test (dataProvider="testdata")
public void Newcontactlink(String title,String firstname,String lastname,String company) throws InterruptedException {
	 
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
	Actions action = new Actions(driver);
	 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")).click();
	Thread.sleep(4000);
	Select Dropdown = new Select(driver.findElement(By.name("title")));
	Thread.sleep(2000);
	Dropdown.selectByVisibleText(title);
	Thread.sleep(2000);
	driver.findElement(By.id("first_name")).sendKeys(firstname);
	driver.findElement(By.id("surname")).sendKeys(lastname);
	driver.findElement(By.name("client_lookup")).sendKeys(company);
	driver.findElement(By.xpath("//input[@type='submit'and @value='Save']")).click();
}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.close();
	}
	@DataProvider(name="testdata")    
	public Object [] [] readExcel() throws BiffException, IOException {
		File file = new File("C:\\Users\\personal\\Desktop\\testingdata1.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s = w.getSheet("Sheet1");
		int Columns = s.getColumns();
		int Rows= s.getRows();
		System.out.println(Rows  +" " + " "+  Columns );
		 String InputData [] [] = new String [Rows] [Columns];
		    for (int i =0 ; i<Rows; i++){
		        for (int j=0; j<Columns; j++){
		            Cell c = s.getCell(j, i);
		            InputData [i] [j] = c.getContents();
		            System.out.println(InputData [i][j]);
		        }
		    }
			return InputData;
		
	}
}

