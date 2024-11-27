package responseValidation;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class ResponseTimeCapturing {
	@Test
	public void responseTimeCapturing()

	{
		Response res =  when().get("https://reqres.in/api/users?page=2");
		res.then().assertThat().statusCode(200);
		long responseTime = res.timeIn(TimeUnit.MILLISECONDS);
		System.out.println(" response time is " + responseTime);

	}

}
