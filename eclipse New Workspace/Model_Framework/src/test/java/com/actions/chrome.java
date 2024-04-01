package com.actions;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.genricutility.mainclass;
//import com.genricutility.dataaccess;
import com.elements.Openurl;

public class chrome extends mainclass {
	@Test
	public void tes() throws IOException {
		Openurl h=new Openurl(driver);
		h.enterdetails(as.readfiledata("uname"), as.readfiledata("psword"));
		
	}

}
