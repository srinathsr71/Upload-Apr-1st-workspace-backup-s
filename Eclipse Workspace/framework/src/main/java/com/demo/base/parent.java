package com.demo.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.demo.utilites.filedemo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parent {
	public static WebDriver driver;
	public filedemo fd=new filedemo();
	
	public void intialization() throws IOException {
		
		if(fd.filedata("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(fd.filedata("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("browser not found");
		}
		
		driver.get(fd.filedata("url"));
		driver.manage().window().maximize();
	}

}
