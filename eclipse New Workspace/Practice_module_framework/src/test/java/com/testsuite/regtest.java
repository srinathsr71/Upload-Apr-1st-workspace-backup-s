package com.testsuite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilitiespages.openbrowser;
import com.webelerepo.regpage;

public class regtest extends openbrowser{

@Test
public void registertest() throws IOException {
	regpage jg=new regpage(driver);
	jg.regdetails(kg.dautil("fname"),kg.dautil("sname"),kg.dautil("phnum"),kg.dautil("adr"),kg.dautil("city"),kg.dautil("coun"),
			kg.dautil("pcode"),kg.dautil("emailid"),kg.dautil("pwd"),kg.dautil("cpwd"));
	jg.dropdowns();
	jg.radiobuton();
//	jg.validate_regpage(kg.dautil("homeurl"));
	
	
}
	

	
	
	
}
