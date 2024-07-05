
package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        dryRun = false
)
public class TestRunner {
}
