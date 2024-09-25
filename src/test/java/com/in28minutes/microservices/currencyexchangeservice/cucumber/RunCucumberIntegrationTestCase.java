package com.in28minutes.microservices.currencyexchangeservice.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber; // updated by bralmeidaa
import io.cucumber.junit.CucumberOptions; // updated by bralmeidaa

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources", plugin = { "pretty" })
public class RunCucumberIntegrationTestCase {
}