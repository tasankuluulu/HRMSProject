package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", // need to give a PATH for our feature files
		glue = "com/hrms/stepDefinitions", // we need to glue our step definitions
		dryRun = false, 
		monochrome = true, 
		tags = "@AddDependents", 
		strict = false, 
		plugin = { "pretty",
				"html:target/cucumber-default-reports", 
				"rerun:target/FailedTest.txt", // generates texreports
				"json:target/cucumber.json"} // generates json reports
		)
public class TestRunner {

}
