package api.payload;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;;

public class RequestBodyByMethodForPetStoreUsingJSONPayload {
	@Test
	public void createUserTest()
	{     
		File file = new File("./src/test/resources/petStore.json");
		given().contentType(ContentType.JSON).body(file)
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().assertThat().statusCode(200)
		.log().all();
	}

}
