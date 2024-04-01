package com.day1.testsuite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.day1.base.allbrowsers;
import com.day1.elerepo.logins;

public class testexec extends allbrowsers {

	
@Test
public void tesexe() throws IOException {
	logins ki=new logins(driver);
	ki.login(jsa.datacess("fsname"),jsa.datacess("lsname"),jsa.datacess("pcode"));
}
}
