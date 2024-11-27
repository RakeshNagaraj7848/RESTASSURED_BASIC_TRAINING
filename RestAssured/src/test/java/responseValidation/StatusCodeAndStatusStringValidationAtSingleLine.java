package responseValidation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class StatusCodeAndStatusStringValidationAtSingleLine {

	@Test
	public void statusCodeAndStatusStringValidationAtSingleLine()

	{
		given().when().get("https://reqres.in/api/users?page=2")

				.then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK")

				.log().all();
	}

}
