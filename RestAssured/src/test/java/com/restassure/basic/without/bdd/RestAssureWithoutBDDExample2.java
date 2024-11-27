package com.restassure.basic.without.bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssureWithoutBDDExample2 {
@Test
public void apiAutomationWithoutBDD()
{
	Response response = RestAssured.get("https://reqres.in/api/users/2");
	response.then().assertThat().statusCode(200);
	System.out.println("response body is "+" "+response.prettyPrint());
}
}
