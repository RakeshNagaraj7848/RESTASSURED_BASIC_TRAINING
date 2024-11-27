package responseValidation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ResponseTimeValidationLessThan {

	@Test
	public void responseTimeValidationLessthen()

	{
		given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
				.statusLine(Matchers.containsString("OK"))
				.time(Matchers.lessThan(1500L))
				.log().all();
	}

}
