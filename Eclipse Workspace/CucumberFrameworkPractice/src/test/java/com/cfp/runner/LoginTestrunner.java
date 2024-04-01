package com.cfp.runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/resources/Features/loginpage.feature"},glue= {"com.cfp.stepdefinitions"},
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
monochrome = true,publish = true)
public class LoginTestrunner extends AbstractTestNGCucumberTests {
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
	

}



