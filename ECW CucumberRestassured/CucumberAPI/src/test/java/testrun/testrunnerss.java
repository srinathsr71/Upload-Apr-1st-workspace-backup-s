package testrun;

import org.junit.Before;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/feature/demo.feature",glue="stepdefinit")
public class testrunnerss {

@Before
public void setup() {
	System.out.println("testing in progress");
}
	
}
