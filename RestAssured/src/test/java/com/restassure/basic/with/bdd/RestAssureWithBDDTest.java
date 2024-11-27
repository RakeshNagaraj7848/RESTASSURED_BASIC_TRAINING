package com.restassure.basic.with.bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssureWithBDDTest {
@Test
public void createUserTest()
{
	
	
	RestAssured.given().contentType(ContentType.JSON)
	.body("{\r\n"
			+ "	\"name\":\"morpheus\",\r\n"
			+ "	\"job\":\"leader\"\r\n"
			+ "}")
	.when().post("https://reqres.in/api/user")
	.then().assertThat().statusCode(201)
	.log().all();
	
	
}

}
