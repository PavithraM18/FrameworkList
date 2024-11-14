package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all the web elements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		//capture the text of all web elements into new (original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step3 ->sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		// compare original vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
	/*	//scan the name column with getText -> beans - print the price of the beans at 1st page
		List<String> price = elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
				price.forEach(a->System.out.println(a));    
				*/
		
		//scan the name column with getText in all pages until name found-> Rice - print the price of the rice 
		List<String> price ;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));  
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;

	}

}
