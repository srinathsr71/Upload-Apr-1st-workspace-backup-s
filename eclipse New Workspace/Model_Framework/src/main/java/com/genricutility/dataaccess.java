package com.genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class dataaccess {

	public String readfiledata(String keyvalue) throws IOException {
		//this statement we can use to get the text file of the location and mention the path of the file
		FileInputStream fs=new FileInputStream("./src/test/resources/common.properties");
		//we can use this statement to get the data from the  text file
		//Each key and its corresponding value in the property list is a string
		Properties s=new Properties();
		//this statement will read the key values of the text file
		s.load(fs);
		//this statment will get each key and value of the text file if found it will display
		String c=s.getProperty(keyvalue);
		//it will return the key and value of text file
		return c;
		
				
	}
}
