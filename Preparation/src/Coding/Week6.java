package Coding;

import static org.testng.Assert.assertEquals;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Week6 {

	public static void main(String[] args) throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
	
		//week1();
		week2();
	}

	private static void week2() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Pavithra");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Mathivanan");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("mpavithra18@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//button[@title= 'Create an Account']")).click();
		
		
		driver.findElement(By.cssSelector("#ui-id-4")).click();
		
	}

	public static void week1() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
            // Navigate to the Shadow DOM page
            driver.get("http://uitestingplayground.com/shadowdom");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Access the Shadow DOM element
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowHost = driver.findElement(By.cssSelector("guid-generator"));
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
            WebElement generateButton = shadowRoot.findElement(By.cssSelector("#buttonGenerate"));
            generateButton.click();
            WebElement copyButton = shadowRoot.findElement(By.cssSelector("#buttonCopy"));
            copyButton.click();
            Thread.sleep(1000);

            // Get the clipboard content (GUID)
            String clipboardValue = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

            WebElement guidInputField = shadowRoot.findElement(By.cssSelector("#editField"));
            String inputFieldValue = guidInputField.getAttribute("value");

            Assert.assertEquals( clipboardValue, inputFieldValue, "The clipboard value should match the input field value");
            System.out.println("Test Passed: The GUIDs match!");

        }
		finally {
            driver.quit();
        }
	
	}
}
