package MiscellanousTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionkey");
		driver.get("https://www.google.com/");
		
		//C:\Users\Pavithra.Mathivanan.ACS\OneDrive - Innova Solutions\eclipse-workspace
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Pavithra.Mathivanan.ACS\\OneDrive - Innova Solutions\\eclipse-workspace\\Screenshot.png"));
		
	}

}
