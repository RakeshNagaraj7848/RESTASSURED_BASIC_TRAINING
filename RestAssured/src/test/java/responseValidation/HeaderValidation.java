package responseValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class HeaderValidation {

	@Test
	public void responseTimeCapturing()

	{
		Response res=when().get("https://reqres.in/api/users?page=2");
		res.then().assertThat().statusCode(200)
		.header("Content-Type","application/json; charset=utf-8")
		.header("Transfer-Encoding", "chunked")
		.header("Server", "cloudflare")
		.log().all();
		
				
	}

}
