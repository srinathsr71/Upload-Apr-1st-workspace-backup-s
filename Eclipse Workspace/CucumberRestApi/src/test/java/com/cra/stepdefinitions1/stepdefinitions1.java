package com.cra.stepdefinitions1;

import static io.restassured.RestAssured.given;

import org.example.PostSample;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import utils.TestData;

public class stepdefinitions1 {
	private RequestSpecBuilder builder;
    Response response;
    private String StatusLine;
    private String apiBody;
    
	@Given("User has API body for adding a pet")
	public void user_has_api_body_for_adding_a_pet() {
		apiBody = TestData.getApiBody();
		System.out.println(apiBody);
		//System.out.println("hello");
	}
	@And("User sets API body content type as {string}")
	public void user_sets_api_body_content_type_as(String string) {
		builder=new RequestSpecBuilder();
        builder.setBody(apiBody);
        builder.setContentType(string);
		System.out.println("welcome");
		System.out.println(builder.setContentType(string));
	}
	@When("User calls POST \\/pet API")
	public void user_calls_post_pet_api() {
		
//		PostSample ps=new PostSample();
//		ps.postSampleOne();
//		String requestUrl="https://petstore.swagger.io/v2/user";
//        RequestSpecification requestSpecification=builder.build();
//        System.out.println(requestSpecification);
//        response= given().
//                spec(requestSpecification).
//                when().post("https://petstore.swagger.io/v2/user");
//        System.out.println(response);
//		System.out.println("cucumber api");
//		System.out.println(response.getStatusCode());
//		System.out.println( response.getBody().asString());
		
		RequestSpecification httprequest=RestAssured.given();
		response=httprequest.when().post("https://petstore.swagger.io/v2/user");
	}
	@Then("API returns a response back")
	public void api_returns_a_response_back() {
		int responsecode=response.getStatusCode();
		System.out.println(responsecode);
//        String StatusLine = response.statusLine();
//        System.out.println( response.getStatusLine());
//        System.out.println( response.getBody().asString());
		System.out.println("Bdd framework");      
	}
	@Then("User validates response code as {int}")
	public void user_validates_response_code_as(Integer int1) {
		Assert.assertEquals(200, response.getStatusCode());
        Assert.assertTrue(StatusLine.contains("OK"));
		System.out.println("Bdd Rest api framework");
	}



	
	

}
