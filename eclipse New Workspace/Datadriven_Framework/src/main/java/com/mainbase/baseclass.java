package com.mainbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import com.utility.dautils2;
import com.utility.waitsutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	public dautils2 cs=new dautils2();
	public waitsutility hs=new waitsutility();
	
@BeforeMethod	
public void openbrowser() throws IOException {
	if(cs.infoac("browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if (cs.infoac("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}else if(cs.infoac("browser").equalsIgnoreCase("edge")){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else {
		System.out.println("the browser is not opening");
	}
	
//	driver.get(cs.infoac("url"));
	
	
	
}
public void openurl(String url) throws IOException {
	driver.get(cs.infoac("url"));
	driver.manage().window().maximize();
}
	
	
	
	
	
	
	

}
