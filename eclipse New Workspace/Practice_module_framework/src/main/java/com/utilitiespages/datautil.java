package com.utilitiespages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datautil {
	
	
public String dautil(String kevalue) throws IOException {
	FileInputStream jhs=new FileInputStream("./src/test/resources/info.properties");
	Properties fjs=new Properties();
	fjs.load(jhs);
	String sf=fjs.getProperty(kevalue);
	return sf;
}

}
