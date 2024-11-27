package responseValidation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ResponseTimeValidationBothLessThaAndGreaterThan {
	@Test
	public void responseTimeValidationBothLessThaAndGreaterThan()

	{
		given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
				.statusLine(Matchers.containsString("OK"))
				.time(Matchers.both(Matchers.greaterThan(1000L)).and(Matchers.lessThan(2000L))).log().all();
	}

}