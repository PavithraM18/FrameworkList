package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will be executing last");
	}
	@Test(groups = {"Smoke"})
	public void Demo() {
		
		System.out.println("Demo View");
	}

	@Test
	public void secondTest()
	{
		System.out.println("Running 2nd test case");
	}
}
