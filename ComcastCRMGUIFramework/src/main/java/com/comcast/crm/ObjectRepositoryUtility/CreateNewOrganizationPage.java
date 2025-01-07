package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {

	WebDriver driver;
	public CreateNewOrganizationPage(WebDriver driver) {                             //contructor will initialize
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(name="accountname")
	private WebElement orgNameTF;
	
	
	@FindBy(name="phone")
	private WebElement phoneNoTF;
	
	@FindBy(name="industry")
	private WebElement industryDD;
	
	@FindBy(name="accounttype")
	private WebElement TypeDD;
	
	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getTypeDD() {
		return TypeDD;
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBTN;
	
	@FindBy(name="search_text")
	private WebElement searchBar;
	
	@FindBy(name="search")
	private WebElement searchBTN;
	
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchBTN() {
		return searchBTN;
	}

	public WebElement getOrgNameTF() {
		return orgNameTF;
	}

	public WebElement getPhoneNoTF() {
		return phoneNoTF;
	}

	public WebElement getSaveBTN() {
		return SaveBTN;
	}
	
	public void CreateOrg(String OrgName)
	{
		orgNameTF.sendKeys(OrgName);
		SaveBTN.click();
	}
	
	
	
	public void CreateorgWithPhoneNo(String orgName, String PhNo)
	{
		orgNameTF.sendKeys(orgName);
		phoneNoTF.sendKeys(PhNo);
		SaveBTN.click();
	}
	
	public void createOrgWithIndustry_NType(String orgName,String industry, String Type)
	{
		orgNameTF.sendKeys(orgName);
		
		Select sel1=new Select(industryDD);
		sel1.selectByVisibleText(industry);
		
		Select sel2=new Select(TypeDD);
		sel2.selectByVisibleText(Type);
		
		SaveBTN.click();
		
		
	}
	
}