package com.comcast.crm.orgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.ObjectRepositoryUtility.HomePage;
import com.comcast.crm.ObjectRepositoryUtility.LoginPage;
import com.comcast.crm.ObjectRepositoryUtility.OrganizationPage;
import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class DeleteOrganizationTest
{
	public static void main(String[] args) throws Throwable {
		//Create Object
				FileUtility fLib=new FileUtility();
				ExcelUtility eLib=new ExcelUtility();
				JavaUtility jLib=new JavaUtility();
				WebDriverUtility wLib=new WebDriverUtility();
				
				
				//read common data from property file	
					String Browser=fLib.getDataFromPropertiesFile("browser");
					String URL=fLib.getDataFromPropertiesFile("url");
					String USERNAME=fLib.getDataFromPropertiesFile("username");
					String PASSWORD=fLib.getDataFromPropertiesFile("password");

				//read testScript data from excel file
					String orgname= eLib.getDataFromExcel("org", 1, 2)+ jLib.getRandomNumber();	
			
						
			//Choose Browser
			WebDriver driver=null;
			if(Browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(Browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(Browser.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			else
			{
				driver=new ChromeDriver();
			}
			
			
			
			//Step1: login to app
			wLib.waitForPageToLoad(driver);
			driver.get(URL);
			
			LoginPage lp=new LoginPage(driver);
			lp.LoginToApp(USERNAME, PASSWORD);       //un and pswd from property file
			
			
			
			//Step2: navigate to organization
			driver.findElement(By.linkText("Organizations")).click();
			
			//step3: click on "create organization" button
			driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
			
			//Step:4 Enter detail and create new organization
			driver.findElement(By.name("accountname")).sendKeys(orgname);
			driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			Thread.sleep(2000);
			
			//verify the header massage expected Result
			String HeaderInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if (HeaderInfo.contains(orgname)) {
				System.out.println(orgname +" is created===>pass");
			} else {
				System.out.println(orgname +" is not created===>fail");
					
			}
			
			
			//verify header orgname info expectedResult
			String HeaderOrgInfo=driver.findElement(By.id("dtlview_Organization Name")).getText();
			if (HeaderOrgInfo.equals(orgname)) {
				System.out.println(orgname +" is created===>pass");
			} else {
				System.out.println(orgname +" is not created===>fail");
			}
			
			//go back to organization Page
			HomePage hp=new HomePage(driver);
			hp.getOrgLink().click();
			
			//search for Organization
			OrganizationPage op=new OrganizationPage(driver);
			op.getSearchBar().sendKeys(orgname);
			wLib.select(op.getSearchDD(), "Organization Name");
			op.getSearchBtn().click();
			
			//in dynamic table select org and delete
			
			driver.findElement(By.xpath("//a[text()='"+orgname+"']/../../td[8]/a[text()='del']")).click();
			wLib.switchToAlertAndAccept(driver);
			
			
			//Step:5 logout
			wLib.mousemoveonElement(driver, driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
			driver.findElement(By.linkText("Sign Out")).click();
			
			driver.quit();
		}
	}

