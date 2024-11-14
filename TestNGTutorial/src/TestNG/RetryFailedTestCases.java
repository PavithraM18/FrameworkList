package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	    private int retryCount = 0;
	    private int maxRetryCount = 3;

	    //This method will be called every time a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
	    
	    public boolean retry(ITestResult result) {

	        if (retryCount < maxRetryCount) {
	        	
	        	System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCount+1));
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
}
