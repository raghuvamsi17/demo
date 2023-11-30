package PracticeTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiceTestng {
	
	
	@Parameters({"URL"})
	@Test
	public void Demo(String naistam)
	{
		int a=10;
		int b=20;
		int c=a+b;
	System.out.println(c);
	System.out.println(naistam);
	}
	
	
	@Test(dataProvider="getData")
	public void Second(String username ,String password) {
		System.out.println("New data provider");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object [3][2];
		//1st Set data
		data[0][0]="firstuser";
		data[0][1]="password";
		//Second set data
		data[1][0]="seconduser";
		data[1][1]="password";
		//third set of data
		data[2][0]="thirduser";
		data[2][1]="password";
		return data;
		
		
	}

}
	

