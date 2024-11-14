package TestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	
	@Test
	public void MoblieLoginHomeLoan()
	{
		System.out.println("MObile login home loan");
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"Smoke"})
	public void APILoginHomeLoan()
	{
		System.out.println("API login home loan");
	}
	
	@Test(retryAnalyzer = RetryFailedTestCases.class) 
	//@Test
	public void MoblieLoanDepartment()
	{
		System.out.println("MObile login home loan");
		Assert.assertTrue(false);
	}
}
