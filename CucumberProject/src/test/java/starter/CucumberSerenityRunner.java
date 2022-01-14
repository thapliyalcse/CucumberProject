package starter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
(
		features="src/test/resources/FeatureFiles/LoginSerenity.feature",
		glue= {"demo.Cucumber"}
		
)
public class CucumberSerenityRunner {

}
