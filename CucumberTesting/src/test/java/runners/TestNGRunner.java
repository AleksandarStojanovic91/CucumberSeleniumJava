package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources",glue = "stepDefinitions")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
