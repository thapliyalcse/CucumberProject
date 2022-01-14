package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/FeatureFiles/LoginDemo.feature",
		glue= {"demo.Cucumber"},
		//plugin= {"json:target/cucumber-json/cucumber.json",
		//		"html:target/cucumber-html/index.html",
		//		"junit:target/junit/junit-report"},
				plugin= {"json:CucumberReports/cucumber.json",
						"html:CucumberReports/index.html",
						"junit:target/junit/junit-report"},
		dryRun=false,
		monochrome=true
		
)

public class TestRunner {

}
