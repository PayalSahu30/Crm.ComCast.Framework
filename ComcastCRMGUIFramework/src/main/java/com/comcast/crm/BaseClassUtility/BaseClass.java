package com.comcast.crm.BaseClassUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.comcast.crm.ObjectRepositoryUtility.HomePage;
import com.comcast.crm.ObjectRepositoryUtility.LoginPage;
import com.comcast.crm.generic.databaseUtility.DataBaseUtility;
import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.fileUtility.FileUtility;
import com.comcast.crm.generic.weddriverUtility.ClassObjectUtility;
import com.comcast.crm.generic.weddriverUtility.JavaUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class BaseClass
{
	public WebDriver driver=null; // important for parellel execution
	public DataBaseUtility dbLib=new DataBaseUtility();
	public FileUtility fLib= new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public  static WebDriver sdriver=null;    //for listeners
	
	@BeforeSuite(groups= {"smoketest", "regressiontest"})
	public void configBS()
	{
		System.out.println("==DB Connect, Report config==");
		//dbLib.getConnection();
	}
	
	
	//Data from Property file
	@BeforeClass(groups= {"smoketest", "regressiontest"})
	public void configBC() throws Throwable
	{
		System.out.println("==Launch Browser==");
//		Data from property file
//		String Browser=fLib.getDataFromPropertiesFile("browser");
	
//		data from commandline---- if cmd is null then property file
		String Browser=  System.getProperty("browser",fLib.getDataFromPropertiesFile("browser"));
		
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
		sdriver=driver;
		ClassObjectUtility.setDriver(driver);
	}
	
	
	//Data From Xml File for cross browser Parellel Execution
//	@Parameters("BROWSER")
//	@BeforeClass(groups= {"smoketest", "regressiontest"})
//	public void configBC(String browser) throws Throwable
//	{
//		System.out.println("==Launch Browser==");
//		String Browser=browser;
//		
//		
//		if(Browser.equals("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(Browser.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else if(Browser.equals("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}
//	}
	
	@BeforeMethod(groups= {"smoketest", "regressiontest"})
	public void configBM() throws Throwable
	{
		System.out.println("==Login==");
		LoginPage lp=new LoginPage(driver);
//		Data from property file
//		String URL=fLib.getDataFromPropertiesFile("url");
//		String USERNAME=fLib.getDataFromPropertiesFile("username");
//		String PASSWORD=fLib.getDataFromPropertiesFile("password");
//		
		
//		data from commandline
//		String URL=System.getProperty("url");
//		String USERNAME=System.getProperty("username");
//		String PASSWORD=System.getProperty("password");
//		
		// if data from commandline is null then automatically take data from Propertyfile
		String URL=System.getProperty("url",fLib.getDataFromPropertiesFile("url"));
		String USERNAME=System.getProperty("username",fLib.getDataFromPropertiesFile("username"));
		String PASSWORD=System.getProperty("password",fLib.getDataFromPropertiesFile("password"));
		
		lp.LoginToApp(URL,USERNAME,PASSWORD);
	}
	
	@AfterMethod(groups= {"smoketest", "regressiontest"})
	public void configAM()
	{
		System.out.println("==LogOut==");
		HomePage hp=new HomePage(driver);
		hp.logout();
		
	}
	@AfterClass(groups= {"smoketest", "regressiontest"})
	public void configAC()
	{
		System.out.println("==close the Browser==");
		driver.quit();
	}
	@AfterSuite(groups= {"smoketest", "regressiontest"})
	public void configAS()
	{
		System.out.println("==close DB, Report Backup== ");
		// dbLib.closeDbConnection();
	}
}
