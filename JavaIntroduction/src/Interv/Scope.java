package Interv;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		 WebElement footerlink = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerlink.findElements(By.tagName("a")).size());
		WebElement columnlink = footerlink.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));
		System.out.println(columnlink.findElements(By.tagName("a")).size());
		
		for (int i =1;i< columnlink.findElements(By.tagName("a")).size() ; i++)
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnlink.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
		}
		Set<String> links = driver.getWindowHandles();
		Iterator<String> it = links.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	}

}
