package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity3 
{
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	@DataProvider(name = "petInfo")
	public static Object[][] credentials() {
	    return new Object[][] { 
	    	{ 7723211, "TestRiley", "available"},
	    	{ 7723212, "TestHansel", "alive"}
	    };
	}
	
	@BeforeClass
	public void setUp()
	{
		//Request specification - specify the common request parts only in RequestSpecBuilder
		requestSpec = new RequestSpecBuilder()
				.setBaseUri("https://petstore.swagger.io/v2/pet")
				.addHeader("Content-Type","application/json").build();
		
		//response specification
		responseSpec = new ResponseSpecBuilder()
				.expectStatusCode(200) // Check status code in response
				.expectContentType("application/json") // Check response content type 
				.build(); // Build response specification
	}

	//POST request on https://petstore.swagger.io/v2/pet
	@Test (priority=1, dataProvider = "petInfo")
	public void postRequest(int petId, String petName, String petStatus)
	{
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", petId);
		reqBody.put("name", petName);
		reqBody.put("status", petStatus);
		
		//create an response object
		Response respose = given()
				.spec(requestSpec)
				.body(reqBody)
				.when().post();
		
		int newpetId= respose.then().extract().path("id");
		System.out.println("New Pet created with id : " + newpetId);
		
		//Assertions
		respose.then().spec(responseSpec);
		respose.then().body("id", equalTo(petId));
		respose.then().body("name", equalTo(petName));
		
		System.out.println("New Pet created : " + reqBody);
		
	}
	
	//GET request on https://petstore.swagger.io/v2/pet/{petId}
	@Test (priority=2, dataProvider = "petInfo")
	public void getRequest(int petId, String name, String status)
	{
		given().spec(requestSpec).pathParam("petId", petId)
		.when().get("/{petId}")
		.then().spec(responseSpec)
		.log().all();
	}
	
	//DELETE request on https://petstore.swagger.io/v2/pet/{petId}
	@Test (priority=3, dataProvider = "petInfo")
	public void deleteRequest(int petId, String name, String status)
	{
		given().spec(requestSpec).pathParam("petId", petId)
		.when().delete("/{petId}")
		.then()
			.statusCode(200)
			.body("message", equalTo(""+petId));
		
		System.out.println("New Pet got deleted " + petId);
	}
	

}
