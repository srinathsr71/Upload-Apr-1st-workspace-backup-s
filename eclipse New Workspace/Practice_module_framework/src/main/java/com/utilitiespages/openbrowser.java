package com.utilitiespages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openbrowser {
	public static WebDriver driver;
	public datautil kg=new datautil();
	
	
@BeforeMethod
public void browsersele() throws IOException {
	if(kg.dautil("Browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(kg.dautil("Browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(kg.dautil("Browser").equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else {
		System.out.println("the browser is not opening");
	}
	driver.get(kg.dautil("url"));
	driver.manage().window().maximize();
	
	
}

//@AfterMethod
//public void at() {
//	driver.close();
//}
	
	
	
	
	

}
