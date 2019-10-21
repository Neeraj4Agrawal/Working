package com.qa.runners;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Bridesides\\FreeCRMCucumberFramework\\src\\test\\java\\com\\qa\\features\\loginadvance.feature"
		,glue= {"com\\qa\\stepdefinitions"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	//	plugin= {"html:target/cucumber-html-report","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
	//	tags= {"@SmokeTest"}
	//	tags= {"@SmokeTest , @RegressionTest"}      //here comma act as OR operator
	//	tags= {"@SmokeTest" , "@RegressionTest"}     // acts as AND
			//	tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}  //WILL IGONORE smoke,regression and endtoend
		
		)

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	



public class TestRunner2 {
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("C:\\Bridesides\\FreeCRMCucumberFramework\\src\\main\\java\\com\\qa\\config\\extent-config.xml"));
	 }
	
	
	
	
	
	
	

}
