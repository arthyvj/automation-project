package org.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@CucumberOptions(features ="src/test/resources", glue = "org.StepDefinition",
monochrome = true )

public class TestRunnerClass {
	
	

}
