package com.comcast.crm.contactTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class CreateContactwithOrg 
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
	String orgname= eLib.getDataFromExcel("contact", 7, 2)+ jLib.getRandomNumber();		
	String contactLastName= eLib.getDataFromExcel("contact", 7, 3);
			
			
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
			
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			
			
			//Step2: navigate to organization
			driver.findElement(By.linkText("Organizations")).click();
			
			//step3: click on "create organization" button
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			
			//Step:4 Enter detail and create new organization
			driver.findElement(By.name("accountname")).sendKeys(orgname);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(2000);
			
			
			
			
			
			//verify the header massage expected Result
			String HeaderInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if (HeaderInfo.contains(orgname)) {
				System.out.println(orgname +" is created===>pass");
			} else {
				System.out.println(orgname +" is not created===>fail");
			}
			
			//Step5: navigate to organization
			driver.findElement(By.linkText("Contacts")).click();
			
			//step6: click on "create organization" button
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			
			//Step:7 Enter detail and create new organization
			driver.findElement(By.name("lastname")).sendKeys(contactLastName);
			driver.findElement(By.xpath("//input[@name='account_name']/../img")).click();
			
			//Switch to childWindow
		     wLib.switchTabOnURL(driver, "module=Accounts&action");
			
			driver.findElement(By.name("search_text")).sendKeys(orgname);
			driver.findElement(By.name("search")).click();
			driver.findElement(By.xpath("//a[text()='"+orgname+"']")).click();
			
			//Switch to Parent Window
			wLib.switchTabOnURL(driver, "module=Contacts&action");
						
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(2000);
			
			
			
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

	driver.quit();
	}
}