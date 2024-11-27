package api.payload;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;;

public class RequestBodyByMethod {
	@Test
	public void createPetTest()
	{
		given().contentType(ContentType.JSON).body(RequestBodyWithMethod.addPet())
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().assertThat().statusCode(200)
		.log().body();
	}

}
