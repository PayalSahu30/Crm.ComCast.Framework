package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	WebDriver driver;
	public OrganizationPage(WebDriver driver) 
	{                             //contructor will initialize
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement CreateNewOrgBtn;
	
	public WebElement getCreateNewOrgBtn() {
		return CreateNewOrgBtn;
	}
	
	@FindBy(name="search_text")
	private WebElement SearchBar;
	
	@FindBy(name="search_field")
	private WebElement SearchDD;
	
	public WebElement getSearchDD() {
		return SearchDD;
	}

	@FindBy(linkText="Organization Name")
	private WebElement OrgTypeDD;
	
	@FindBy(name="submit")
	private WebElement SearchBtn;
	
	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getOrgTypeDD() {
		return OrgTypeDD;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	
	
}