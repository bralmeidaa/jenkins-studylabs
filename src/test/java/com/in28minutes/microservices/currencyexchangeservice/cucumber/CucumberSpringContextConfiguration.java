package com.in28minutes.microservices.currencyexchangeservice.cucumber;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import com.in28minutes.microservices.currencyexchangeservice.CurrencyExchangeServiceApplicationH2;

import io.cucumber.spring.CucumberContextConfiguration; // updated by bralmeidaa
import io.cucumber.java.Before; // updated by bralmeidaa

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = CurrencyExchangeServiceApplicationH2.class, loader = SpringBootContextLoader.class)
public class CucumberSpringContextConfiguration {

  @Before
  public void setUp() {
  }
}