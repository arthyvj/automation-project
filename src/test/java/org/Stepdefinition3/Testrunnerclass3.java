package org.Stepdefinition3;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" ,
glue = "org.Stepdefinition3" , 
monochrome = true , snippets = SnippetType.CAMELCASE , tags = "@foodsearch")

public class Testrunnerclass3 {

}
