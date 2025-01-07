package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.weddriverUtility.JavaUtility;

public class CreateNewContactPage extends JavaUtility{

	
	
WebDriver driver;
public CreateNewContactPage(WebDriver driver) {                             //contructor will initialize
this.driver=driver;
PageFactory.initElements(driver, this);
}

	@FindBy(name="lastname")
	private WebElement LastNameTF;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBTN;
	
	@FindBy(name="support_start_date")
	private WebElement StartDateTF;
	
	@FindBy(name="support_end_date")
	private WebElement EndDateTF;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement orgBtn;
	
	public WebElement getOrgBtn() {
		return orgBtn;
	}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getSaveBTN() {
		return SaveBTN;
	}
	
	public void createContact(String LastName)
	{
		LastNameTF.sendKeys(LastName);
		SaveBTN.click();
	}
	
	public void createContactWithDate(String lastname)
	{
		String startDate = getSystemDateYYYYMMDD();
		String endDate =getRequiredDateYYYYMMDD(30);
		LastNameTF.sendKeys(lastname);
		StartDateTF.sendKeys(startDate);
		EndDateTF.sendKeys(endDate);
		SaveBTN.click();
	}
}
