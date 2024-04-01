package com.ddf.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ddf.base.parent;
import com.ddf.elements.Logine;
import com.ddf.utilities.Actions1;
import com.ddf.utilities.DemoFile;
import com.ddf.utilities.CustomListener;
@Listeners(CustomListener.class)
public class Failscreenshot extends parent {
	//WebDriver driver;
	public Actions1 ac=ac=new Actions1();
	public DemoFile dg=new DemoFile();
	parent g=new parent();

	
@BeforeMethod
public void bt() throws IOException {
	parent.intialization();
	parent.open();
	
}


@Test
public void faileTestmethod() throws InterruptedException, IOException {
	Logine hs=new Logine(driver);
	hs.loginCredentials(dg.fileDatas("username"),dg.fileDatas("password"));
}
}
