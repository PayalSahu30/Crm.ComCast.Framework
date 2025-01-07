package com.comcast.crm.ListenerUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.generic.weddriverUtility.ClassObjectUtility;

public class ListenerImplementationClass implements ITestListener, ISuiteListener {
	

   public static ExtentReports report;
   public ExtentTest test;
   
   
	@Override
    public void onStart(ISuite suite) {
	System.out.println("===reportConfig===");
	
	//Spark Report Config
	String time= new Date().toString().replace(" ", "_").replace(":", "_");
	ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReports/report_"+time+".html");
	spark.config().setDocumentTitle("CRM test Suite Result");
	spark.config().setReportName("CRM report");
	spark.config().setTheme(Theme.STANDARD);
	
	//ADD ENVIRONMENT INFORMATION & CREATE TEST
	  report = new ExtentReports();
	  report.attachReporter(spark);
	  report.setSystemInfo("OS", "Windows-10");
	  report.setSystemInfo("Browser", "chrome");
	  
}
	
	public void onFinish(ISuite suite) {
		System.out.println("===reportBackup===");
		report.flush();
	}
	
	public void onTestStart(ITestResult result) {
		
		test=report.createTest(result.getMethod().getMethodName());
		ClassObjectUtility.setTest(test);
		test.log(Status.INFO,result.getMethod().getMethodName()+"==STARTED==");
	}
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"==COMPLETED==");
	}
	
	public void onTestFailure(ITestResult result) {
		
		
		String testName= result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) BaseClass.sdriver;
		
		// for ScreenShot image in folder
//		File temp= ts.getScreenshotAs(OutputType.FILE);
//		
//		//To add date and time in filename
//		String time= new Date().toString().replace(" ", "_").replace(":", "_");
//		File dest = new File("./Screenshots/"+testName+time+".png");
//		try {
//			FileHandler.copy(temp, dest);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		//  Screenshot image in extent Report
		String filePath=ts.getScreenshotAs(OutputType.BASE64);
		String time= new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath,testName+" "+time);
		test.log(Status.FAIL,result.getMethod().getMethodName()+"==FAILED==");
	}
}
