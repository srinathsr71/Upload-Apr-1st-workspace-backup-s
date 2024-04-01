package com.ddf.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;

import com.ddf.base.parent;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Actions1 extends  parent{
	
	
	public List<HashMap<String, String>> getJSondatatomap(String filepath) throws IOException {
		// read JSon file to string
		String jsonContent = FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
		// Sting to hashmap ->Jacksondatabind needs to import
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data = mapper.readValue(jsonContent,
		        new TypeReference<List<HashMap<String,String>>>() {});
		//System.out.println(data);
		return data;
	}
	
	
	
	
}
