package TestRunner;

import org.junit.Before;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/pet.feature",glue="Stepdefinitions")
public class testrunner {
	@Before
	public void setup() {
		System.out.println("testing progress");
	}
}