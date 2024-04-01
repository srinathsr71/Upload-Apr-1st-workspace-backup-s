package com.demo.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filedemo {
	
	
	public String filedata(String keyvalue) throws IOException {
		FileInputStream fd=new FileInputStream("./src/test/resources/configuration/config.properties");
		Properties ps=new Properties();
	ps.load(fd);
	String value=ps.getProperty(keyvalue);
	return value;
	}

}
