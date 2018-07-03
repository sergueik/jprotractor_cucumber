package com.github.sergueik.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)

// @formatter:off
@CucumberOptions(
	plugin = {
		"pretty",
		"html:target/cucumber-html",
		"json:target/cucumber-json-report.json"
	}, 
	features = {
		"src/test/resources/features"
	}, 
	glue = {
			"com.github.sergueik.cucumber" // System.getProperty("project.groupId") 
	}, 
	tags = {
		"@test",
		"~@ignore"
	}, 
	dryRun = false)
	// @formatter:on

public class CucumberTest {
}
