package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features",
glue = {"StepDefinition"},
monochrome = true,
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true)
 
public class Testrunner extends AbstractTestNGCucumberTests  {

}
