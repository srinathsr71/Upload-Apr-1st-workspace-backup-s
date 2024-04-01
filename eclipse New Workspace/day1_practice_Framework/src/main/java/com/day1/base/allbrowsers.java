package com.day1.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.day1.utility.datainfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allbrowsers {
	public static WebDriver driver;
	public datainfo jsa=new datainfo();
	
	@BeforeMethod
	public void browser() throws IOException {
		if(jsa.datacess("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(jsa.datacess("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(jsa.datacess("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else {
			System.out.println("the browser is not opening");
		}
		driver.get(jsa.datacess("url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void at() {
		driver.close();
	}
	
	
	
	

}
