package seleniumframework.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports ereport ;
	
	@BeforeTest
	public void config()
	{
		//ExtentReports  , ExtentSparkReporter
		//C:\Users\pavithra.mathivanan\OneDrive - InnovaSolutions\eclipse-workspace\ExtentReports
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ereport = new ExtentReports();
		ereport.attachReporter(reporter);
		ereport.setSystemInfo("Tester", "Pavithra");	
	}
	

	
	@Test
	public void initialDemo() {
	
	   ExtentTest test = ereport.createTest("Intitial Demo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("test do not match");
		
		ereport.flush();
	}

}
