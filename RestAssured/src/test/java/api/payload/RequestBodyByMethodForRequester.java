package api.payload;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;;

public class RequestBodyByMethodForRequester {
	@Test
	public void createUserTest()
	{
		given().contentType(ContentType.JSON).body(RequestBodyByMethodForRequesterPayload.createUserPayload())
		.when().post("https://reqres.in/api/user")
		.then().assertThat().statusCode(200)
		.log().body();
	}

}
