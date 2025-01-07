package practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileUtility.ExcelUtility;
import com.comcast.crm.generic.weddriverUtility.WebDriverUtility;

public class CreateContact_DP_XLS_Test 
{
@Test(dataProvider="getData")
public void getproductInfoTest(String BrandName, String ProductName) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in");
	
	// search product
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(BrandName,Keys.ENTER);
	Thread.sleep(2000);
	
	//Capture product Info
	String prod="//span[text()='"+ProductName +"']/../../../../div[4]/div[1]/div/div/div[1]/div[1]/a/span/span[2]/span[2]";
	String price=driver.findElement(By.xpath(prod)).getText();
	System.out.println("Phone price: "+ price);
	driver.quit();
}

@DataProvider
public Object[][] getData() throws Throwable
{
	ExcelUtility elib=new ExcelUtility();
	
	int rowCount=elib.getRowCount("product");
	System.out.println(rowCount);
	Object[][] objarr= new Object[rowCount][2];
	
	for (int i = 0; i < rowCount; i++) {
	objarr[i][0]=elib.getDataFromExcel("product", i+1, 0);	
	objarr[i][1]=elib.getDataFromExcel("product", i+1, 1);
	}
	
	
	return objarr;
	
}
}

