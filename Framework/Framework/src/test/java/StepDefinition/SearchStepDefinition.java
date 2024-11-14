package StepDefinition;

import java.io.IOException;
import org.testng.Assert;
import Driver.DriverFactory;
import Pages.Google;
import Pages.InnovaSolution;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition  extends DriverFactory {
	//public static WebDriver driver;
	DriverFactory df = new DriverFactory();
	Google go =  new Google(df.url());
	InnovaSolution IS =   new InnovaSolution(driver);
	//private InnovaSolution innova;
	
	@Given("Launch Google")
	public void launch_google() throws IOException {
		//initializeDriver();
	    //go.goTo();
	    String title = go.getTitle();
	    Assert.assertEquals("Google", title);
	}

	@When("Enter the innova solution in searchbar")
	public void enter_the_innova_solution_in_searchbar() {
		go.search();
	
	}

	@When("Open the first result url")
	public void  open_the_first_result_url() {
		go.urlSelection();
	}

	@Then("Get the title page")
	public void get_the_title_page() throws IOException {
		 IS.screenShot();
		String Title = IS.getTitle();
		// Assert.assertEquals("Innova Solutions (formerly ACS Solutions)", Title);
		 Assert.assertEquals("Reasons to count on us - Innova solutions", Title);
		 df.close();
		  
	}


}
