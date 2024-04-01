package com.assign.testsuite;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.assign.base.Parent;
import com.assign.ele.LoginPage;
import com.assign.ele.demo;
import com.assign.utility.Actions;

public class Testdemologin extends Parent {
	public static LoginPage cs;
	public Actions act;
	public demo de;
	private static Logger logger = LogManager.getLogger();

	@BeforeMethod
	public void init() throws IOException {
		intialization();
	}

	@Test
	public void test8() throws IOException {
		open();
		act=new Actions();
		String[][] userData = act.jsondata();
		de=new demo(driver);
		for (int i = 0; i < userData.length; i++) {
			System.out.println("username:"+userData[i][0]);
			System.out.println("password:"+userData[i][1]);
		    de.logininfo(userData[i][0], userData[i][1]);		    
		}
	}
	
@AfterMethod
public void at() {
	driver.close();
}
	
}
