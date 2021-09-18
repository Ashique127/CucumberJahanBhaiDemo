package TestRunneeer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "SteppDefff")

//tags= {""})

public class TestRunnerrrrrr extends AbstractTestNGCucumberTests {

}
