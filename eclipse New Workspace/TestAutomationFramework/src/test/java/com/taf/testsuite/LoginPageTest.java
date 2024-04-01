package com.taf.testsuite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.taf.elepages.HomePage;
import com.taf.elepages.LoginPage;
import com.taf.main.TestBase;

public class LoginPageTest extends TestBase{
	
	//HomePage hs;
	


	
@Test
public void login() throws IOException {
	LoginPage lps=new LoginPage(driver);
	lps.logininfo(pda.PropInfo("datema"),pda.PropInfo("datepas"));
	String title=lps.valiatelogintitle();
	Assert.assertEquals(title, "Insurance Broker System - Login");
}



}
