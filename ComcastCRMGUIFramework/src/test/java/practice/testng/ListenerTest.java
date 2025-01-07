package practice.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.BaseClassUtility.BaseClass;


public class ListenerTest extends BaseClass
{
@Test(retryAnalyzer=com.comcast.crm.ListenerUtility.RetryListenerImplementation.class)
public void CreateInvoiceTest()
{
	System.out.println("execute CreateInvoiceTest");
	System.out.println("Step1");
	System.out.println("Step2");
	String acttitle=driver.getTitle();
	Assert.assertEquals(acttitle, "Login");      //intentionally fail
	System.out.println("Step3");
	System.out.println("Step4");
	System.out.println("Step5");
	}
//@Test
//public void CreateInvoiceWithContactTest()
//{
//	System.out.println("execute CreateInvoiceWithContactTest");
//	System.out.println("Step1");
//	System.out.println("Step2");
//	System.out.println("Step3");
//	System.out.println("Step4");
//	System.out.println("Step5");
//	}
}
