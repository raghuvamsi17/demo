package PracticeTestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiceTest2 {
	
	@Test(dependsOnMethods= {"Mobile"})
	public void Demo()
	{
	System.out.println("Selenium");
	System.out.println("Selenium");
	System.out.println("Selenium");
	}
	
	
	@BeforeMethod
	public void Demo1() {
		
		System.out.println("Rest assured");
	}
	
	@Test(enabled=true)
	public void Demo2() {
		
		System.out.println("Jmeter");
	}
	
	@Parameters({"API/Appium","URL"})

	@Test
	public void Mobile(String mana,String url) {
		
		System.out.println("Appium");
		System.out.println(mana);
		System.out.println(url);
	}

	@Test
	public void NotMobile() {
		
		System.out.println("Appiumnew");
	}

}
