package com.day1.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datainfo {
	
	
	public String datacess(String values) throws IOException {
		FileInputStream sjd=new FileInputStream("./src/test/resources/config/common.properties");
		Properties hg=new Properties();
		hg.load(sjd);
		String sw=hg.getProperty(values);
		return sw;
		
	}
	

}
