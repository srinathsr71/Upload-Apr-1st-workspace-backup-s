package com.cra.testrunner;

import org.junit.Before;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Feature/pet.feature",glue = {"com.cra.stepdefinitions2"})
public class testrunner1 {
	@Before
    public void setup(){
        System.out.println("Test in progress");
    }

}
