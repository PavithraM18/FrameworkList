import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		By username = By.name("email");
		By password = By.cssSelector("input[type = 'password']");
		String uname = "mpavithra18";
						
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys("TEST");
	}

}
