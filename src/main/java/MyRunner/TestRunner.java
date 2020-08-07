package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features/login.feature",//the path of the feature files
        glue ={"stepDefinitions"}
)
public class TestRunner {

}
