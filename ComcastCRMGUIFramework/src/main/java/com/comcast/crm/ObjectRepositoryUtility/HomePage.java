package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver) {                             //contructor will initialize
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(linkText = "Organizations")
	private WebElement OrgLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement ContactsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement AddNewLink;
	
	public WebElement getOrgLink() {
		return OrgLink;
	}

	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getAddNewLink() {
		return AddNewLink;
	}
	
	public void logout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminImg).perform();
		signOutLink.click();
	}
	
//	public void navigateToCampagienPage()
//	{
//		
//	}
	
}
