package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@tag",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
        )

@RunWith(Cucumber.class)
public class MainRunner{

}
