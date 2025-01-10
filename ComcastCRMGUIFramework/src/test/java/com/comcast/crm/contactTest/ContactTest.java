package com.comcast.crm.contactTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.ObjectRepositoryUtility.ContactPage;
import com.comcast.crm.ObjectRepositoryUtility.CreateNewContactPage;
import com.comcast.crm.ObjectRepositoryUtility.CreateNewOrganizationPage;
import com.comcast.crm.ObjectRepositoryUtility.HomePage;
import com.comcast.crm.ObjectRepositoryUtility.OrganizationPage;
import com.comcast.crm.generic.weddriverUtility.ClassObjectUtility;

@Listeners(com.comcast.crm.ListenerUtility.ListenerImplementationClass.class)
public class ContactTest extends BaseClass {
	@Test(groups="smoketest")
	public void CreateContactTest() throws Throwable {
		// read testScript data from excel file
		String lastname = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();
         ClassObjectUtility.getTest().log(Status.INFO, "Data Read From Excel Successfully");
         
		// Step2: navigate to Contact
		HomePage hp = new HomePage(driver);
		hp.getContactsLink().click();
		 ClassObjectUtility.getTest().log(Status.INFO, "Navigated to Login page");
		 

		// step3: click on "create contact" button
		ContactPage cp = new ContactPage(driver);
		cp.getCreateNewContactBTN().click();
		 ClassObjectUtility.getTest().log(Status.INFO, "clicked on create new contact button");

		// step 4: Enter all the details & create new Contact
		CreateNewContactPage ccp = new CreateNewContactPage(driver);
		ccp.createContact(lastname);
		 ClassObjectUtility.getTest().log(Status.INFO, "details Added And clicked on Save");

		// verify header info expectedResult
		String actualHeader = cp.getHeaderInfo().getText();
		boolean status=  actualHeader.contains(lastname);
		Assert.assertEquals(status, true);
		System.out.println(actualHeader +" createds");
		 ClassObjectUtility.getTest().log(Status.INFO, "Successfully");
		
		
		// verify lastname field info expectedResult
				String actuallast = cp.getLastNameTF().getText();
				SoftAssert soft= new SoftAssert();
				soft.assertEquals(actuallast, lastname);
				soft.assertAll();
				ClassObjectUtility.getTest().log(Status.INFO, "Varification Done");
	}

	@Test(groups="regressiontest")
	public void createContactWithSupprotDate() throws Throwable {
		// read testScript data from excel file
		String lastname = eLib.getDataFromExcel("contact", 4, 2) + jLib.getRandomNumber();

		// Step2: navigate to Contact
		HomePage hp = new HomePage(driver);
		hp.getContactsLink().click();

		// step3: click on "create contact" button
		ContactPage cp = new ContactPage(driver);
		cp.getCreateNewContactBTN().click();

		// step 4: Enter all the details & create new Contact
		CreateNewContactPage ccp = new CreateNewContactPage(driver);
		ccp.createContactWithDate(lastname);

		//Set Date And after 30 days date
		String startDate=jLib.getSystemDateYYYYMMDD();
		String endDate=jLib.getRequiredDateYYYYMMDD(30);
		
		//verify expected start date 
		String actualStartDate=driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if (actualStartDate.equals(startDate)) {
			System.out.println(startDate +"  created on ===>pass");
		} else {
			System.out.println(startDate +"===>fail");

		}
		//verify expected end date
		    String actualendDate=driver.findElement(By.id("dtlview_Support End Date")).getText();
			if (actualendDate.equals(endDate)) {
				System.out.println(endDate +" ended on===>pass");
			} else {
				System.out.println(endDate +" ===>fail");
			}
		
		
	}
	@Test(groups="regressiontest")
	public void createContactWithOrg() throws Throwable 
	{
		//read testScript data from excel file
		String orgname= eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();		
		String contactLastName= eLib.getDataFromExcel("contact", 7, 3);	
		
		
		// navigate to organization
			HomePage hp = new HomePage(driver);
			hp.getOrgLink().click();

	//step3: click on "create organization" button
			OrganizationPage op = new OrganizationPage(driver);
			op.getCreateNewOrgBtn().click();

	//Step:4 Enter detail and create new organization
			CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
			cop.CreateOrg(orgname);
			
			//verify the header massage expected Result
			String HeaderInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if (HeaderInfo.contains(orgname)) {
				System.out.println(orgname +" is created===>pass");
			} else {
				System.out.println(orgname +" is not created===>fail");
			}
			
			// Step2: navigate to Contact
			HomePage hp1 = new HomePage(driver);
			hp1.getContactsLink().click();

			// step3: click on "create contact" button
			ContactPage cp = new ContactPage(driver);
			cp.getCreateNewContactBTN().click();

			// step 4: Enter all the details & create new Contact
			CreateNewContactPage ccp = new CreateNewContactPage(driver);
			ccp.getLastNameTF().sendKeys(contactLastName);
			ccp.getOrgBtn().click();
			
			//Switch to childWindow
		     wLib.switchTabOnURL(driver, "module=Accounts&action");
		     CreateNewOrganizationPage cop1=new CreateNewOrganizationPage(driver);
		     cop1.getSearchBar().sendKeys(orgname);
		     cop1.getSearchBTN().click();
		     driver.findElement(By.xpath("//a[text()='"+orgname+"']")).click();
		     
		   //Switch to Parent Window
				wLib.switchTabOnURL(driver, "module=Contacts&action");
				
				ccp.getSaveBTN().click();
				

				//verify the header massage expected Result
				String HeaderInfo1=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if (HeaderInfo1.contains(contactLastName)) {
					System.out.println(contactLastName +" is created===>pass");
				} else {
					System.out.println(contactLastName +" is not created===>fail");
				}

				
				//verify header orgname info expectedResult
				String HeaderOrgInfo=driver.findElement(By.id("mouseArea_Organization Name")).getText();
				if (HeaderOrgInfo.trim().equals(orgname)) {
					System.out.println(orgname +" is created===>pass");
				} else {
					System.out.println(orgname +" is not created===>fail");
				}
			
			
	}
	
	
}