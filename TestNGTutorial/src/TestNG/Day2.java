package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void thirdTest()
	{
		System.out.println("Running 3rd test case");
	}
	
	@BeforeTest
	public void preRequiste()
	{
		System.out.println("I will be execute first");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will be 1 one");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I will be Last");
	}
}
