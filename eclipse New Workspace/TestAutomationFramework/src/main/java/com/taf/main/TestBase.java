package com.taf.main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.taf.utils.DriverWaits;
import com.taf.utils.PropDataAcess;
import com.taf.utils.Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static PropDataAcess pda=new PropDataAcess();
	public static DriverWaits dw=new DriverWaits();
	public static Cookies ck=new Cookies();

	
	public void intilization() throws IOException {
		//String brows=pda.PropInfo("browser");
		
			if(pda.PropInfo("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();				
			}else if(pda.PropInfo("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			} else if(pda.PropInfo("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else {
				System.out.println("the browser is not opening");
			}
		
		driver.get(pda.PropInfo("url"));
		driver.manage().window().maximize();
		dw.pagelodtime(driver);
		dw.implicitWait(driver);
		ck.delcookies(driver);
		
		
		
		
		
		
		
		
	}


}
