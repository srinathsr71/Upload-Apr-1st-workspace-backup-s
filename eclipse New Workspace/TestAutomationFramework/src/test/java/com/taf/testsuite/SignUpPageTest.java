package com.taf.testsuite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.taf.elepages.LoginPage;
import com.taf.elepages.SignUpPage;
import com.taf.main.TestBase;

public class SignUpPageTest extends TestBase{
	SignUpPage sp;
	LoginPage lp;
	
//	public SignUpPageTest() {
//		super();
//	}
	
@BeforeMethod
public void setup() throws IOException {
	intilization();//calling from parent class
	sp=new SignUpPage();
}
	

@Test(priority = 0)
public void verifiedtitle() {
	String title=sp.validatepagetitle();
	System.out.println(title);
	Assert.assertEquals(title, "Insurance Broker System - Login");
}

@Test(priority = 1)
public void signuptest() throws IOException {
	lp=sp.Registration(pda.PropInfo("fname"), pda.PropInfo("sname"), pda.PropInfo("phnum"), pda.PropInfo("adr"),pda.PropInfo("city"),pda.PropInfo("coun"),pda.PropInfo("pcode"), pda.PropInfo("emailid"), pda.PropInfo("pwd"),pda.PropInfo("cpwd"));
	String titles=sp.validateregpagetitle();
	System.out.println(titles);
	Assert.assertEquals(titles, "Insurance Broker System - Register");
	sp.clicks();
	String titlew=sp.validatehometitle();
	System.out.println(titlew);
	Assert.assertEquals(titlew, "Insurance Broker System - Login");
}


@AfterMethod
public void tearDown() {
	driver.close();
}
}
