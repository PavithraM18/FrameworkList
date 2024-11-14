package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDatepick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(10000);
		// Scroll the Page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)");
		// Click on the Date field
		Thread.sleep(3000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("December"))
		{
			Thread.sleep(2000);
		     driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		     
		}

		int date = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();

		for(int i=0;i<date;i++)
		{	
			Thread.sleep(2000);
		     String text=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
		     if(text.equalsIgnoreCase("10"))
		     {    
		    	 driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
		    	 System.out.println("The select day is:"+text);
		    	 break;
		     }

		}

		String SelectedDate = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value");

		System.out.println("The select date is:"+SelectedDate);
		
	}

}
