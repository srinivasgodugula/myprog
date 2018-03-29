package myprog;

import java.io.IOException;
import java.nio.file.InvalidPathException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import crm.qa.base.Test_Base;

public class WebEventListner extends Test_Base implements WebDriverEventListener {

	/*public void beforeAlertAccept(String url,WebDriver driver) {
		System.out.println("Before navigating to :'"+ url +"'");
		
	}

	public void afterAlertAccept(String url,WebDriver driver) {
		System.out.println(" navigating to :'"+ url +"'");
		
	}

	public void afterAlertDismiss(WebElement element,WebDriver driver) {
		System.out.println("Value of the :"+ element.toString()+"Before Any changes made");
		
	}

	public void beforeAlertDismiss(WebElement element,WebDriver driver) {
		
		System.out.println("Element value changed:"+ element.toString());
	}*/

	public void beforeNavigateTo(String url, WebDriver driver) {
		
		System.out.println("Before navigating to :'"+ url +"'");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println(" navigating to :'"+ url +"'");
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("navigate back to previous page");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("navigate back to previous page");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("navigate back to previous page");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("navigate back to previous page");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("trying to find element by:"+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found element  by:"+by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("trying to click on:"+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("trying to click on:"+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println(" click on:"+element.toString());
		
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Element value changed:"+ element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("exception occur"+error);
		try {
		TestUtils.TakeScreenShotatendofmyTest();
		}catch(InvalidPathException e){
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private void TakeScreenShotatendofmyTest() {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

}
