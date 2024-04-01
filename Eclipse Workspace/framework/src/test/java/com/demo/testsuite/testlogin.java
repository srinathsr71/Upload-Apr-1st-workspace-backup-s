package com.demo.testsuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.parent;
import com.demo.pageelements.loginpage;

public class testlogin extends parent {
	
	
@BeforeMethod
public void bt() throws IOException {
	intialization();
}
@Test
public void test() throws IOException, InterruptedException {
	loginpage ln=new loginpage(driver);
	ln.login(fd.filedata("username"),fd.filedata("password"));
}

}
