package com.cfp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"./src/test/resources/Features/Account.feature"},glue = {"com.cfp.accountstepdef"})
public class AccountsTestrunner extends AbstractTestNGCucumberTests {

}
