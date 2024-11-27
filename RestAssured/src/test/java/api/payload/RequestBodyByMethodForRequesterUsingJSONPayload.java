package api.payload;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;;

public class RequestBodyByMethodForRequesterUsingJSONPayload {
	@Test
	public void createUserTest()
	{     
		File file = new File("./src/test/resources/reqRes.json");
		given().contentType(ContentType.JSON).body(file)
		.when().post("https://reqres.in/api/user")
		.then().assertThat().statusCode(201)
		.log().body();
	}

}
