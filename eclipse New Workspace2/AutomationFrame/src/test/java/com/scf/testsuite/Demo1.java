package com.scf.testsuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;
import com.scf.base.parent;
import com.scf.ele.ActionsPerform;

public class Demo1 {
parent p=new parent();

@Test
public void bt() {
	try {
		p.intialization();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	p.openurl();
	ActionsPerform ac=new ActionsPerform();
	ac.rightclick();
	ac.lists();
	ac.lists1();
	
}
	
	
	
}
