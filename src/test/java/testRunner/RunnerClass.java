package testRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		glue= {"stepsDefinition"},
		dryRun=false,
		monochrome=true,
				plugin= {"html:Reports/abc.html",
						 "json:Reports/pqc.json",
						 "junit:Reports/abd.xml",
						 "pretty:Reports/pqr.txt"
				}
		
		)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
