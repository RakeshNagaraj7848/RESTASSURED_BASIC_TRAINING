package com.restassure.basic.with.bdd.statickey;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class RestAssureWithBDDTest {
	@Test
	public void createUserTest() {

		         given().contentType(ContentType.JSON)
				.body("{\r\n" + "	\"name\":\"morpheus\",\r\n" + "	\"job\":\"leader\"\r\n" + "}")
				.when()
				.post("https://reqres.in/api/user")
				.then().assertThat().statusCode(201).log().all();

	}

}
