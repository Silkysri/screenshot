import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC1_Get_Weather {

	@Test
		void getweatherDetails()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification req=RestAssured.given();
		
		
		
		Response res = req.request(Method.GET, "/Irving");
		
		
		String str = res.getBody().asString();
		
		System.out.println(str);
		System.out.println(res.getStatusCode());
	    Assert.assertEquals(res.getStatusCode(), 200);
	    System.out.println(res.getBody());
	    
	    
	    JsonPath jp=res.jsonPath();
	    System.out.println(jp.get("City"));
	    
	    
	    
	}
	
}
