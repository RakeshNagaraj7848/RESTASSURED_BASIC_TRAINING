 package com.restassure.basic.with.bdd.statickey;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RestAssureWithBDDTest2 {
	@Test
	public void createUserTest() {

		   when().get("https://reqres.in/api/users/2")
		   .then().assertThat().statusCode(200);

	}

}
