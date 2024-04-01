package com.scf.base;

import java.io.IOException;

import com.operationmethods.GenericMethods;
import com.operationmethods.GenericStaticMethods;



public class parent {
	GenericMethods gm=new GenericMethods();
	public void intialization() throws IOException {
		GenericStaticMethods.setFilepath("./src/test/resources/configuration/config.properties");
		GenericStaticMethods.openBrowser();
		GenericStaticMethods.maximizeWindow();
	}
	public void openurl() {
		GenericStaticMethods.geturl(GenericStaticMethods.getProperty("url"));
	}
	
	

}
