package PracticeTestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiceTest1 {
	
	
	@Parameters({"URL"})
	@Test
	public void Demo(String username)
	{
	System.out.println("Hello");
	System.out.println(username);
	}
	
	
	@Test(groups={"smoke"})
	public void Third()
	{
	 System.out.println("Tech services");
	}
	
	
	@AfterTest
	public void Second() {
		
		System.out.println("Epethilial LLP");
	}


}
