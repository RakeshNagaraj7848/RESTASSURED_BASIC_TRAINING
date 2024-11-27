package com.restassure.basic.without.bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssureWithoutBDDExample6 {
@Test
public void apiAutomationWithoutBDD()
{
	Response response = RestAssured.get("https://reqres.in/api/unknown/23");
	response.then().assertThat().statusCode(404);
	System.out.println("response body is "+" "+response.prettyPrint());
}
}
