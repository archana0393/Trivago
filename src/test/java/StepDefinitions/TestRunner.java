package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"}
//plugin = {"json:target/cucumber.json"}
//plugin= {"pretty","json:target/jsonreports/report.json"}
//plugin= {"pretty","junit:target/junitreport/report.xml"}
		)
public class TestRunner {

}
