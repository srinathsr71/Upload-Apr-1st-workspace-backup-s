package com.taf.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDataAcess {
	
	
	public String PropInfo(String keyvalue) {
	    try (FileInputStream fs = new FileInputStream("./src/test/resources/com/taf/config/config.properties")) {
	        Properties ps = new Properties();
	        ps.load(fs);
	        String valueprop = ps.getProperty(keyvalue);
	        return valueprop;
	    } catch (IOException e) {
	        e.printStackTrace(); // Handle or log the exception appropriately
	        return null; // Or throw a custom exception
	    }
	}

}
