package Programs;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScannerClassExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name:");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavithra.mathivanan\\OneDrive - InnovaSolutions\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavithra.mathivanan\\OneDrive - InnovaSolutions\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Invalid browser");
		}
		Thread.sleep(5000);
		driver.quit();

		}

}
