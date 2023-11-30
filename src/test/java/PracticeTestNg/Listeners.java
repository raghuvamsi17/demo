package PracticeTestNg;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("My Test is successfully executed with Listeners class");
		
	}


       @Override
        public void onTestFailure(ITestResult result) {
          // TODO Auto-generated method stub

          System.out.println("I failed executed Listeners Pass code" +result.getName());
          }



              @Override
              public void onTestSkipped(ITestResult result) {

            // TODO Auto-generated method stub

}



@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

// TODO Auto-generated method stub

}



@Override
public void onStart(ITestContext context) {

// TODO Auto-generated method stub

}

@Override
public void onFinish(ITestContext context) {

// TODO Auto-generated method stub

}
}