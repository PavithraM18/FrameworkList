package MiscellanousTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//broken url
		//step1: get all url's tied up to the links using selenium
		//step2: Java method will call URL's and get the status code
		//step3: If the status code >400 the URL is not working which is broken link-> can check in UI directly ,network tab during Inspect
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link :links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response = conn.getResponseCode();
			System.out.println (response);
			a.assertTrue(response < 400, "The link with Text " + link.getText()+ "is broken with following code" + response );
			
			/*//hard assertion 
			 		 
			if (response > 400)
			{
				System.out.println("The link with Text " + link.getText()+ "is broken with following code" + response );
				Assert.assertTrue(false);
			}  */
		}
		a.assertAll();
	
	}

}
