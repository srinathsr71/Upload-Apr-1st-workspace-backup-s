package com.ddf.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.assign.utility.Fileinfo;
import com.ddf.utilities.DemoFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parent {
	public static WebDriver driver;
	public static final DemoFile fi = new DemoFile();

	public static void intialization() throws IOException {
			String ses="browser";
		if (fi.fileDatas(ses).equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (fi.fileDatas(ses).equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (fi.fileDatas(ses).equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("No Browser is Opening");
		}

	}

	public static void open() throws IOException {
		driver.get(fi.fileDatas("url"));
		driver.manage().window().maximize();
	}
	
	public void getScreenshot(String testmethod) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("D:\\veera project\\eclipse New Workspace2\\Daily_design_Frameworks\\screenshots\\"+testmethod+" "+".jpg");
		FileUtils.copyFile(source, file);
	
		
		
	}


}
