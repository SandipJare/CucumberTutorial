package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "AllFeatureFiles/FaceBook.feature" }, 
		glue = { "stepsDefinition" },
		dryRun = false,
		monochrome=true,
		plugin = {
		"html:Reports/a.html",
		"json:Reports/b.json",
		"junit:Reports/c.xml",
		"pretty:reports/d.txt" }

)

public class FacebookRunnerClass extends AbstractTestNGCucumberTests {

}
