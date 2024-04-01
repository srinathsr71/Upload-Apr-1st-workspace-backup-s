package com.assign.utility;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.assign.base.Parent;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Actions extends Parent{
	static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public void takeScreenshot(String locfileName) {
	       try {
	           File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(screenshotFile, new File(locfileName));
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging other exceptions
	       }
	   }
	
	public ExtentTest report(String testname) {
		if(extent==null) {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		}
		ExtentTest test;
		test=extent.createTest(testname);
		return test;
		
	}
	public String[][] jsondata() {
		try {
            // JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();
            // Read JSON file
            FileReader reader = new FileReader("./src/test/resources/config/data.json");
            // Parse JSON file to object
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // Get the JSONArray for userlogins
            JSONArray userLogins = (JSONArray) jsonObject.get("userlogins");
            List<String[]> userDataList = new ArrayList<>();
            // Iterate over each user login data
            for (Object obj : userLogins) {
                JSONObject userLogin = (JSONObject) obj;
                // Extract data from JSONObject
                String username = (String) userLogin.get("username");
                String password = (String) userLogin.get("password");
                userDataList.add(new String[]{username, password});
            }
            System.out.println(userDataList.size());
         // Convert the list to array and return
            return userDataList.toArray(new String[0][0]);
}
		catch (Exception e) {
            e.printStackTrace();
		}
		return null; 
		
}
}