package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementsUtilities.ElementUtil;

public class Google {
//	private  WebDriver driver; 
	private ElementUtil Eu;
	
	 public static WebDriver driver;
	public Google(WebDriver driver) 
	{
		
		Google.driver = driver;
		 Eu = new ElementUtil(driver);
	}
	
	public  void goTo()
	{
		driver.get("www.google.com");
	}
	
	public String getTitle()
	{
		String PageTitle = Eu.getPageTitle();
		return PageTitle;
		
	}
	
	By searchbar = By.name("q");
	By urlselect = By.partialLinkText("innovasolutions");
	
	public void search()
	{
		Eu.doActionsSendKeys1(searchbar,"Innova Solutions");
	}
	
	
	public InnovaSolution urlSelection()
	{
		Eu.urlSelect(urlselect);
		return new InnovaSolution(driver);
	}
}
