package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactDataProvider
{
@Test(dataProvider="getData")
public void createContactTest(String firstName, String lastname, long Phoneno)
{
	System.out.println("FirstName : " + firstName+ " LastName : " + lastname+ " Contact No: " + Phoneno );
}

@DataProvider
public Object[][] getData()
{
	Object[][] objarr= new Object[3][3];
	objarr[0][0]="Payal";
	objarr[0][1]="Sahu";
	objarr[0][2]=123456789l;
	
	objarr[1][0]="Palak";
	objarr[1][1]="kawre";
	objarr[1][2]=123456709l;
	
	objarr[2][0]="Prisha";
	objarr[2][1]="meh";
	objarr[2][2]=123456780l;
	
	return objarr;
}
}
