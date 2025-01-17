package Stepdefinitions;


import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.apache.http.client.methods.HttpPost;
public class stepDefinition {
	public RequestSpecification httpRequest;
    public Response response;
    public int ResponseCode;
    public ResponseBody body;
    public JSONObject requestParams;
    public JsonPath jsnpath;
    public String s;

	

	@Given("User has API body for adding a pet")
	public void user_has_api_body_for_adding_a_pet() {
		RestAssured.baseURI = "https://petstore.swagger.io";
        httpRequest = RestAssured.given();
         requestParams = new JSONObject();
         httpRequest.header("Content-Type", "application/json");
		
	}
	@Given("I pass request body as content type")
	public void i_pass_request_body_as_content_type() {
        requestParams.put("id","101");
        requestParams.put("username","Rachana");
        requestParams.put("firstName","Lokesh");
        requestParams.put("lastName","Naveen");
        requestParams.put("email","rn@gmail.com");
        requestParams.put("password",122344);
        requestParams.put("phone","8978888388");
        requestParams.put("userstatus",1);
        httpRequest.body(requestParams.toJSONString());
        
		
	}
	@When("User calls create a resource API")
	public void user_calls_create_a_resource_api() {
		Response response =httpRequest.post("/v2/user/");
        ResponseBody body = response.getBody();
        JsonPath jsnpath = response.jsonPath();
        Object idObject = jsnpath.get("id");
        if (idObject != null) {
            s = idObject.toString();
        } else {
            System.out.println("The 'id' field is not found in the JSON response.");
        }
        //s = jsnpath.getJsonObject("id").toString();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
        ResponseCode = response.getStatusCode();
	}
	
	@Then("user validates response code")
	public void user_validates_response_code() { 
		
        Assert.assertEquals(ResponseCode, 200);
	}



}
