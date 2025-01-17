package org.example;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
public class PostApi {
	
	    
	    @Test
	    public void postSamples() {
	        RestAssured.baseURI = "https://petstore.swagger.io";
	        RequestSpecification httpRequest = RestAssured.given();
	        
	        JSONObject requestParams = new JSONObject();
//	        requestParams.put("id", 100);
//	        requestParams.put("username", "Rachana");
//	        requestParams.put("firstName", "Lokesh");
//	        requestParams.put("lastName", "naveen");
//	        requestParams.put("email", "r.n@gmail.com");
//	        requestParams.put("password", "123pass");
//	        requestParams.put("phone", "9611342837");
//	        requestParams.put("userStatus", 1);
	        requestParams.put("phone", "9611342837");
//	        requestParams.put("userStatus", 1);

	        httpRequest.body(requestParams.toString());
	        httpRequest.contentType("application/json");

	        try {
	            Response response = httpRequest.when().post("/v2/user");
	            int statusCode = response.getStatusCode();
	            String statusLine = response.getStatusLine();

	            System.out.println("Response Status Code: " + statusCode);
	            System.out.println("Response Status Line: " + statusLine);

	            Assert.assertEquals(201, statusCode);
	            Assert.assertTrue(statusLine.contains("Created"));
	        } catch (Exception e) {
	            System.out.println("Error occurred: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}


