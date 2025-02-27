package Coding;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week2 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//program1();
		Week2 program = new Week2();
		program.program2();
	}

	public static void program1()
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		 driver.findElement(By.id("fname")).sendKeys("Pavithra");
		 driver.findElement(By.cssSelector("input[value= 'Show me']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passnew")));
		 button.sendKeys( "Test");	
		/* System.out.println(driver.findElement(By.xpath("//input[@id='pass']")).isEnabled());
		WebElement element = driver.findElement(By.xpath("//input[@id='pass']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",element); 
		element.sendKeys("Test"); */
		driver.findElement(By.cssSelector("input[value= 'Submit']")).click();
		driver.quit();
	}
	
	public void program2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qaplayground.dev/apps/tags-input-box/");
		int tags = driver.findElements(By.xpath("//ul//li")).size();
		System.out.println("Existing tags present in the box: " + tags);
		int tagElement = driver.findElements(By.cssSelector("i.uit.uit-multiply")).size();
		for (int i = 0;i<tagElement;i++)
		{
			driver.findElement(By.xpath("//i[contains(@onclick,'remove')]")).click();
		}
		System.out.println("Existing tags after removing from the box: " + driver.findElement(By.xpath("//div[@class='details']//p")).getText());
	    String[] inputValue = {"java","selenium","css","html","python","sql","oracle","testng","cucumber","jenkins"};
	
		for (int i = 0; i<inputValue.length;i++)
		{
			String singleValue = inputValue[i];
			WebElement inbox = driver.findElement(By.cssSelector("input[type= 'text']"));
			inbox.sendKeys(singleValue + Keys.ENTER);
		}
		System.out.println("New tags after adding to the box: " + driver.findElement(By.xpath("//div[@class='details']//p")).getText());
		driver.findElement(By.cssSelector("div[class='details'] button")).click();
		System.out.println("New tags after removing from the box: " + driver.findElement(By.xpath("//div[@class='details']//p")).getText());
		driver.findElement(By.cssSelector("input[type= 'text']")).sendKeys("<script> alert() </script>" + Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//div[@class='content']//ul//li//script"));
		String value = (String)((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;", element);
		System.out.println("Value: " + value);
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
