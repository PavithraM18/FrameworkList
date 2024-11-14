package Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	
	//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	  public static WebDriver driver;
	
	  
	public WebDriver initializeDriver() throws IOException
	{
		//properties class can read the global properties file
		
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\Pavithra.Mathivanan.ACS\\OneDrive - Innova Solutions\\eclipse-workspace\\Framework\\src\\test\\resources\\Config");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{	
			 driver = new FirefoxDriver();
		}
 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public WebDriver url() {
		
		try {
			initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		driver.get("https://www.google.com/");
		return driver;
	}
	
	
	public void close() {
		
		driver.quit();
	}
}
