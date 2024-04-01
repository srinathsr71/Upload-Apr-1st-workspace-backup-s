package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.path.json.JsonPath.*;
import static org.hamcrest.Matchers.containsString;


public class GetSample {
    @Test
    public void getMethod(){
        RequestSpecBuilder builder=new RequestSpecBuilder();
        builder.addHeader("Accept","*/*");
        builder.addHeader("Connection","keep-alive");
        builder.setContentType("application/json");

        RequestSpecification requestSpecification=builder.build();
        String resturl="https://petstore.swagger.io/v2/user/Rachana";
        Response response=given().spec(requestSpecification).when().get(resturl) ;
        String statusCode=String.valueOf(response.getStatusCode());
        System.out.println(statusCode);
        String responseBody=response.getBody().asString();
     System.out.println(responseBody);
//        Assert.assertEquals("200",statusCode);
//        String jsonResponse = given().spec(requestSpecification).when().get(resturl).asString();
//        int sold = from(jsonResponse).get("sold");
//        System.out.println("sold="+sold);

    }
}
