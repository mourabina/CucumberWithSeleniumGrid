package br.com.runTest;

import org.junit.runner.RunWith;

import commons.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = { ".//src//test//resources//" }, glue = {
				"web.steps", 
				"configuration", 
				"commons"},

		tags = { "@Agendamento" })

public class RunTest extends BaseTest {

}