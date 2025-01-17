package stepdefinit;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class stepdefinitions4 {
	
	public RequestSpecification httpRequest;
    public Response response;
    public int ResponseCode;
    public ResponseBody body;
    public JSONObject requestParams;
    public JsonPath jsnpath;
    public String s;

	@Given("I hit the url of post product api endpoint")
	public void i_hit_the_url_of_post_product_api_endpoint() {
		RestAssured.baseURI = "https://fakestoreapi.com/";
        httpRequest = given();
         requestParams = new JSONObject();
	    
	}
	@Given("I pass the request body of product title {}")
	public void i_pass_the_request_body_of_product_title(String title) {
		requestParams.put("title", title);
        requestParams.put("price",13.5);
        requestParams.put("description","lorem ipsum set");
        requestParams.put("image","https://i.pravatar.cc");
        requestParams.put("cateogry","electronic");
        httpRequest.body(requestParams.toJSONString());
        response =httpRequest.post("products");
        ResponseBody body = response.getBody();
        System.out.println(body);
        JsonPath jsnpath = response.jsonPath();
        s = jsnpath.getJsonObject("id").toString();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
        
		
	}
	@Then("I receive the response code as {int}")
	public void i_receive_the_response_code_as(Integer int1) {
		ResponseCode = response.getStatusCode();
        Assert.assertEquals(ResponseCode, 200);
		
		
		
	}


	@Then("I receive the response body with id as {}")
	public void i_receive_the_response_body_with_id_as(String id) {
		assertEquals(id, s);
	}




	
}
