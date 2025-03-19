package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity1 
{
	private int myPetID = 1231212;
	
	//sending a POST request on https://petstore.swagger.io/v2/pet
	
	@Test (priority=1)
	public void postRequestAddNewPet() 
	{
		Map<String, Object> reqBody = new HashMap<>();
		
		reqBody.put("id", myPetID);
		reqBody.put("name", "MyTestDog");
		reqBody.put("status", "alive");
		
		Response res = given().
				baseUri("https://petstore.swagger.io/v2/pet").//set base URI
				header("Content-Type","application/json").//set headers
				body(reqBody).//add request body
				when().post();//send POST request
		
		//Assertions
		res.then().body("id", equalTo(myPetID));
		res.then().body("name", equalTo("MyTestDog"));
		res.then().body("status", equalTo("alive"));
		
		System.out.println("New Pet created " + reqBody);
	}
	//GET request on https://petstore.swagger.io/v2/pet/{petId}
	@Test (priority=2)
	public void getRequestWithPathParam() 
	{
		System.out.println("With Path Param");
		//WithPathParam
		//send request, get response and assert with logging
		given().
			baseUri("https://petstore.swagger.io/v2/pet").//set base URL
			header("Content-Type","application/json").//set header
			pathParam("petId", myPetID).//set path parameter
			log().all().
		with().
			get("/{petId}").//send GET request
		then().
			statusCode(200).
			body("id", equalTo(myPetID)).
			body("name", equalTo("MyTestDog")).
			body("status", equalTo("alive")).
			log().all();
	
		//WithQueryParam
		System.out.println("With Query Param");
		
		Response response = given().
			baseUri("https://petstore.swagger.io/v2/pet").
			header("Content-Type","application/json").
			when().
				pathParam("petId", myPetID).
				get("/{petId}");
		
		System.out.println("print response body : " + response.getBody().asPrettyString());
		
		//Assertions
		response.then().body("id", equalTo(myPetID));
		response.then().body("name", equalTo("MyTestDog"));
		response.then().body("status", equalTo("alive"));
	}
	
	//DELETE request on https://petstore.swagger.io/v2/pet/{petId}
	@Test (priority=3)
	public void deletePet() 
	{
		//WithQueryParam
		Response response = given().
			baseUri("https://petstore.swagger.io/v2/pet").
			header("Content-Type","application/json").
			when().
				pathParam("petId", myPetID).
				delete("/{petId}");
	
		response.then().statusCode(200);
		
		System.out.println("New Pet got deleted ");
	}
}
