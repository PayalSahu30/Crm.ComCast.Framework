package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	WebDriver driver;
	public ContactPage(WebDriver driver) {                             //contructor will initialize
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dtlview_Last Name")
	private WebElement LastNameTF;
	
	@FindBy(className="dvHeaderText")
	private WebElement HeaderInfo;
	
	
	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getHeaderInfo() {
		return HeaderInfo;
	}

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateNewContactBTN;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateNewContactBTN() {
		return CreateNewContactBTN;
	}
	

}
