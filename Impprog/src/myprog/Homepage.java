package myprog;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.qa.base.Test_Base;

public class Homepage extends Test_Base{


		//td[contains(text(),'User: Naveen K')]
	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement currentuser;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontact;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasks;
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyhomepagetitle() {
		
	return driver.getTitle();
	}
	public ContactsPage clickoncontactslink() throws IOException {
		contacts.click();
		return new ContactsPage();
	}
	public boolean verifycurrentusername() {
		return currentuser.isDisplayed();
	}
	
	public Deals clickonDealslink() throws IOException {
		deals.click();
		return new Deals();
	}
	public Tasks clickonTaskslink() throws IOException {
		tasks.click();
		return new Tasks();
	}
	public void clickonnewcontactlink() {
		Actions action = new Actions(driver);
		action.moveToElement(newcontact).build().perform();
		newcontact.click();
	}
}
