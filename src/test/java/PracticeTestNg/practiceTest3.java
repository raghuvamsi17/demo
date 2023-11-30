package PracticeTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiceTest3 {
	
	
	@Parameters({"API/Appium"})
	@Test
	public void Demo(String username)
	{
	System.out.println(username);
	}
	
	
	@Test
	public void city()
	{
	 System.out.println("Hyderabad");
	 Assert.assertTrue(false);
	}
	
	
	@AfterTest
	public void State() {
		
		System.out.println("Telangana");
	}


}
