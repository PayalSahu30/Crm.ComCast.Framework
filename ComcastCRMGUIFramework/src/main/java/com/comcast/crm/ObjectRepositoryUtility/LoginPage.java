package com.comcast.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{  //rule1: create a seprate java class
					
	WebDriver driver;
	public LoginPage(WebDriver driver) {                             //contructor will initialize
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	//Rule2: Object Creation
	@FindBy(name="user_name")
	private WebElement usernameEdt;
	


	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;

	
	
						//Rule 3: Object Initialization(in script)
	//Rule 4: Object Encapsulation
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Rule 5: ProvideAction
	public void LoginToApp(String username, String password)
	{
		driver.manage().window().maximize();
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}

	public void LoginToApp(String url,String username, String password)
	{
		waitForPageToLoad(driver);
		driver.get(url);
		driver.manage().window().maximize();
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
}
