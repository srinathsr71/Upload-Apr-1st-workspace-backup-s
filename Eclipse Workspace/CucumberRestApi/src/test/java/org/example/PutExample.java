package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutExample {
    @Test
    public void putSampleOne(){
        RequestSpecBuilder builder=new RequestSpecBuilder();
        String requestUrl="https://petstore.swagger.io/v2/user/Rachana";
        String apiBody="{\n" +
                "  \"id\": 100,\n" +
                "  \"username\": \"Rachana\",\n" +
                "  \"firstName\": \"Lokesh\",\n" +
                "  \"lastName\": \"Vedanth\",\n" +
                "  \"email\": \"r.n@gmail.com\",\n" +
                "  \"password\": \"123pass\",\n" +
                "  \"phone\": \"9611342837\",\n" +
                "  \"userStatus\": 1\n" +
                "}";

        builder.setBody(apiBody);
        builder.setContentType("application/json");
        RequestSpecification requestSpecification= builder.build();
        Response response= given().
                spec(requestSpecification).
                when().put(requestUrl);
        System.out.println(response.getStatusCode());
        System.out.println( response.getStatusLine());
        System.out.println( response.getBody().asString());


    }
}
