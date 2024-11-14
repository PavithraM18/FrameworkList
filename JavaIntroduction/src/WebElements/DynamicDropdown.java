package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra.Mathivanan.ACS\\OneDrive - Innova Solutions\\chromedriver.exe");
		//ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='SAG']")).click();
		driver.findElement(By.xpath("//div[@id = \"glsctl00_mainContent_ddl_originStation1_CTNR\"]  //a[@value='SAG']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver.findElement(By.xpath("//div[@id = \"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]  //a[@value='DEL']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
	}

}
