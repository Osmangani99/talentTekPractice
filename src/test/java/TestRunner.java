import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/FeatureFiles/signup.feature",
        glue = "stepDef",
        plugin = {
                "json:target/cucumber.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {




}
