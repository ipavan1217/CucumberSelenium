package testRunners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= "stepDefinitions",format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner_GoogleHomepage {

}