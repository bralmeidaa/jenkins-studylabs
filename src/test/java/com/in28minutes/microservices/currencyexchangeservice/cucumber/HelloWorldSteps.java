package com.in28minutes.microservices.currencyexchangeservice.cucumber;

import io.cucumber.java.en.Given; // updated by bralmeidaa
import io.cucumber.java.en.When; // updated by bralmeidaa
import io.cucumber.java.en.Then; // updated by bralmeidaa
import org.junit.Assert;

import com.in28minutes.microservices.currencyexchangeservice.HelloWorld;

public class HelloWorldSteps {

    private HelloWorld helloWorld = new HelloWorld();


    private String name = "";

    private String output = "";

    @Given("^A String name (.*)$")
    public void givenInput(String name) {
        this.name = name;
    }
    @When("^sayHello method of HelloWorld.java is called$")
    public void whenBusinessLogicCalled() {
        output = helloWorld.sayHello(name);
    }
    @Then("^It should return (.*)$")
    public void thenCheckOutput(String response) {
        Assert.assertEquals(output, response);
    }


    public static void main(String[] args) {
    }
}
