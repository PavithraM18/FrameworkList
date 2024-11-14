package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing any methods in this Day3 class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all methods in this Day3 class");
	}

	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in this Day3 class");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method in this Day3 class");
	}
	
	//@Parameters({"url"})
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		System.out.println("Web login car loan");
		//System.out.println(urlname);
	}
	
	@Test(groups = {"Smoke"})
	public void MoblieLoginCarLoan()
	{
		System.out.println("MObile login car loan");
	}
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"})
	public void APILoginCarLoan()
	{
		System.out.println("API login car loan");
	}
	@Test(enabled = false)
	public void APISigninCarLoan()
	{
		System.out.println("API signin car loan");
	}
	
	@Test(timeOut = 4000)
	public void APISignoutCarLoan()
	{
		System.out.println("API signout car loan");
	}
}
