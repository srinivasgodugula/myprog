package myprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import crm.qa.base.Test_Base;

public class ContactsPage extends Test_Base {

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	@FindBy(name="title")
	WebElement title;

	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="surname")
	WebElement lastname;
	@FindBy(name="client_lookup")
	WebElement company;

	@FindBy(xpath="//input[@type='submit'and @value='Save']")
	WebElement savebtn;

	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean VerifycontactLabel() {
		return contactsLabel.isDisplayed();
	}
	public void Selectcontactsbyname(String value) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='contact_id' and @value="+value+"]")).click();
		
	}
	public void CreateNewContact(String title,String ftname,String ltname,String comp) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstname.sendKeys(ftname);
		lastname.sendKeys(ltname);
		company.sendKeys(comp);
		savebtn.click();
	}
}
