package api.payload;

public class RequestBodyByMethodForRequesterPayload {
	
	public static String createUserPayload()
	{
		return "{\r\n"
				+ "	\"name\":\"rakesh\",\r\n"
				+ "	\"job\":\"Software Engineer\"\r\n"
				+ "}";
	}

}
