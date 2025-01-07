package com.comcast.crm.contactTest;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class CreateContactWithSupportDateTest 
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
			String lastname= eLib.getDataFromExcel("contact", 4, 2)+ jLib.getRandomNumber();
					
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
			driver.manage().window().maximize();
			
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			
			
			//Step2: navigate to organization
			driver.findElement(By.linkText("Contacts")).click();
			
			//step3: click on "create organization" button
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			
			//Step:4 Enter detail and create new organization
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			
				//Set Date And after 30 days date
				String startDate=jLib.getSystemDateYYYYMMDD();
				String endDate=jLib.getRequiredDateYYYYMMDD(30);
			
				
			
			driver.findElement(By.name("support_start_date")).clear();
			driver.findElement(By.name("support_start_date")).sendKeys(startDate);
			
			driver.findElement(By.name("support_end_date")).clear();
			driver.findElement(By.name("support_end_date")).sendKeys(endDate);	
			
			System.out.println(startDate);
			System.out.println(endDate);
			
			
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(2000);
			
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
				
			

			
			//Step:5 logout
			WebElement logo=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			wLib.mousemoveonElement(driver,logo);
//			Actions act= new Actions(driver);
//			act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
			
			driver.findElement(By.linkText("Sign Out")).click();
			
			driver.quit();
		
}
}

