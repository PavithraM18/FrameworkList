import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=4000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i =0; i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		String TotalUI = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int total = Integer.parseInt(TotalUI);
		Assert.assertEquals(sum, total);
	}

}
