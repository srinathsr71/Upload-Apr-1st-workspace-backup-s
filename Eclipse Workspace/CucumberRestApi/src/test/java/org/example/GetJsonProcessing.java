package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.containsString;

import org.json.JSONObject;

public class GetJsonProcessing {
    @Test
    public void bitcointest() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.addHeader("Accept", "*/*");
        builder.addHeader("Connection", "keep-alive");
        builder.setContentType("application/json");

        RequestSpecification requestSpecification = builder.build();
        String resturl = "https://api.coindesk.com/v1/bpi/currentprice.json";

        Response response = given().spec(requestSpecification).when().get(resturl);
        String jsonResponseString=response.getBody().asString();
        System.out.println(jsonResponseString);
        JSONObject jsonResponseBody = new JSONObject(jsonResponseString);
        System.out.println("Disclaimer - >"+jsonResponseBody.getString("disclaimer"));
        JSONObject time = jsonResponseBody.getJSONObject("time");
        System.out.println("updatedTime -"+time.getString("updated"));
        String rateOfEUR = jsonResponseBody.getJSONObject("bpi").getJSONObject("EUR").getString("rate");
        System.out.println("rateOfEUR ->"+rateOfEUR);

    }
}
