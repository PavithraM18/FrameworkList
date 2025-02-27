package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra.Mathivanan.ACS\\OneDrive - Innova Solutions\\chromedriver.exe");
			//ChromeOptions ops = new ChromeOptions();
			//ops.addArguments("--remote-allow-origins=*");
			//	WebDriver driver = new ChromeDriver(ops);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticDropdown);
				dropdown.selectByIndex(3);
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByVisibleText("AED");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByValue("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				System.out.println(dropdown.getFirstSelectedOption().isSelected());
				
				
			
	}

}
