package com.cra.stepdefinitions2;
import static io.restassured.RestAssured.given;

import org.example.PostApi;
import org.example.PostSample;
import org.json.JSONObject;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import utils.TestData;

public class stepdef {
	 
	    public String s;
	    
		@Given("User has API body for adding a pet")
		public void user_has_api_body_for_adding_a_pet() {
			
			//System.out.println(apiBody);
			System.out.println("hello");
		}
		@And("User sets API body content type as")
		public void user_sets_api_body_content_type_as() {
//			PostSample ps=new PostSample();
//			ps.postSampleOne();
			PostApi pa=new PostApi();
			pa.postSamples();
			
			System.out.println("sample");
			
			
			
			
			
			
			
		
		
		}
		@When("User calls POST \\/pet API")
		public void user_calls_post_pet_api() {
			
	       System.out.println("heri");
	        //assertEquals(id, s);
		
		}
		@Then("API returns a response back")
		public void api_returns_a_response_back() {

			System.out.println("hei");
			
		}
		@Then("User validates response code as {int}")
		public void user_validates_response_code_as(Integer int1) {
			System.out.println(int1);
			
		}



		
		

	}
	
