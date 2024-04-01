package com.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserutility {
	public static WebDriver driver;
	public datautility ja=new datautility();
	
	@BeforeMethod
	public void browserinit() throws IOException {
		if(ja.infoacess("Browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("the edge browser is not opening");
			
		}
		
		driver.get(ja.infoacess("baseurl"));
		driver.manage().window().maximize();
	}
	
	

}
