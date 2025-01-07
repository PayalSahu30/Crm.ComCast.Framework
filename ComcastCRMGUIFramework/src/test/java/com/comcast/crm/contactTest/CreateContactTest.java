package com.comcast.crm.contactTest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class CreateContactTest 
{
	public static void main(String[] args) throws Throwable 
	{
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
			String lastname= eLib.getDataFromExcel("contact", 1, 2) +  jLib.getRandomNumber();
						
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
			
			
			//Step2: navigate to Contact
			driver.findElement(By.linkText("Contacts")).click();
			
			//step3: click on "create contact" button
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			
			//Step:4 Enter detail and create new contact
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			Thread.sleep(2000);
			
			//verify the header massage expected Result
			String HeaderInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if (HeaderInfo.contains(lastname)) {
				System.out.println(lastname +" is created===>pass");
			} else {
				System.out.println(lastname +" is not created===>fail");
			}
			
			//verify header lastname info expectedResult
			String HeaderOrgInfo=driver.findElement(By.id("dtlview_Last Name")).getText();
			if (HeaderOrgInfo.equals(lastname)) {
				System.out.println(lastname +" is created===>pass");
			} else {
				System.out.println(lastname +" is not created===>fail");
			}
			
			//Step:5 logout

			wLib.mousemoveonElement(driver,driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
			driver.findElement(By.linkText("Sign Out")).click();
			
			driver.quit();
		}
	
}
