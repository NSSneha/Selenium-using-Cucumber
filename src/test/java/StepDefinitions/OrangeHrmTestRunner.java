package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/OrangeHrm.feature", glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/HTMLReports/orange.html",
                "pretty", "json:target/JSONReports/orange.json",
                "pretty", "junit:target/JunitReports/orange.xml"})
public class OrangeHrmTestRunner {
}
