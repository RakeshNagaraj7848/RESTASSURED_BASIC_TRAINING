package responseValidation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class StatusCodeAndStatusStringValidationWithIgnoreCase {

	@Test
	public void statusCodeAndStatusStringValidationWithIgnoreCase()

	{
		given().when().get("https://reqres.in/api/users?page=2")

				.then().assertThat().statusCode(200).statusLine(Matchers.containsStringIgnoringCase("Ok"))

				.log().all();
	}

}
