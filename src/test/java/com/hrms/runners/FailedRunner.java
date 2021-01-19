package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/FailedTest.txt", // need to give a PATH for our feature files
		glue = "com/hrms/stepDefinitions", // we need to glue our step definitions
		monochrome = true,  
		plugin = { "pretty",
				"html:target/cucumber-default-reports"}
		)

public class FailedRunner {

}
