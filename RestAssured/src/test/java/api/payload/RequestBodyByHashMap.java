package api.payload;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class RequestBodyByHashMap {
	@Test
	public void requestBodyBtHashMapTest()
	
	{
		HashMap<String,String> hs = new HashMap<String,String>();
		hs.put("name", "bhavanishankar Pawar");
		hs.put("job", "mechanical engineer");
		given().contentType("application/json").body(hs)
		.when().post("https://reqres.in/api/user")
		.then().assertThat().statusCode(201)
		.log().all();
	}

}
