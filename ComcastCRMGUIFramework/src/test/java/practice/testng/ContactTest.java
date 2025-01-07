package practice.testng;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(priority=1)
	public void createContactTest()
	{
		System.out.println("Execute====>createContactTest");
	}
	@Test(priority=2)
	public void ModifyContactTest()
	{
		System.out.println("Execute====>ModifyContactTest");
	}
	@Test(priority=3)
	public void DeleteContactTest()
	{
		System.out.println("Execute====>DeleteContactTest");
	}
	
	@Test(invocationCount=3)
	public void RenameContactTest()
	{
		System.out.println("Execute====>RenameContactTest");
	}
}
