package myprog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import crm.qa.base.Test_Base;

public class TestUtils extends Test_Base {


public	static long PAGE_LOAD_TIMEOUT =30;
	
public	static long IMPLICT_WAIT =30;
public static 	String TEST_SHEET_PATH;
static Workbook w;
static Sheet s;
	
public void SwitchtoFrame() {
	
	driver.switchTo().frame("mainpanel");
}
public static void TakeScreenShotatendofmyTest() throws IOException {
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentdir = System.getProperty("user.dir");
	FileUtils.copyFile(srcFile,new File(currentdir+"/ScreenShot/"+System.currentTimeMillis()+".png"));
}

}
