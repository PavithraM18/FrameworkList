import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebIntroduction {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra.Mathivanan.ACS\\OneDrive - Innova Solutions\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavithra.mathivanan\\OneDrive - InnovaSolutions\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com");
	
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
