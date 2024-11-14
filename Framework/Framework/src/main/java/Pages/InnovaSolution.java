package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import ElementsUtilities.ElementUtil;

public class InnovaSolution{

	public ElementUtil eu;
	 public static WebDriver driver;
	public InnovaSolution(WebDriver driver)
	{
		InnovaSolution.driver = driver;
		eu = new ElementUtil(driver);
	}

	public String getTitle()
	{
		String PageTitle = eu.getPageTitle();
		return PageTitle;
		
	}
	
	
	public void screenShot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\pavithra.mathivanan\\OneDrive - InnovaSolutions\\eclipse-workspace\\Framework\\target\\CucumberShot.png"));
	}
   

}
