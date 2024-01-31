
package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression or @performance",features={"src/test/resources/FeatureWithTags/"},
glue= {"StepDefinitions"},
plugin = {"pretty", "html:target/cucumber-reports.html"})


public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests{

}
