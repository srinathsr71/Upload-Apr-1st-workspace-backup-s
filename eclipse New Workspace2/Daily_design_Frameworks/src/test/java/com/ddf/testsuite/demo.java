package com.ddf.testsuite;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ddf.base.parent;
import com.ddf.elements.Logine;
import com.ddf.utilities.Actions1;

public class demo extends parent {
	public Actions1 ac=ac=new Actions1();

	
@BeforeTest
public void bt() throws IOException {
	parent.intialization();
	parent.open();
}
	
@Test(dataProvider = "getData")
public void te1(HashMap<String,String> input) throws IOException, InterruptedException {
	
	System.out.println(input);
	Logine s=new Logine(driver);
	s.loginCredentials(input.get("username"),input.get("password"));
	//s.loginCredentials(input);
	//s.loginCredentials(input.get("firstname"),input.get("lastname"),input.get("mobileno"));
	System.out.println(input.get("username"));
	System.out.println(input.get("password"));
//	System.out.println("firstname");
//	System.out.println("lastname");
//	System.out.println("mobileno");
	//ac.getData();
}
@DataProvider
public Object[][] getData() throws IOException{
	
	List<HashMap<String,String>> data= 
			ac.getJSondatatomap("./src/test/resources/data.json");
	System.out.println(data);
	//return new Object[][] {{data.get(0)},{data.get(1)}};
	//convert list of hashmaps to 2D array
	Object[][] dataArray = new Object[data.size()][1];
    for (int i = 0; i < data.size(); i++) {
        dataArray[i][0] = data.get(i);
    }
    
    return dataArray;
}
}
