package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Mokshith\\eclipse-workspace\\Orange_HRM\\src\\main\\java\\feature"}
		, glue = {"oh.capg"},
				plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
						"json:target/JSONReports/report.json"},publish=true
				
				
		)

public class TestRunner {

}
