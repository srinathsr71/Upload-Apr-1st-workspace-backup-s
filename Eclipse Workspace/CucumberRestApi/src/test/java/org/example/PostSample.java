package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostSample {
    @Test
    public void postSampleOne(){
    	 RequestSpecification httpRequest;
	     Response response;
	     JSONObject requestParams;
	     JsonPath jsnpath;
        RequestSpecBuilder builder=new RequestSpecBuilder();
        RestAssured.baseURI = "https://petstore.swagger.io";
        httpRequest = RestAssured.given();
         requestParams = new JSONObject();
       // String requestUrl="https://petstore.swagger.io/v2/user";
        //String requestUrl="https://reqres.in/api/users";
//        String apiBody="{\n" +
//                "  \"id\": 100,\n" +
//                "  \"username\": \"Rachana\",\n" +
//                "  \"firstName\": \"Lokesh\",\n" +
//                "  \"lastName\": \"naveen\",\n" +
//                "  \"email\": \"r.n@gmail.com\",\n" +
//                "  \"password\": \"123pass\",\n" +
//                "  \"phone\": \"9611342837\",\n" +
//                "  \"userStatus\": 1\n" +
//                "}";
         requestParams.put("id","100");
			requestParams.put("username","Rachana");
			requestParams.put("firstName","Lokesh");
			requestParams.put("lastName","naveen");
			requestParams.put("email","r.n@gmail.com");
			requestParams.put("password","123pass");
			requestParams.put("phone","9611342837");
			requestParams.put("userStatus",1);
			httpRequest.body(requestParams.toString());
try {
       // builder.setBody(apiBody);
        builder.setContentType("application/json");
         httpRequest= builder.build();
        
       response= httpRequest.
                spec(httpRequest).
                when().post("/v2/user");
        System.out.println(response.getStatusCode());
        String StatusLine = response.statusLine();
//       System.out.println( response.getStatusLine());
//        System.out.println( response.getBody().asString());
       Assert.assertEquals(201, response.getStatusCode());
        Assert.assertTrue(StatusLine.contains("OK"));
}
catch (Exception e) {
    // Handle exception
    System.out.println("Error occurred: " + e.getMessage());
    e.printStackTrace();
    // You can add more specific error handling based on the type of exception
}
    }
}
