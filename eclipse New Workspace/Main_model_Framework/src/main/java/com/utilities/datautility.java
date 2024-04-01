package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datautility {
	
	public String infoacess(String value) throws IOException {
		FileInputStream jd=new FileInputStream("./src/test/resources/data.properties");
		Properties js=new Properties();
		js.load(jd);
		String ks=js.getProperty(value);
		return ks;
	}

}
