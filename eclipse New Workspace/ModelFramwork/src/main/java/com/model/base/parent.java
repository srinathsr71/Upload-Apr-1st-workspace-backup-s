package com.model.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.model.utilities.fileut;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parent {

public static WebDriver driver;
public fileut hg=new fileut();

@BeforeMethod
public void browseropen() throws IOException {
	if(hg.fileinfo("browser").equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else if(hg.fileinfo("browser").equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(hg.fileinfo("browser").equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else {
		System.out.println("the browser is not opening");
	}
	driver.get(hg.fileinfo("url"));
	driver.manage().window().maximize();
}

//@AfterMethod
public void at() {
	driver.close();
}
	
}
