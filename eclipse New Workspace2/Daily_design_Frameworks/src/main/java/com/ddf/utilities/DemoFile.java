package com.ddf.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoFile {
	
	public String fileDatas(String keyvalue) throws IOException {
		try (FileInputStream fs = new FileInputStream("./src/test/resources/configuration/config.properties")) {
	        Properties ps = new Properties();
	        ps.load(fs);
	        return ps.getProperty(keyvalue);
	    } catch (IOException e) {
	        e.printStackTrace(); // Handle or log the exception appropriately
	        return null; // Or throw a custom exception
	    }
	}
	

}
