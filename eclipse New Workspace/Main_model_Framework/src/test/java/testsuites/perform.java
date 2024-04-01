package testsuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilities.browserutility;
import com.webelements.loginform;

public class perform extends browserutility {
	
	
	
@Test
public void ready() throws IOException {
	loginform js=new loginform(driver);
	js.details(ja.infoacess("Username"),ja.infoacess("emailid"));
	
}

}
