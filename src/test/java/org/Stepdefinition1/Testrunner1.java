package org.Stepdefinition1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "org.Stepdefinition1",
monochrome = true ,tags = "@sanity")
public class Testrunner1 {

}
