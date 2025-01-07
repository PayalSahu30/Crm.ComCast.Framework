package com.comcast.crm.orgTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.ObjectRepositoryUtility.CreateNewOrganizationPage;
import com.comcast.crm.ObjectRepositoryUtility.HomePage;
import com.comcast.crm.ObjectRepositoryUtility.LoginPage;
import com.comcast.crm.ObjectRepositoryUtility.OrganizationPage;
import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class OrganizationTest extends BaseClass {
	@Test(groups="smoketest")
	public void CreateOrgTest() throws Throwable {

// read testScript data from excel file
		String orgname = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber();

//Step2: navigate to organization
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

//step3: click on "create organization" button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

//Step:4 Enter detail and create new organization
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.CreateOrg(orgname);

//verify the header massage expected Result
		String HeaderInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if (HeaderInfo.contains(orgname)) {
			System.out.println(orgname + " is created===>pass");
		} else {
			System.out.println(orgname + " is not created===>fail");

		}

//verify header orgname info expectedResult
		String HeaderOrgInfo = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if (HeaderOrgInfo.equals(orgname)) {
			System.out.println(orgname + " is created===>pass");
		} else {
			System.out.println(orgname + " is not created===>fail");
		}

	}

	@Test(groups="regressiontest")
	public void CreateOrganizationWithPhoneNumber() throws Throwable {
		// read testdata from excel file
		String orgname = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNumber();
		String phoneno = eLib.getDataFromExcel("org", 7, 3);

		// Step2: navigate to organization
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// step3: click on "create organization" button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		// Step:4 Enter detail and create new organization
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.CreateorgWithPhoneNo(orgname, phoneno);

		// verify the phoneNumber expected Result
		String actualno = driver.findElement(By.id("dtlview_Phone")).getText();
		if (actualno.equals(phoneno)) {
			System.out.println(phoneno + " is created===>pass");
		} else {
			System.out.println(phoneno + " is not created===>fail");
		}
		

		//verify the OrgName expected Result
				String HeaderInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if (HeaderInfo.contains(orgname)) {
					System.out.println(orgname + " is created===>pass");
				} else {
					System.out.println(orgname + " is not created===>fail");
				}
				

	}
	
	@Test(groups="regressiontest")
	public void CreateOrgWithIndustryNType() throws Throwable
	{
		//read testScript data from excel file
		String orgname= eLib.getDataFromExcel("org", 4, 2)+ jLib.getRandomNumber();	
		String industryname=eLib.getDataFromExcel("org", 4, 3);
		String type= eLib.getDataFromExcel("org", 4, 4);
		
		//Step2: navigate to organization
				HomePage hp = new HomePage(driver);
				hp.getOrgLink().click();

		//step3: click on "create organization" button
				OrganizationPage op = new OrganizationPage(driver);
				op.getCreateNewOrgBtn().click();

		//Step:4 Enter detail and create new organization
				CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
				cop.createOrgWithIndustry_NType(orgname, industryname, type);
				

				//verify the industry expected Result
				String industryInfo=driver.findElement(By.id("dtlview_Industry")).getText();
				if (industryInfo.equals(industryname)) {
					System.out.println(industryname +" industry is verified===>pass");
				} else {
					System.out.println(industryname +" is not verified===>fail");
				}
				
				//verify header type info expectedResult
				String typeInfo=driver.findElement(By.id("dtlview_Type")).getText();
				if (typeInfo.equals(type)) {
					System.out.println(type +" industry type is verified====>pass");
				} else {
					System.out.println(type +" is not verified====>fail");
				}
		
	}
}