package Interv;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Veggiecart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //implicit wait
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait
		
		String[] veggie = { "Brocolli", "Cucumber", "Tomato", "Mushroom", "Mango" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, veggie);
		//Veggiecart vc = new Veggiecart();
		//vc.addItems(driver, veggie);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()= 'PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class= 'promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class= 'promoInfo']")).getText());
		
		
	}

	public static void addItems(WebDriver driver, String[] veggie)
	{
		int j= 0;
		List<WebElement> veggieList = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0;i<veggieList.size();i++)
		{
			
			String[] veggieName = veggieList.get(i).getText().split("-");
			String formattedVeggiename = veggieName[0].trim();
			// check whether the name you extracted is present in array or not
			//convert array into array list for easy search
			List<String> vegList = Arrays.asList(veggie);
			
			
			if(vegList.contains(formattedVeggiename))
			{
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				
				if (j == veggie.length)
				{
				break;
				}
			}
		}
	}
}
