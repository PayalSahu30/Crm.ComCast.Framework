package practice.testng;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.ListenerUtility.ListenerImplementationClass;

@Listeners(com.comcast.crm.ListenerUtility.ListenerImplementationClass.class)
public class SampleReportTest extends BaseClass {
@Test
public void CreateContact() {

	TakesScreenshot ts= (TakesScreenshot)driver;
	String filepath= ts.getScreenshotAs(OutputType.BASE64); //because ExtentReport Support Base64
	
	ExtentTest test= ListenerImplementationClass.report.createTest("CreateContact");
	
	test.log(Status.INFO, "login to app");
	test.log(Status.INFO, "Navigate to homepage");
	test.log(Status.INFO, "create contact");
	test.log(Status.INFO, "click on crete contact");
	if("hdfc".equals("hdfcc"))
	{
		test.log(Status.PASS, "same");
	}
	else
	{
		test.log(Status.FAIL, "same");
		test.addScreenCaptureFromBase64String(filepath,"ERRORFILE"); 
	}
	
}
}
