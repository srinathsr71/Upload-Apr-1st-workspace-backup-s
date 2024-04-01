package com.genricutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class mainclass {

	public static WebDriver driver;
	public dataaccess as=new dataaccess();

	
	
	public void intialise() throws IOException {
	if(as.readfiledata("browser").equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}	
	else {
		System.out.println("the browser is not edge");
	}
	driver.get(as.readfiledata("url"));
	driver.manage().window().maximize();
		
	}
	


}
