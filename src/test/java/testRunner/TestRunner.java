package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
				plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		dryRun = false,
		monochrome = true
		//tags = "@T2"
		)
 
public class TestRunner {

}
