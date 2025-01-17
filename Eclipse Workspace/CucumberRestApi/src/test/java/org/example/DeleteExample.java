package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteExample {
    @Test
    public void deleteExample(){
        RequestSpecBuilder builder=new RequestSpecBuilder();
        String requestUrl="https://petstore.swagger.io/v2/store/order/123";
        builder.setContentType("application/json");
        RequestSpecification requestSpecification= builder.build();
        Response response= given().
                spec(requestSpecification).
                when().delete(requestUrl);
        System.out.println(response.getStatusCode());
        System.out.println( response.getStatusLine());
        System.out.println( response.getBody().asString());

    }
}
