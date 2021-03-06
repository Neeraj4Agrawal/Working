package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Bridesides/FreeCRMCucumberFramework/src/main/java/feature/tagging.feature"
		,glue= {"StepDefinition"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=true,
	//	tags= {"@SmokeTest"}
	//	tags= {"@SmokeTest , @RegressionTest"}      //here comma act as OR operator
	//	tags= {"@SmokeTest" , "@RegressionTest"}     // acts as AND
				tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}  //WILL IGONORE smoke,regression and endtoend
		
		)

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	



public class TestRunner {	

}
