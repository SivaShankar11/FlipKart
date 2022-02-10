package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src//test//resources//feature",
		glue="org.stepdefinition",
		tags="@tag1additemaddtocart",
		monochrome=true,
		dryRun=false,
		plugin= {"html:target", "json:target/reports.json"}
		)



public class TestRunner 


{

}
