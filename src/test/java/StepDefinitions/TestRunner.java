package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/DDT.feature", glue = {"StepDefinitions"},
plugin = {"pretty", "html:target/HTMLReports/index.html",
        "pretty", "json:target/JSONReports/report.json",
        "pretty", "junit:target/JunitReports/report.xml"})
public class TestRunner {
    //install few dependencies cucumber-junit, junit, selenium server
}
